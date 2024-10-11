package org.knit.lab3;

public class Priest extends Player implements Healer{

    private int power = 10;

    public Priest(int health, String name, int posX, int posY) {
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
    public void heal(Player player) {
        System.out.println(name + " вылечил " + player.name);
        player.increaseHealth(power);
    }
}
