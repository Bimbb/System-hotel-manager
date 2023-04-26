/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84336
 */
public class KieuPhong {
    private int IDKIEUPHONG;
    private String TENKIEUPHONG;
    
    public KieuPhong() {
    }

    public KieuPhong(int IDKIEUPHONG, String TENKIEUPHONG) {
        this.IDKIEUPHONG = IDKIEUPHONG;
        this.TENKIEUPHONG = TENKIEUPHONG;
    }

    public int getIDKIEUPHONG() {
        return IDKIEUPHONG;
    }

    public void setIDKIEUPHONG(int IDKIEUPHONG) {
        this.IDKIEUPHONG = IDKIEUPHONG;
    }

    public String getTENKIEUPHONG() {
        return TENKIEUPHONG;
    }

    public void setTENKIEUPHONG(String TENKIEUPHONG) {
        this.TENKIEUPHONG = TENKIEUPHONG;
    }
}
