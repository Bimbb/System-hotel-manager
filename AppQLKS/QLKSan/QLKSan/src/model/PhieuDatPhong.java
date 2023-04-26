/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ldlan
 */
public class PhieuDatPhong implements Serializable{
   public int SoPhieuDatPhong;
    public Date NgayDatPhong;
    public float TongTienDatPhong;
    public String CMND;
    public int  MaNV;

    public PhieuDatPhong(int SoPhieuDatPhong, Date NgayDatPhong, float TongTienDatPhong, String CMND, int MaNV) {
        this.SoPhieuDatPhong = SoPhieuDatPhong;
        this.NgayDatPhong = NgayDatPhong;
        this.TongTienDatPhong = TongTienDatPhong;
        this.CMND = CMND;
        this.MaNV = MaNV;
    }

    public PhieuDatPhong() {
    }

    public void setSoPhieuDatPhong(int SoPhieuDatPhong) {
        this.SoPhieuDatPhong = SoPhieuDatPhong;
    }

    public void setNgayDatPhong(Date NgayDatPhong) {
        this.NgayDatPhong = NgayDatPhong;
    }

    public void setTongTienDatPhong(float TongTienDatPhong) {
        this.TongTienDatPhong = TongTienDatPhong;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public void setMANV(int MaNV) {
        this.MaNV = MaNV;
    }

    public int getSoPhieuDatPhong() {
        return SoPhieuDatPhong;
    }

    public Date getNgayDatPhong() {
        return NgayDatPhong;
    }

    public float getTongTienDatPhong() {
        return TongTienDatPhong;
    }

    public String getCMND() {
        return CMND;
    }

    public int  getMANV() {
        return MaNV;
    }
}
