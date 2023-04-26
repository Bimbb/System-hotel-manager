/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDB {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyKhachSan;user=sa;password=1234";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    public static ResultSet ThucHien_Sql(String sql){
        ResultSet rs = null;
        try {
            Connection conn = ConnectionDB.getConnection();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}

