package org.knit.lab3;

public class Priest extends Player implements Healer{

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
    public void heal(Player player) {
        player.increaseHealth(power);
    }
}
