package org.knit.lab3;

public class Guard extends Warrior {
    private int newDefense = 10;

    public Guard(int health, String name, int posX, int posY, int damage, int newDefense) {
        super(health, name, posX, posY, damage, newDefense);
    }

    @Override
    public void decreaseHealth(int value) {
        if (!isAlive) {
            System.out.println(name + " нельзя нанести урон, тк уже мертв");
            return;
        }
        int uron = value - newDefense;
        if (uron < 0) {
            uron = 0;
        }
        health -= uron;
        if (health > 0) {
            System.out.println(name + " потерял здоровье с дополнительной защитой на " + uron + ". Текущее здоровье: " + health);
        }
        if (health <= 0) {
            isAlive = false;
            health = 0;
            System.out.println(name + " погиб");
        }
    }

    public String toString() {
        return "имя=" + name + ", здоровье: " + health + ", живой: " + isAlive + ", позиция по Х: " + posX + ", позиция по У: " + posY + ", урон: " + damage + ", защита: " + defense;
    }
}
