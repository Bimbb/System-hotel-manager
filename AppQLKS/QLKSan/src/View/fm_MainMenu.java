/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;  
/**
 *
 * @author ldlan
 */
public class fm_MainMenu extends javax.swing.JFrame {
    
    public fm_MainMenu() {
        initComponents();
    }
    
    public fm_MainMenu(int i) {
        initComponents();
        showmenu(i);
    }
    
 
    public void showmenu(int a){
        if(a == 1){
            BtDichVu.setVisible(false);
            BtKhachHang.setVisible(false);
            BtKieuPhong.setVisible(false);
            BtLoaiDichVu.setVisible(false);
            BtLoaiPhong.setVisible(false);
            BtNhanVien.setVisible(false);
            BtPhong.setVisible(false);
            BtTaiKhoan.setVisible(false);
            BtThongKe.setVisible(false);
            BtHoaDon.setVisible(false);
        }
        else if(a == 2){
            BtThongKe.setVisible(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        iconmimaxclose = new javax.swing.JPanel();
        btClose = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        btMax = new javax.swing.JPanel();
        Max = new javax.swing.JLabel();
        btMin = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        linehidemenu = new javax.swing.JPanel();
        hidemenu = new javax.swing.JPanel();
        buttonhide = new javax.swing.JLabel();
        lineseting = new javax.swing.JPanel();
        seting = new javax.swing.JPanel();
        buttonseting = new javax.swing.JLabel();
        Menuhide = new javax.swing.JPanel();
        BtDanhsachPhong = new javax.swing.JPanel();
        buttonDanhsachPhong = new javax.swing.JLabel();
        BtDatPhong = new javax.swing.JPanel();
        buttonDatPhong = new javax.swing.JLabel();
        BtThongKe = new javax.swing.JPanel();
        btThongKe = new javax.swing.JLabel();
        BtThongTinCaNhan = new javax.swing.JPanel();
        btThongTinCaNhan = new javax.swing.JLabel();
        BtDichVu = new javax.swing.JPanel();
        btDichVu = new javax.swing.JLabel();
        BtKhachHang = new javax.swing.JPanel();
        btKhachHang = new javax.swing.JLabel();
        BtKieuPhong = new javax.swing.JPanel();
        btKieuPhong = new javax.swing.JLabel();
        BtLoaiDichVu = new javax.swing.JPanel();
        btLoaiDichVu = new javax.swing.JLabel();
        BtLoaiPhong = new javax.swing.JPanel();
        btLoaiPhong = new javax.swing.JLabel();
        BtNhanVien = new javax.swing.JPanel();
        btNhanVien = new javax.swing.JLabel();
        BtPhong = new javax.swing.JPanel();
        btPhong = new javax.swing.JLabel();
        BtTaiKhoan = new javax.swing.JPanel();
        btTaiKhoan = new javax.swing.JLabel();
        BtHoaDon = new javax.swing.JPanel();
        btHoaDon = new javax.swing.JLabel();
        PnView = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        Header.setBackground(new java.awt.Color(16, 19, 53));
        Header.setPreferredSize(new java.awt.Dimension(1066, 50));
        Header.setLayout(new java.awt.BorderLayout());

        iconmimaxclose.setBackground(new java.awt.Color(16, 19, 54));
        iconmimaxclose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btClose.setBackground(new java.awt.Color(16, 19, 54));
        btClose.setLayout(new java.awt.BorderLayout());

        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete_32px.png"))); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseMouseExited(evt);
            }
        });
        btClose.add(Close, java.awt.BorderLayout.CENTER);

