/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.TaiKhoanController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.TaiKhoan;

/**
 *
 * @author 84336
 */
public class fr_DoiMatKhau extends javax.swing.JFrame {

    public static String TaiKhoan;
    
    
    public fr_DoiMatKhau() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTenDV = new javax.swing.JLabel();
        btSave = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbDonGia = new javax.swing.JLabel();
        lbDVT = new javax.swing.JLabel();
        txtXacNhan = new javax.swing.JPasswordField();
        txtMatKhau = new javax.swing.JPasswordField();
        txtMatKhauMoi = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTenDV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTenDV.setForeground(new java.awt.Color(255, 51, 51));
        lbTenDV.setText("Mật khẩu");
        jPanel1.add(lbTenDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, 40));

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btSave.setText("Lưu");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 100, 40));

        btThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancelled.png"))); // NOI18N
        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 100, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 10, 10));

        lbDonGia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDonGia.setForeground(new java.awt.Color(255, 51, 51));
        lbDonGia.setText("Mật khẩu mới");
        jPanel1.add(lbDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, 40));

        lbDVT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDVT.setForeground(new java.awt.Color(255, 51, 51));
        lbDVT.setText("Xác nhận");
        jPanel1.add(lbDVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 120, 40));
        jPanel1.add(txtXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 240, 50));
        jPanel1.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 240, 50));
        jPanel1.add(txtMatKhauMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 240, 50));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        boolean kt = TaiKhoanController.kiemtraDB(TaiKhoan);
        if(kt == true){
            ArrayList<TaiKhoan> DSTK = TaiKhoanController.LayTkTuTenTK(TaiKhoan);
            for(TaiKhoan tk : DSTK){
                if(txtMatKhau.getText().equals(tk.getMATKHAU())){
                    if(txtMatKhauMoi.getText().equals(txtXacNhan.getText())){
                        boolean x =TaiKhoanController.SuaMK(TaiKhoan,txtXacNhan.getText());
                        if(x == false){
                            JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!");
                            this.setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Đổi mật khẩu không thành công!");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "xác nhận không đúng!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "mật khẩu không đúng!");
                }
            }
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btThoatActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_DoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JButton btThoat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDVT;
    private javax.swing.JLabel lbDonGia;
    private javax.swing.JLabel lbTenDV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtXacNhan;
    // End of variables declaration//GEN-END:variables
}
