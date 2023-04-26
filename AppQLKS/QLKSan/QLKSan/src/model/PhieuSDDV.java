/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ldlan
 */
public class PhieuSDDV {
    public int SoPhieuSDDV;
        public int MaPhong;
        public Date NgaySuDung;
        public float TongTienDV;
        public int SoPhieuDatPhong;

    public PhieuSDDV() {
    }

    public PhieuSDDV(int SoPhieuSDDV, int MaPhong, Date NgaySuDung, float TongTienDV, int SoPhieuDatPhong) {
        this.SoPhieuSDDV = SoPhieuSDDV;
        this.MaPhong = MaPhong;
        this.NgaySuDung = NgaySuDung;
        this.TongTienDV = TongTienDV;
        this.SoPhieuDatPhong = SoPhieuDatPhong;
    }

        
    public void setSoPhieuSDDV(int SoPhieuSDDV) {
        this.SoPhieuSDDV = SoPhieuSDDV;
    }

    public void setMaPhong(int MaPhong) {
        this.MaPhong = MaPhong;
    }

    public void setNgaySuDung(Date NgaySuDung) {
        this.NgaySuDung = NgaySuDung;
    }

    public void setTongTienDV(float TongTienDV) {
        this.TongTienDV = TongTienDV;
    }

    public void setSoPhieuDatPhong(int SoPhieuDatPhong) {
        this.SoPhieuDatPhong = SoPhieuDatPhong;
    }
    public int getSoPhieuSDDV() {
        return SoPhieuSDDV;
    }

    public int getMaPhong() {
        return MaPhong;
    }

    public Date getNgaySuDung() {
        return NgaySuDung;
    }

    public float getTongTienDV() {
        return TongTienDV;
    }

    public int getSoPhieuDatPhong() {
        return SoPhieuDatPhong;
    }
     

}
