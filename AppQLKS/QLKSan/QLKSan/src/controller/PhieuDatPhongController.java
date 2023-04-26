/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static controller.Connectiondb.getConnect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PhieuDatPhong;

/**
 *
 * @author 84336
 */
public class PhieuDatPhongController {
    private static Connection conn;
    KhachHangController kh;

    public PhieuDatPhongController() {
    }

    public ArrayList<PhieuDatPhong> getListPhieuDatPhongs() {
        ArrayList<PhieuDatPhong> list = new ArrayList<>();
        String sql = "SELECT * FROM PHIEUDATPHONG";
        conn = getConnect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuDatPhong s = new PhieuDatPhong();
                s.setSoPhieuDatPhong(rs.getInt(1));
                s.setNgayDatPhong(rs.getDate(2));
                s.setTongTienDatPhong(rs.getFloat(3));

                s.setCMND(rs.getString(4));
                s.setMANV(rs.getInt(5));
                list.add(s);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public PhieuDatPhong getPhieuDatPhong(int soPhieuDatPhong) {
        String sql = "SELECT * FROM PHIEUDATPHONG WHERE  SOPHIEUDATPHONG = " + soPhieuDatPhong;
        conn = getConnect();
        PhieuDatPhong s = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
            s = new PhieuDatPhong();
            s.setSoPhieuDatPhong(rs.getInt(1));
            s.setNgayDatPhong(rs.getDate(2));
            s.setTongTienDatPhong(rs.getFloat(3));
            s.setCMND(rs.getString(4));
            s.setMANV(rs.getInt(5));
             }
        } catch (SQLException e) {
        }
        return s;
    }

    public boolean addPhieuDatPhong(PhieuDatPhong s) {

        String sql = "INSERT INTO PHIEUDATPHONG( NGAYDATPHONG, TONGTIENDATPHONG, CMND, MANV) "
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setFloat(2, s.getTongTienDatPhong());
            ps.setDate(1, new Date(s.getNgayDatPhong().getTime()));
            ps.setString(3, s.getCMND());
            ps.setInt(4, s.getMANV());
            
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
        }
        return false;
    }

    public int MaxSoPhieuDatPhong() {
        int name = 0;
        conn = getConnect();
        String sql = "Select Max(SoPhieuDatPhong) from PHIEUDATPHONG" ;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                name = rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return name;
    }

    public boolean updataPhieuDatPhong(PhieuDatPhong s) throws SQLException {
        if (s == null) {
            throw new SQLException("PhieuDatPhong Item rỗng");
        }
        String sql = "UPDATE PHIEUDATPHONG SET NGAYDATPHONG = ? and TONGTIENDATPHONG = ? WHERE SOPHIEUDATPHONG = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(3, s.getSoPhieuDatPhong());
            ps.setDate(1, new Date(s.getNgayDatPhong().getTime()));
            ps.setFloat(2, s.getTongTienDatPhong());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
        }

        return false;
    }

    public boolean deletePhieuDatPhong(PhieuDatPhong s) throws SQLException {
        if (s == null) {
            throw new SQLException("PhieuDatPhong Item rỗng");
        }
        String sql = "DELETE FROM PHIEUDATPHONG WHERE  SOPHIEUDATPHONG = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getSoPhieuDatPhong());
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
        }
        return false;
    }
}

