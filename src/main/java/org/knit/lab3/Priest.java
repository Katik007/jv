package org.knit.lab3;

public class Priest extends Player implements Healer {

    public Priest(int health, String name, int posX, int posY, int damage, int defense) {
        super(health, name, posX, posY, damage, defense);
    }

    @Override
    public void increaseHealth(int value) {
        if (!isAlive) {
            System.out.println(name + " не может быть вылечен, тк мертв");
            return;
        }
        health += value;
        if (health > healthMax) {
            health = healthMax;
        }
        System.out.println(name + " увеличил здоровье на " + value + ". Текущее здоровье:" + health);
    }

    @Override
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
            System.out.println(name + " потерял здоровье на " + uron + ". Текущее здоровье: " + health);
        }
        if (health <= 0) {
            isAlive = false;
            health = 0;
            System.out.println(name + " погиб");
        }
    }

    @Override
    public void move(int deltaX, int deltaY) {
        posX = deltaX;
        posY = deltaY;
        System.out.println(name + " переместился на (" + posX + ", " + posY + ")");
    }

    @Override
    public void heal(Player player) {
        if (!isAlive) {
            System.out.println(name + " не может вылечить, тк мертв");
            return;
        }
        System.out.println(name + " вылечил " + player.name + " на " + damage + " здоровья");
        player.increaseHealth(damage);
    }

    public String toString() {
        return "имя=" + name + ", здоровье: " + health + ", живой: " + isAlive + ", позиция по Х: " + posX + ", позиция по У: " + posY + ", урон: " + damage + ", защита: " + defense;
    }
}
