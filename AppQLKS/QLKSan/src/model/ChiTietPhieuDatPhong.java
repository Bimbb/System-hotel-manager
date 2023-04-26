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
public class ChiTietPhieuDatPhong {
    public int SoPhieuDatPhong;
    public int MaPhong;
    public Date GioRa;
    public Date GioVao;
    public int SoNguoi;    
    public String TinhTrangPhong;
    
    public void setSoPhieuDatPhong(int SoPhieuDatPhong) {
        this.SoPhieuDatPhong = SoPhieuDatPhong;
    }

    public void setMaPhong(int MaPhong) {
        this.MaPhong = MaPhong;
    }

    public void setGioRa(Date GioRa) {
        this.GioRa = GioRa;
    }

    public void setGioVao(Date GioVao) {
        this.GioVao = GioVao;
    }

    public void setSoNguoi(int SoNguoi) {
        this.SoNguoi = SoNguoi;
    }

    public void setTinhTrangPhong(String TinhTrangPhong) {
        this.TinhTrangPhong = TinhTrangPhong;
    }
  

    public int getSoPhieuDatPhong() {
        return SoPhieuDatPhong;
    }

    public int getMaPhong() {
        return MaPhong;
    }

    public Date getGioRa() {
        return GioRa;
    }

    public Date getGioVao() {
        return GioVao;
    }

    public int getSoNguoi() {
        return SoNguoi;
    }

    public String getTinhTrangPhong() {
        return TinhTrangPhong;
    }
}
