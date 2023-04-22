package mage.player.ai.playground;

import java.util.Arrays;
import java.util.List;
import java.util.HashMap;


public class GameResultsList extends HashMap<Integer, GameResult> {

    private static final String tableFormatHeader = "|%-10s|%-15s|%-20s|%-10s|%-15s|%-15s|%-10s|%-20s|%n";
    private static final String tableFormatData = "|%-10s|%15s|%20s|%10s|%15s|%15s|%10s|%20s|%n";

    public GameResult createGame(int index, String name, long randomSeed) {
        if (this.containsKey(index)) {
            throw new IllegalArgumentException("Game with index " + index + " already exists");
        }
        GameResult res = new GameResult(index, name, randomSeed);
        this.put(index, res);
        return res;
    }

    public void printResultHeader() {
        List<String> data = Arrays.asList(
                "index",
                "name",
                "random sid",
                "turn",
                "player 1",
                "player 2",
                "time, sec",
                "time per turn, sec"
        );
        System.out.printf(tableFormatHeader, data.toArray());
    }

    public void printResultData() {
        this.values().forEach(this::printResultData);
    }

    public void printResultData(GameResult gameResult) {
        List<String> data = Arrays.asList(
                String.valueOf(gameResult.index), //"index",
                gameResult.name, //"name",
                String.valueOf(gameResult.randomSeed), // "random sid",
                String.valueOf(gameResult.getTurn()), //"turn",
                String.valueOf(gameResult.getLife1()), //"player 1",
                String.valueOf(gameResult.getLife2()), //"player 2",
                String.format("%.3f", (float) gameResult.getDurationMs() / 1000), //"time, sec",
                String.format("%.3f", ((float) gameResult.getDurationMs() / 1000) / gameResult.getTurn()) //"per turn, sec"
        );
        System.out.printf(tableFormatData, data.toArray());
    }

    public void printResultTotal() {
        List<String> data = Arrays.asList(
                "TOTAL/AVG", //"index",
                String.valueOf(this.size()), //"name",
                "", // "random sid",
                String.valueOf(this.getAvgTurn()), // turn
                String.valueOf(this.getAvgLife1()), // player 1
                String.valueOf(this.getAvgLife2()), // player 2
                String.valueOf(String.format("%.3f", (float) this.getAvgDurationMs() / 1000)), // time, sec
                String.valueOf(String.format("%.3f", (float) this.getAvgDurationPerTurnMs() / 1000)) // time per turn, sec
        );
        System.out.printf(tableFormatData, data.toArray());
    }

    private int getAvgTurn() {
        return this.values().stream().mapToInt(GameResult::getTurn).sum() / this.size();
    }

    private int getAvgLife1() {
        return this.values().stream().mapToInt(GameResult::getLife1).sum() / this.size();
    }

    private int getAvgLife2() {
        return this.values().stream().mapToInt(GameResult::getLife2).sum() / this.size();
    }

    private int getAvgDurationMs() {
        return this.values().stream().mapToInt(GameResult::getDurationMs).sum() / this.size();
    }

    private int getAvgDurationPerTurnMs() {
        return getAvgDurationMs() / getAvgTurn();
    }
}
