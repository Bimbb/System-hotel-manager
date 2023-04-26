
package controller;

import java.sql.*;

public class Connectiondb {

     public static Connection getConnect()
    {
        Connection conn=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl=
                    "jdbc:sqlserver://localhost:1433;databaseName=QuanLyKhachSan;user=sa;password=1234";
            conn= DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());
        } catch (ClassNotFoundException cE) {
            System.out.println("Class Not Found Exception: "+ cE.toString());
        }
        return conn;
    }


    
}
