/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Custom;

import java.awt.Color;

/**
 *
 * @author ldlan
 */
public class PhongView extends javax.swing.JPanel {

    /**
     * Creates new form PhongView
     */
    public PhongView() {
        initComponents();
    }

    public String getTenKhach() {
        return lbTenKhach.getText();
    }

    public void setTenKhach(String Name) {
        lbTenKhach.setText(Name);
    }

    public String getSoPhong() {
        return lbSoPhong.getText();
    }

    public void setSoPhong(String SoPhong) {
        lbSoPhong.setText(SoPhong);
    }

    public String getTinhTrang() {
        return lbTinhTrang.getText();
    }

    public void setTinhTrang(String TinhTrang) {
        lbTinhTrang.setText(TinhTrang);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbSoPhong = new javax.swing.JLabel();
        lbTinhTrang = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbTenKhach = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSoPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSoPhong.setText("so Phong");
        add(lbSoPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbTinhTrang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTinhTrang.setText("tinh trang");
        add(lbTinhTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_user_48px_1.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        lbTenKhach.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTenKhach.setText("TenKhach");
        add(lbTenKhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
       
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbSoPhong;
    private javax.swing.JLabel lbTenKhach;
    private javax.swing.JLabel lbTinhTrang;
    // End of variables declaration//GEN-END:variables
}
