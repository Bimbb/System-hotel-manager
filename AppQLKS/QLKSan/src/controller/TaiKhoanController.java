package controller;


import static controller.PhongController.kiemtraTen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ConnectionDB;
import model.TaiKhoan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 84336
 */
public class TaiKhoanController {
    public static ArrayList<TaiKhoan> layDSTaiKhoan(){
        ArrayList<TaiKhoan> DSTaiKhoan = new ArrayList<>();
        try {
            
            String sql = "select * from TaiKhoan";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                TaiKhoan lp = new TaiKhoan(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
                DSTaiKhoan.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSTaiKhoan;
    }
    
    public static ArrayList<TaiKhoan> layDSTaiKhoanTheoTen(String TenDV){
        ArrayList<TaiKhoan> DSTaiKhoan = new ArrayList<>();
        try {
            
            String sql = "select * from TaiKhoan where TENTAIKHOAN like N'%"+TenDV+"%'";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                TaiKhoan lp = new TaiKhoan(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
                DSTaiKhoan.add(lp);
            }
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DichVuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSTaiKhoan;
    }
    
    // lay ra tk tu ten tk
    public static ArrayList<TaiKhoan> LayTkTuTenTK(String tentk){
        ArrayList<TaiKhoan> DSTaiKhoan = new ArrayList<>();
        try {
            
            String sql = "select * from TaiKhoan where TENTAIKHOAN = '"+tentk+"'";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                TaiKhoan lp = new TaiKhoan(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
                DSTaiKhoan.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSTaiKhoan;
    }
    
    // lay ten loai dich vu
    public static String LayTenNhanVien(int MaNV){
        String name = null;
        Connection conn = ConnectionDB.getConnection();
        String sql = "select * from NhanVien where MANV = "+MaNV+"";
        try{
            PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                name = rs.getString("TENNV");
            }
        }catch(SQLException ex){
            
        }
        return name;
    }
    
    //lay id loai dich vu tu cbb
    public static int LayMaNhanVien(String TenNV){
        int id = -1;
        Connection conn = ConnectionDB.getConnection();
        String sql = "select * from NHANVIEN where TENNV = N'"+TenNV+"'";
        try{
            PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                id = rs.getInt("MANV");
            }
        }catch(SQLException ex){
            
        }
        return id;
    }
    
    // lay cai ten quyen
    public static String Quyen(int x){
        if(x == 1){
            return "Nhân viên";
        }
        else if ( x == 2){
            return "Quản lý";
        }
        else{
            return "Admin";
        }
    }
    
    //kiem tra xem co trong CSDL ko
    public static boolean kiemtraDB(String tenTK){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from TaiKhoan where TenTaiKhoan = '"+tenTK+"'";
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
    
    public static boolean Them(String TenTK,String MK, int MaNV, int Quyen){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(!kiemtraTen(TenTK)){
                String sql = "insert into TAIKHOAN values('"+TenTK+"','"+MK+"',"+MaNV+","+Quyen+")";
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
    
    public static boolean Sua(String TenTK,int MaNV, int Quyen){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(kiemtraDB(TenTK)){
                String sql = "UPDATE TaiKhoan SET MANV = "+MaNV+", QUYEN = "+Quyen+" WHERE TENTAIKHOAN = '"+TenTK+"'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean SuaLaiTK(String TenTK,String Mk,int MaNV, int Quyen){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(kiemtraDB(TenTK)){
                String sql = "UPDATE TaiKhoan SET MatKhau = '"+Mk+"', MANV = "+MaNV+", QUYEN = "+Quyen+" WHERE TENTAIKHOAN = '"+TenTK+"'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean SuaMK(String TenTK, String Mk){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(kiemtraDB(TenTK)){
                String sql = "UPDATE TaiKhoan SET MATKHAU = "+Mk+" WHERE TENTAIKHOAN = '"+TenTK+"'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean Xoa(String TenTK){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(kiemtraDB(TenTK)){
                String sql = "DELETE FROM TAIKHOAN where TENTAIKHOAN = '"+TenTK+"'";
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
