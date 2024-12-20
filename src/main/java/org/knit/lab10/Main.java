package org.knit.lab10;

import java.util.Arrays;
import java.util.List;

import static org.knit.lab10.FilterUtils.filter;
import static org.knit.lab10.MaxFinder.findMax;
import static org.knit.lab10.TypePrinter.printType;

public class Main {
    public static void main(String[] args) {
        System.out.println("000");
        Pair<String, Integer> pair = new Pair<>("Age", 30);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        pair.setSecond(35);
        System.out.println(pair.getSecond());
        System.out.println("000");
        Integer[] numbers = {1, 2, 33, 4, 5};
        System.out.println("Максимальное число: " + findMax(numbers));

        String[] words = {"apple", "tubanana", "cherry"};
        System.out.println("Максимальное слово: " + findMax(words));

        Double[] decimals = {1.1, 3.5, 2.4};
        System.out.println("Максимальное число (Double): " + findMax(decimals));
        System.out.println("000");
        Box<Integer> integerBox = new Box<>();
        integerBox.add(10);
        integerBox.add(20);
        System.out.println("Сумма (Int): " + integerBox.sum());
        Box<Double> doubleBox = new Box<>();
        doubleBox.add(1.5);
        doubleBox.add(2.5);
        System.out.println("Сумма (Double): " + doubleBox.sum());
        Box<Float> floatBox = new Box<>();
        floatBox.add(1.2f);
        floatBox.add(2.3f);
        System.out.println("Сумма (Float): " + floatBox.sum());

        System.out.println("000");
        List<String> words1 = Arrays.asList("apple", "banana", "cherry");
        List<String> filtered = filter(words1, s -> s.startsWith("b"));
        System.out.println(filtered);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = filter(numbers1, n -> n % 2 == 0);
        System.out.println(evenNumbers);

        List<Double> decimals1 = Arrays.asList(1.1, 2.2, 3.3, 4.4);
        List<Double> greaterThanThree = filter(decimals1, d -> d > 3.0);
        System.out.println(greaterThanThree);

        System.out.println("000");
        Dictionary<String, Integer> dictionary = new Dictionary<>();
        dictionary.put("Alice", 25);
        dictionary.put("Bob", 30);
        System.out.println("Alice: " + dictionary.get("Alice"));
        System.out.println("Bob: " + dictionary.get("Bob"));
        dictionary.put("Alice", 28);
        System.out.println("Alice (обновлено): " + dictionary.get("Alice"));
        dictionary.remove("Bob");
        System.out.println("Bob: " + dictionary.get("Bob"));
        dictionary.put("Jack", 58);
        System.out.println("Jack: " + dictionary.get("Jack"));

        System.out.println("000");
        printType(123);
        printType("Hello");
        printType(45.67);
        printType(true);
        printType(null);
    }
}
