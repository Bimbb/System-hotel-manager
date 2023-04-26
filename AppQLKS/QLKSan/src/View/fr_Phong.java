/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.KieuPhongController;
import controller.LoaiPhongController;
import controller.PhongController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.KieuPhong;
import model.LoaiPhong;
import model.Phong;

public class fr_Phong extends javax.swing.JFrame {

    public static int IdPhong;
    pn_Phong form = new pn_Phong();
    
    public fr_Phong() {
        initComponents();
    }
    
    public fr_Phong(pn_Phong pnPhong) {
        initComponents();
        this.setLocationRelativeTo(null);
        form = pnPhong;
        cbbKieuPhong.removeAllItems();
        cbbLoaiPhong.removeAllItems();
        loadCbbKieuPhong();
        loadCbbLoaiPhong();
        hienthongtin(IdPhong);
    }

    private boolean kiemtrathongtin(){
        if(txtPhong.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập tên phòng");
            return false;
        }
        return true;
    }
    
    //load cbb
    public void loadCbbLoaiPhong(){
        String name = "";
        ArrayList<LoaiPhong> DSLoaiDV = LoaiPhongController.layDSLoaiPhong();
        for(LoaiPhong loaip : DSLoaiDV){
            name = LoaiPhongController.LayTenLoaiPhong(loaip.getIDLOAIPHONG());
            cbbLoaiPhong.addItem(name);
        }       
    }
    
    public void loadCbbKieuPhong(){
        String name = "";
        ArrayList<KieuPhong> DSLoaiDV = KieuPhongController.layDSKieuPhong();
        for(KieuPhong kieup : DSLoaiDV){
            name = KieuPhongController.LayTenKieuPhong(kieup.getIDKIEUPHONG());
            cbbKieuPhong.addItem(name);
        }
    }
    
    //lay IDDichVU cua Cbb
    public int layIdLoaiPhong(String TenLDV){
        int x = PhongController.LayIdLoaiPhong(TenLDV);
        return x;
    }
    
    public int layIdKieuPhong(String TenLDV){
        int x = PhongController.LayIdKieuPhong(TenLDV);
        return x;
    }
    
    // hien thi thong tin len form
    private void hienthongtin(int Id){
        ArrayList<Phong> DSDV = PhongController.LayPhongTuId(Id);
        for(Phong dv : DSDV){
            txtPhong.setText(dv.getTENPHONG());
            cbbKieuPhong.setSelectedItem(PhongController.LayTenKieuPhong(dv.getIDKIEUPHONG()));
            cbbLoaiPhong.setSelectedItem(PhongController.LayTenLoaiPhong(dv.getIDLOAIPHONG()));
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTenDV = new javax.swing.JLabel();
        txtPhong = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbLoaiDV = new javax.swing.JLabel();
        cbbLoaiPhong = new javax.swing.JComboBox<>();
        cbbKieuPhong = new javax.swing.JComboBox<>();
        lbLoaiDV1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTenDV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTenDV.setForeground(new java.awt.Color(255, 51, 51));
        lbTenDV.setText("Tên phòng");
        jPanel1.add(lbTenDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, 40));

        txtPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 242, 51));

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btSave.setText("Lưu");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 100, 40));

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
        jPanel1.add(btThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 100, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 10, 10));

        lbLoaiDV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLoaiDV.setForeground(new java.awt.Color(255, 51, 51));
        lbLoaiDV.setText("Loại phòng");
        jPanel1.add(lbLoaiDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, 40));

        cbbLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbLoaiPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(cbbLoaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 250, 30));

        cbbKieuPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbKieuPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(cbbKieuPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 250, 30));

        lbLoaiDV1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLoaiDV1.setForeground(new java.awt.Color(255, 51, 51));
        lbLoaiDV1.setText("Kiểu phòng");
        jPanel1.add(lbLoaiDV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 120, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(kiemtrathongtin()){
            if(!PhongController.kiemtraDB(IdPhong)){
                if(!PhongController.kiemtraTen(txtPhong.getText())){
                    boolean x = PhongController.Them(txtPhong.getText(),layIdKieuPhong(cbbKieuPhong.getSelectedItem().toString()),layIdLoaiPhong(cbbLoaiPhong.getSelectedItem().toString()));
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
                if(!PhongController.kiemtraTenTruDoiTuongDuocTron(IdPhong,txtPhong.getText()))
                {
                    boolean x =PhongController.Sua(IdPhong,txtPhong.getText(),layIdKieuPhong(cbbKieuPhong.getSelectedItem().toString()),layIdLoaiPhong(cbbLoaiPhong.getSelectedItem().toString()));
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
            boolean x = PhongController.Xoa(IdPhong);
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
                new fr_Phong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbbKieuPhong;
    private javax.swing.JComboBox<String> cbbLoaiPhong;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbLoaiDV;
    private javax.swing.JLabel lbLoaiDV1;
    private javax.swing.JLabel lbTenDV;
    private javax.swing.JTextField txtPhong;
    // End of variables declaration//GEN-END:variables
}
