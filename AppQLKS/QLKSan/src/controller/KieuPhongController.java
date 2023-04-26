/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ConnectionDB;
import model.KieuPhong;


public class KieuPhongController {
    public static ArrayList<KieuPhong> layDSKieuPhong(){
        ArrayList<KieuPhong> DSKieuPhong = new ArrayList<>();
        try {
            
            String sql = "select * from KieuPhong";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                KieuPhong lp = new KieuPhong(rs.getInt("IDKIEUPHONG"),rs.getString("TENKIEUPHONG"));
                DSKieuPhong.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSKieuPhong;
    }
    
    public static ArrayList<KieuPhong> layDSKieuPhongTheoTen( String TenKP){
        ArrayList<KieuPhong> DSKieuPhong = new ArrayList<>();
        try {
            
            String sql = "select * from KieuPhong where KIEUPHONG.TENKIEUPHONG like '%"+TenKP+"%'";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                KieuPhong lp = new KieuPhong(rs.getInt("IDKIEUPHONG"),rs.getString("TENKIEUPHONG"));
                DSKieuPhong.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSKieuPhong;
    }
    
    public static String LayTenKieuPhong(int ID){
        String name = null;
        Connection conn = ConnectionDB.getConnection();
        String sql = "select * from KieuPhong where KIEUPHONG.IDKIEUPHONG = "+ID+"";
        try{
            PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                name = rs.getString("TENKIEUPHONG");
            }
        }catch(SQLException ex){
            
        }
        return name;
    }
    
    public static boolean kiemtraDB(int Id){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from KieuPhong where IDKIEUPHONG = "+Id+"";
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
            String sql_check = "select * from KieuPhong where TENKIEUPHONG = '"+TenLP+"'";
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
            String sql_check = "select * from KieuPhong where TENKIEUPHONG = '"+TenLP+"' and IDKIEUPHONG <> "+id+"";
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
                String sql = "insert into KIEUPHONG values(N'"+TenLP+"')";
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
                String sql = "UPDATE KIEUPHONG SET TENKIEUPHONG = N'"+TenLP+"' WHERE IDKIEUPHONG = "+id+"";
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
                String sql = "DELETE FROM KIEUPHONG where IDKIEUPHONG = "+id+"";
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
