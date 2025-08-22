package dev.spruce.game.gameplay.tower;

public abstract class Tower {

    protected String name;
    protected int cost;
    protected int level;
    protected int count;

    public Tower(String name, int cost, int level) {
        this.name = name;
        this.cost = cost;
        this.level = level;
        this.count = 0;
    }

    public abstract void upgrade();
    public abstract double getOnionsPerSecond();

    public void increaseCount(int quantity) {
        this.count += quantity;
    }

    public void decreaseCount(int quantity) {
        if (this.count - quantity >= 0) {
            this.count -= quantity;
        }
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getLevel() {
        return level;
    }

    public int getCount() {
        return count;
    }
}
