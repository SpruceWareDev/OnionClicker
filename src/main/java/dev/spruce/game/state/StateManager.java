package dev.spruce.game.state;

public class StateManager {

    private State currentState;

    public void setState(State state) {
        if (currentState != null) {
            currentState.dispose();
        }
        currentState = state;
        currentState.init();
    }

    public void update() {
        if (currentState != null) {
            currentState.update();
        }
    }

    public void render() {
        if (currentState != null) {
            currentState.render();
        }
    }

    public void dispose() {
        if (currentState != null) {
            currentState.dispose();
            currentState = null;
        }
    }
}
