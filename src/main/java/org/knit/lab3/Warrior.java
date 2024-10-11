package org.knit.lab3;

public class Warrior extends Player implements Attaker{

    private int power = 10;

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
        player.decreaseHealth(power);
    }
}
