/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.VatTuController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.VatTu;

/**
 *
 * @author 84336
 */
public class fr_VatTu extends javax.swing.JFrame {

    public static int IdVatTu;
    pn_VatTu form = new pn_VatTu();
    
    public fr_VatTu() {
        initComponents();
    }
    
    public fr_VatTu(pn_VatTu pnVatTu) {
        initComponents();
        form = pnVatTu;
        this.setLocationRelativeTo(null);
        hienthongtin();
    }

    private void hienthongtin(){
        ArrayList<VatTu> dsvt = VatTuController.LayVatTuTuId(IdVatTu);
        for(VatTu vt : dsvt){
            txtVatTu.setText(vt.getTENVATTU());
            txtXuatXu.setText(vt.getXUATXU());
        }
    }
    
    
    private boolean kiemtrathongtin(){
        if(txtVatTu.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập loại phòng");
            return false;
        }
        
        if(txtXuatXu.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập loại phòng");
            return false;
        }
        return true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtVatTu = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtXuatXu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Loại phòng");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 120, 40));

        txtVatTu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtVatTu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 242, 51));

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btSave.setText("Lưu");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 100, 40));

        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove.png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 90, 40));

        btThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancelled.png"))); // NOI18N
        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 100, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 20, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Loại phòng");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, 40));

        txtXuatXu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtXuatXu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 242, 51));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(kiemtrathongtin()){
            if(!VatTuController.kiemtraDB(IdVatTu)){

                if(!VatTuController.kiemtraTen(txtVatTu.getText())){
                    boolean x = VatTuController.Them(txtVatTu.getText(),txtXuatXu.getText());
                    if(x == false){
                        JOptionPane.showMessageDialog(this, "Thêm thành công");
                        this.setVisible(false);
                        form.load();
                    }else{
                        JOptionPane.showMessageDialog(this, "Lỗi khi thêm");
                    }

                }
                else{
                    JOptionPane.showMessageDialog(this, "Trùng tên");
                }
            }
            else{
                if(!VatTuController.kiemtraTenTruDoiTuongDuocTron(IdVatTu,txtVatTu.getText())){
                    boolean x = VatTuController.Sua(IdVatTu,txtVatTu.getText(),txtXuatXu.getText());
                    if(x == false){
                        JOptionPane.showMessageDialog(this, "Sửa thành công");
                        this.setVisible(false);
                        form.load();
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Lỗi khi Sửa");
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
            boolean x = VatTuController.Xoa(IdVatTu);
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
                new fr_VatTu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtVatTu;
    private javax.swing.JTextField txtXuatXu;
    // End of variables declaration//GEN-END:variables
}
