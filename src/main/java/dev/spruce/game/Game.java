package dev.spruce.game;

import dev.spruce.game.state.GameState;
import dev.spruce.game.state.StateManager;

import static com.raylib.Colors.RAYWHITE;
import static com.raylib.Raylib.*;

public class Game {

    private static final String NAME = "OnionClicker", BUILD = "160825";
    public static final int FPS = 60;

    private static StateManager stateManager;

    public static void run() {
        InitWindow(800, 600, NAME);
        SetTargetFPS(FPS);
        stateManager = new StateManager();
        stateManager.setState(new GameState());

        while (!WindowShouldClose()) {
            update();
            BeginDrawing();
            ClearBackground(RAYWHITE);
            render();
            EndDrawing();
        }

        stateManager.dispose();
        CloseWindow();
    }

    private static void update() {
        stateManager.update();
    }

    private static void render() {
        stateManager.render();
    }
}
