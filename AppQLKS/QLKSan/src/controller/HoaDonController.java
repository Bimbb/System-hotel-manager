/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ConnectionDB;
import model.HoaDon;
import model.LoaiDichVu;

/**
 *
 * @author 84336
 */
public class HoaDonController {
    public static ArrayList<HoaDon> layDSHoaDon(){
        ArrayList<HoaDon> DSHoaDon = new ArrayList<>();
        try {
            
            String sql = "select * from HoaDOn";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                HoaDon lp = new HoaDon(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8));
                DSHoaDon.add(lp);
            }
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSHoaDon;
    }
    
    public static ArrayList<HoaDon> layDSHoaDonTheoMa(String MaHD){
        ArrayList<HoaDon> DSHoaDon = new ArrayList<>();
        try {
            
            String sql = "select * from HOaDon where IDHOADON like %"+MaHD+"%";
            ResultSet rs = ConnectionDB.ThucHien_Sql(sql);
            
            while (rs.next()) {            
                HoaDon lp = new HoaDon(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8));
                DSHoaDon.add(lp);
            }
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(LoaiPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DSHoaDon;
    }
}
