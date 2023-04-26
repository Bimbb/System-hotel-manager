/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class LoaiPhong {
    private int IDLOAIPHONG;
    private String TENLOAIPHONG;

    public LoaiPhong() {
    }

    public LoaiPhong(int IDLOAIPHONG, String TENLOAIPHONG) {
        this.IDLOAIPHONG = IDLOAIPHONG;
        this.TENLOAIPHONG = TENLOAIPHONG;
    }

    public int getIDLOAIPHONG() {
        return IDLOAIPHONG;
    }

    public void setIDLOAIPHONG(int IDLOAIPHONG) {
        this.IDLOAIPHONG = IDLOAIPHONG;
    }

    public String getTENLOAIPHONG() {
        return TENLOAIPHONG;
    }

    public void setTENLOAIPHONG(String TENLOAIPHONG) {
        this.TENLOAIPHONG = TENLOAIPHONG;
    }

    @Override
    public String toString() {
        return "LoaiPhong{" + "IDLOAIPHONG=" + IDLOAIPHONG + ", TENLOAIPHONG=" + TENLOAIPHONG + '}';
    }
}


