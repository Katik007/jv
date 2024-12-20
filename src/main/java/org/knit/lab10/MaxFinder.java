package org.knit.lab10;


public class MaxFinder {

    // Универсальный метод для поиска максимального элемента
    public static <T extends Comparable<T>> T findMax(T[] array) {

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}