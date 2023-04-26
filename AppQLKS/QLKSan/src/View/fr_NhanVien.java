/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.NhanVienController;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.NhanVien;

/**
 *
 * @author 84336
 */
public class fr_NhanVien extends javax.swing.JFrame {

    pn_NhanVien form = new pn_NhanVien();
    public static int MaNV;
    
    public fr_NhanVien() {
        initComponents();
    }
    
    public fr_NhanVien(pn_NhanVien pnNhanVien) {
        initComponents();
        form = pnNhanVien;
        this.setLocationRelativeTo(null);
        hienthongtin(MaNV);
    }

    // kiem tra nhap thong tin
    private boolean kiemtrathongtin(){
        if(txtTenNV.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập tên ");
            return false;
        }
        if(txtNgaySinh.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập ngày sinh");
            return false;
        }
        if(txtCMND.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập CMND");
            return false;
        }
        if(txtLuong.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập lương");
            return false;
        }
        if(txtDiaChi.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập địa chỉ");
            return false;
        }
        return true;
    }
    
    private void hienthongtin(int Id){
        ArrayList<NhanVien> DSDV = NhanVienController.LayNhanVienTheoID(Id);
        for(NhanVien dv : DSDV){
            txtTenNV.setText(dv.getTENNV());
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
            txtNgaySinh.setText(formatter.format(dv.getNGAYSINH()));
            txtCMND.setText(dv.getCMND());
            txtLuong.setText(String.valueOf(dv.getLUONG()));
            txtDiaChi.setText(dv.getDIACHI());
        }                                                               
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTenDV = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        lbDonGia = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        lbLoaiDV = new javax.swing.JLabel();
        lbDVT = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lbLoaiDV1 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTenDV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTenDV.setForeground(new java.awt.Color(255, 51, 51));
        lbTenDV.setText("Tên");
        jPanel1.add(lbTenDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 40));

        txtTenNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 242, 51));

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btSave.setText("Lưu");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 100, 40));

        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove.png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 90, 40));

        btThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancelled.png"))); // NOI18N
        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 100, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 10, 10));

        txtNgaySinh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 242, 51));

        lbDonGia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDonGia.setForeground(new java.awt.Color(255, 51, 51));
        lbDonGia.setText("Ngày sinh");
        jPanel1.add(lbDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 120, 40));

        txtCMND.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 242, 51));

        lbLoaiDV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLoaiDV.setForeground(new java.awt.Color(255, 51, 51));
        lbLoaiDV.setText("CMND");
        jPanel1.add(lbLoaiDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 120, 40));

        lbDVT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDVT.setForeground(new java.awt.Color(255, 51, 51));
        lbDVT.setText("Địa chỉ ");
        jPanel1.add(lbDVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 120, 40));

        txtDiaChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 242, 51));

        lbLoaiDV1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLoaiDV1.setForeground(new java.awt.Color(255, 51, 51));
        lbLoaiDV1.setText("Lương");
        jPanel1.add(lbLoaiDV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 120, 40));

        txtLuong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 242, 51));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(kiemtrathongtin()){
            if(!NhanVienController.kiemtraDB(MaNV)){
                if(!NhanVienController.kiemtraTen(txtTenNV.getText())){
                    boolean x = NhanVienController.Them(txtTenNV.getText(),txtNgaySinh.getText(),txtDiaChi.getText(),txtCMND.getText(),Float.valueOf(txtLuong.getText()));
                    if(x == false){
                        JOptionPane.showMessageDialog(this, "Thêm thành công");                                                                        
                        this.setVisible(false);
                        form.load();
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Lỗi khi thêm");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Trùng tên");
                }
            }
            else{
                if(!NhanVienController.kiemtraTenTruDoiTuongDuocTron(MaNV,txtTenNV.getText())){
                    boolean x =NhanVienController.Sua(MaNV,txtTenNV.getText(),txtNgaySinh.getText(),txtDiaChi.getText(),txtCMND.getText(),Float.valueOf(txtLuong.getText()));
                    if(x == false){
                        JOptionPane.showMessageDialog(this, "Sửa thành công");
                        this.setVisible(false);
                        form.load();
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Lỗi khi sửa");
                    }

                }
                else{
                    JOptionPane.showMessageDialog(this, "Trùng tên");
                }
            }
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa không!","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq == JOptionPane.YES_OPTION){
            boolean x = NhanVienController.Xoa(MaNV);
            if(x == true){
                this.setVisible(false);
                form.load();
            }
            else{
            }
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        this.setVisible(false);
        form.load();
    }//GEN-LAST:event_btThoatActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_NhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDVT;
    private javax.swing.JLabel lbDonGia;
    private javax.swing.JLabel lbLoaiDV;
    private javax.swing.JLabel lbLoaiDV1;
    private javax.swing.JLabel lbTenDV;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