        iconmimaxclose.add(btClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 50));

        btMax.setBackground(new java.awt.Color(16, 19, 54));
        btMax.setLayout(new java.awt.BorderLayout());

        Max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/full_screen_32px.png"))); // NOI18N
        Max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MaxMouseExited(evt);
            }
        });
        btMax.add(Max, java.awt.BorderLayout.CENTER);

        iconmimaxclose.add(btMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        btMin.setBackground(new java.awt.Color(16, 19, 54));
        btMin.setLayout(new java.awt.BorderLayout());
        iconmimaxclose.add(btMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 50));

        Header.add(iconmimaxclose, java.awt.BorderLayout.LINE_END);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        Menu.setBackground(new java.awt.Color(24, 30, 72));
        Menu.setMinimumSize(new java.awt.Dimension(300, 105));
        Menu.setName(""); // NOI18N
        Menu.setPreferredSize(new java.awt.Dimension(300, 865));
        Menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(16, 19, 53));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 565));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linehidemenu.setBackground(new java.awt.Color(16, 19, 54));
        linehidemenu.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linehidemenuLayout = new javax.swing.GroupLayout(linehidemenu);
        linehidemenu.setLayout(linehidemenuLayout);
        linehidemenuLayout.setHorizontalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linehidemenuLayout.setVerticalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(linehidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        hidemenu.setBackground(new java.awt.Color(16, 19, 54));
        hidemenu.setLayout(new java.awt.BorderLayout());

        buttonhide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonhide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/menu_32px.png"))); // NOI18N
        buttonhide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonhideMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonhideMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonhideMouseExited(evt);
            }
        });
        hidemenu.add(buttonhide, java.awt.BorderLayout.CENTER);

        MenuIcon.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, 50));

        lineseting.setBackground(new java.awt.Color(16, 19, 54));
        lineseting.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linesetingLayout = new javax.swing.GroupLayout(lineseting);
        lineseting.setLayout(linesetingLayout);
        linesetingLayout.setHorizontalGroup(
            linesetingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linesetingLayout.setVerticalGroup(
            linesetingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(lineseting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, -1));

        seting.setBackground(new java.awt.Color(16, 19, 54));
        seting.setLayout(new java.awt.BorderLayout());

        buttonseting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonseting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Logout_40px.png"))); // NOI18N
        buttonseting.setToolTipText("   ");
        buttonseting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonsetingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonsetingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonsetingMouseExited(evt);
            }
        });
        seting.add(buttonseting, java.awt.BorderLayout.PAGE_END);

        MenuIcon.add(seting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 50, 50));

        Menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        Menuhide.setBackground(new java.awt.Color(24, 30, 72));
        Menuhide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtDanhsachPhong.setBackground(new java.awt.Color(95, 97, 121));

        buttonDanhsachPhong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonDanhsachPhong.setForeground(new java.awt.Color(255, 51, 153));
        buttonDanhsachPhong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonDanhsachPhong.setText("Danh Sách Phòng"); // NOI18N
        buttonDanhsachPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDanhsachPhongMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDanhsachPhongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDanhsachPhongMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtDanhsachPhongLayout = new javax.swing.GroupLayout(BtDanhsachPhong);
        BtDanhsachPhong.setLayout(BtDanhsachPhongLayout);
        BtDanhsachPhongLayout.setHorizontalGroup(
            BtDanhsachPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonDanhsachPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        BtDanhsachPhongLayout.setVerticalGroup(
            BtDanhsachPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonDanhsachPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        Menuhide.add(BtDanhsachPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 250, -1));

        BtDatPhong.setBackground(new java.awt.Color(95, 97, 121));

        buttonDatPhong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonDatPhong.setForeground(new java.awt.Color(255, 51, 153));
        buttonDatPhong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonDatPhong.setText("Đặt Phòng"); // NOI18N
        buttonDatPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDatPhongMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDatPhongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDatPhongMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtDatPhongLayout = new javax.swing.GroupLayout(BtDatPhong);
        BtDatPhong.setLayout(BtDatPhongLayout);
        BtDatPhongLayout.setHorizontalGroup(
            BtDatPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonDatPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        BtDatPhongLayout.setVerticalGroup(
            BtDatPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonDatPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        Menuhide.add(BtDatPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 250, -1));

        BtThongKe.setBackground(new java.awt.Color(95, 97, 121));

        btThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btThongKe.setForeground(new java.awt.Color(255, 51, 153));
        btThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btThongKe.setText("Thống kê"); // NOI18N
        btThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThongKeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btThongKeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtThongKeLayout = new javax.swing.GroupLayout(BtThongKe);
        BtThongKe.setLayout(BtThongKeLayout);
        BtThongKeLayout.setHorizontalGroup(
            BtThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtThongKeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtThongKeLayout.setVerticalGroup(
            BtThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtThongKeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menuhide.add(BtThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 250, 43));

        BtThongTinCaNhan.setBackground(new java.awt.Color(95, 97, 121));

        btThongTinCaNhan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btThongTinCaNhan.setForeground(new java.awt.Color(255, 51, 153));
        btThongTinCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btThongTinCaNhan.setText("Thông tin cá nhân"); // NOI18N
        btThongTinCaNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThongTinCaNhanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btThongTinCaNhanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btThongTinCaNhanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtThongTinCaNhanLayout = new javax.swing.GroupLayout(BtThongTinCaNhan);
        BtThongTinCaNhan.setLayout(BtThongTinCaNhanLayout);
        BtThongTinCaNhanLayout.setHorizontalGroup(
            BtThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtThongTinCaNhanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtThongTinCaNhanLayout.setVerticalGroup(
            BtThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtThongTinCaNhanLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(btThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menuhide.add(BtThongTinCaNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 250, 40));

        BtDichVu.setBackground(new java.awt.Color(95, 97, 121));

        btDichVu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btDichVu.setForeground(new java.awt.Color(255, 51, 153));
        btDichVu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDichVu.setText("Dịch vụ"); // NOI18N
        btDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDichVuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDichVuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDichVuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtDichVuLayout = new javax.swing.GroupLayout(BtDichVu);
        BtDichVu.setLayout(BtDichVuLayout);
        BtDichVuLayout.setHorizontalGroup(
            BtDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtDichVuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtDichVuLayout.setVerticalGroup(
            BtDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtDichVuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menuhide.add(BtDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 250, 43));

        BtKhachHang.setBackground(new java.awt.Color(95, 97, 121));

        btKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btKhachHang.setForeground(new java.awt.Color(255, 51, 153));
        btKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btKhachHang.setText("Khách hàng"); // NOI18N
        btKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btKhachHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btKhachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btKhachHangMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtKhachHangLayout = new javax.swing.GroupLayout(BtKhachHang);
        BtKhachHang.setLayout(BtKhachHangLayout);
        BtKhachHangLayout.setHorizontalGroup(
            BtKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtKhachHangLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtKhachHangLayout.setVerticalGroup(
            BtKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtKhachHangLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menuhide.add(BtKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 250, 43));

        BtKieuPhong.setBackground(new java.awt.Color(95, 97, 121));

        btKieuPhong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btKieuPhong.setForeground(new java.awt.Color(255, 51, 153));
        btKieuPhong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btKieuPhong.setText("Kiểu phòng"); // NOI18N
        btKieuPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btKieuPhongMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btKieuPhongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btKieuPhongMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtKieuPhongLayout = new javax.swing.GroupLayout(BtKieuPhong);
        BtKieuPhong.setLayout(BtKieuPhongLayout);
        BtKieuPhongLayout.setHorizontalGroup(
            BtKieuPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtKieuPhongLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btKieuPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtKieuPhongLayout.setVerticalGroup(
            BtKieuPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtKieuPhongLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btKieuPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menuhide.add(BtKieuPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 250, 43));

        BtLoaiDichVu.setBackground(new java.awt.Color(95, 97, 121));

        btLoaiDichVu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLoaiDichVu.setForeground(new java.awt.Color(255, 51, 153));
        btLoaiDichVu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btLoaiDichVu.setText("Loại dịch vụ"); // NOI18N
        btLoaiDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLoaiDichVuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btLoaiDichVuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btLoaiDichVuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtLoaiDichVuLayout = new javax.swing.GroupLayout(BtLoaiDichVu);
        BtLoaiDichVu.setLayout(BtLoaiDichVuLayout);
        BtLoaiDichVuLayout.setHorizontalGroup(
            BtLoaiDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtLoaiDichVuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtLoaiDichVuLayout.setVerticalGroup(
            BtLoaiDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtLoaiDichVuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menuhide.add(BtLoaiDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 250, 43));

        BtLoaiPhong.setBackground(new java.awt.Color(95, 97, 121));

        btLoaiPhong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLoaiPhong.setForeground(new java.awt.Color(255, 51, 153));
        btLoaiPhong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btLoaiPhong.setText("Loại phòng"); // NOI18N
        btLoaiPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLoaiPhongMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btLoaiPhongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btLoaiPhongMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtLoaiPhongLayout = new javax.swing.GroupLayout(BtLoaiPhong);
        BtLoaiPhong.setLayout(BtLoaiPhongLayout);
        BtLoaiPhongLayout.setHorizontalGroup(
            BtLoaiPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtLoaiPhongLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtLoaiPhongLayout.setVerticalGroup(
            BtLoaiPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtLoaiPhongLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menuhide.add(BtLoaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 250, 43));

        BtNhanVien.setBackground(new java.awt.Color(95, 97, 121));

        btNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btNhanVien.setForeground(new java.awt.Color(255, 51, 153));
        btNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNhanVien.setText("Nhân viên"); // NOI18N
        btNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNhanVienMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtNhanVienLayout = new javax.swing.GroupLayout(BtNhanVien);
        BtNhanVien.setLayout(BtNhanVienLayout);
        BtNhanVienLayout.setHorizontalGroup(
            BtNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtNhanVienLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtNhanVienLayout.setVerticalGroup(
            BtNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtNhanVienLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menuhide.add(BtNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 250, 43));

        BtPhong.setBackground(new java.awt.Color(95, 97, 121));

        btPhong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btPhong.setForeground(new java.awt.Color(255, 51, 153));
        btPhong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btPhong.setText("Phòng"); // NOI18N
        btPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPhongMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btPhongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btPhongMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtPhongLayout = new javax.swing.GroupLayout(BtPhong);
        BtPhong.setLayout(BtPhongLayout);
        BtPhongLayout.setHorizontalGroup(
            BtPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtPhongLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtPhongLayout.setVerticalGroup(
            BtPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtPhongLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menuhide.add(BtPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 250, 43));

        BtTaiKhoan.setBackground(new java.awt.Color(95, 97, 121));

        btTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btTaiKhoan.setForeground(new java.awt.Color(255, 51, 153));
        btTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btTaiKhoan.setText("Tài khoản "); // NOI18N
        btTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTaiKhoanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btTaiKhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btTaiKhoanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtTaiKhoanLayout = new javax.swing.GroupLayout(BtTaiKhoan);
        BtTaiKhoan.setLayout(BtTaiKhoanLayout);
        BtTaiKhoanLayout.setHorizontalGroup(
            BtTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtTaiKhoanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtTaiKhoanLayout.setVerticalGroup(
            BtTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtTaiKhoanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menuhide.add(BtTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 250, 43));

        BtHoaDon.setBackground(new java.awt.Color(95, 97, 121));

        btHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btHoaDon.setForeground(new java.awt.Color(255, 51, 153));
        btHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btHoaDon.setText("Hóa đơn"); // NOI18N
        btHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btHoaDonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtHoaDonLayout = new javax.swing.GroupLayout(BtHoaDon);
        BtHoaDon.setLayout(BtHoaDonLayout);
        BtHoaDonLayout.setHorizontalGroup(
            BtHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtHoaDonLayout.createSequentialGroup()
                .addComponent(btHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BtHoaDonLayout.setVerticalGroup(
            BtHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtHoaDonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menuhide.add(BtHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 250, 43));

        Menu.add(Menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(Menu, java.awt.BorderLayout.LINE_START);

        PnView.setBackground(new java.awt.Color(71, 127, 237));
        PnView.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo (3).png"))); // NOI18N
        jLabel2.setToolTipText("");
        PnView.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(PnView, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1123, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    boolean a = true;
    private JPanel ChildPanl;
    public void changcolor (JPanel hover, Color ran){
        hover.setBackground(ran);
    }
    
    
    
    public void ClickMenu(JPanel h1, JPanel h2,int muberbool){
        if(muberbool == 1){
            h1.setBackground(new Color(25,29,74));
            h2.setBackground(new Color(5, 10,46));
        }else{
             h2.setBackground(new Color(25,29,74));
            h1.setBackground(new Color(5, 10,46));
        }
    }
    public void changeimage(JLabel Button, String resourcheing){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheing));
        Button.setIcon(aimg);
    }
    
    public void hideShow(JPanel menushowhide, boolean  dashboard, JLabel button){
        
        if(dashboard == true){
            menushowhide.setPreferredSize(new Dimension(50,menushowhide.getHeight()));
            changeimage(button, "/Icon/menu_32px.png");
        }else{
            menushowhide.setPreferredSize(new Dimension(300,menushowhide.getHeight()));
            changeimage(button, "/Icon/back_32px.png");

        }
    }
    
    public void showPanel(JPanel panel){
        ChildPanl = panel;
        PnView.removeAll();
        PnView.add(ChildPanl);
        PnView.validate();
    }
    // <editor-fold defaultstate="collapsed" desc="Event">       
    

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);

    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
        changcolor(btClose, new Color(25, 29, 74));
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseExited
        changcolor(btClose, new Color(5, 10, 46));
    }//GEN-LAST:event_CloseMouseExited

    private void MaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaxMouseClicked
        if(this.getExtendedState() != fm_MainMenu.MAXIMIZED_BOTH){
            this.setExtendedState(fm_MainMenu.MAXIMIZED_BOTH);
        }else{
            this.setExtendedState(NORMAL);

        }
    }//GEN-LAST:event_MaxMouseClicked

    private void MaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaxMouseEntered
        changcolor(btMax, new Color(25, 29, 74));
    }//GEN-LAST:event_MaxMouseEntered

    private void MaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaxMouseExited
        changcolor(btMax, new Color(5, 10, 46));
    }//GEN-LAST:event_MaxMouseExited

    private void buttonhideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhideMouseClicked
        ClickMenu(hidemenu, seting, 1);

        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }

    }//GEN-LAST:event_buttonhideMouseClicked

    private void buttonhideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhideMouseEntered
        changcolor(linehidemenu, new Color(247, 78, 105));
    }//GEN-LAST:event_buttonhideMouseEntered

    private void buttonhideMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhideMouseExited
        changcolor(linehidemenu, new Color(5, 10, 46));
    }//GEN-LAST:event_buttonhideMouseExited

    private void buttonsetingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsetingMouseClicked
        Login form = new Login();
        this.setVisible(false);
        form.setVisible(true);
    }//GEN-LAST:event_buttonsetingMouseClicked

    private void buttonsetingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsetingMouseEntered
        changcolor(lineseting, new Color(8, 177, 150));
    }//GEN-LAST:event_buttonsetingMouseEntered

    private void buttonsetingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsetingMouseExited
        changcolor(lineseting, new Color(5, 10, 46));
    }//GEN-LAST:event_buttonsetingMouseExited

    private void buttonDanhsachPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDanhsachPhongMouseClicked
        showPanel(new fm_DanhSachPhong());
        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }

    }//GEN-LAST:event_buttonDanhsachPhongMouseClicked

    private void buttonDanhsachPhongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDanhsachPhongMouseEntered
        changcolor(BtDanhsachPhong, new Color(8, 177, 150));
    }//GEN-LAST:event_buttonDanhsachPhongMouseEntered

    private void buttonDanhsachPhongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDanhsachPhongMouseExited
        changcolor(BtDanhsachPhong, new Color(95,97,121));
    }//GEN-LAST:event_buttonDanhsachPhongMouseExited

    private void buttonDatPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDatPhongMouseClicked
        showPanel(new fm_DatPhong());
        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }

    }//GEN-LAST:event_buttonDatPhongMouseClicked

    private void buttonDatPhongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDatPhongMouseEntered
        changcolor(BtDatPhong, new Color(8, 177, 150));
    }//GEN-LAST:event_buttonDatPhongMouseEntered

    private void buttonDatPhongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDatPhongMouseExited
        changcolor(BtDatPhong, new Color(95,97,121));
    }//GEN-LAST:event_buttonDatPhongMouseExited

    private void btThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThongKeMouseClicked
        showPanel(new pn_Thongke());
        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }
    }//GEN-LAST:event_btThongKeMouseClicked

    private void btThongTinCaNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThongTinCaNhanMouseClicked
        showPanel(new pn_Info());
        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }
    }//GEN-LAST:event_btThongTinCaNhanMouseClicked

    private void btDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDichVuMouseClicked
        showPanel(new pn_DichVu());
        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }
    }//GEN-LAST:event_btDichVuMouseClicked

    private void btKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btKhachHangMouseClicked
        showPanel(new pn_KhachHang());
        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }
    }//GEN-LAST:event_btKhachHangMouseClicked

    private void btKieuPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btKieuPhongMouseClicked
        showPanel(new pn_KieuPhong());
        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }
    }//GEN-LAST:event_btKieuPhongMouseClicked

    private void btLoaiDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLoaiDichVuMouseClicked
        showPanel(new pn_LoaiDichVu());
        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }
    }//GEN-LAST:event_btLoaiDichVuMouseClicked

    private void btLoaiPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLoaiPhongMouseClicked
        showPanel(new pn_LoaiPhong());
        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }
    }//GEN-LAST:event_btLoaiPhongMouseClicked

    private void btNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNhanVienMouseClicked
        showPanel(new pn_NhanVien());
        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }
    }//GEN-LAST:event_btNhanVienMouseClicked

    private void btPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPhongMouseClicked
        showPanel(new pn_Phong());
        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }
    }//GEN-LAST:event_btPhongMouseClicked

    private void btTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTaiKhoanMouseClicked
        showPanel(new pn_TaiKhoan());
        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }
    }//GEN-LAST:event_btTaiKhoanMouseClicked

    private void btThongTinCaNhanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThongTinCaNhanMouseEntered
        changcolor(BtThongTinCaNhan, new Color(8, 177, 150));
    }//GEN-LAST:event_btThongTinCaNhanMouseEntered

    private void btDichVuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDichVuMouseEntered
        changcolor(BtDichVu, new Color(8, 177, 150));
    }//GEN-LAST:event_btDichVuMouseEntered

    private void btKhachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btKhachHangMouseEntered
        changcolor(BtKhachHang, new Color(8, 177, 150));
    }//GEN-LAST:event_btKhachHangMouseEntered

    private void btKieuPhongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btKieuPhongMouseEntered
        changcolor(BtKieuPhong, new Color(8, 177, 150));
    }//GEN-LAST:event_btKieuPhongMouseEntered

    private void btLoaiDichVuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLoaiDichVuMouseEntered
        changcolor(BtLoaiDichVu, new Color(8, 177, 150));
    }//GEN-LAST:event_btLoaiDichVuMouseEntered

    private void btLoaiPhongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLoaiPhongMouseEntered
        changcolor(BtLoaiPhong, new Color(8, 177, 150));
    }//GEN-LAST:event_btLoaiPhongMouseEntered

    private void btNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNhanVienMouseEntered
        changcolor(BtNhanVien, new Color(8, 177, 150));
    }//GEN-LAST:event_btNhanVienMouseEntered

    private void btPhongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPhongMouseEntered
        changcolor(BtPhong, new Color(8, 177, 150));
    }//GEN-LAST:event_btPhongMouseEntered

    private void btTaiKhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTaiKhoanMouseEntered
        changcolor(BtTaiKhoan, new Color(8, 177, 150));
    }//GEN-LAST:event_btTaiKhoanMouseEntered

    private void btThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThongKeMouseEntered
        changcolor(BtThongKe, new Color(8, 177, 150));
    }//GEN-LAST:event_btThongKeMouseEntered

    private void btThongTinCaNhanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThongTinCaNhanMouseExited
        changcolor(BtThongTinCaNhan, new Color(95,97,121));
    }//GEN-LAST:event_btThongTinCaNhanMouseExited

    private void btDichVuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDichVuMouseExited
        changcolor(BtDichVu, new Color(95,97,121));
    }//GEN-LAST:event_btDichVuMouseExited

    private void btKhachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btKhachHangMouseExited
        changcolor(BtKhachHang, new Color(95,97,121));
    }//GEN-LAST:event_btKhachHangMouseExited

    private void btKieuPhongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btKieuPhongMouseExited
        changcolor(BtKieuPhong, new Color(95,97,121));
    }//GEN-LAST:event_btKieuPhongMouseExited

    private void btLoaiDichVuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLoaiDichVuMouseExited
        changcolor(BtLoaiDichVu, new Color(95,97,121));
    }//GEN-LAST:event_btLoaiDichVuMouseExited

    private void btLoaiPhongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLoaiPhongMouseExited
        changcolor(BtLoaiPhong, new Color(95,97,121));
    }//GEN-LAST:event_btLoaiPhongMouseExited

    private void btNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNhanVienMouseExited
        changcolor(BtNhanVien, new Color(95,97,121));
    }//GEN-LAST:event_btNhanVienMouseExited

    private void btPhongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPhongMouseExited
        changcolor(BtPhong, new Color(95,97,121));
    }//GEN-LAST:event_btPhongMouseExited

    private void btTaiKhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTaiKhoanMouseExited
        changcolor(BtTaiKhoan, new Color(95,97,121));
    }//GEN-LAST:event_btTaiKhoanMouseExited

    private void btThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThongKeMouseExited
        changcolor(BtThongKe, new Color(95,97,121));
    }//GEN-LAST:event_btThongKeMouseExited

    private void btHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHoaDonMouseClicked
        showPanel(new pn_HoaDon());
        if( a == true){
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= false;
        }else{
            hideShow(Menu, a,buttonhide);
            SwingUtilities.updateComponentTreeUI(this);
            a= true;
        }
    }//GEN-LAST:event_btHoaDonMouseClicked

    private void btHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHoaDonMouseEntered
        changcolor(BtHoaDon, new Color(8, 177, 150));
    }//GEN-LAST:event_btHoaDonMouseEntered

    private void btHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHoaDonMouseExited
        changcolor(BtHoaDon, new Color(95,97,121));
    }//GEN-LAST:event_btHoaDonMouseExited

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new fm_MainMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtDanhsachPhong;
    private javax.swing.JPanel BtDatPhong;
    private javax.swing.JPanel BtDichVu;
    private javax.swing.JPanel BtHoaDon;
    private javax.swing.JPanel BtKhachHang;
    private javax.swing.JPanel BtKieuPhong;
    private javax.swing.JPanel BtLoaiDichVu;
    private javax.swing.JPanel BtLoaiPhong;
    private javax.swing.JPanel BtNhanVien;
    private javax.swing.JPanel BtPhong;
    private javax.swing.JPanel BtTaiKhoan;
    private javax.swing.JPanel BtThongKe;
    private javax.swing.JPanel BtThongTinCaNhan;
    private javax.swing.JLabel Close;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Max;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JPanel Menuhide;
    private javax.swing.JPanel PnView;
    private javax.swing.JPanel btClose;
    private javax.swing.JLabel btDichVu;
    private javax.swing.JLabel btHoaDon;
    private javax.swing.JLabel btKhachHang;
    private javax.swing.JLabel btKieuPhong;
    private javax.swing.JLabel btLoaiDichVu;
    private javax.swing.JLabel btLoaiPhong;
    private javax.swing.JPanel btMax;
    private javax.swing.JPanel btMin;
    private javax.swing.JLabel btNhanVien;
    private javax.swing.JLabel btPhong;
    private javax.swing.JLabel btTaiKhoan;
    private javax.swing.JLabel btThongKe;
    private javax.swing.JLabel btThongTinCaNhan;
    private javax.swing.JLabel buttonDanhsachPhong;
    private javax.swing.JLabel buttonDatPhong;
    private javax.swing.JLabel buttonhide;
    private javax.swing.JLabel buttonseting;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JPanel iconmimaxclose;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel lineseting;
    private javax.swing.JPanel seting;
    // End of variables declaration//GEN-END:variables
}
