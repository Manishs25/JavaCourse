package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionConfig {
    public static Connection getConn(){
        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registering driver
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java25aug",
                    "root", "@mySQL1406"); //connection established

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
