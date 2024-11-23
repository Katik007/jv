package org.knit.lab5;
import java.util.*;


public class Task8 {
    public static void main(String[] args) {
        String[] names = {"книга", "ручка", "линейка", "пенал"};
        Random random = new Random();

        ShopItem[] items = new ShopItem[100];
        for (int i = 0; i < items.length; i++) {
            String name = names[random.nextInt(names.length)];
            double price = 10 + (random.nextInt(40));
            int quantity = random.nextInt(10) + 1;
            items[i] = new ShopItem(name, price, quantity);
        }

        // Сортировка по имени
        Arrays.sort(items, Comparator.comparing(ShopItem::getName).thenComparing(ShopItem::getPrice));
        System.out.println("Отсортированные ShopItem:");
        for (ShopItem item : items) {
            System.out.println(item);
        }

        Map<ShopItem, Integer> itemCounts = new HashMap<>();
        for (ShopItem item : items) {
            itemCounts.put(item, itemCounts.getOrDefault(item, 0) + 1);
        }


        System.out.println("\nКоличество одинаковых ShopItem:");
        for (Map.Entry<ShopItem, Integer> entry : itemCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " встречается " + entry.getValue() + " раз(а)");
            }
        }
    }
}