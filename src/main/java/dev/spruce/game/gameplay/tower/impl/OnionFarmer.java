package dev.spruce.game.gameplay.tower.impl;

import dev.spruce.game.gameplay.tower.Tower;

public class OnionFarmer extends Tower {

    public static final int TOWER_INDEX = 0;

    public OnionFarmer() {
        super("Onion Farmer", 200, 1);
    }

    @Override
    public void upgrade() {

    }

    @Override
    public double getOnionsPerSecond() {
        return getLevel() * 10 * getCount();
    }
}
