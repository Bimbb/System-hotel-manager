/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Custom.CT_PhieuDatPhong_Custom;
import controller.LoaiPhongController;
import controller.PhongController;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Phong;

/**
 *
 * @author ldlan
 */
public final class fm_DatPhongMoi extends javax.swing.JFrame {

    ArrayList<Phong> pHONGsTrong = new ArrayList<>();
    ArrayList<CT_PhieuDatPhong_Custom> PhongChon = new ArrayList<>();

    DefaultTableModel model;
    DefaultTableModel PhongChonModel;
    private final fm_DatPhong datPhong;

    public fm_DatPhongMoi(JPanel parent) {
        initComponents();
        LoadDateTimePickerBill();
        model = (DefaultTableModel) tbPhongTrong.getModel();
        PhongChonModel = (DefaultTableModel) tbPhongDaChon.getModel();
        LoadPhongTheoNgay();
        datPhong = (fm_DatPhong) parent;

    }

    void LoadDateTimePickerBill() {
        String t = "10:00 AM";
        txtGioBÐ.setText(t);
        txtGioKT.setText(t);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        timePicker1 = new com.raven.swing.TimePicker();
        timePicker2 = new com.raven.swing.TimePicker();
        btGioTinh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btHuy = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        Chinh = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ThongTinKhachHang = new javax.swing.JPanel();
        txtTenKH = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtQuocTich = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btSearchCMND = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        pnPhong = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNgayBD = new javax.swing.JTextField();
        txtNgayKT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtGioBÐ = new javax.swing.JTextField();
        txtGioKT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhongTrong = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPhongDaChon = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        dateChooser1.setForeground(new java.awt.Color(0, 153, 255));
        dateChooser1.setTextRefernce(txtNgayBD);

        dateChooser2.setTextRefernce(txtNgayKT);

        timePicker1.setDisplayText(txtGioBÐ);

        timePicker2.setDisplayText(txtGioKT);
        timePicker2.setName(""); // NOI18N
        timePicker2.getAccessibleContext().setAccessibleName("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(50, 469));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        Menu.setPreferredSize(new java.awt.Dimension(952, 50));
        Menu.setLayout(new java.awt.BorderLayout());
        getContentPane().add(Menu, java.awt.BorderLayout.PAGE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(50, 419));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setPreferredSize(new java.awt.Dimension(952, 70));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btHuy.setBackground(new java.awt.Color(204, 204, 255));
        btHuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btHuy.setText("Hủy");
        btHuy.setToolTipText("");
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });
        jPanel4.add(btHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 16, 100, 40));

        btLuu.setBackground(new java.awt.Color(0, 153, 0));
        btLuu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLuu.setText("Lưu");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });
        jPanel4.add(btLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 16, 110, 40));

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        Chinh.setBackground(new java.awt.Color(204, 255, 204));
        Chinh.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        ThongTinKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        ThongTinKhachHang.setToolTipText("");
        ThongTinKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ThongTinKhachHang.setPreferredSize(new java.awt.Dimension(335, 509));
        ThongTinKhachHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenKH.setForeground(new java.awt.Color(148, 149, 165));
        txtTenKH.setText("Nhập Tên Khách Hàng");
        txtTenKH.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        txtTenKH.setName(""); // NOI18N
        txtTenKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTenKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTenKHMouseExited(evt);
            }
        });
        ThongTinKhachHang.add(txtTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 92, 200, 27));

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSDT.setForeground(new java.awt.Color(148, 149, 165));
        txtSDT.setText("Nhập SÐT");
        txtSDT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        txtSDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSDTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSDTMouseExited(evt);
            }
        });
        ThongTinKhachHang.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 200, 27));

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDiaChi.setForeground(new java.awt.Color(148, 149, 165));
        txtDiaChi.setText("Nhập Địa Chỉ");
        txtDiaChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        txtDiaChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDiaChiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDiaChiMouseExited(evt);
            }
        });
        ThongTinKhachHang.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 280, 200, 27));

        txtCMND.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCMND.setForeground(new java.awt.Color(148, 149, 165));
        txtCMND.setText("Nhập CMND");
        txtCMND.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        txtCMND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCMNDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCMNDMouseExited(evt);
            }
        });
        ThongTinKhachHang.add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 168, 200, 27));

        txtQuocTich.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQuocTich.setForeground(new java.awt.Color(148, 149, 165));
        txtQuocTich.setText("Nhập Quốc Tịch");
        txtQuocTich.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        txtQuocTich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtQuocTichMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtQuocTichMouseExited(evt);
            }
        });
        ThongTinKhachHang.add(txtQuocTich, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 200, 27));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_user_40px.png"))); // NOI18N
        ThongTinKhachHang.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 92, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_card_security_40px.png"))); // NOI18N
        ThongTinKhachHang.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 155, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_phone_30px.png"))); // NOI18N
        ThongTinKhachHang.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 220, 40, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_address_40px.png"))); // NOI18N
        ThongTinKhachHang.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 267, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_male_and_female_40px.png"))); // NOI18N
        ThongTinKhachHang.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 40, 39));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Thông Tin Khách Hàng");
        ThongTinKhachHang.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        btSearchCMND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Search_Contacts_40px_1.png"))); // NOI18N
        btSearchCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchCMNDActionPerformed(evt);
            }
        });
        ThongTinKhachHang.add(btSearchCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 40, 40));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_earth_planet_48px.png"))); // NOI18N
        ThongTinKhachHang.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 40, 39));

        btGioTinh.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoNu.setText("Nữ");
        ThongTinKhachHang.add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        btGioTinh.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");
        ThongTinKhachHang.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        jPanel2.add(ThongTinKhachHang, java.awt.BorderLayout.LINE_START);

        pnPhong.setBackground(new java.awt.Color(236, 236, 236));
        pnPhong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Thông Tin Phòng");
        pnPhong.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Ngày KT");
        pnPhong.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Ngày BÐ");
        pnPhong.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtNgayBD.setToolTipText("");
        pnPhong.add(txtNgayBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 120, -1));
        pnPhong.add(txtNgayKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 120, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Giờ KT");
        pnPhong.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 50, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Giờ BĐ");
        pnPhong.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 50, -1));

        txtGioBÐ.setToolTipText("");
        txtGioBÐ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGioBÐMouseClicked(evt);
            }
        });
        pnPhong.add(txtGioBÐ, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 100, -1));

        txtGioKT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGioKTMouseClicked(evt);
            }
        });
        pnPhong.add(txtGioKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 100, -1));

        tbPhongTrong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MãP", "TênP", "LoạiP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPhongTrong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhongTrongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPhongTrong);
        if (tbPhongTrong.getColumnModel().getColumnCount() > 0) {
            tbPhongTrong.getColumnModel().getColumn(0).setMinWidth(40);
            tbPhongTrong.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        pnPhong.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, 240));

        tbPhongDaChon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TênP", "NgàyBÐ", "NgàyKT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPhongDaChon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhongDaChonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbPhongDaChon);
        if (tbPhongDaChon.getColumnModel().getColumnCount() > 0) {
            tbPhongDaChon.getColumnModel().getColumn(0).setMinWidth(60);
            tbPhongDaChon.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        pnPhong.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 350, 240));

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Tìm Phòng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnPhong.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 100, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Phòng Ðã Chọn");
        pnPhong.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Danh Sách Phòng Trống");
        pnPhong.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 170, -1));

        jPanel2.add(pnPhong, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel2, java.awt.BorderLayout.CENTER);

        Chinh.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(Chinh, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Event">                          
    public void changcolor(JPanel hover, Color ran) {
        hover.setBackground(ran);
    }

    private void txtGioBÐMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGioBÐMouseClicked
        timePicker1.showPopup(this, 900, 200);
    }//GEN-LAST:event_txtGioBÐMouseClicked

    private void txtGioKTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGioKTMouseClicked
        timePicker2.showPopup(this, 900, 230);
    }//GEN-LAST:event_txtGioKTMouseClicked

    private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btHuyActionPerformed

    private void txtTenKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenKHMouseEntered
        if (txtTenKH.getText().equals("Nhập Tên Khách Hàng")) {
            txtTenKH.setText("");
            txtTenKH.setForeground(Color.BLACK);
        }


    }//GEN-LAST:event_txtTenKHMouseEntered

    private void txtTenKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenKHMouseExited
        if (txtTenKH.getText().equals("")) {
            txtTenKH.setText("Nhập Tên Khách Hàng");
            txtTenKH.setForeground(new Color(148, 149, 165));
        } else
            txtTenKH.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtTenKHMouseExited

    private void txtCMNDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCMNDMouseEntered
        if (txtCMND.getText().equals("Nhập CMND")) {
            txtCMND.setText("");
            txtCMND.setForeground(Color.BLACK);
        }


    }//GEN-LAST:event_txtCMNDMouseEntered

    private void txtCMNDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCMNDMouseExited
        if (txtCMND.getText().equals("")) {
            txtCMND.setText("Nhập CMND");
            txtCMND.setForeground(new Color(148, 149, 165));
        } else
            txtCMND.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtCMNDMouseExited

    private void txtSDTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSDTMouseEntered
        if (txtSDT.getText().equals("Nhập SÐT")) {
            txtSDT.setText("");
            txtSDT.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_txtSDTMouseEntered

    private void txtSDTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSDTMouseExited
        if (txtSDT.getText().equals("")) {
            txtSDT.setText("Nhập SÐT");
            txtSDT.setForeground(new Color(148, 149, 165));
        } else
            txtSDT.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtSDTMouseExited

    private void txtDiaChiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiaChiMouseEntered
        if (txtDiaChi.getText().equals("Nhập Địa Chỉ")) {
            txtDiaChi.setText("");
            txtDiaChi.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtDiaChiMouseEntered

    private void txtDiaChiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiaChiMouseExited
        if (txtDiaChi.getText().equals("")) {
            txtDiaChi.setText("Nhập Địa Chỉ");
            txtDiaChi.setForeground(new Color(148, 149, 165));
        }
    }//GEN-LAST:event_txtDiaChiMouseExited

    private void txtQuocTichMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuocTichMouseEntered
        if (txtQuocTich.getText().equals("Nhập Quốc Tịch")) {
            txtQuocTich.setText("");
            txtQuocTich.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtQuocTichMouseEntered

    private void txtQuocTichMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuocTichMouseExited
        if (txtQuocTich.getText().equals("")) {
            txtQuocTich.setText("Nhập Quốc Tịch");
            txtQuocTich.setForeground(new Color(148, 149, 165));
        } else
            txtQuocTich.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtQuocTichMouseExited

    private void btSearchCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchCMNDActionPerformed
        if (!txtCMND.getText().equals("") && !txtCMND.getText().equals("Nhập CMND")) {
            String CMND = txtCMND.getText();
            try {
                KhachHang KH = new KhachHangControl().getKhachHangtheoCMND(CMND);
                if (KH != null) {
                    txtTenKH.setForeground(Color.BLACK);
                    txtQuocTich.setForeground(Color.BLACK);
                    txtDiaChi.setForeground(Color.BLACK);
                    txtSDT.setForeground(Color.BLACK);
                    txtTenKH.setText(KH.getTenKhachHang());
                    txtQuocTich.setText(KH.getQuocTich());
                    txtDiaChi.setText(KH.getDiaChi());
                    txtSDT.setText(KH.getSÐT());
//                 if(KH.getGioiTinh() == true){
                    rdoNu.setSelected(true);
//                 }
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Bạn Chưa Nhập CMND", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (HeadlessException ex) {
            }

        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Bạn Chưa Nhập CMND", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btSearchCMNDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CheckNgay();
        LoadPhongTheoNgay();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbPhongTrongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhongTrongMouseClicked
        Component frame = null;
        int selectedIndex;
        selectedIndex = tbPhongTrong.getSelectedRow();
        String TenPhong = model.getValueAt(selectedIndex, 1).toString();
        int MaP = (int) model.getValueAt(selectedIndex, 0);
        int result = JOptionPane.showConfirmDialog(frame,
                "Bạn có chắc muốn Thêm " + TenPhong + " Vào Danh Sách Phòng Chọn!",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            String ngayBD = txtNgayBD.getText() + " " + txtGioBÐ.getText();
            String ngayKT = txtNgayKT.getText() + " " + txtGioKT.getText();

            String bd = ngayBD.substring(17, 19);
            String kt = ngayKT.substring(17, 19);

            if (bd.equals("MP")) {
                ngayBD = ngayBD.substring(0, 17) + "PM";
            }
            if (kt.equals("MP")) {
                ngayKT = ngayKT.substring(0, 17) + "PM";
            }
            Date NgayBDateTime = TryParseDateTime(ngayBD);
            Date NgayKTateTime = TryParseDateTime(ngayKT);
            // tbPhongTrong.remove(selectedIndex);
            CT_PhieuDatPhong_Custom cT_PhieuDatPhong = new CT_PhieuDatPhong_Custom(MaP, NgayBDateTime, NgayKTateTime, 1, 1, 1);

            PhongChon.add(cT_PhieuDatPhong);
            model.removeRow(selectedIndex);
            PhongChonModel.addRow(new Object[]{
                TenPhong, ngayBD, ngayKT
            });

        }
    }//GEN-LAST:event_tbPhongTrongMouseClicked

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        if (KiemTraDuLieu()) {
            String TenKhach = txtTenKH.getText();
            String CMND = txtCMND.getText();
            String SDT = txtSDT.getText();
            String QuocTich = txtQuocTich.getText();
            String DiaChi = txtDiaChi.getText();

            byte Gioitinh;
            int dem = 0;

            if (rdoNam.isSelected() == true) {
                Gioitinh = 0;
            } else {
                Gioitinh = 1;
            }
            KhachHang KhachHang = new KhachHang();
            KhachHang.setCMND(CMND);
            KhachHang.setDiaChi(DiaChi);
            KhachHang.setGioiTinh(Gioitinh);
            KhachHang.setQuocTich(QuocTich);
            KhachHang.setSÐT(SDT);
            KhachHang.setTenKhachHang(TenKhach);

            if (new KhachHangControl().AddKhachHang(KhachHang)) {
                JOptionPane.showMessageDialog(new JFrame(), "Thêm Khách Hàng mới thành công!!", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            }
            PhieuDatPhong PDP = new PhieuDatPhong();
            PDP.setMANV(1);
            PDP.setCMND(CMND);
            Date NDP = new Date();
            PDP.setNgayDatPhong(NDP);
            PDP.setTongTienDatPhong(0);
            if (new PhieuDatPhongControl().addPhieuDatPhong(PDP)) {
                for (CT_PhieuDatPhong_Custom phong_Custom : PhongChon) {
                    ChiTietPhieuDatPhong CTPDP = new ChiTietPhieuDatPhong();
                    int SoPhieuDatP = new PhieuDatPhongControl().MaxSoPhieuDatPhong();
                    CTPDP.setSoPhieuDatPhong(SoPhieuDatP);
                    CTPDP.setMaPhong(phong_Custom.getMAPHONG());
                    CTPDP.setGioRa(phong_Custom.getGIORA());
                    CTPDP.setGioVao(phong_Custom.getGIOVAO());
                    CTPDP.setSoNguoi(1);
                    CTPDP.setTinhTrangPhong("Đã Đặt");

                    if (new ChiTietPhieuDatPhongControl().addChiTietDatPhong(CTPDP)) {
                        dem++;
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "Lỗi: Thêm Chi Tiết Phiếu Thuê!", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Lỗi: Thêm Phiếu Đặt Phòng!", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            }
            if (dem == PhongChon.size() && dem != 0) {
                datPhong.showTable();
                JOptionPane.showMessageDialog(new JFrame(), "Đặt phòng Thành Công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Đặt phòng thất bại  !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }//GEN-LAST:event_btLuuActionPerformed

    private void tbPhongDaChonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhongDaChonMouseClicked
        Component frame = null;
        int selectedIndex;
        selectedIndex = tbPhongDaChon.getSelectedRow();
        String TenPhong = PhongChonModel.getValueAt(selectedIndex, 0).toString();

        int result = JOptionPane.showConfirmDialog(frame,
                "Bạn có chắc muốn Xoá " + TenPhong + " Khỏi Danh Sách Phòng Chọn!",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            Phong phongXoa = new PhongControl().getPhongTheoTenPhong(TenPhong);
            String LoaiPhong = new LoaiPhongControl().CheckTenLoaiPhong(phongXoa.getMaPhong());
            pHONGsTrong.add(phongXoa);
            PhongChonModel.removeRow(selectedIndex);
            model.addRow(new Object[]{
                phongXoa.getMaPhong(), phongXoa.getTenPhong(), LoaiPhong
            });
        }
    }//GEN-LAST:event_tbPhongDaChonMouseClicked
    public boolean KiemTraDuLieu() {
        if (txtTenKH.getText().equals("Nhập Tên Khách Hàng")) {
            txtTenKH.requestFocus();
            JOptionPane.showMessageDialog(new JFrame(), "Nhập đầy đủ họ tên !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        //Kiểm tra textbox CCCD rỗng hoặc nhập kí tự chữ không
        if (txtCMND.getText().equals("Nhập CMND/CCCD")) {
            txtCMND.requestFocus();
            JOptionPane.showMessageDialog(new JFrame(), "Nhập đầy đủ căn cước công dân !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        //Kiểm tra textbox SDT rỗng hoặc có nhập chữ không
        if (txtSDT.getText().equals("Nhập SĐT")) {
            txtSDT.requestFocus();
            JOptionPane.showMessageDialog(new JFrame(), "Nhập đầy đủ số điện thoại !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            return false;

        }
        //Kiểm tra ô nhập địa chỉ
        if (txtDiaChi.getText().equals("Nhập Địa Chỉ")) {
            txtDiaChi.requestFocus();
            JOptionPane.showMessageDialog(new JFrame(), "Nhập đầy đủ địa chỉ  !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);

            return false;
        }
        //kiểm tra ô quốc tịch
        if (txtQuocTich.getText().equals("Nhập Quốc Tịch")) {
            txtQuocTich.requestFocus();
            JOptionPane.showMessageDialog(new JFrame(), "Nhập đầy đủ Quốc Tịch  !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        if (PhongChon == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Vui lòng chọn phòng trước khi lưu !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

   
// </editor-fold> 

    private void LoadPhongTheoNgay() {
        String ngayBD = txtNgayBD.getText() + " " + txtGioBÐ.getText();
        String ngayKT = txtNgayKT.getText() + " " + txtGioKT.getText();

        String bd = ngayBD.substring(17, 19);
        String kt = ngayKT.substring(17, 19);

        if (bd.equals("MP")) {
            ngayBD = ngayBD.substring(0, 17) + "PM";
        }
        if (kt.equals("MP")) {
            ngayKT = ngayKT.substring(0, 17) + "PM";
        }
        Date NgayBDateTime = TryParseDateTime(ngayBD);
        Date NgayKTateTime = TryParseDateTime(ngayKT);
        String TenP = "1";
        pHONGsTrong = new PhongController().getPHONGTheoGio(NgayBDateTime, NgayKTateTime);
//LoaiPhong Da Chon
        Phong p = new Phong();

        ArrayList<Phong> PhongDC = new ArrayList<>();
        if (PhongChon != null) {
            for (Phong PT : pHONGsTrong) {
                for (CT_PhieuDatPhong_Custom phong_Custom : PhongChon) {
                    int PTMaP = PT.getMAPHONG();
                    int PCMA = phong_Custom.getMAPHONG();
                    if (PTMaP == PCMA) {
                        PhongDC.add(PT);
                    }
                }
            }
            pHONGsTrong.removeAll(PhongDC);
        }
        //Xoa Phong Trong Table 
        model.getDataVector().removeAllElements();
        //Them Phong Vao Table
        for (Phong s : pHONGsTrong) {
            TenP = new LoaiPhongController().CheckTenLoaiPhong(s.getIDLOAIPHONG());
            model.addRow(new Object[]{
                s.getMAPHONG(), s.getTENPHONG(), TenP
            });

        }
    }

    void CheckNgay() {

        String ngayBD = txtNgayBD.getText() + " " + txtGioBÐ.getText();
        String ngayKT = txtNgayKT.getText() + " " + txtGioKT.getText();
        String ngayKT1 = txtNgayKT.getText();

        // String PM = (ngayBD.charAt(18)+""+ngayBD.charAt(19));
        String bd = ngayBD.substring(17, 19);
        String kt = ngayKT.substring(17, 19);

        if (bd.equals("MP")) {
            ngayBD = ngayBD.substring(0, 17) + "PM";
        }
        if (kt.equals("MP")) {
            ngayKT = ngayKT.substring(0, 17) + "PM";
        }

        Date NgayBDateTime = TryParseDateTime(ngayBD);
        Date NgayKTateTime = TryParseDateTime(ngayKT);

        if (NgayBDateTime == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Nhập đúng định dạng ngày bắt đầu !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (NgayKTateTime == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Nhập đúng định dạng ngày kết thúc !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int diff = NgayBDateTime.compareTo(NgayKTateTime);
        if (diff > 0) {
            JOptionPane.showMessageDialog(new JFrame(), "Ngày bắt đầu không thể lớn hơn ngày kết thúc !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            txtNgayBD.setText(ngayKT1);
            txtNgayKT.setText(ngayKT1);
            return;
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
            java.util.logging.Logger.getLogger(fm_DatPhongMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fm_DatPhongMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fm_DatPhongMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fm_DatPhongMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fm_DatPhongMoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Chinh;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel ThongTinKhachHang;
    private javax.swing.ButtonGroup btGioTinh;
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSearchCMND;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnPhong;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tbPhongDaChon;
    private javax.swing.JTable tbPhongTrong;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGioBÐ;
    private javax.swing.JTextField txtGioKT;
    private javax.swing.JTextField txtNgayBD;
    private javax.swing.JTextField txtNgayKT;
    private javax.swing.JTextField txtQuocTich;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
