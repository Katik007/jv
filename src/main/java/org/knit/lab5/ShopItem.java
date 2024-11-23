package org.knit.lab5;

import java.util.Objects;

class ShopItem {
    private String name;
    private double price;
    private int quantity;

    // Конструктор
    public ShopItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ShopItem{Наименование='" + name + "', Цена=" + price + ", Количество=" + quantity + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        org.knit.lab5.ShopItem shopItem = (org.knit.lab5.ShopItem) o;
        return Double.compare(shopItem.price, price) == 0 &&
                quantity == shopItem.quantity &&
                Objects.equals(name, shopItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }
}
