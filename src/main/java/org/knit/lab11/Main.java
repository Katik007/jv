package org.knit.lab11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите команду: ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ", 3);

            switch (parts[0]) {
                case "add":
                    userService.registerUser(parts[1], parts[2]);
                    break;
                case "list":
                    userService.listAllUsers();
                    break;
                case "delete":
                    userService.deleteUser(Integer.parseInt(parts[1]));
                    break;
                case "update":
                    userService.updateUser(Integer.parseInt(parts[1]), parts[2], parts[3]);
                    break;
                case "exit":
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неизвестная команда.");
            }
        }
    }
}
