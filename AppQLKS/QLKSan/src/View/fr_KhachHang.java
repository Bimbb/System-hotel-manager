/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.KhachHangController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.KhachHang;

/**
 *
 * @author 84336
 */
public class fr_KhachHang extends javax.swing.JFrame {

    public static String CMND;
    pn_KhachHang form = new pn_KhachHang();
    
    public fr_KhachHang() {
        initComponents();
    }
    
    public fr_KhachHang(pn_KhachHang pnKhachHang) {
        initComponents();
        hienthongtin(CMND);
        cbbGioiTinh.removeAllItems();
        loadCbb();
        form = pnKhachHang;
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTenDV = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        btXoa = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        lbDonGia = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        lbLoaiDV = new javax.swing.JLabel();
        lbDVT = new javax.swing.JLabel();
        lbDVT1 = new javax.swing.JLabel();
        lbLoaiDV1 = new javax.swing.JLabel();
        txtQuocTich = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        cbbGioiTinh = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTenDV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTenDV.setForeground(new java.awt.Color(255, 51, 51));
        lbTenDV.setText("CMND");
        jPanel1.add(lbTenDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 40));

        txtCMND.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 242, 40));

        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove.png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 90, 40));

        btThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancelled.png"))); // NOI18N
        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 100, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 10, 10));

        txtTenKH.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 242, 40));

        lbDonGia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDonGia.setForeground(new java.awt.Color(255, 51, 51));
        lbDonGia.setText("Tên khách hàng");
        jPanel1.add(lbDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, 40));

        txtSDT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 242, 40));

        lbLoaiDV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLoaiDV.setForeground(new java.awt.Color(255, 51, 51));
        lbLoaiDV.setText("Địa chỉ");
        jPanel1.add(lbLoaiDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 120, 40));

        lbDVT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDVT.setForeground(new java.awt.Color(255, 51, 51));
        lbDVT.setText("SDT");
        jPanel1.add(lbDVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 120, 40));

        lbDVT1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDVT1.setForeground(new java.awt.Color(255, 51, 51));
        lbDVT1.setText("Giới tính");
        jPanel1.add(lbDVT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 120, 40));

        lbLoaiDV1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLoaiDV1.setForeground(new java.awt.Color(255, 51, 51));
        lbLoaiDV1.setText("Quốc tịch");
        jPanel1.add(lbLoaiDV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 120, 40));

        txtQuocTich.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtQuocTich, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 242, 40));

        txtDiaChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 242, 40));

        cbbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbGioiTinh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(cbbGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 240, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa không!","Thông báo",JOptionPane.YES_NO_OPTION);
        if(kq == JOptionPane.YES_OPTION){
            boolean x = KhachHangController.Xoa(CMND);
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

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        this.setVisible(false);
        form.load();
    }//GEN-LAST:event_btThoatActionPerformed

    public void loadCbb(){
        cbbGioiTinh.addItem("Nữ");
        cbbGioiTinh.addItem("Nam");
    }
    
    
    // hien thi thong tin len form
    private void hienthongtin(String CMND){
        ArrayList<KhachHang> DSKH = KhachHangController.LayKhachHangTuCMND(CMND);
        for(KhachHang kh : DSKH){
            txtCMND.setText(kh.getCMND());
            txtTenKH.setText(kh.getTENKHACHHANG());
            txtSDT.setText(kh.getSDT());
            txtDiaChi.setText(kh.getDIACHI());
            txtQuocTich.setText(kh.getQUOCTICH());
            byte x = kh.getGIOITINH();
            if(x == 0){
                cbbGioiTinh.setSelectedIndex(1);
            }
            else{
                cbbGioiTinh.setSelectedIndex(2);
            }
        }
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_KhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbbGioiTinh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDVT;
    private javax.swing.JLabel lbDVT1;
    private javax.swing.JLabel lbDonGia;
    private javax.swing.JLabel lbLoaiDV;
    private javax.swing.JLabel lbLoaiDV1;
    private javax.swing.JLabel lbTenDV;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtQuocTich;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
