package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchStatementDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java25aug", "root", "@mySQL1406");

        String insert = "insert into employee(id,name,addrress) values(?,?,?)";

        PreparedStatement pst = connection.prepareStatement(insert);

        for(int i=20;i<30;i++) {
            pst.setString(2, "name"+i);
            pst.setString(3, "addrress"+i);
            pst.setInt(1, i);
            pst.addBatch();
        }

        int[] count = pst.executeBatch();
        System.out.println(count.length);
    }
}
