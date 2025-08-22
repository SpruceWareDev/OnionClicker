package dev.spruce.game.gameplay.tower;

import dev.spruce.game.gameplay.tower.impl.OnionFarmer;
import dev.spruce.game.gameplay.tower.impl.StarGate;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TowerManager {

    private CopyOnWriteArrayList<Tower> towers;

    public TowerManager() {
        this.towers = new CopyOnWriteArrayList<>();
        registerTowers();
    }

    private void registerTowers() {
        towers.add(new OnionFarmer());
        towers.add(new StarGate());
    }

    public void addTower(int index, int quantity) {
        towers.get(index).increaseCount(quantity);
    }

    public void removeTower(int index, int quantity) {
        towers.get(index).decreaseCount(quantity);
    }

    public double calculateOnionsPerSecond() {
        double totalOnionsPerSecond = 0;
        for (Tower tower : towers) {
            totalOnionsPerSecond += tower.getOnionsPerSecond();
        }
        return totalOnionsPerSecond;
    }

    public List<Tower> getTowers() {
        return towers;
    }
}
