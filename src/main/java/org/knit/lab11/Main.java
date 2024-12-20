package org.knit.lab11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from users");
        preparedStatement.execute();
        ResultSet resultSet = preparedStatement.getResultSet();
        System.out.println(resultSet.next());
        while (resultSet.next()){
            System.out.println(resultSet.getString(2));
        }
    }
}
