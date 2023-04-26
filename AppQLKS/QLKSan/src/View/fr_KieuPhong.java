/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.KieuPhongController;
import javax.swing.JOptionPane;

public class fr_KieuPhong extends javax.swing.JFrame {
    public static int IDKieuPhong;
    pn_KieuPhong form = new pn_KieuPhong();
    
    public fr_KieuPhong() {
        initComponents();
    }

    public fr_KieuPhong(pn_KieuPhong pnKieuPhong) {
        initComponents();
        form = pnKieuPhong;
        this.setLocationRelativeTo(null);
        hienthongtin();
    }
    
    private void hienthongtin(){
        String value = KieuPhongController.LayTenKieuPhong(IDKieuPhong);
        txtLoaiPhong.setText(value);
    }
    
    
    private boolean kiemtrathongtin(){
        if(txtLoaiPhong.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập loại phòng");
            txtLoaiPhong.hasFocus();
            return false;
        }
        return true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLoaiPhong = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Kiểu phòng");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 120, 40));

        txtLoaiPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtLoaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 242, 51));

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btSave.setText("Lưu");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 100, 40));

        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove.png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 90, 40));

        btThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancelled.png"))); // NOI18N
        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 100, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(kiemtrathongtin()){
            if(!KieuPhongController.kiemtraDB(IDKieuPhong)){

                if(!KieuPhongController.kiemtraTen(txtLoaiPhong.getText())){
                    boolean x = KieuPhongController.Them(txtLoaiPhong.getText());
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
                if(!KieuPhongController.kiemtraTenTruDoiTuongDuocTron(IDKieuPhong,txtLoaiPhong.getText())){
                    boolean x = KieuPhongController.Sua(IDKieuPhong,txtLoaiPhong.getText());
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
            boolean x = KieuPhongController.Xoa(IDKieuPhong);
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
            java.util.logging.Logger.getLogger(fr_KieuPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_KieuPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_KieuPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_KieuPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_KieuPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLoaiPhong;
    // End of variables declaration//GEN-END:variables
}
