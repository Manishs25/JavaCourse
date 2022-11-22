package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//ddl = create alter drop
//dml = insert update delete
//dql = select

//insert update delete = executeupdate query
//select = executeQuery

public class InsertDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java25aug", "root", "@mySQL1406");

            Statement statement = connection.createStatement();

//            String insert = "insert into employee(id,name,addrress) values(2,'Max','Satara')";

//            String update  = "update employee set name = 'Amit' where id = 2";

            String delete = "delete from employee where id=2";

            int count = statement.executeUpdate(delete);

            System.out.println(count + " row deleted ");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
