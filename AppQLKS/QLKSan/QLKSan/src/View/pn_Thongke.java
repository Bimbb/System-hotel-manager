/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import controller.ThongKeController;
import java.awt.BorderLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import java.awt.Color;
import java.util.ArrayList;
import model.PhieuDatPhong;
import model.PhieuSDDV;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;


public class pn_Thongke extends javax.swing.JPanel {

    int nam = 2022;
    int thang = -1;

    public pn_Thongke() {
        initComponents();
        showPieChart(nam,thang);
        showBarChart(nam);
        cbbNam.setSelectedItem(2022);
        loadCbbNam();
        loadCbbThang();
    }

    public void showPieChart(int nam, int thang){
        float tiendv = 0;
        float tienphong = 0;
        if(thang == -1){
            ArrayList<PhieuSDDV> DSSDDV = ThongKeController.layDSSDDV();
            for(PhieuSDDV phieuDV : DSSDDV){
                tiendv = phieuDV.getTongTienDV() + tiendv;
            }
        
            ArrayList<PhieuDatPhong> DSPhieuDatPhong = ThongKeController.layDSPhieuDatPhong();
            for(PhieuDatPhong phieuDP : DSPhieuDatPhong){
                tienphong = phieuDP.getTongTienDatPhong()+ tienphong;
            }
        }
        else{
            ArrayList<PhieuSDDV> DSSDDV = ThongKeController.layTienDVTheoThang(nam, thang);
            for(PhieuSDDV phieuDV : DSSDDV){
                tiendv = phieuDV.getTongTienDV() + tiendv;
            }
        
            ArrayList<PhieuDatPhong> DSPhieuDatPhong = ThongKeController.layTienPhongTheoThang(nam, thang);
            for(PhieuDatPhong phieuDP : DSPhieuDatPhong){
                tienphong = phieuDP.getTongTienDatPhong()+ tienphong;
            }
        }
        
        
        DefaultPieDataset barDataset = new DefaultPieDataset();
        barDataset.setValue("Dịch vụ "+ Math.round(tiendv*100/(tiendv+tienphong))+"%", new Double(tiendv));
        barDataset.setValue("Phòng "+Math.round(tienphong*100/(tiendv+tienphong)) +"%", new Double(tienphong));
        JFreeChart pieChart = ChartFactory.createPieChart("Huy", barDataset,false,true,false);
        
        PiePlot piePlot = (PiePlot) pieChart.getPlot();
        piePlot.setBackgroundPaint(Color.white);
        ChartPanel barChartPanel = new ChartPanel(pieChart);
        pnPieChart.removeAll();
        pnPieChart.add(barChartPanel, BorderLayout.CENTER);
        pnPieChart.validate();
    }
    
    public void showBarChart(int nam){
        float tiendv = 0;
        float tienphong = 0;
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i = 1; i <= 12; i++){
            tiendv = 0;
            tienphong = 0;
            ArrayList<PhieuSDDV> DSSDDV = new ThongKeController().layTienDVTheoThang(nam, i);
            for(PhieuSDDV phieuDV : DSSDDV){
                tiendv = phieuDV.getTongTienDV() + tiendv;
            }
            dataset.setValue(tiendv, "Dịch vụ", i+"");
            ArrayList<PhieuDatPhong> DSPhieuDatPhong = new ThongKeController().layTienPhongTheoThang(nam,i);
            for(PhieuDatPhong phieuDP : DSPhieuDatPhong){
                tienphong = phieuDP.getTongTienDatPhong()+ tienphong;
            }
            dataset.setValue(tienphong, "Phòng", i+"");
        }
        
        JFreeChart chart = ChartFactory.createBarChart("Doang thu năm", "Năm", "amount", dataset, PlotOrientation.VERTICAL, true, true, true);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        categoryPlot.setBackgroundPaint(Color.white);
        BarRenderer renderer =(BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barChartPanel = new ChartPanel(chart);
        pnBarChart.removeAll();
        pnBarChart.add(barChartPanel, BorderLayout.CENTER);
        pnBarChart.validate();
    }
    
    public void loadCbbThang(){
        cbbThang.addItem("Cả năm");
        cbbThang.addItem("Tháng 1");
        cbbThang.addItem("Tháng 2");
        cbbThang.addItem("Tháng 3");
        cbbThang.addItem("Tháng 4");
        cbbThang.addItem("Tháng 5");
        cbbThang.addItem("Tháng 6");
        cbbThang.addItem("Tháng 7");
        cbbThang.addItem("Tháng 8");
        cbbThang.addItem("Tháng 9");
        cbbThang.addItem("Tháng 10");
        cbbThang.addItem("Tháng 11");
        cbbThang.addItem("Tháng 12");
    }
    
