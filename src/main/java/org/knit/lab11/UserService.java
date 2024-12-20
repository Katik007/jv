package org.knit.lab11;

import java.sql.SQLException;
import java.util.List;

public class UserService {
    private UserDAO userDAO = new UserDAOImpl();

    public void registerUser(String name, String email) throws SQLException {
        if (userDAO.emailExists(email)) {
            System.out.println("Email уже существует!");
            return;
        }
        userDAO.create(new User(name, email));
        System.out.println("Пользователь добавлен.");
    }

    public void listAllUsers() throws SQLException {
        List<User> users = userDAO.findAll();
        users.forEach(System.out::println);
    }

    public void deleteUser(int id) throws SQLException {
        if (userDAO.findById(id) == null) {
            System.out.println("Пользователь не найден!");
            return;
        }
        userDAO.delete(id);
        System.out.println("Пользователь удален.");
    }

    public void updateUser(int id, String newName, String newEmail) throws SQLException {
        if (userDAO.findById(id) == null) {
            System.out.println("Пользователь не найден!");
            return;
        }
        userDAO.update(new User(id, newName, newEmail));
        System.out.println("Данные пользователя обновлены.");
    }
}
