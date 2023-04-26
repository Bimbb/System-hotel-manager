/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84336
 */
public class LoaiDichVu {
    private int IDLOAIDICHVU;
    private String TENLOAIDICHVU;

    public LoaiDichVu() {
    }

    public LoaiDichVu(int IDLOAIDICHVU, String TENLOAIDICHVU) {
        this.IDLOAIDICHVU = IDLOAIDICHVU;
        this.TENLOAIDICHVU = TENLOAIDICHVU;
    }

    public int getIDLOAIDICHVU() {
        return IDLOAIDICHVU;
    }

    public void setIDLOAIDICHVU(int IDLOAIDICHVU) {
        this.IDLOAIDICHVU = IDLOAIDICHVU;
    }

    public String getTENLOAIDICHVU() {
        return TENLOAIDICHVU;
    }

    public void setTENLOAIDICHVU(String TENLOAIDICHVU) {
        this.TENLOAIDICHVU = TENLOAIDICHVU;
    }
    
}
