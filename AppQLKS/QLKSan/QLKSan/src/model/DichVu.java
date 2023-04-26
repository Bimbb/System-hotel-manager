/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class DichVu{
    private int IDDICHVU;
    private String TENDICHVU;
    private float DONGIABAN;
    private String DVT;
    private int IDLOAIDICHVU;

    public DichVu() {
    }

    public DichVu(int IDDICHVU, String TENDICHVU, float DONGIABAN, String DVT, int IDLOAIDICHVU) {
        this.IDDICHVU = IDDICHVU;
        this.TENDICHVU = TENDICHVU;
        this.DONGIABAN = DONGIABAN;
        this.DVT = DVT;
        this.IDLOAIDICHVU = IDLOAIDICHVU;
    }

    public int getIDDICHVU() {
        return IDDICHVU;
    }

    public void setIDDICHVU(int IDDICHVU) {
        this.IDDICHVU = IDDICHVU;
    }

    public String getTENDICHVU() {
        return TENDICHVU;
    }

    public void setTENDICHVU(String TENDICHVU) {
        this.TENDICHVU = TENDICHVU;
    }

    public float getDONGIABAN() {
        return DONGIABAN;
    }

    public void setDONGIABAN(float DONGIABAN) {
        this.DONGIABAN = DONGIABAN;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public int getIDLOAIDICHVU() {
        return IDLOAIDICHVU;
    }

    public void setIDLOAIDICHVU(int IDLOAIDICHVU) {
        this.IDLOAIDICHVU = IDLOAIDICHVU;
    }
    
}
