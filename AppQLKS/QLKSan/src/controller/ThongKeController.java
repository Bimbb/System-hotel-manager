/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConnectionDB;
import model.PhieuDatPhong;
import model.PhieuSDDV;

/**
 *
 * @author 84336
 */
public class ThongKeController {
    public static ArrayList<PhieuSDDV> layDSSDDV(){
        ArrayList<PhieuSDDV> DSSDDV = new ArrayList<>();
        try {
            
            String sql = "select * from PHIEUSDDV";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                PhieuSDDV lp = new PhieuSDDV(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getFloat(4),rs.getInt(5));
                DSSDDV.add(lp);
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(LoaiPhongController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return DSSDDV;
    }
    
    public static ArrayList<PhieuDatPhong> layDSPhieuDatPhong(){
        ArrayList<PhieuDatPhong> DSPhieuDatPhong = new ArrayList<>();
        try {
            
            String sql = "select * from PHIEUDATPHONG";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                PhieuDatPhong lp = new PhieuDatPhong(rs.getInt(1),rs.getDate(2),rs.getFloat(3),rs.getString(4),rs.getInt(5));
                DSPhieuDatPhong.add(lp);
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(LoaiPhongController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return DSPhieuDatPhong;
    }
    
    public static ArrayList<PhieuSDDV> layTienDVTheoNam(int nam){
        ArrayList<PhieuSDDV> DSSDDV = new ArrayList<>();
        try {
            
            String sql = "Select * From PHIEUSDDV where  YEAR(NGAYSDDV) = "+nam+"";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                PhieuSDDV lp = new PhieuSDDV(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getFloat(4),rs.getInt(5));
                DSSDDV.add(lp);
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(LoaiPhongController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return DSSDDV;
    }
    
    public static ArrayList<PhieuDatPhong> layTienPhongTheoNam(int nam){
        ArrayList<PhieuDatPhong> DSPhieuDatPhong = new ArrayList<>();
        try {
            
            String sql = "Select * From PHIEUDATPHONG where  YEAR(NGAYDATPHONG) = "+nam+"";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                PhieuDatPhong lp = new PhieuDatPhong(rs.getInt(1),rs.getDate(2),rs.getFloat(3),rs.getString(4),rs.getInt(5));
                DSPhieuDatPhong.add(lp);
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(LoaiPhongController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return DSPhieuDatPhong;
    }
    
    public static ArrayList<PhieuSDDV> layTienDVTheoThang(int nam, int thang){
        ArrayList<PhieuSDDV> DSSDDV = new ArrayList<>();
        try {
            
            String sql = "Select * From PHIEUSDDV where  YEAR(NGAYSDDV) = "+nam+" and MONTH(NGAYSDDV) = "+thang+"";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                PhieuSDDV lp = new PhieuSDDV(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getFloat(4),rs.getInt(5));
                DSSDDV.add(lp);
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(LoaiPhongController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return DSSDDV;
    }
    
    public static ArrayList<PhieuDatPhong> layTienPhongTheoThang(int nam, int thang){
        ArrayList<PhieuDatPhong> DSPhieuDatPhong = new ArrayList<>();
        try {
            
            String sql = "Select * From PHIEUDATPHONG where  YEAR(NGAYDATPHONG) = "+nam+" and MONTH(NGAYDATPHONG) = "+thang+"";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                PhieuDatPhong lp = new PhieuDatPhong(rs.getInt(1),rs.getDate(2),rs.getFloat(3),rs.getString(4),rs.getInt(5));
                DSPhieuDatPhong.add(lp);
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(LoaiPhongController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return DSPhieuDatPhong;
    }
}
