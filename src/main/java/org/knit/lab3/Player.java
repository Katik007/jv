package org.knit.lab3;

public abstract class Player {
    protected int health;
    protected int healthMax;
    protected boolean isAlive;
    protected String name;
    protected int posX;
    protected int posY;
    protected int damage;
    protected int defense;

    public Player(int healthMax, String name, int posX, int posY, int damage, int defense) {
        this.health = healthMax;
        this.healthMax = healthMax;
        this.isAlive = true;
        this.name = name;
        this.posX = posX;
        this.posY = posY;
        this.damage = damage;
        this.defense = defense;
    }

    public void increaseHealth(int value) {
        if (!isAlive) {
            System.out.println(name + " не может быть вылечен, тк мертв");
            return;
        }
        health += value;
        if (health > healthMax) {
            health = healthMax;
        }
        System.out.println(name + " увеличил здоровье на " + value + " Текущее здоровье:" + health);
    }

    public void decreaseHealth(int value) {
        if (!isAlive) {
            System.out.println(name + " нельзя нанести урон, тк уже мертв");
            return;
        }
        int uron = value - defense;
        if (uron < 0) {
            uron = 0;
        }
        health -= uron;
        if (health > 0) {
            System.out.println(name + " потерял здоровье на " + uron + " Текущее здоровье: " + health);
        }
        if (health <= 0) {
            isAlive = false;
            health = 0;
            System.out.println(name + " погиб");
        }
    }

    public void move(int deltaX, int deltaY) {
        posX = deltaX;
        posY = deltaY;
        System.out.println(name + " переместился на (" + posX + ", " + posY + ")");
    }

    public String toString() {
        return "имя=" + name + ", здоровье: " + health + ", живой: " + isAlive + ", позиция по Х: " + posX + ", позиция по У: " + posY + ", урон: " + damage + ", защита: " + defense;
    }
}
