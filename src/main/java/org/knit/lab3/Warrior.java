package org.knit.lab3;

public class Warrior extends Player implements Attaker{

    private int power = 10;

    public Warrior(int health, String name, int posX, int posY) {
        super(health, name, posX, posY);
    }
    @Override
    void increaseHealth(int value) {
        health += value;
    }

    @Override
    void decreaseHealth(int value) {
        health -= value;
    }

    @Override
    public void attak(Player player) {
        System.out.println(name + " атаковал " + player.name);
        player.decreaseHealth(power);
    }
}
