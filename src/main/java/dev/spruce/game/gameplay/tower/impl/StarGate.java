package dev.spruce.game.gameplay.tower.impl;

import dev.spruce.game.gameplay.tower.Tower;

public class StarGate extends Tower {

    public static final int TOWER_INDEX = 1;

    private static final double BASE_MULTIPLIER = 1E6;

    public StarGate() {
        super("Star Gate", 500, 1);
    }

    @Override
    public void upgrade() {
        level++;
    }

    @Override
    public double getOnionsPerSecond() {
        return level * BASE_MULTIPLIER * getCount();
    }
}
