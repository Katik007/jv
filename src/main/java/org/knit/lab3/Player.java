package org.knit.lab3;

public abstract class Player {
    protected int health;
    protected String name;
    
    abstract void increaseHealth(int value);
    abstract void decreaseHealth(int value);
}
