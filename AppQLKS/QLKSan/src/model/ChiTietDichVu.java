/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ldlan
 */
public class ChiTietDichVu {
    public int SoPhieuSDDV;
    public int IDDichVu;
    public int SoLuong;

    public ChiTietDichVu() {
    }

    public ChiTietDichVu(int SoPhieuSDDV, int IDDichVu, int SoLuong) {
        this.SoPhieuSDDV = SoPhieuSDDV;
        this.IDDichVu = IDDichVu;
        this.SoLuong = SoLuong;
    }
    public int getSoPhieuSDDV() {
        return SoPhieuSDDV;
    }

    public int getIDDichVu() {
        return IDDichVu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoPhieuSDDV(int SoPhieuSDDV) {
        this.SoPhieuSDDV = SoPhieuSDDV;
    }

    public void setIDDichVu(int IDDichVu) {
        this.IDDichVu = IDDichVu;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    

    
}
