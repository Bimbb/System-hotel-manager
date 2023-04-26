/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84336
 */
public class Phong {
    private int MAPHONG;
    private String TENPHONG;
    private int IDKIEUPHONG;
    private int IDLOAIPHONG;

    public Phong(int MAPHONG, String TENPHONG, int IDKIEUPHONG, int IDLOAIPHONG) {
        this.MAPHONG = MAPHONG;
        this.TENPHONG = TENPHONG;
        this.IDKIEUPHONG = IDKIEUPHONG;
        this.IDLOAIPHONG = IDLOAIPHONG;
    }

    public Phong() {
    }

    public int getMAPHONG() {
        return MAPHONG;
    }

    public void setMAPHONG(int MAPHONG) {
        this.MAPHONG = MAPHONG;
    }

    public String getTENPHONG() {
        return TENPHONG;
    }

    public void setTENPHONG(String TENPHONG) {
        this.TENPHONG = TENPHONG;
    }

    public int getIDKIEUPHONG() {
        return IDKIEUPHONG;
    }

    public void setIDKIEUPHONG(int IDKIEUPHONG) {
        this.IDKIEUPHONG = IDKIEUPHONG;
    }

    public int getIDLOAIPHONG() {
        return IDLOAIPHONG;
    }

    public void setIDLOAIPHONG(int IDLOAIPHONG) {
        this.IDLOAIPHONG = IDLOAIPHONG;
    }
}
