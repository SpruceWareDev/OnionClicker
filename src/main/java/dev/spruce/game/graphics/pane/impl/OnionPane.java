package dev.spruce.game.graphics.pane.impl;

import dev.spruce.game.graphics.pane.Pane;
import dev.spruce.game.state.GameState;
import dev.spruce.game.util.MathUtils;

import static com.raylib.Raylib.*;

public class OnionPane extends Pane {

    private final GameState gameState;

    private float onionRadiusAnimation = 80;
    private boolean mouseOverOnion;

    public OnionPane(GameState gameState, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.gameState = gameState;
    }

    @Override
    public void init() {

    }

    @Override
    public void update() {
        mouseOverOnion = MathUtils.isPointInArea(
                GetMouseX(), GetMouseY(),
                250 / 2 - onionRadiusAnimation,
                GetScreenHeight() / 2 - onionRadiusAnimation,
                onionRadiusAnimation * 2, onionRadiusAnimation * 2
        );
        if (IsMouseButtonPressed(MOUSE_BUTTON_LEFT) && mouseOverOnion) {
            gameState.getOnionTracker().incrementOnions();
        }
    }

    @Override
    public void render() {
        DrawRectangle(0, 0, 250, GetScreenHeight(), com.raylib.Colors.LIGHTGRAY);

        DrawText("Run Time: " + gameState.getGameTimer().getFormattedTime(), 10, 10, 20, com.raylib.Colors.BLACK);
        DrawText("Onions: " + gameState.getOnionTracker().getOnions(), 10, 40, 20, com.raylib.Colors.BLACK);

        float circleRadiusTarget = IsMouseButtonDown(MOUSE_BUTTON_LEFT) && mouseOverOnion ? 100 : 80;
        onionRadiusAnimation = MathUtils.lerp(onionRadiusAnimation, circleRadiusTarget, 0.1f);
        DrawCircle(250 / 2, GetScreenHeight() / 2, onionRadiusAnimation, com.raylib.Colors.DARKGRAY);
    }

    @Override
    public void dispose() {

    }
}
