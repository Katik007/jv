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

    public String divide(double a, double b)  {
        if (b == 0) {
            return "Ошибка: Деление на ноль невозможно.";
        }
        return String.valueOf(a / b);
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
            String result = "";
            switch (operator) {
                case "+":
                    result = String.valueOf(calculator.add(num1, num2));
                    break;
                case "-":
                    result = String.valueOf(calculator.subtract(num1, num2));
                    break;
                case "*":
                    result = String.valueOf(calculator.multiply(num1, num2));
                    break;
                case "/":
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    result = "Неверный оператор!";
            }
            System.out.println("Результат: " + result);
        }
        scanner.close();
    }
}