    public void loadCbbNam(){
        cbbNam.addItem("2018");
        cbbNam.addItem("2019");
        cbbNam.addItem("2020");
        cbbNam.addItem("2021");
        cbbNam.addItem("2022");
        cbbNam.addItem("2023");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btReport = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        cbbThang = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        pnPieChart = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        cbbNam = new javax.swing.JComboBox<>();
        pnBarChart = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 150));
        jPanel2.setLayout(null);

        btReport.setText("jButton1");
        btReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReportActionPerformed(evt);
            }
        });
        jPanel2.add(btReport);
        btReport.setBounds(530, 50, 75, 22);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel3.add(jPanel10, java.awt.BorderLayout.LINE_START);

        cbbThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbThangActionPerformed(evt);
            }
        });
        jPanel11.add(cbbThang);

        jPanel3.add(jPanel11, java.awt.BorderLayout.PAGE_START);
        jPanel3.add(jPanel12, java.awt.BorderLayout.LINE_END);
        jPanel3.add(jPanel13, java.awt.BorderLayout.PAGE_END);

        pnPieChart.setBackground(new java.awt.Color(255, 255, 255));
        pnPieChart.setLayout(new java.awt.BorderLayout());
        jPanel3.add(pnPieChart, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());
        jPanel5.add(jPanel6, java.awt.BorderLayout.LINE_START);
        jPanel5.add(jPanel4, java.awt.BorderLayout.LINE_END);
        jPanel5.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        cbbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNamActionPerformed(evt);
            }
        });
        jPanel8.add(cbbNam);

        jPanel5.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        pnBarChart.setBackground(new java.awt.Color(255, 255, 255));
        pnBarChart.setLayout(new java.awt.BorderLayout());
        jPanel5.add(pnBarChart, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cbbThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbThangActionPerformed
        if(cbbThang.getSelectedItem().toString().equals("Cả năm")){
            thang = -1;
            showPieChart(nam, thang);
        }
        else if(cbbThang.getSelectedItem().toString().equals("Tháng 1")){
            thang = 1;
            showPieChart(nam, thang);
        }
        else if(cbbThang.getSelectedItem().toString().equals("Tháng 2")){
            thang = 2;
            showPieChart(nam, thang);
        }
        else if(cbbThang.getSelectedItem().toString().equals("Tháng 3")){
            thang = 3;
            showPieChart(nam, thang);
        }
        else if(cbbThang.getSelectedItem().toString().equals("Tháng 4")){
            thang = 4;
            showPieChart(nam, thang);
        }
        else if(cbbThang.getSelectedItem().toString().equals("Tháng 5")){
            thang = 5;
            showPieChart(nam, thang);
        }
        else if(cbbThang.getSelectedItem().toString().equals("Tháng 6")){
            thang = 6;
            showPieChart(nam, thang);
        }
        else if(cbbThang.getSelectedItem().toString().equals("Tháng 7")){
            thang = 7;
            showPieChart(nam, thang);
        }
        else if(cbbThang.getSelectedItem().toString().equals("Tháng 8")){
            thang = 8;
            showPieChart(nam, thang);
        }
        else if(cbbThang.getSelectedItem().toString().equals("Tháng 9")){
            thang = 9;
            showPieChart(nam, thang);
        }
        else if(cbbThang.getSelectedItem().toString().equals("Tháng 10")){
            thang = 10;
            showPieChart(nam, thang);
        }
        else if(cbbThang.getSelectedItem().toString().equals("Tháng 11")){
            thang = 11;
            showPieChart(nam, thang);
        }
        else {
            thang = 12;
            showPieChart(nam, thang);
        }
    }//GEN-LAST:event_cbbThangActionPerformed

    private void cbbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNamActionPerformed
        if(cbbNam.getSelectedItem().toString().equals("2018")){
            thang = -1;
            nam = 2018;
            showBarChart(nam);
            showPieChart(nam, thang);
        }
        else if(cbbNam.getSelectedItem().toString().equals("2019")){
            thang = -1;
            nam = 2019;
            showBarChart(nam);
            showPieChart(nam, thang);
        }
        else if(cbbNam.getSelectedItem().toString().equals("2020")){
            thang = -1;
            nam = 2020;
            showBarChart(nam);
            showPieChart(nam, thang);
        }
        else if(cbbNam.getSelectedItem().toString().equals("2021")){
            thang = -1;
            nam = 2021;
            showBarChart(nam);
            showPieChart(nam, thang);
        }
        else if(cbbNam.getSelectedItem().toString().equals("2022")){
            thang = -1;
            nam = 2022;
            showBarChart(nam);
            showPieChart(nam, thang);
        }
        else if(cbbNam.getSelectedItem().toString().equals("2023")){
            thang = -1;
            nam = 2023;
            showBarChart(nam);
            showPieChart(nam, thang);
        }
    }//GEN-LAST:event_cbbNamActionPerformed

    private void btReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReport;
    private javax.swing.JComboBox<String> cbbNam;
    private javax.swing.JComboBox<String> cbbThang;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel pnBarChart;
    private javax.swing.JPanel pnPieChart;
    // End of variables declaration//GEN-END:variables
}
