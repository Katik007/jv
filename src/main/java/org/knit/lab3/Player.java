package org.knit.lab3;

public abstract class Player {
    protected int health;
    protected String name;
    protected int posX;
    protected int posY;

    public Player(int health, String name, int posX, int posY) {
        this.health = health;
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }

    abstract void increaseHealth(int value);
    abstract void decreaseHealth(int value);
}
