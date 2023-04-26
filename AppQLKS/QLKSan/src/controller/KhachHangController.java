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
import model.KhachHang;

/**
 *
 * @author 84336
 */
public class KhachHangController {
    private static Connection conn;

    public KhachHangController() {
    }

    public KhachHang getKhachHangtheoCMND(String CMND) {
        String sql = "select * from dbo.KhachHang where CMND = " + CMND;
        conn = getConnect();
        KhachHang s = new KhachHang();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                s.setCMND(rs.getString(1));
                s.setTENKHACHHANG(rs.getString(2));
                s.setDIACHI(rs.getString(4));
                s.setGIOITINH(rs.getByte(5));
                s.setSDT(rs.getString(3));
                s.setQUOCTICH(rs.getString(6));
            }
        } catch (SQLException e) {

        }
        return s;
    }

    public String CheckCMND(String cmnd) {
        String name = null;
        conn = getConnect();
        String sql = "select * from dbo.KhachHang where CMND = " + cmnd;
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

    public boolean AddKhachHang(KhachHang KH) {
        String sql = "INSERT INTO KHACHHANG( CMND, TENKHACHHANG, SDT, DIACHI,GIOITINH,QUOCTICH) "
                + "VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, KH.getCMND());
            ps.setString(2, KH.getTENKHACHHANG());
            ps.setString(3, KH.getSDT());
            ps.setString(4, KH.getDIACHI());
            ps.setByte(5, KH.getGIOITINH());
            ps.setString(6, KH.getQUOCTICH());
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
        }
        return false;

    }
    
    
    
    
    public static ArrayList<KhachHang> layDSKhachHang(){
        ArrayList<KhachHang> DSKhachHang = new ArrayList<>();
        try {
            
            String sql = "select * from KhachHang";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                KhachHang lp = new KhachHang(rs.getString("CMND"),rs.getString("TENKHACHHANG"),rs.getString("SDT"),rs.getString("DIACHI"),rs.getByte("GIOITINH"),rs.getString("QUOCTICH"));
                DSKhachHang.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSKhachHang;
    }
    
    public static ArrayList<KhachHang> layDSKhachHangTheoTen(String TenKH){
        ArrayList<KhachHang> DSKhachHang = new ArrayList<>();
        try {
            
            String sql = "select * from KhachHang where KHACHHANG.TENKHACHHANG like '%"+TenKH+"%'";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                KhachHang lp = new KhachHang(rs.getString("CMND"),rs.getString("TENKHACHHANG"),rs.getString("SDT"),rs.getString("DIACHI"),rs.getByte("GIOITINH"),rs.getString("QUOCTICH"));
                DSKhachHang.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSKhachHang;
    }
    
    public static ArrayList<KhachHang> LayKhachHangTuCMND(String CMND){
        ArrayList<KhachHang> DSKH = new ArrayList<>();
        try {
            
            String sql = "select * from KhachHang where CMND = "+CMND+"";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                KhachHang lp = new KhachHang(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getByte(5),rs.getString(6));
                DSKH.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSKH;
    }
    
    public static String GioiTinh(byte x){
        if(x == 0){
            return "Nam";
        }
        return "Nữ";
        
    }
    
    public static boolean kiemtraDB(String CMND){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from KHACHHANG where CMND = '"+CMND+"'";
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

    public static boolean Xoa(String CMND){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(kiemtraDB(CMND)){
                String sql = "DELETE FROM KHACHHANG where CMND = "+CMND+"";
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
