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
import model.LoaiDichVu;

/**
 *
 * @author 84336
 */
public class LoaiDichVuController {
    public static ArrayList<LoaiDichVu> layDSLoaiDV(){
        ArrayList<LoaiDichVu> DSLoaiDV = new ArrayList<>();
        try {
            
            String sql = "select * from LOAIDICHVU";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                LoaiDichVu lp = new LoaiDichVu(rs.getInt("IDLOAIDICHVU"),rs.getString("TENLOAIDICHVU"));
                DSLoaiDV.add(lp);
            }
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSLoaiDV;
    }
    
    public static ArrayList<LoaiDichVu> layDSLoaiDVTheoTen(String TenDV){
        ArrayList<LoaiDichVu> DSLoaiDV = new ArrayList<>();
        try {
            
            String sql = "select * from LOAIDICHVU where TENLOAIDICHVU = '"+TenDV+"'";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                LoaiDichVu lp = new LoaiDichVu(rs.getInt("IDLOAIDICHVU"),rs.getString("TENLOAIDICHVU"));
                DSLoaiDV.add(lp);
            }
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSLoaiDV;
    }
    
    public static String LayTenLoaiDichVu(int ID){
        String name = null;
        Connection conn = ConnectionDB.getConnection();
        String sql = "select * from LOAIDICHVU where IDLOAIDICHVU = "+ID+"";
        try{
            PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                name = rs.getString("TENLOAIDICHVU");
            }
        }catch(SQLException ex){
            
        }
        return name;
    }
    
    public static boolean kiemtraDB(int Id){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from LOAIDICHVU where IDLOAIDICHVU = "+Id+"";
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
    
    public static boolean kiemtraTen(String TenDV){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from LOAIDICHVU where TENLOAIDICHVU = N'"+TenDV+"'";
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
    
    public static boolean kiemtraTenTruDoiTuongDuocTron(int id,String TenDV){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from LOAIDICHVU where TENLOAIDICHVU = N'"+TenDV+"' and IDLOAIDICHVU <> "+id+"";
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
    
    public static boolean Them(String TenDV){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(!kiemtraTen(TenDV)){
                String sql = "insert into LOAIDICHVU values(N'"+TenDV+"')";
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
    
    public static boolean Sua(int id,String TenDV){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(kiemtraDB(id)){
                String sql = "UPDATE LOAIDICHVU SET TENLOAIDICHVU = N'"+TenDV+"' WHERE IDLOAIDICHVU = "+id+"";
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
                String sql = "DELETE FROM LOAIDICHVU where IDLOAIDICHVU = "+id+"";
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
