/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84336
 */
public class KhachHang {
    private String CMND;
    private String TENKHACHHANG;
    private String SDT;
    private String DIACHI;
    private byte GIOITINH;
    private String QUOCTICH;

    public KhachHang() {
    }

    public KhachHang(String CMND, String TENKHACHHANG, String SDT, String DIACHI, byte GIOITINH, String QUOCTICH) {
        this.CMND = CMND;
        this.TENKHACHHANG = TENKHACHHANG;
        this.SDT = SDT;
        this.DIACHI = DIACHI;
        this.GIOITINH = GIOITINH;
        this.QUOCTICH = QUOCTICH;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getTENKHACHHANG() {
        return TENKHACHHANG;
    }

    public void setTENKHACHHANG(String TENKHACHHANG) {
        this.TENKHACHHANG = TENKHACHHANG;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public byte getGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(byte GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public String getQUOCTICH() {
        return QUOCTICH;
    }

    public void setQUOCTICH(String QUOCTICH) {
        this.QUOCTICH = QUOCTICH;
    }
    
}
