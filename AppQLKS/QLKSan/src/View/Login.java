/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.TaiKhoanController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.TaiKhoan;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTaiKhoan = new javax.swing.JTextField();
        btDangNhap = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();
        lbTaiKhoan = new javax.swing.JLabel();
        lbMatKhau = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btThoat = new javax.swing.JButton();
        or = new javax.swing.JLabel();
        checkHienMK = new javax.swing.JCheckBox();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTaiKhoan.setToolTipText("");
        txtTaiKhoan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(txtTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 270, 40));

        btDangNhap.setBackground(new java.awt.Color(0, 204, 255));
        btDangNhap.setText("Đăng nhập");
        btDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangNhapActionPerformed(evt);
            }
        });
        getContentPane().add(btDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 100, 50));

        txtMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMatKhau.setToolTipText("");
        txtMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 270, 40));

        lbTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lbTaiKhoan.setText("Tài khoản");
        getContentPane().add(lbTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 80, 30));

        lbMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lbMatKhau.setText("Mật khẩu");
        getContentPane().add(lbMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        btThoat.setBackground(new java.awt.Color(0, 204, 255));
        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 100, 50));

        or.setForeground(new java.awt.Color(255, 255, 255));
        or.setText("or");
        getContentPane().add(or, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        checkHienMK.setBackground(new java.awt.Color(255, 255, 255));
        checkHienMK.setText("Hiện mật khẩu");
        getContentPane().add(checkHienMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangNhapActionPerformed
        boolean kt = TaiKhoanController.kiemtraDB(txtTaiKhoan.getText());
        if(kt == true){
            ArrayList<TaiKhoan> DSTK = TaiKhoanController.LayTkTuTenTK(txtTaiKhoan.getText());
            for(TaiKhoan tk : DSTK){
                if(txtMatKhau.getText().equals(tk.getMATKHAU())){
                    JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
                    pn_Info.MANV = tk.getMANV();
                    pn_Info.Tk = tk.getTENTAIKHOAN();
                    System.err.println(tk.getMANV());
                    if(tk.getQUYEN() == 1){
                        fm_MainMenu form = new fm_MainMenu(1);
                        form.setVisible(true);
                    }
                    else if(tk.getQUYEN() == 2){
                        fm_MainMenu form = new fm_MainMenu(2);
                        form.setVisible(true);
                    }
                    else{
                        fm_MainMenu form = new fm_MainMenu(3);
                        form.setVisible(true);
                    }
                    txtTaiKhoan.setText("");
                    txtMatKhau.setText("");
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu không đúng!");
                }
            }
        }
    }//GEN-LAST:event_btDangNhapActionPerformed

    
    
    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa không!","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btThoatActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btDangNhap;
    private javax.swing.JButton btThoat;
    private javax.swing.JCheckBox checkHienMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbMatKhau;
    private javax.swing.JLabel lbTaiKhoan;
    private javax.swing.JLabel or;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
