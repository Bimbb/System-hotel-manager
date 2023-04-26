/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ldlan
 */
public class HoaDon {
        public int IDHoaDon;        
        public String NgayLap;
        public float TongTien;
        public int SoPhieuDatPhong;
        public int TinhTrang;
        public int SoPhieuSDDV;
        public int MaNV;
        public int MaPhong;

    public HoaDon() {
    }

    public HoaDon(int IDHoaDon, String NgayLap, float TongTien, int SoPhieuDatPhong, int TinhTrang, int SoPhieuSDDV, int MaNV, int MaPhong) {
        this.IDHoaDon = IDHoaDon;
        this.NgayLap = NgayLap;
        this.TongTien = TongTien;
        this.SoPhieuDatPhong = SoPhieuDatPhong;
        this.TinhTrang = TinhTrang;
        this.SoPhieuSDDV = SoPhieuSDDV;
        this.MaNV = MaNV;
        this.MaPhong = MaPhong;
    }

    public void setIDHoaDon(int IDHoaDon) {
        this.IDHoaDon = IDHoaDon;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }

    public void setSoPhieuDatPhong(int SoPhieuDatPhong) {
        this.SoPhieuDatPhong = SoPhieuDatPhong;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public void setSoPhieuSDDV(int SoPhieuSDDV) {
        this.SoPhieuSDDV = SoPhieuSDDV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public void setMaPhong(int MaPhong) {
        this.MaPhong = MaPhong;
    }

    public int getIDHoaDon() {
        return IDHoaDon;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public float getTongTien() {
        return TongTien;
    }

    public int getSoPhieuDatPhong() {
        return SoPhieuDatPhong;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public int getSoPhieuSDDV() {
        return SoPhieuSDDV;
    }

    public int getMaNV() {
        return MaNV;
    }

    public int getMaPhong() {
        return MaPhong;
    }
}
