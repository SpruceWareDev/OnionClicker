package dev.spruce.game.graphics.pane;

import java.util.ArrayList;
import java.util.List;

public class PaneManager {

    private List<Pane> panes;

    public PaneManager() {
        this.panes = new ArrayList<>();
    }

    public void addPane(Pane pane) {
        panes.add(pane);
        pane.init();
    }

    public void render() {
        for (Pane pane : panes) {
            pane.render();
        }
    }

    public void update() {
        for (Pane pane : panes) {
            pane.update();
        }
    }

    public void dispose() {
        for (Pane pane : panes) {
            pane.dispose();
        }
        panes.clear();
    }

    public List<Pane> getPanes() {
        return panes;
    }
}
