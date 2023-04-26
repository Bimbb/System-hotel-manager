/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84336
 */
public class VatTu {
    private int IDVATTU;
    private String TENVATTU;
    private String XUATXU;

    public VatTu() {
    }

    public VatTu(int IDVATTU, String TENVATTU, String XUATXU) {
        this.IDVATTU = IDVATTU;
        this.TENVATTU = TENVATTU;
        this.XUATXU = XUATXU;
    }

    public int getIDVATTU() {
        return IDVATTU;
    }

    public void setIDVATTU(int IDVATTU) {
        this.IDVATTU = IDVATTU;
    }

    public String getTENVATTU() {
        return TENVATTU;
    }

    public void setTENVATTU(String TENVATTU) {
        this.TENVATTU = TENVATTU;
    }

    public String getXUATXU() {
        return XUATXU;
    }

    public void setXUATXU(String XUATXU) {
        this.XUATXU = XUATXU;
    }
}
