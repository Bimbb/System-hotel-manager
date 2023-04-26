/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.ChiTietPhieuDatPhongController;
import controller.KhachHangController;
import controller.NhanVienController;
import controller.PhieuDatPhongController;
import controller.PhongController;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.ChiTietPhieuDatPhong;
import model.PhieuDatPhong;
import model.Phong;

/**
 *
 * @author ldlan
 */
public class fm_ChiTietPhongThue extends javax.swing.JFrame {

    public static int MaP;
    public static int SoPhongThue = 0;

    public fm_ChiTietPhongThue() {
        initComponents();
        LoadThongTinPhong();
    }

    void LoadThongTinPhong() {
        Phong p = new PhongController().getPhongTheoMaPhong(MaP);
        lbSoPhong.setText(p.getTENPHONG());
        PhieuDatPhong pdp = new PhieuDatPhongController().getPhieuDatPhong(SoPhongThue);
        if (pdp == null) {
            lbNgayDat.setText("");
            lbNhanVien.setText("");
            lbTenKhach.setText("");
            btThanhToan.setVisible(false);
            btThemDichVu.setVisible(false);
            txtSoPhieuDP.setText("");
            txtTinhTrang.setText("Phòng Trống");
        }else
        {
            lbNgayDat.setText(pdp.getNgayDatPhong().toString());
            String TenNhanvien = new NhanVienController().GetTenNhanVien(pdp.getMANV());
            lbNhanVien.setText(TenNhanvien);
            String TenKhachHang = new KhachHangController().CheckCMND(pdp.getCMND());
            lbTenKhach.setText(TenKhachHang);
            ChiTietPhieuDatPhong ctpdp = new ChiTietPhieuDatPhongController().getChiTietPhieuDatPhongTheoSoPhieuMap(MaP, SoPhongThue);
            if(ctpdp.getTinhTrangPhong().equals("Đã Đặt")){
                btThanhToan.setText("Nhận Phòng");
            }else
                btThanhToan.setText("Thanh Toán");
           
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbSoPhong = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btThanhToan = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbTenKhach = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbNgayDat = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbNhanVien = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTinhTrang = new javax.swing.JTextField();
        txtSoPhieuDP = new javax.swing.JTextField();
        btThemDichVu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(50, 357));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(989, 60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSoPhong.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbSoPhong.setText("PHÒNG");
        jPanel2.add(lbSoPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 230, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(50, 427));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(989, 50));

        btThanhToan.setBackground(new java.awt.Color(0, 128, 0));
        btThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btThanhToan.setText("Thanh Toán");
        btThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThanhToanActionPerformed(evt);
            }
        });

        btThoat.setBackground(new java.awt.Color(255, 255, 192));
        btThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btThoat.setForeground(new java.awt.Color(169, 169, 173));
        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(616, Short.MAX_VALUE)
                .addComponent(btThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setBackground(new java.awt.Color(227, 227, 227));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_user_48px_1.png"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 40, 40));

        lbTenKhach.setText("1");
        jPanel5.add(lbTenKhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 50, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_calendar_40px.png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 40, 40));

        lbNgayDat.setText("1");
        jPanel5.add(lbNgayDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 60, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_user_40px.png"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 40, 40));

        lbNhanVien.setText("1");
        jPanel5.add(lbNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 60, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Dịch Vụ ", "Số Lượng", "Thành Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 420, 200));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Tình Trạng Phòng:  ");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Mã Đăng Kí:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, -1));

        txtTinhTrang.setEditable(false);
        txtTinhTrang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTinhTrang.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTinhTrang.setText("Đã Đặt");
        txtTinhTrang.setCaretColor(new java.awt.Color(0, 51, 51));
        txtTinhTrang.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTinhTrang.setSelectionColor(new java.awt.Color(0, 51, 51));
        jPanel6.add(txtTinhTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 130, 40));

        txtSoPhieuDP.setEditable(false);
        txtSoPhieuDP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSoPhieuDP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoPhieuDP.setText("32");
        txtSoPhieuDP.setCaretColor(new java.awt.Color(0, 51, 51));
        txtSoPhieuDP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSoPhieuDP.setSelectionColor(new java.awt.Color(0, 51, 51));
        jPanel6.add(txtSoPhieuDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 130, 40));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 330, 190));

        btThemDichVu.setBackground(new java.awt.Color(0, 128, 0));
        btThemDichVu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btThemDichVu.setForeground(new java.awt.Color(255, 255, 255));
        btThemDichVu.setText("Thêm Dịch Vụ ");
        btThemDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemDichVuActionPerformed(evt);
            }
        });
        jPanel5.add(btThemDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 140, 40));

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btThoatActionPerformed

    private void btThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThanhToanActionPerformed
       if(btThanhToan.getText().equals("Nhận Phòng")){
           btThanhToan.setText("Thanh Toán");
           if(new ChiTietPhieuDatPhongController().updataTinhTrangPhongThue(MaP, SoPhongThue, "Ðang Thuê")){
                JOptionPane.showMessageDialog(new JFrame(), "Bạn Đã Nhận Phòng Đã Đặt !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
           }
           
       }
    }//GEN-LAST:event_btThanhToanActionPerformed

    private void btThemDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemDichVuActionPerformed
        fm_ThemDichVu tdv = new fm_ThemDichVu();
        tdv.setVisible(true);
    }//GEN-LAST:event_btThemDichVuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fm_ChiTietPhongThue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fm_ChiTietPhongThue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fm_ChiTietPhongThue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fm_ChiTietPhongThue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fm_ChiTietPhongThue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btThanhToan;
    private javax.swing.JButton btThemDichVu;
    private javax.swing.JButton btThoat;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbNgayDat;
    private javax.swing.JLabel lbNhanVien;
    private javax.swing.JLabel lbSoPhong;
    private javax.swing.JLabel lbTenKhach;
    private javax.swing.JTextField txtSoPhieuDP;
    private javax.swing.JTextField txtTinhTrang;
    // End of variables declaration//GEN-END:variables
}
