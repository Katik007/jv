package org.knit.lab9;

enum Rank {
    ДВОЙКА("2"), ТРОЙКА("3"), ЧЕТВЁРКА("4"), ПЯТЁРКА("5"), ШЕСТЁРКА("6"), СЕМЁРКА("7"),
    ВОСЬМЁРКА("8"), ДЕВЯТКА("9"), ДЕСЯТКА("10"), ВАЛЕТ("Валет"), ДАМА("Дама"),
    КОРОЛЬ("Король"), ТУЗ("Туз");

    private final String displayName;

    Rank(String displayName) {
        this.displayName = displayName;
    }
    @Override
    public String toString() {
        return displayName;
    }
}
