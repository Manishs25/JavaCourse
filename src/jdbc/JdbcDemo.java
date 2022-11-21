package jdbc;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java25aug", "root", "@mySQL1406");

            Statement statement = connection.createStatement();

            String select = "select * from employee";

            ResultSet resultSet = statement.executeQuery(select);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.
                        getString(2) + " " + resultSet.getString(3)); //Connection established.
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);

        }

    }
}
