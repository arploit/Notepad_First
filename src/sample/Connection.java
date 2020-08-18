package sample;

import  java.sql.*;

public class Connection {

    protected java.sql.Connection connection;

    public java.sql.Connection getConnection(){

        String url = "jdbc:mysql://localhost:3306/default";
        String uname = "root";
        String upass = "root@123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(url, uname, upass);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
}
