package org.knit.lab9;

public class Cards {
    public static void main(String[] args) {
        // Генерация колоды из 52 карт
        System.out.println("Стандартная 52-карточная колода:");
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                System.out.println(rank + " " + suit);
            }
        }
    }
}

