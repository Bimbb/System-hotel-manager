/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.NhanVienController;
import controller.TaiKhoanController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.NhanVien;
import model.TaiKhoan;

public class fr_TaiKhoan extends javax.swing.JFrame {

    public static String  TenTK;
    pn_TaiKhoan form = new pn_TaiKhoan();
    
    public fr_TaiKhoan() {
        initComponents();
    }
    
    public fr_TaiKhoan(pn_TaiKhoan pnTaiKhoan) {
        initComponents();
        this.setLocationRelativeTo(null);
        form = pnTaiKhoan;
        cbbQuyen.removeAllItems();
        cbbNhanVien.removeAllItems();
        loadCbbNhanVien();
        hienthongtin(TenTK);
        loadCbbQuyen();
    }

    private boolean kiemtrathongtin(){
        if(txtTenTaiKhoan.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập tên ");
            return false;
        }
        return true;
    }
    
    //load cbb
    public void loadCbbQuyen(){
        cbbQuyen.addItem("Admin");
        cbbQuyen.addItem("User");
        cbbQuyen.addItem("Quản lý");        
    }
    
    public void loadCbbNhanVien(){
        String name = "";
        ArrayList<NhanVien> DSNV = NhanVienController.layDSNhanVien();
        for(NhanVien nv : DSNV){
            name = TaiKhoanController.LayTenNhanVien(nv.getMANV());
            cbbNhanVien.addItem(name);
        }
    }
    
    //lay IDDichVU cua Cbb
    public int layMaNV(String TenLDV){
        int x = TaiKhoanController.LayMaNhanVien(TenLDV);
        System.out.println(x);
        return x;
    }
    
    public int layIdQuyen(String Quyen){
        int x = 1;
        return x;
    }
    
    // hien thi thong tin len form
    private void hienthongtin(String TenTK){
        ArrayList<TaiKhoan> DSTK = TaiKhoanController.LayTkTuTenTK(TenTK);
        for(TaiKhoan tk : DSTK){
            txtTenTaiKhoan.setText(tk.getTENTAIKHOAN());
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTenDV = new javax.swing.JLabel();
        txtTenTaiKhoan = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbLoaiDV = new javax.swing.JLabel();
        cbbQuyen = new javax.swing.JComboBox<>();
        cbbNhanVien = new javax.swing.JComboBox<>();
        lbLoaiDV1 = new javax.swing.JLabel();
        btLamMoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTenDV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTenDV.setForeground(new java.awt.Color(255, 51, 51));
        lbTenDV.setText("Tên tài khoản");
        jPanel1.add(lbTenDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, 40));

        txtTenTaiKhoan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTenTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 242, 51));

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btSave.setText("Lưu");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 100, 40));

        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove.png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 90, 40));

        btThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancelled.png"))); // NOI18N
        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 100, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 10, 10));

        lbLoaiDV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLoaiDV.setForeground(new java.awt.Color(255, 51, 51));
        lbLoaiDV.setText("Quyền");
        jPanel1.add(lbLoaiDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, 40));

        cbbQuyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbQuyen.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(cbbQuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 250, 30));

        cbbNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(cbbNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 250, 30));

        lbLoaiDV1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLoaiDV1.setForeground(new java.awt.Color(255, 51, 51));
        lbLoaiDV1.setText("Mã nhân viên");
        jPanel1.add(lbLoaiDV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 120, 40));

        btLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btLamMoi.setText("Làm mới");
        btLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLamMoiActionPerformed(evt);
            }
        });
        jPanel1.add(btLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 120, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(kiemtrathongtin()){
            if(!TaiKhoanController.kiemtraDB(TenTK)){
                boolean x = TaiKhoanController.Them(txtTenTaiKhoan.getText(),"1",layMaNV(cbbNhanVien.getSelectedItem().toString()),layIdQuyen("Admin"));
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
                boolean x =TaiKhoanController.Sua(txtTenTaiKhoan.getText(),"2",layMaNV(cbbNhanVien.getSelectedItem().toString()),layIdQuyen("Admin"));
                if(x == false){
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                    this.setVisible(false);
                    form.load();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Lỗi khi sửa");
                }
            }
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa không!","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq == JOptionPane.YES_OPTION){
            boolean x = TaiKhoanController.Xoa(TenTK);
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

    private void btLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLamMoiActionPerformed
        if(!TaiKhoanController.kiemtraDB(TenTK)){
                JOptionPane.showMessageDialog(this, "Bạn phải thêm");
        }
        else{
            boolean x =TaiKhoanController.Sua(txtTenTaiKhoan.getText(),"1",layMaNV(cbbNhanVien.getSelectedItem().toString()),layIdQuyen("Admin"));
            if(x == false){
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                this.setVisible(false);
                form.load();
            }
            else{
                JOptionPane.showMessageDialog(this, "Lỗi khi sửa");
            }
        }
    }//GEN-LAST:event_btLamMoiActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_TaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLamMoi;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbbNhanVien;
    private javax.swing.JComboBox<String> cbbQuyen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbLoaiDV;
    private javax.swing.JLabel lbLoaiDV1;
    private javax.swing.JLabel lbTenDV;
    private javax.swing.JTextField txtTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
