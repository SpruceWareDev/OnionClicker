package dev.spruce.game.gameplay;

import dev.spruce.game.Game;
import dev.spruce.game.state.GameState;

public class OnionTracker {

    private final GameState gameState;

    private long onions;
    private long onionsPerSecond;
    private int tickTracker;

    public OnionTracker(GameState gameState) {
        this.gameState = gameState;
        this.onions = 0;
        this.onionsPerSecond = 1;
        this.tickTracker = 0;
    }

    public void update() {
        onionsPerSecond = (long) gameState.getTowerManager().calculateOnionsPerSecond();
        tickTracker++;
        if (tickTracker >= Game.FPS) {
            tickTracker = 0;
            onions += onionsPerSecond;
        }
    }

    public void incrementOnions() {
        onions++;
    }

    public long getOnions() {
        return onions;
    }
}
