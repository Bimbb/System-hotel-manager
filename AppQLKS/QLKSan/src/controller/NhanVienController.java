/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static controller.Connectiondb.getConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ConnectionDB;

import model.NhanVien;

public class NhanVienController {
    
    private static Connection conn;
    public String GetTenNhanVien(int MaNV) {
        String name = null;
        conn = getConnect();
        String sql = "select * from dbo.NhanVien where MaNV = " + MaNV;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                name = rs.getString(2);
            }
        } catch (SQLException e) {
        }
        return name;
    }
    
    
    public static ArrayList<NhanVien> layDSNhanVien(){
        ArrayList<NhanVien> DSNhanVien = new ArrayList<>();
        try {
            
            String sql = "select * from NhanVien";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                NhanVien lp = new NhanVien(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getString(4),rs.getString(5),rs.getFloat(6),rs.getString(7));
                DSNhanVien.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSNhanVien;
    }
    
    public static ArrayList<NhanVien> layDSNhanVienTheoTen(String TenNV){
        ArrayList<NhanVien> DSNhanVien = new ArrayList<>();
        try {
            
            String sql = "select * from NhanVien where NhanVien.TenNV like '%"+TenNV+"%'";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                NhanVien lp = new NhanVien(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getString(4),rs.getString(5),rs.getFloat(6),rs.getString(7));
                DSNhanVien.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSNhanVien;
    }
    
    
    // lay ra dich vu tu id
    public static ArrayList<NhanVien> LayNhanVienTheoID(int ID){
        ArrayList<NhanVien> DSNhanVien = new ArrayList<>();
        try {
            
            String sql = "select * from NhanVien where MANV = "+ID+"";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                NhanVien lp = new NhanVien(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getString(4),rs.getString(5),rs.getFloat(6),rs.getString(7));
                DSNhanVien.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSNhanVien;
    }
    
    // lay ten nhan vien
    
    public static String LayTenNhanVien(int ID){
        String name = null;
        Connection conn = ConnectionDB.getConnection();
        String sql = "select * from NhanVien where MANV = "+ID+"";
        try{
            java.sql.PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                name = rs.getString("TENNV");
            }
        }catch(SQLException ex){
            
        }
        return name;
    }
    
    public static int LayChucVu(int ID){
        int quyen = 0;
        Connection conn = ConnectionDB.getConnection();
        String sql = "Select QUYEN from NHANVIEN, TAIKHOAN where NHANVIEN.MANV = TAIKHOAN.MANV and  NHANVIEN.MANV = "+ID+"";
        try{
            java.sql.PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                quyen = rs.getInt("Quyen");
            }
        }catch(SQLException ex){
            
        }
        return quyen;
    }

    
    
    public static boolean kiemtraDB(int Id){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from NhanVien where NhanVien.MANV = "+Id+"";
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
            String sql_check = "select * from NHANVIEN where NHANVIEN.TENNV = '"+TenLP+"'";
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
    
    //Kiem tra trung ten khac voi doi tuong duoc tron, dùng trong lúc sua
    public static boolean kiemtraTenTruDoiTuongDuocTron(int id,String TenNV){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from NHANVIEN where TENNV = '"+TenNV+"' and MANV <> "+id+"";
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
    
    public static boolean Them(String TENNV, String NGAYSINH, String DIACHI, String CMND, Float LUONG){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(!kiemtraTen(TENNV)){
                String sql = "insert into NhanVien values(N'"+TENNV+"',Convert(Datetime,'"+NGAYSINH+"',105),N'"+DIACHI+"','"+CMND+"',"+LUONG+",'')";
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
    // sua trong fr_nhanvien
    public static boolean Sua(int MaNV,String TenNV,String NgaySinh, String DiaChi, String CMND, Float LUONG){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(kiemtraDB(MaNV)){
                String sql = "UPDATE NhanVien SET TENNV = N'"+TenNV+"',NGAYSINH = Convert(Datetime,'"+NgaySinh+"',103),DIACHI = N'"+DiaChi+"', CMND = '"+CMND+"', Luong = "+LUONG+" WHERE MANV = "+MaNV+"";
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
    
    
    // sua trong thong tin ca nhan
    public static boolean Sua1(int MaNV,String TenNV, String DiaChi, String CMND, Float LUONG, String ANHDAIDIEN){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(kiemtraDB(MaNV)){
                String sql = "UPDATE NhanVien SET TENNV = N'"+TenNV+"',DIACHI = '"+DiaChi+"', CMND = '"+CMND+"', Luong = "+LUONG+",ANHDAIDIEN = '"+ANHDAIDIEN+"' WHERE MANV = "+MaNV+"";
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
                String sql = "DELETE FROM NhanVien where MANV = "+id+"";
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
