package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java25aug", "root", "@mySQL1406");

        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        String addrress;

        System.out.println("Enter the values : ");
        id = sc.nextInt();
        name = sc.next();
        addrress = sc.next();

//      String insert = "insert into employee(id,name,addrress) values(?,?,?)";
        String update = "update employee set name = ?, addrress = ? where id = ?";
        PreparedStatement pst = connection.prepareStatement(update);

//
//        pst.setInt(1,id);
//        pst.setString(2,name);
//        pst.setString(3,addrress);

        pst.setString(1, name);
        pst.setString(2, addrress);
        pst.setInt(3, id);

        int count = pst.executeUpdate();
        System.out.println(count + " row update");

    }
}
