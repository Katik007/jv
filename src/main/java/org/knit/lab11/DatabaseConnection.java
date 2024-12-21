package org.knit.lab11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite:C:\\Users\\User\\GitHub\\jv\\src\\main\\java\\org\\knit\\lab11\\Kok";
//    private static final String USER = "your_user";
//    private static final String PASSWORD = "your_password";
    private static Connection connection;

    private DatabaseConnection() {}

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL);
        }
        return connection;
    }
}
