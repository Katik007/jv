package org.knit.lab6;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentManager {

    public static void main(String[] args) {
        TreeSet<String> students = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Показать всех студентов");
            System.out.println("4. Найти студента");
            System.out.println("5. Выйти");

            System.out.print("Выберите опцию: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Введите имя студента: ");
                    String newStudent = scanner.nextLine();
                    if (students.contains(newStudent)) {
                        System.out.println("Ошибка: Студент уже существует.");
                    } else {
                        students.add(newStudent);
                        System.out.println("Студент добавлен.");
                    }
                    break;
                case 2:
                    System.out.print("Введите имя студента для удаления: ");
                    String removeStudent = scanner.nextLine();
                    if (students.remove(removeStudent)) {
                        System.out.println("Студент удален.");
                    } else {
                        System.out.println("Ошибка: Студент не найден.");
                    }
                    break;

                case 3:
                    System.out.println("Список студентов:");
                    if (students.isEmpty()) {
                        System.out.println("Список пуст.");
                    } else {
                        students.forEach(System.out::println);
                    }
                    break;
                case 4:
                    System.out.print("Введите имя студента для поиска: ");
                    String searchStudent = scanner.nextLine();
                    if (students.contains(searchStudent)) {
                        System.out.println("Студент найден.");
                    } else {
                        System.out.println("Студент не найден.");
                    }
                    break;
                case 5:
                    System.out.println("Выход из программы...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ошибка: Некорректный ввод. Попробуйте снова.");
            }
        }
    }
}