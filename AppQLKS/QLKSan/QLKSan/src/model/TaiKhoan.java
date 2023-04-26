/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84336
 */
public class TaiKhoan {
    private String TENTAIKHOAN;
    private String MATKHAU;
    private int MANV;
    private int QUYEN;

    public TaiKhoan() {
    }

    public TaiKhoan(String TENTAIKHOAN, String MATKHAU, int MANV, int QUYEN) {
        this.TENTAIKHOAN = TENTAIKHOAN;
        this.MATKHAU = MATKHAU;
        this.MANV = MANV;
        this.QUYEN = QUYEN;
    }

    public String getTENTAIKHOAN() {
        return TENTAIKHOAN;
    }

    public void setTENTAIKHOAN(String TENTAIKHOAN) {
        this.TENTAIKHOAN = TENTAIKHOAN;
    }

    public String getMATKHAU() {
        return MATKHAU;
    }

    public void setMATKHAU(String MATKHAU) {
        this.MATKHAU = MATKHAU;
    }

    public int getMANV() {
        return MANV;
    }

    public void setMANV(int MANV) {
        this.MANV = MANV;
    }

    public int getQUYEN() {
        return QUYEN;
    }

    public void setQUYEN(int QUYEN) {
        this.QUYEN = QUYEN;
    }
}
