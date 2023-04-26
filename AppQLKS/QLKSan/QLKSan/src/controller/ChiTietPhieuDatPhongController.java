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
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.ChiTietPhieuDatPhong;

/**
 *
 * @author 84336
 */
public class ChiTietPhieuDatPhongController {
    public ChiTietPhieuDatPhongController() {

    }
    private Connection conn;

    public boolean addChiTietDatPhong(ChiTietPhieuDatPhong Ctpdp) {
        String sql = "INSERT INTO CHITIETPHIEUDATPHONG(SOPHIEUDATPHONG, MAPHONG, GIOVAO, GIORA, SONGUOI, TINHTRANGPHONG) "
                + "VALUES(?,?,?,?,?,?)";
        conn = getConnect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Ctpdp.getSoPhieuDatPhong());
            ps.setInt(2, Ctpdp.getMaPhong());
            Timestamp gv = new Timestamp(Ctpdp.getGioVao().getTime());
            ps.setTimestamp(3, gv);
            Timestamp gr = new Timestamp(Ctpdp.getGioRa().getTime());
            ps.setTimestamp(4, gr);
            ps.setInt(5, Ctpdp.getSoNguoi());
            ps.setString(6, Ctpdp.getTinhTrangPhong());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<ChiTietPhieuDatPhong> getListChiTietPhieuDatPhongs(int soPhieuDatPhong) {
        ArrayList<ChiTietPhieuDatPhong> list = new ArrayList<>();
        String sql = "select * from CHITIETPHIEUDATPHONG where SOPHIEUDATPHONG =" + soPhieuDatPhong;
        conn = getConnect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietPhieuDatPhong s = new ChiTietPhieuDatPhong();
                s.setSoPhieuDatPhong(rs.getInt(1));
                s.setMaPhong(rs.getInt(2));
                s.setGioRa(rs.getTimestamp(4));
                s.setGioVao(rs.getTimestamp(3));
                s.setSoNguoi(rs.getInt(5));
                s.setTinhTrangPhong(rs.getString(6));
                list.add(s);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public ChiTietPhieuDatPhong getChiTietPhieuDatPhongTheoNgayMap(int map, java.util.Date ngay) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String sql = "select Top(1) * from CHITIETPHIEUDATPHONG where MAPHONG = " + map + " and GioVao = '" + formatter.format(ngay) + "'";
        conn = getConnect();
        ChiTietPhieuDatPhong s = new ChiTietPhieuDatPhong();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                s.setSoPhieuDatPhong(rs.getInt(1));
                s.setMaPhong(rs.getInt(2));
                s.setGioRa(rs.getTimestamp(4));
                s.setGioVao(rs.getTimestamp(3));
                s.setSoNguoi(rs.getInt(5));
                s.setTinhTrangPhong(rs.getString(6));
                return s;
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public ChiTietPhieuDatPhong getChiTietPhieuDatPhongTheoSoPhieuMap(int map, int sophieudatphong) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String sql = "select Top(1) * from CHITIETPHIEUDATPHONG where MAPHONG = " + map + " and SOPHIEUDATPHONG = " + sophieudatphong;
        conn = getConnect();
        ChiTietPhieuDatPhong s = new ChiTietPhieuDatPhong();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                s.setSoPhieuDatPhong(rs.getInt(1));
                s.setMaPhong(rs.getInt(2));
                s.setGioRa(rs.getTimestamp(4));
                s.setGioVao(rs.getTimestamp(3));
                s.setSoNguoi(rs.getInt(5));
                s.setTinhTrangPhong(rs.getString(6));
                return s;
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public boolean updataTinhTrangPhongThue(int map, int sophieudatphong,String TinhTrang) {
        String sql = "UPDATE CHITIETPHIEUDATPHONG SET TinhTrangPhong = '"+TinhTrang+"' Where MAPHONG = " + map + " and SOPHIEUDATPHONG = " + sophieudatphong;
        conn = getConnect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           if(rs.next()){
               return true;
           }
        } catch (SQLException e) {
        }

        return false;
    }
}
