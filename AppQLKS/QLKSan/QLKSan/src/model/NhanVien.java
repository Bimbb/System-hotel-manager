/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author 84336
 */
public class NhanVien {
    private int MANV;
    private String TENNV;
    private Date NGAYSINH;
    private String DIACHI;
    private String CMND;
    private float LUONG;
    private String ANHDAIDIEN;

    public NhanVien() {
    }

    public NhanVien(int MANV, String TENNV, Date NGAYSINH, String DIACHI, String CMND, float LUONG, String ANHDAIDIEN) {
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.NGAYSINH = NGAYSINH;
        this.DIACHI = DIACHI;
        this.CMND = CMND;
        this.LUONG = LUONG;
        this.ANHDAIDIEN = ANHDAIDIEN;
    }

    public int getMANV() {
        return MANV;
    }

    public void setMANV(int MANV) {
        this.MANV = MANV;
    }

    public String getTENNV() {
        return TENNV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public Date getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(Date NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public float getLUONG() {
        return LUONG;
    }

    public void setLUONG(float LUONG) {
        this.LUONG = LUONG;
    }

    public String getANHDAIDIEN() {
        return ANHDAIDIEN;
    }

    public void setANHDAIDIEN(String ANHDAIDIEN) {
        this.ANHDAIDIEN = ANHDAIDIEN;
    }
}
