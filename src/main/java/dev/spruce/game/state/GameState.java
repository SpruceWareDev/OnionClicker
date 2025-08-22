package dev.spruce.game.state;

import dev.spruce.game.gameplay.OnionTracker;
import dev.spruce.game.gameplay.tower.TowerManager;
import dev.spruce.game.gameplay.tower.impl.OnionFarmer;
import dev.spruce.game.gameplay.tower.impl.StarGate;
import dev.spruce.game.graphics.pane.PaneManager;
import dev.spruce.game.graphics.pane.impl.OnionPane;
import dev.spruce.game.graphics.pane.impl.TowerPane;
import dev.spruce.game.util.GameTimer;
import dev.spruce.game.util.MathUtils;

import static com.raylib.Raylib.*;

public class GameState extends State {

    private OnionTracker onionTracker;
    private GameTimer gameTimer;
    private PaneManager paneManager;

    private TowerManager towerManager;

    @Override
    public void init() {
        gameTimer = new GameTimer();

        towerManager = new TowerManager();

        onionTracker = new OnionTracker(this);

        paneManager = new PaneManager();
        paneManager.addPane(new OnionPane(this, 0, 0, 250, GetScreenHeight()));
        paneManager.addPane(new TowerPane(this, GetScreenWidth() - 250, 0, 250, GetScreenHeight()));
    }

    @Override
    public void update() {
        paneManager.update();
        gameTimer.update();
        onionTracker.update();
    }

    @Override
    public void render() {
        paneManager.render();
    }

    @Override
    public void dispose() {
        paneManager.dispose();
    }

    public OnionTracker getOnionTracker() {
        return onionTracker;
    }

    public GameTimer getGameTimer() {
        return gameTimer;
    }

    public PaneManager getPaneManager() {
        return paneManager;
    }

    public TowerManager getTowerManager() {
        return towerManager;
    }

}
