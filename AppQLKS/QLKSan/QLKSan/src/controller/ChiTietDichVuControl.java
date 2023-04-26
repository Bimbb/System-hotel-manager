/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static controller.Connectiondb.getConnect;
import model.ChiTietDichVu;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ldlan
 */
public class ChiTietDichVuControl {
     private static Connection conn;
    
     public ArrayList<ChiTietDichVu> getlistChiTietDichVus(){
        ArrayList<ChiTietDichVu> list = new ArrayList<>();
        String sql = "SELECT * FROM CHITIETSDDICHVU";
        conn = getConnect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ChiTietDichVu s = new ChiTietDichVu();
                s.setSoPhieuSDDV(rs.getInt(1));
                s.setIDDichVu(rs.getInt(2));
                s.setSoLuong(rs.getInt(3));
                list.add(s);
            }
        } catch (SQLException e) {
        }
        return list;
    } 
    public ArrayList<ChiTietDichVu> getChiTietDichVuTheoSoPhieuDichVus(int sophieusddv){
        ArrayList<ChiTietDichVu> list = new ArrayList<>();
        String sql = "SELECT * FROM CHITIETSDDICHVU WHERE  SOPHIEUSDDV = "+sophieusddv+"";
        conn = getConnect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           while(rs.next()){
                ChiTietDichVu s = new ChiTietDichVu();
                s.setSoPhieuSDDV(rs.getInt(1));
                s.setIDDichVu(rs.getInt(2));
                s.setSoLuong(rs.getInt(3));
                list.add(s);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    
    
    

}
