/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/lice.java to edit this template
 */

package View;

import controller.DichVuController;
import controller.LoaiDichVuController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.DichVu;
import model.LoaiDichVu;

public class fr_DichVu extends javax.swing.JFrame {

    public static int IdDichVu;
    pn_DichVu form = new pn_DichVu();
    
    public fr_DichVu() {
        initComponents();
    }
    
    public fr_DichVu(pn_DichVu pnDichVu) {
        initComponents();
        form = pnDichVu;
        hienthongtin(IdDichVu);
        cbbLoaiDV.removeAllItems();
        loadCbb();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTenDV = new javax.swing.JLabel();
        txtTenDV = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        lbDonGia = new javax.swing.JLabel();
        txtDVT = new javax.swing.JTextField();
        lbLoaiDV = new javax.swing.JLabel();
        lbDVT = new javax.swing.JLabel();
        cbbLoaiDV = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTenDV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTenDV.setForeground(new java.awt.Color(255, 51, 51));
        lbTenDV.setText("Tên dịch vụ");
        jPanel1.add(lbTenDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, 40));

        txtTenDV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTenDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 242, 51));

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

        txtDonGia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 242, 51));

        lbDonGia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDonGia.setForeground(new java.awt.Color(255, 51, 51));
        lbDonGia.setText("Đơn giá");
        jPanel1.add(lbDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, 40));

        txtDVT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtDVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 242, 51));

        lbLoaiDV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLoaiDV.setForeground(new java.awt.Color(255, 51, 51));
        lbLoaiDV.setText("Loại dịch vụ");
        jPanel1.add(lbLoaiDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, 40));

        lbDVT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDVT.setForeground(new java.awt.Color(255, 51, 51));
        lbDVT.setText("DVT");
        jPanel1.add(lbDVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 120, 40));

        cbbLoaiDV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbLoaiDV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(cbbLoaiDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 250, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(kiemtrathongtin()){
            if(!DichVuController.kiemtraDB(IdDichVu)){
                if(!DichVuController.kiemtraTen(txtTenDV.getText())){
                    boolean x = DichVuController.Them(txtTenDV.getText(),Float.valueOf(txtDonGia.getText()),txtDVT.getText(),layId(cbbLoaiDV.getSelectedItem().toString()));
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
                if(!DichVuController.kiemtraTenTruDoiTuongDuocTron(IdDichVu,txtTenDV.getText())){
                    boolean x =DichVuController.Sua(IdDichVu,txtTenDV.getText(),Float.valueOf(txtDonGia.getText()),txtDVT.getText(),layId(cbbLoaiDV.getSelectedItem().toString()));
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
            boolean x = DichVuController.Xoa(IdDichVu);
            if(x == true){
                //                JOptionPane.showMessageDialog(this, "Xóa thành công");
                this.setVisible(false);
                form.load();
            }
            else{
                //                JOptionPane.showMessageDialog(this, "Lỗi khi xóa");
            }
        }
    }//GEN-LAST:event_btXoaActionPerformed

    
    // kiem tra nhap thong tin
    private boolean kiemtrathongtin(){
        if(txtTenDV.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập tên ");
            return false;
        }
        if(txtDonGia.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập giá");
            return false;
        }
        if(txtDVT.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập DVT");
            return false;
        }
        return true;
    }
    
    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        this.setVisible(false);
        form.load();
    }//GEN-LAST:event_btThoatActionPerformed

    //load cbb
    public void loadCbb(){
        String name = "";
        ArrayList<LoaiDichVu> DSLoaiDV = new LoaiDichVuController().layDSLoaiDV();
        for(LoaiDichVu loaiDV : DSLoaiDV){
            name = LoaiDichVuController.LayTenLoaiDichVu(loaiDV.getIDLOAIDICHVU());
            cbbLoaiDV.addItem(name);
        }
    }
    
    //lay IDDichVU cua Cbb
    public int layId(String TenLDV){
        int x = DichVuController.LayIdLoaiDichVu(TenLDV);
        return x;
    }
    
    // hien thi thong tin len form
    private void hienthongtin(int Id){
        ArrayList<DichVu> DSDV = DichVuController.LayDichVuTuId(Id);
        for(DichVu dv : DSDV){
            txtTenDV.setText(dv.getTENDICHVU());
            txtDonGia.setText(String.valueOf(dv.getDONGIABAN()));
            txtDVT.setText(dv.getDVT());
            
        }
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_DichVu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbbLoaiDV;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDVT;
    private javax.swing.JLabel lbDonGia;
    private javax.swing.JLabel lbLoaiDV;
    private javax.swing.JLabel lbTenDV;
    private javax.swing.JTextField txtDVT;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtTenDV;
    // End of variables declaration//GEN-END:variables
}
