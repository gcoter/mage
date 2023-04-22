package mage.player.ai.playground;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.apache.log4j.Logger;

import mage.cards.decks.DeckCardLists;
import mage.players.PlayerType;
import mage.remote.Connection;
import mage.remote.MageRemoteException;
import mage.remote.Session;
import mage.remote.SessionImpl;
import mage.util.RandomUtil;
import mage.view.RoomUsersView;
import mage.view.TableView;
import mage.view.UsersView;

public class Monitor {
    private static final Logger logger = Logger.getLogger(Monitor.class);

    String userName;
    String host;
    int port;
    String proxyType;
    Connection connection;
    SimpleMageClient client;
    Session session;
    UUID roomID;
    UUID createdTableID;
    UUID connectedTableID;
    DeckCardLists deckList;
    String lastGameResult = "";

    public Monitor(String userPrefix, String host, int port, String proxyType, boolean joinGameChat, String logsPrefix) {
        this.userName = userPrefix + "_" + RandomUtil.nextInt(10000);
        this.host = host;
        this.port = port;
        this.proxyType = proxyType;
        this.connection = createSimpleConnection(this.userName, this.host, this.port, this.proxyType);
        this.client = new SimpleMageClient(joinGameChat, logsPrefix);
        this.session = new SessionImpl(this.client);

        this.session.connect(this.connection);
        this.client.setSession(this.session);
        this.roomID = this.session.getMainRoomId();
    }

    private Connection createSimpleConnection(String username, String host, int port, String proxyType) {
        Connection con = new Connection();
        con.setUsername(username);
        con.setHost(host);
        con.setPort(port);
        Connection.ProxyType proxyTypeValue = Connection.ProxyType.valueByText(proxyType);
        con.setProxyType(proxyTypeValue);
        return con;
    }

    public ArrayList<UsersView> getAllRoomUsers() {
        ArrayList<UsersView> res = new ArrayList<>();
        try {
            for (RoomUsersView roomUsers : this.session.getRoomUsers(this.roomID)) {
                res.addAll(roomUsers.getUsersView());
            }
        } catch (MageRemoteException e) {
            logger.error(e);
        }
        return res;
    }

    public UsersView findUser(String userName) {
        for (UsersView user : this.getAllRoomUsers()) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    public Optional<TableView> getTable(UUID tableID) {
        return this.session.getTable(this.roomID, tableID);
    }

    public void connectToTable(UUID tableID) {
        this.session.joinTable(this.roomID, tableID, this.userName, PlayerType.HUMAN, 1, this.deckList, "");
        this.connectedTableID = tableID;
    }

    public void startMatch() {
        this.session.startMatch(this.roomID, this.createdTableID);
    }

    public void setDeckList(DeckCardLists deckList) {
        this.deckList = deckList;
    }

    public void disconnect() {
        this.session.disconnect(false);
    }

    public void concede() {
        this.client.setConcede(true);
    }
}
