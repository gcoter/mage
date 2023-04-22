package mage.player.ai.playground;

import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

import org.apache.log4j.Logger;

import mage.cards.decks.DeckCardLists;
import mage.constants.MatchTimeLimit;
import mage.constants.MultiplayerAttackOption;
import mage.constants.RangeOfInfluence;
import mage.constants.TableState;
import mage.game.match.MatchOptions;
import mage.players.PlayerType;
import mage.remote.Session;
import mage.view.GameTypeView;
import mage.view.GameView;
import mage.view.PlayerView;
import mage.view.TableView;

public class AIPlayground {
    private static final Logger logger = Logger.getLogger(AIPlayground.class);

    private static final String SERVER = "localhost";
    private static final int PORT = 17171;
    private static final String PROXY_TYPE = "None";
    private static final String USER_NAME_GLOBAL_PREFIX = "t_";
    private static final String AI_GAME_NAME = "AI Game";
    private static final String AI_GAME_MODE = "Freeform Commander Free For All"; // "Two Player Duel";
    private static final String AI_DECK_TYPE = "Variant Magic - Freeform Commander"; // "Constructed - Standard";
    private static final String AI_DECK_COLORS = "WGUBR"; // "RG";
    private static final String AI_DECK_SETS = "NEO"; // "M21";

    public static void main(String[] args) {
        GameResultsList gameResults = new GameResultsList();
        GameResult gameResult = gameResults.createGame(0, AI_GAME_NAME, 0);
        playTwoAIGame(AI_GAME_NAME, AI_DECK_COLORS, AI_DECK_SETS, gameResult);
        printGameResults(gameResults);
    }

    public static void playTwoAIGame(String gameName, String deckColors, String deckAllowedSets, GameResult gameResult) {
        // monitor and game source
        Monitor monitor = new Monitor(USER_NAME_GLOBAL_PREFIX + "mon", SERVER, PORT, PROXY_TYPE, true, gameName + ", mon");

        // game by monitor
        GameTypeView gameType = prepareGameType(monitor.session);
        MatchOptions gameOptions = createSimpleGameOptionsForAI(gameType, monitor.session, gameName);
        TableView game = monitor.session.createTable(monitor.roomID, gameOptions);
        UUID tableId = game.getTableId();

        // deck load
        DeckCardLists deckList1 = loadGameDeck(1, deckColors, false, deckAllowedSets);
        DeckCardLists deckList2 = loadGameDeck(2, deckColors, false, deckAllowedSets);

        // join AI
        monitor.session.joinTable(monitor.roomID, tableId, "ai_1", PlayerType.COMPUTER_MAD, 5, deckList1, "");
        monitor.session.joinTable(monitor.roomID, tableId, "ai_2", PlayerType.COMPUTER_MAD, 5, deckList2, "");

        // match start
        monitor.session.startMatch(monitor.roomID, tableId);

        // playing until game over
        gameResult.start();
        boolean startToWatching = false;
        while (true) {
            GameView gameView = monitor.client.getLastGameView();

            TableView checkGame = monitor.getTable(tableId).orElse(null);
            TableState state = (checkGame == null ? null : checkGame.getTableState());

            if (gameView != null && checkGame != null) {
                logger.warn(checkGame.getTableName() + ": ---");
                logger.warn(String.format("%s: turn %d, step %s, state %s",
                        checkGame.getTableName(),
                        gameView.getTurn(),
                        gameView.getStep().toString(),
                        state
                ));
            }

            if (state == TableState.FINISHED) {
                gameResult.finish(gameView);
                break;
            }

            if (!startToWatching && state == TableState.DUELING && checkGame != null) {
                monitor.session.watchGame(checkGame.getGames().iterator().next());
                startToWatching = true;
            }

            if (gameView != null && checkGame != null) {
                gameView.getPlayers()
                        .stream()
                        .sorted(Comparator.comparing(PlayerView::getName))
                        .forEach(p -> {
                            String activeInfo = "";
                            if (Objects.equals(gameView.getActivePlayerId(), p.getPlayerId())) {
                                activeInfo = " (active)";
                            }
                            logger.info(String.format("%s, status: %s - Life=%d; Lib=%d;%s",
                                    checkGame.getTableName(),
                                    p.getName(),
                                    p.getLife(),
                                    p.getLibraryCount(),
                                    activeInfo
                            ));
                        });
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                logger.error(e.getMessage(), e);
            }
        }
    }

    private static GameTypeView prepareGameType(Session session) {
        GameTypeView gameType = session.getGameTypes()
                .stream()
                .filter(m -> m.getName().equals(AI_GAME_MODE))
                .findFirst()
                .orElse(null);
        return gameType;
    }

    private static MatchOptions createSimpleGameOptionsForAI(GameTypeView gameTypeView, Session session, String gameName) {
        return createSimpleGameOptions(gameName, gameTypeView, session, PlayerType.COMPUTER_MAD);
    }

    private static MatchOptions createSimpleGameOptions(String gameName, GameTypeView gameTypeView, Session session, PlayerType playersType) {
        MatchOptions options = new MatchOptions(gameName, gameTypeView.getName(), true, 2);

        options.getPlayerTypes().add(playersType);
        options.getPlayerTypes().add(playersType);
        options.setDeckType(AI_DECK_TYPE);
        options.setLimited(false);
        options.setAttackOption(MultiplayerAttackOption.MULTIPLE);
        options.setRange(RangeOfInfluence.ALL);
        options.setWinsNeeded(1);
        options.setMatchTimeLimit(MatchTimeLimit.MIN__15);
        return options;
    }

    private static DeckCardLists loadGameDeck(int playerNumber, String deckColors, boolean onlyBasicLands, String allowedSets) {
        DeckCardLists deckList = DeckUtils.buildRandomDeckAndInitCards(deckColors, onlyBasicLands, allowedSets);
        return deckList;
    }

    private static void printGameResults(GameResultsList gameResults) {
        System.out.println();
        gameResults.printResultHeader();
        gameResults.printResultData();
        gameResults.printResultTotal();
    }
}
