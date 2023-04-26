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
import model.DichVu;


public class DichVuController {
    public static ArrayList<DichVu> layDSDichVu(){
        ArrayList<DichVu> DSDichVu = new ArrayList<>();
        try {
            
            String sql = "select * from DichVu";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                DichVu lp = new DichVu(rs.getInt("IDDICHVU"),rs.getString("TENDICHVU"),rs.getFloat("DONGIABAN"),rs.getString("DVT"),rs.getInt("IDLOAIDICHVU"));
                DSDichVu.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSDichVu;
    }
    // tim kiem
    public static ArrayList<DichVu> layDSDichVuTheoTen(String TenDV){
        ArrayList<DichVu> DSLoaiPhong = new ArrayList<>();
        try {
            
            String sql = "select * from DICHVU where TENDICHVU like N'%"+TenDV+"%'";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                DichVu lp = new DichVu(rs.getInt("IDDichVu"),rs.getString("TENDichVu"),rs.getFloat("DONGIABAN"),rs.getString("DVT"),rs.getInt("IDLOAIDICHVU"));
                DSLoaiPhong.add(lp);
            }
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DichVuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSLoaiPhong;
    }
    
    // lay ten loai dich vu
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
    
    //lay id loai dich vu tu cbb
    public static int LayIdLoaiDichVu(String TenLDV){
        int id = -1;
        Connection conn = ConnectionDB.getConnection();
        String sql = "select * from LOAIDICHVU where TENLOAIDICHVU = N'"+TenLDV+"'";
        try{
            PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                id = rs.getInt("IDLOAIDICHVU");
            }
        }catch(SQLException ex){
            
        }
        return id;
    }
    
    
    
    // lay ra dich vu tu id
    public static ArrayList<DichVu> LayDichVuTuId(int ID){
        ArrayList<DichVu> DSDichVu = new ArrayList<>();
        try {
            
            String sql = "select * from DichVu where IDDICHVU = "+ID+"";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                DichVu lp = new DichVu(rs.getInt("IDDICHVU"),rs.getString("TENDICHVU"),rs.getFloat("DONGIABAN"),rs.getString("DVT"),rs.getInt("IDLOAIDICHVU"));
                DSDichVu.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSDichVu;
    }
    
    //kiem tra xem co trong CSDL ko
    public static boolean kiemtraDB(int Id){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from DICHVU where DICHVU.IDDICHVU = "+Id+"";
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
    
    //Kiem tra trung ten
    public static boolean kiemtraTen(String TenLP){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from DICHVU where DICHVU.TENDICHVU = '"+TenLP+"'";
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
    public static boolean kiemtraTenTruDoiTuongDuocTron(int id,String TenLP){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from DICHVU where DICHVU.TENDICHVU = '"+TenLP+"' and IDDICHVU <> "+id+"";
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
    
    //Them
    public static boolean Them(String TenDV,Float DonGia, String DVT, int LoaiDV){       
        Connection conn = ConnectionDB.getConnection();
        try {
            if(!kiemtraTen(TenDV)){
                String sql = "insert into DichVu values(N'"+TenDV+"',"+DonGia+",N'"+DVT+"',"+LoaiDV+")";
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
    
    
    public static boolean Sua(int id,String TenLP,Float DonGia, String DVT, int LoaiDV){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(kiemtraDB(id)){
                String sql = "UPDATE DICHVU SET TENDICHVU = N'"+TenLP+"',DONGIABAN = "+DonGia+", DVT = N'"+DVT+"',IDLOAIDICHVU = "+LoaiDV+" WHERE IDDICHVU = "+id+"";
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
                String sql = "DELETE FROM DICHVU where IDDICHVU = "+id+"";
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
