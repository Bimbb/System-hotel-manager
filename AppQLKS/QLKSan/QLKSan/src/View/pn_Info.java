/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import controller.NhanVienController;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.NhanVien;


public class pn_Info extends javax.swing.JPanel {

    public static int MANV;
    String duongdananh = "";
    
    public pn_Info() {
        initComponents();
        MANV = 1;
        hienthongtin();
    }

    public void hienthongtin(){
        ArrayList<NhanVien> nhanVien = NhanVienController.LayNhanVienTheoID(MANV);
        
        for(NhanVien nv : nhanVien){
            txtNhanVien.setText(nv.getTENNV());
            txtChucVu.setText("");
            txtDiaChi.setText(nv.getDIACHI());
            txtLuong.setText(String.valueOf(nv.getLUONG()) );
            txtCMND.setText(nv.getCMND());
            ImageIcon image = new ImageIcon(nv.getANHDAIDIEN());
            lbAnh.setIcon(image);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnAnh = new javax.swing.JPanel();
        lbAnh = new javax.swing.JLabel();
        lbNhanVien = new javax.swing.JLabel();
        lbChucVu = new javax.swing.JLabel();
        lbLuong = new javax.swing.JLabel();
        lbDiaChi = new javax.swing.JLabel();
        lbCMND = new javax.swing.JLabel();
        txtChucVu = new javax.swing.JTextField();
        txtNhanVien = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btDoiMK = new javax.swing.JButton();
        btAnh = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnAnh.setBackground(new java.awt.Color(204, 255, 255));
        pnAnh.setLayout(new java.awt.BorderLayout());
        pnAnh.add(lbAnh, java.awt.BorderLayout.CENTER);

        jPanel1.add(pnAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 118, 250, 190));

        lbNhanVien.setText("Nhân viên");
        jPanel1.add(lbNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 90, 40));

        lbChucVu.setText("Chức vụ");
        jPanel1.add(lbChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 80, 40));

        lbLuong.setText("Lương");
        jPanel1.add(lbLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 80, 40));

        lbDiaChi.setText("Địa chỉ ");
        jPanel1.add(lbDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 80, 40));

        lbCMND.setText("CMND");
        jPanel1.add(lbCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 80, 40));
        jPanel1.add(txtChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 150, 40));
        jPanel1.add(txtNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 150, 40));
        jPanel1.add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 150, 40));
        jPanel1.add(txtLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 150, 40));
        jPanel1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 150, 40));

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        btDoiMK.setText("Đổi mật khẩu");
        btDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoiMKActionPerformed(evt);
            }
        });
        jPanel1.add(btDoiMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        btAnh.setText("Chọn ảnh");
        btAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnhActionPerformed(evt);
            }
        });
        jPanel1.add(btAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnhActionPerformed
        String a;
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            File ftenanh = fileChooser.getSelectedFile();
            duongdananh = ftenanh.getAbsolutePath();
            lbAnh.setIcon(ResizeImage(String.valueOf(duongdananh)));
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btAnhActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(kiemtrathongtin()){
            if(!NhanVienController.kiemtraTenTruDoiTuongDuocTron(MANV,txtNhanVien.getText())){
                    boolean x =NhanVienController.Sua1(MANV,txtNhanVien.getText(),txtDiaChi.getText(),txtCMND.getText(),Float.valueOf(txtLuong.getText()),duongdananh);
                    if(x == false){
                        JOptionPane.showMessageDialog(this, "Sửa thành công");
                        this.setVisible(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Lỗi khi sửa");
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "Trùng tên");
                }
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoiMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDoiMKActionPerformed

    
    
    public ImageIcon ResizeImage(String ImagePath){
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lbAnh.getWidth(),lbAnh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    private boolean kiemtrathongtin(){
        if(txtNhanVien.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập tên ");
            return false;
        }
        if(txtLuong.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập lương");
            return false;
        }
        if(txtDiaChi.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập Địa chỉ ");
            return false;
        }
        if(txtCMND.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập CMND");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnh;
    private javax.swing.JButton btDoiMK;
    private javax.swing.JButton btSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAnh;
    private javax.swing.JLabel lbCMND;
    private javax.swing.JLabel lbChucVu;
    private javax.swing.JLabel lbDiaChi;
    private javax.swing.JLabel lbLuong;
    private javax.swing.JLabel lbNhanVien;
    private javax.swing.JPanel pnAnh;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtNhanVien;
    // End of variables declaration//GEN-END:variables
}
