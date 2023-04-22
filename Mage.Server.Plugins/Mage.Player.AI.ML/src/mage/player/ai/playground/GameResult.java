package mage.player.ai.playground;

import java.util.Date;
import mage.view.GameView;


public class GameResult {
    int index;
    String name;
    long randomSeed;
    Date timeStarted;
    Date timeEnded = null;
    GameView finalGameView = null;

    public GameResult(int index, String name, long randomSeed) {
        this.index = index;
        this.name = name;
        this.randomSeed = randomSeed;
    }

    public void start() {
        this.timeStarted = new Date();
    }

    public void finish(GameView finalGameView) {
        this.timeEnded = new Date();
        this.finalGameView = finalGameView;
    }

    public int getLife1() {
        return this.finalGameView.getPlayers().get(0).getLife();
    }

    public int getLife2() {
        return this.finalGameView.getPlayers().get(1).getLife();
    }

    public int getTurn() {
        return this.finalGameView.getTurn();
    }

    public int getDurationMs() {
        return (int) ((this.timeEnded.getTime() - this.timeStarted.getTime()));
    }
}
