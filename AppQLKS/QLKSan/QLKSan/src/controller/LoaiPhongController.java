/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static controller.Connectiondb.getConnect;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ConnectionDB;
import model.LoaiPhong;
import java.sql.PreparedStatement;


public class LoaiPhongController {
    
    public LoaiPhongController() {
    }
    
    private static Connection conn;
    public String CheckTenLoaiPhong(int MaLoaiPhong){
        String name = null;
        conn = getConnect();
        String sql = "select * from dbo.LoaiPhong where MaLoaiPhong = "+MaLoaiPhong;
        try {
             PreparedStatement  ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                name = rs.getString(2);
            }
        } catch (SQLException e) {
        }
        return name;
    }
    
    
    public static ArrayList<LoaiPhong> layDSLoaiPhong(){
        ArrayList<LoaiPhong> DSLoaiPhong = new ArrayList<>();
        try {
            
            String sql = "select * from LOAIPHONG";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                LoaiPhong lp = new LoaiPhong(rs.getInt(1),rs.getString(2));
                DSLoaiPhong.add(lp);
            }
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSLoaiPhong;
    }
    
    public static ArrayList<LoaiPhong> layDSLoaiPhongTheoTen(String TenLP){
        ArrayList<LoaiPhong> DSLoaiPhong = new ArrayList<>();
        try {
            
            String sql = "select * from LOAIPHONG where TENLOAIPHONG = N'"+TenLP+"'";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                LoaiPhong lp = new LoaiPhong(rs.getInt("IDLOAIPHONG"),rs.getString("TENLOAIPHONG"));
                DSLoaiPhong.add(lp);
            }
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSLoaiPhong;
    }
    
    public static String LayTenLoaiPhong(int ID){
        String name = null;
        Connection conn = ConnectionDB.getConnection();
        String sql = "select * from LOAIPhong where IDLOAIPHONG = "+ID+"";
        try{
            PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                name = rs.getString("TENLOAIPHONG");
            }
        }catch(SQLException ex){
            
        }
        return name;
    }
    
    public static boolean kiemtraDB(int Id){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from LOAIPhong where LOAIPHONG.IDLOAIPHONG = "+Id+"";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql_check);
            if(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean kiemtraTen(String TenLP){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from LOAIPhong where LOAIPHONG.TENLOAIPHONG = N'"+TenLP+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql_check);
            if(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean kiemtraTenTruDoiTuongDuocTron(int id,String TenLP){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from LOAIPhong where LOAIPHONG.TENLOAIPHONG = N'"+TenLP+"' and IDLOAIPHONG <> "+id+"";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql_check);
            if(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean Them(String TenLP){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(!kiemtraTen(TenLP)){
                String sql = "insert into LOAIPHONG values(N'"+TenLP+"')";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean Sua(int id,String TenLP){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(kiemtraDB(id)){
                String sql = "UPDATE LOAIPHONG SET TENLOAIPHONG = N'"+TenLP+"' WHERE IDLOAIPHONG = "+id+"";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean Xoa(int id){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(kiemtraDB(id)){
                String sql = "DELETE FROM LOAIPHONG where IDLOAIPHONG = "+id+"";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
