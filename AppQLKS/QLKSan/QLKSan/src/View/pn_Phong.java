/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import controller.PhongController;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Phong;


public class pn_Phong extends javax.swing.JPanel {


    public pn_Phong() {
        initComponents();
        load();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbDichVu = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        btTimKiem = new javax.swing.JButton();
        txtTinKiem = new javax.swing.JTextField();
        lbTenTrang = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        tbDichVu = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tbDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên phòng", "Kiểu phòng", "Loại phòng "
            }
        ));
        tbDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDichVuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDichVu);

        add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(70, 100));
        add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 30));
        add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(70, 100));
        add(jPanel1, java.awt.BorderLayout.LINE_START);

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setPreferredSize(new java.awt.Dimension(570, 70));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btTimKiem.setText("Tìm kiếm");
        btTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemActionPerformed(evt);
            }
        });
        Header.add(btTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 120, 40));

        txtTinKiem.setForeground(new java.awt.Color(148, 149, 165));
        txtTinKiem.setToolTipText("");
        txtTinKiem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtTinKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTinKiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTinKiemMouseExited(evt);
            }
        });
        Header.add(txtTinKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 260, 40));

        lbTenTrang.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbTenTrang.setForeground(new java.awt.Color(255, 0, 0));
        lbTenTrang.setText("Loại Phòng");
        Header.add(lbTenTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 40));

        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });
        Header.add(btThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 100, 40));

        add(Header, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void tbDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDichVuMouseClicked
        // click dúp chu?t
        if(evt.getClickCount() == 2){
            fr_Phong.IdPhong = Integer.parseInt(tbDichVu.getModel().getValueAt(tbDichVu.getSelectedRow(), 0).toString());
            fr_Phong form = new fr_Phong(this);
            form.setVisible(true);
        }
    }//GEN-LAST:event_tbDichVuMouseClicked

    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
        if(txtTinKiem.getText().equals("Tìm kiếm ...")){
            load();
        }
        else{
            loadTimKiem(txtTinKiem.getText());
        }
    }//GEN-LAST:event_btTimKiemActionPerformed

    private void txtTinKiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTinKiemMouseEntered
        if(txtTinKiem.getText().equals("Tìm kiếm ...")){
            txtTinKiem.setText("");
            txtTinKiem.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtTinKiemMouseEntered

    private void txtTinKiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTinKiemMouseExited
        if(txtTinKiem.getText().equals("")){
            txtTinKiem.setText("Tìm kiếm ...");
            txtTinKiem.setForeground(new Color(148, 149, 165));
        }
        else{
            txtTinKiem.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtTinKiemMouseExited

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        fr_Phong form = new fr_Phong(this);
        fr_Phong.IdPhong = -1;
        form.setVisible(true);
    }//GEN-LAST:event_btThemActionPerformed

    public void load(){
        String loaiphong = "";
        String kieuphong = "";

        ArrayList<Phong> DSDichVu = PhongController.layDSPhong();
        DefaultTableModel model = (DefaultTableModel) tbDichVu.getModel();
        model.setRowCount(0);
        for(Phong lp : DSDichVu){
            loaiphong = PhongController.LayTenLoaiPhong(lp.getIDLOAIPHONG());
            kieuphong = PhongController.LayTenKieuPhong(lp.getIDLOAIPHONG());
            Object[] objmodel = new Object[]{lp.getMAPHONG(),lp.getTENPHONG(),kieuphong,loaiphong};
            model.addRow(objmodel);
        }
    }
    
    public void loadTimKiem(String tenPhong){
        String loaiphong = "";
        String kieuphong = "";

        ArrayList<Phong> DSDichVu = PhongController.layDSPhongTheoTen(tenPhong);
        DefaultTableModel model = (DefaultTableModel) tbDichVu.getModel();
        model.setRowCount(0);
        for(Phong lp : DSDichVu){
            loaiphong = PhongController.LayTenLoaiPhong(lp.getIDLOAIPHONG());
            kieuphong = PhongController.LayTenKieuPhong(lp.getIDLOAIPHONG());

            Object[] objmodel = new Object[]{lp.getMAPHONG(),lp.getTENPHONG(),kieuphong,loaiphong};
            model.addRow(objmodel);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTenTrang;
    private javax.swing.JTable tbDichVu;
    private javax.swing.JTextField txtTinKiem;
    // End of variables declaration//GEN-END:variables
}
