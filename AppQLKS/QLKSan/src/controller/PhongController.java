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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ConnectionDB;
import model.Phong;


public class PhongController {
    
    public PhongController() {
    }
    private static Connection conn;

    public ArrayList<Phong> getPHONGTheoGio(Date NgayBD, Date NgayKT) {
        ArrayList<Phong> list = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String sql = "EXEC USP_GetListPHONGByDate '" + formatter.format(NgayBD) + "','" + formatter.format(NgayKT) + "'";
        conn = getConnect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Phong s = new Phong();
                s.setMAPHONG(rs.getInt(1));
                s.setTENPHONG(rs.getString(2));
                s.setIDLOAIPHONG(rs.getInt(3));
                list.add(s);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public Phong getPhongTheoMaPhong(int Map) {
        String sql = "select * from dbo.Phong where MaPhong = " + Map;
        conn = getConnect();
        Phong s = new Phong();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                s.setMAPHONG(rs.getInt(1));
                s.setTENPHONG(rs.getString(2));
                s.setIDLOAIPHONG(rs.getInt(3));
            }
        } catch (SQLException e) {

        }
        return s;
    }

    public ArrayList<Phong> getAllPhong() {
        ArrayList<Phong> list = new ArrayList<>();
        String sql = "select * from PHONG";
        conn = getConnect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Phong s = new Phong();
                s.setMAPHONG(rs.getInt(1));
                s.setTENPHONG(rs.getString(2));
                s.setIDLOAIPHONG(rs.getInt(3));
                list.add(s);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public static String CheckTenPhong(int Map) {
        String name = null;
        conn = getConnect();
        String sql = "select * from dbo.Phong where MaPhong = " + Map;
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

    public Phong getPhongTheoTenPhong(String TenPhong) {
        String sql = "select * from dbo.Phong where TENPHONG = " + "'" + TenPhong + "'";
        conn = getConnect();
        Phong s = new Phong();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                s.setMAPHONG(rs.getInt(1));
                s.setTENPHONG(rs.getString(2));
                s.setIDLOAIPHONG(rs.getInt(3));
            }
        } catch (SQLException e) {

        }
        return s;
    }
    
    
    
    
    public static ArrayList<Phong> layDSPhong(){
        ArrayList<Phong> DSPhong = new ArrayList<>();
        try {
            
            String sql = "select * from Phong";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                Phong lp = new Phong(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
                DSPhong.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSPhong;
    }
    
    public static ArrayList<Phong> layDSPhongTheoTen(String TenPhong){
        ArrayList<Phong> DSPhong = new ArrayList<>();
        try {
            
            String sql = "select * from Phong where TenPhong like N'%"+TenPhong+"%'";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                Phong lp = new Phong(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
                DSPhong.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSPhong;
    }
    
    public static ArrayList<Phong> LayPhongTuId(int ID){
        ArrayList<Phong> DSPhong = new ArrayList<>();
        try {
            
            String sql = "select * from Phong where MAPHONG = "+ID+"";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                Phong lp = new Phong(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
                DSPhong.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSPhong;
    }
    
    // lay ten loai dich vu
    public static String LayTenLoaiPhong(int ID){
        String name = null;
        Connection conn = ConnectionDB.getConnection();
        String sql = "select * from LOAIPHONG where IDLOAIPHONG = "+ID+"";
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
    
    //lay id loai dich vu tu cbb
    public static int LayIdLoaiPhong(String TenLDV){
        int id = -1;
        Connection conn = ConnectionDB.getConnection();
        String sql = "select * from LOAIPHONG where TENLOAIPHONG = N'"+TenLDV+"'";
        try{
            PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                id = rs.getInt("IDLOAIPHONG");
            }
        }catch(SQLException ex){
            
        }
        return id;
    }
    
    // lay ten loai dich vu
    public static String LayTenKieuPhong(int ID){
        String name = null;
        Connection conn = ConnectionDB.getConnection();
        String sql = "select * from KIEUPHONG where IDKIEUPHONG = "+ID+"";
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
    
    //lay id loai dich vu tu cbb
    public static int LayIdKieuPhong(String TenLDV){
        int id = -1;
        Connection conn = ConnectionDB.getConnection();
        String sql = "select * from KIEUPHONG where TENKIEUPHONG = N'"+TenLDV+"'";
        try{
            PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                id = rs.getInt("IDKIEUPHONG");
            }
        }catch(SQLException ex){
            
        }
        return id;
    }

    
    public static boolean kiemtraDB(int Id){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from PHONG where MAPHONG = "+Id+"";
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
            String sql_check = "select * from PHONG where TENPHONG = '"+TenLP+"'";
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
            String sql_check = "select * from Phong where TENPHONG = N'"+TenLP+"' and MAPHONG <> "+id+"";
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
    
    public static boolean Them(String TenLP,int kieuph, int loaiph){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(!kiemtraTen(TenLP)){
                String sql = "insert into Phong values(N'"+TenLP+"',"+kieuph+","+loaiph+")";
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
    
    public static boolean Sua(int id,String TenLP,int kieuph, int loaiph){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(kiemtraDB(id)){
                String sql = "UPDATE PHONG SET TENPHONG = N'"+TenLP+"',IDKIEUPHONG = "+kieuph+", IDLOAIPHONG= "+loaiph+" WHERE MAPHONG = "+id+"";
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
                String sql = "DELETE FROM PHONG where MAPHONG = "+id+"";
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
