package org.knit.lab2;

import java.util.Scanner;

class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return a / b;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Введите первое число: ");
            String input1 = scanner.nextLine();
            if (input1.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            }
            double num1;
            num1 = Double.parseDouble(input1);
            System.out.print("Введите оператор (+, -, *, /): ");
            String operator = scanner.nextLine();

            System.out.print("Введите второе число: ");
            String input2 = scanner.nextLine();

            if (input2.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            }
            double num2;
            num2 = Double.parseDouble(input2);
            try {
                double result = 0;
                switch (operator) {
                    case "+":
                        result = calculator.add(num1, num2);
                        break;
                    case "-":
                        result = calculator.subtract(num1, num2);
                        break;
                    case "*":
                        result = calculator.multiply(num1, num2);
                        break;
                    case "/":
                        result = calculator.divide(num1, num2);
                        break;
                }
                System.out.println("Результат: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
