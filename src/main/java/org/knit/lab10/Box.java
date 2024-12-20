package org.knit.lab10;
import java.util.ArrayList;
import java.util.List;

public class Box<T extends Number> {
    private List<T> numbers;
    public Box() {
        numbers = new ArrayList<>();
    }
    public void add(T number) {
        numbers.add(number);
    }

    public double sum() {
        double total = 0.0;
        for (T number : numbers) {
            total += number.doubleValue(); // Преобразуем число в double
        }
        return total;
    }
}