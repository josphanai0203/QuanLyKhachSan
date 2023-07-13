/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Toolkit;
import javax.swing.JButton;
import controller.MenuController;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class MenuFrame extends javax.swing.JFrame {

    public MenuController controler;

    /**
     * Creates new form MenuFrame
     */
    public MenuFrame() {
        this.setUndecorated(false);                 //false for title bar. True for no title bar
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
        setIcon();
        initComponents();
        Toolkit a = Toolkit.getDefaultToolkit();
        int xSize = (int) a.getScreenSize().getWidth();
        int ySize = (int) a.getScreenSize().getHeight();
        this.setSize(xSize, ySize);
        controler = new MenuController(viewPane);
        controler.setView(new JButton());
    }
  
    private void setIcon(){
        Image icon = Toolkit.getDefaultToolkit().createImage(new File("").getAbsolutePath()+"/src/img/icon/logo24.png");
        this.setIconImage(icon);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuPane = new javax.swing.JPanel();
        customerBtn = new javax.swing.JButton();
        billBtn = new javax.swing.JButton();
        warehouseBtn = new javax.swing.JButton();
        roomBtn = new javax.swing.JButton();
        staffBtn = new javax.swing.JButton();
        reportBtn = new javax.swing.JButton();
        viewPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Khách sạn");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 800));

        menuPane.setToolTipText("");
        menuPane.setLayout(new java.awt.GridLayout(6, 0, 20, 20));

        customerBtn.setText("Khách Hàng");
        customerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerBtnActionPerformed(evt);
            }
        });
        menuPane.add(customerBtn);

        billBtn.setText("Hoá Đơn");
        billBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billBtnActionPerformed(evt);
            }
        });
        menuPane.add(billBtn);

        warehouseBtn.setText("Kho Hàng");
        warehouseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehouseBtnActionPerformed(evt);
            }
        });
        menuPane.add(warehouseBtn);

        roomBtn.setText("Phòng");
        roomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomBtnActionPerformed(evt);
            }
        });
        menuPane.add(roomBtn);

        staffBtn.setText("Nhân Viên");
        staffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffBtnActionPerformed(evt);
            }
        });
        menuPane.add(staffBtn);

        reportBtn.setText("Báo Cáo");
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });
        menuPane.add(reportBtn);

        javax.swing.GroupLayout viewPaneLayout = new javax.swing.GroupLayout(viewPane);
        viewPane.setLayout(viewPaneLayout);
        viewPaneLayout.setHorizontalGroup(
            viewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        viewPaneLayout.setVerticalGroup(
            viewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(menuPane, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPane, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billBtnActionPerformed
        controler.setView(billBtn);
    }//GEN-LAST:event_billBtnActionPerformed

    private void warehouseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehouseBtnActionPerformed
        controler.setView(warehouseBtn);
    }//GEN-LAST:event_warehouseBtnActionPerformed

    private void customerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerBtnActionPerformed
       controler.setView(customerBtn);
    }//GEN-LAST:event_customerBtnActionPerformed

    private void roomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomBtnActionPerformed
        controler.setView(roomBtn);
    }//GEN-LAST:event_roomBtnActionPerformed

    private void staffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffBtnActionPerformed
         controler.setView(staffBtn);
    }//GEN-LAST:event_staffBtnActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
         controler.setView(reportBtn);
    }//GEN-LAST:event_reportBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billBtn;
    private javax.swing.JButton customerBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menuPane;
    private javax.swing.JButton reportBtn;
    private javax.swing.JButton roomBtn;
    private javax.swing.JButton staffBtn;
    private javax.swing.JPanel viewPane;
    private javax.swing.JButton warehouseBtn;
    // End of variables declaration//GEN-END:variables
}
