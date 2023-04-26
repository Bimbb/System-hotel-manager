/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;
import Custom.PhongView;
import controller.ChiTietPhieuDatPhongController;
import controller.KhachHangController;
import controller.PhieuDatPhongController;
import controller.PhongController;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.ChiTietPhieuDatPhong;
import model.PhieuDatPhong;
import model.Phong;

/**
 *
 * @author ldlan
 */
public class fm_DanhSachPhong extends javax.swing.JPanel {

    /**
     * Creates new form DanhSachPhong
     */
    public fm_DanhSachPhong() {
        initComponents();
       
        LoadDateTimePickerBill();
        LoadPhong();
    }

    void LoadDateTimePickerBill() {
        String t = "10:00 AM";
        txtGio.setText(t);
        txtGio.setText(t);

    }

    public void LoadPhong() {
        pnPhongVip.removeAll();
        pnPhongThuong.removeAll();

        String ngayBD = txtNgay.getText() + " " + txtGio.getText();
        ArrayList<Phong> ListPhong = new ArrayList<>();
        String bd = ngayBD.substring(17, 19);
        if (bd.equals("MP")) {
            ngayBD = ngayBD.substring(0, 17) + "PM";
        }
        Date NgayBDateTime = TryParseDateTime(ngayBD);
        ListPhong = new PhongController().getAllPhong();
        for (Phong phong : ListPhong) {
            PhongView phongv = new PhongView();

            phongv.setSize(200, 110);

            phongv.setSoPhong(phong.getTENPHONG());

            ChiTietPhieuDatPhong ctpdp = new ChiTietPhieuDatPhongController().getChiTietPhieuDatPhongTheoNgayMap(phong.getMAPHONG(), NgayBDateTime);

            if (ctpdp != null) {
                phongv.setTinhTrang(ctpdp.getTinhTrangPhong());
                if (ctpdp.getTinhTrangPhong().equals("Đã Đặt")) {
                    phongv.setBackground(new Color(255, 181, 192));
                } else {
                    phongv.setBackground(new Color(144, 238, 144));
                }

                PhieuDatPhong pdp = new PhieuDatPhongController().getPhieuDatPhong(ctpdp.getSoPhieuDatPhong());

                String TenKhach = new KhachHangController().CheckCMND(pdp.getCMND());

                phongv.setTenKhach(TenKhach);
            } else {
                phongv.setTinhTrang("Phòng Trống");
                phongv.setTenKhach("Phòng Trống");
                phongv.setBackground(new Color(176, 196, 222));
            }

            phongv.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    JOptionPane.showMessageDialog(new JFrame(), "Day La Phong " + phong.getTENPHONG(), "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                    if (ctpdp != null) {
                        fm_ChiTietPhongThue.SoPhongThue = ctpdp.getSoPhieuDatPhong();
                    }
                    int MaP = phong.getMAPHONG();
                    fm_ChiTietPhongThue.MaP = MaP;
                    fm_ChiTietPhongThue ctpt = new fm_ChiTietPhongThue();
                    ctpt.setVisible(true);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            });
            if (phong.getIDLOAIPHONG()== 1) {
                pnPhongVip.add(phongv);
            } else {
                pnPhongThuong.add(phongv);
            }

        }
    }

    public static Date TryParseDateTime(String someText) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm a");
            Date date = formatter.parse(someText);
            return date;
        } catch (Exception e) {
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        timePicker1 = new com.raven.swing.TimePicker();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        txtGio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btSearchPhong = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pnPhongVip = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnPhongThuong = new javax.swing.JPanel();

        dateChooser1.setTextRefernce(txtNgay);

        timePicker1.setDisplayText(txtGio);

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(918, 130));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Danh Sách Phòng");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Ngày");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 50, -1));
        jPanel1.add(txtNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 130, -1));

        txtGio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGioMouseClicked(evt);
            }
        });
        jPanel1.add(txtGio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 130, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Giờ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 50, -1));

        jTextField1.setText("Tìm Kiếm");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 340, 40));

        btSearchPhong.setBackground(new java.awt.Color(0, 153, 0));
        btSearchPhong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSearchPhong.setForeground(new java.awt.Color(255, 255, 255));
        btSearchPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_search_16px.png"))); // NOI18N
        btSearchPhong.setText("Tìm Phòng");
        btSearchPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchPhongActionPerformed(evt);
            }
        });
        jPanel1.add(btSearchPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 120, 30));

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(996, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Phòng Vip");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(960, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.BorderLayout());

        pnPhongVip.setBackground(new java.awt.Color(102, 204, 255));
        pnPhongVip.setPreferredSize(new java.awt.Dimension(996, 250));
        pnPhongVip.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel4.add(pnPhongVip, java.awt.BorderLayout.PAGE_START);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(996, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Phòng Thường");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(933, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        pnPhongThuong.setBackground(new java.awt.Color(102, 204, 255));
        pnPhongThuong.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel6.add(pnPhongThuong, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    private void txtGioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGioMouseClicked
        timePicker1.showPopup(this, 150, 110);
    }//GEN-LAST:event_txtGioMouseClicked

    private void btSearchPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchPhongActionPerformed
        LoadPhong();
    }//GEN-LAST:event_btSearchPhongActionPerformed

    class CustomMouseListener implements MouseListener {

        @Override
        public void mousePressed(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // t/hrow new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(new JFrame(), "Nhập đúng định dạng ngày kết thúc !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSearchPhong;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnPhongThuong;
    private javax.swing.JPanel pnPhongVip;
    private com.raven.swing.TimePicker timePicker1;
    private javax.swing.JTextField txtGio;
    private javax.swing.JTextField txtNgay;
    // End of variables declaration//GEN-END:variables
}
