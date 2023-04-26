/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ConnectionDB;
import model.VatTu;

/**
 *
 * @author 84336
 */
public class VatTuController {
    public static ArrayList<VatTu> layDSVatTu(){
        ArrayList<VatTu> DSVatTu = new ArrayList<>();
        try {
            
            String sql = "select * from VatTu";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                VatTu lp = new VatTu(rs.getInt(1),rs.getString(2),rs.getString(3));
                DSVatTu.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSVatTu;
    }
    
    public static ArrayList<VatTu> layDSVatTuTheoTen(String TenVT){
        ArrayList<VatTu> DSVatTu = new ArrayList<>();
        try {
            
            String sql = "select * from VatTu where TENVATTU like '%"+TenVT+"%'";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                VatTu lp = new VatTu(rs.getInt(1),rs.getString(2),rs.getString(3));
                DSVatTu.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSVatTu;
    }
    
    
    
    public static boolean kiemtraDB(int Id){
        Connection conn = ConnectionDB.getConnection();
        try {
            String sql_check = "select * from VatTu where IDVATTU = "+Id+"";
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
            String sql_check = "select * from VatTu where TENVATTU = '"+TenLP+"'";
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
            String sql_check = "select * from VatTu where TenVatTu = N'"+TenLP+"' and IDVATTU <> "+id+"";
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
    
    public static ArrayList<VatTu> LayVatTuTuId(int ID){
        ArrayList<VatTu> DSVatTu = new ArrayList<>();
        try {
            
            String sql = "select * from VatTu where IDVATtu = "+ID+"";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                VatTu lp = new VatTu(rs.getInt(1),rs.getString(2),rs.getString(3));
                DSVatTu.add(lp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSVatTu;
    }
    
    public static boolean Them(String TenLP,String XX){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(!kiemtraTen(TenLP)){
                String sql = "insert into VatTU values(N'"+TenLP+"',N'"+XX+"')";
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
    
    public static boolean Sua(int id,String TenLP,String XX){
        Connection conn = ConnectionDB.getConnection();
        try {
            if(kiemtraDB(id)){
                String sql = "UPDATE VATTU SET TENVATTU = N'"+TenLP+"', XUATXU = '"+XX+"' WHERE IDVATTU = "+id+"";
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
                String sql = "DELETE FROM VATTU where IDVATTU = "+id+"";
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
