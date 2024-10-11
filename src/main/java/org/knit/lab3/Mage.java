package org.knit.lab3;

public class Mage extends Player implements Caster{

    private int magic = 15;

    public Mage(int health, String name, int posX, int posY) {
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
    public void castSpell(Player player) {
        System.out.println(name + " кинул атакующее заклинание в " + player.name);
        player.decreaseHealth(magic);
    }
}
