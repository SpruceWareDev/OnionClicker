package dev.spruce.game.graphics.pane.impl;

import com.raylib.Raylib;
import dev.spruce.game.gameplay.tower.impl.OnionFarmer;
import dev.spruce.game.graphics.pane.Pane;
import dev.spruce.game.state.GameState;

import static com.raylib.Raylib.DrawRectangle;
import static com.raylib.Raylib.GuiButton;

public class TowerPane extends Pane {

    private final GameState gameState;

    public TowerPane(GameState gameState, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.gameState = gameState;
    }

    @Override
    public void init() {

    }

    @Override
    public void update() {

    }

    @Override
    public void render() {
        DrawRectangle(getX(), getY(), getWidth(), getHeight(), com.raylib.Colors.LIGHTGRAY);

        Raylib.Rectangle buttonRect = new Raylib.Rectangle()
                .x(getX())
                .y(getY())
                .width(getWidth())
                .height(40);
        if(GuiButton(buttonRect, "Onion Farmer " + gameState.getTowerManager().getTowers().get(0).getCount()) == 1) {
            gameState.getTowerManager().addTower(OnionFarmer.TOWER_INDEX, 1);
        }
    }

    @Override
    public void dispose() {

    }
}
