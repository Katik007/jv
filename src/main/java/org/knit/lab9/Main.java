package org.knit.lab9;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        for (Season season : Season.values()) {
//            System.out.println(season.name() + ": " +
//                    season.getTemperature() + ", типичный праздник - " +
//                    season.getHoliday());
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите текущий сигнал светофора (RED, YELLOW, GREEN):");
//        String input = scanner.next().toUpperCase();
//
//        TrafficLight currentLight = TrafficLight.valueOf(input);
//        TrafficLight nextLight = currentLight.getNext();
//        System.out.println("Следующий сигнал: " + nextLight);
//    }
    public static void main(String[] args) throws IllegalAccessException {
        // Создаём тестовый объект с некорректными значениями
        Us us = new Us(null, "Username123456789", 15);
        Validator.validate(us);
    }
}

