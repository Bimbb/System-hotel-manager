/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Custom;

import java.util.Date;

/**
 *
 * @author ldlan
 */
public class CT_PhieuDatPhong_Custom {

    public int MAPHONG;
    public Date GIOVAO;
    public Date GIORA;
    public int SONGUOI;
    public int SoNgay;
    public int SoGio;

    public CT_PhieuDatPhong_Custom() {
    }

    public CT_PhieuDatPhong_Custom(int MAPHONG, Date GIOVAO, Date GIORA, int SONGUOI, int SoNgay, int SoGio) {
        this.MAPHONG = MAPHONG;
        this.GIOVAO = GIOVAO;
        this.GIORA = GIORA;
        this.SONGUOI = SONGUOI;
        this.SoNgay = SoNgay;
        this.SoGio = SoGio;
    }

    public int getMAPHONG() {
        return MAPHONG;
    }

    public Date getGIOVAO() {
        return GIOVAO;
    }

    public Date getGIORA() {
        return GIORA;
    }

    public int getSONGUOI() {
        return SONGUOI;
    }

    public int getSoNgay() {
        return SoNgay;
    }

    public int getSoGio() {
        return SoGio;
    }

    public void setMAPHONG(int MAPHONG) {
        this.MAPHONG = MAPHONG;
    }

    public void setGIOVAO(Date GIOVAO) {
        this.GIOVAO = GIOVAO;
    }

    public void setGIORA(Date GIORA) {
        this.GIORA = GIORA;
    }

    public void setSONGUOI(int SONGUOI) {
        this.SONGUOI = SONGUOI;
    }

    public void setSoNgay(int SoNgay) {
        this.SoNgay = SoNgay;
    }

    public void setSoGio(int SoGio) {
        this.SoGio = SoGio;
    }
    
}
