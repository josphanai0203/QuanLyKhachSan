/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.billView;

import controller.BillDoneService;
import controller.ItemServiceService;
import controller.MenuController;
import controller.UserService;
import controller.WareHouseService;
import dao.CustomerDAO;
import dao.ItemServiceDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Customer;
import model.WareHouse;

/**
 *
 * @author Admin
 */
public class BillView extends javax.swing.JPanel {

    private MenuController controller;
    private WareHouseService whs = new WareHouseService();
    private ItemServiceService isd = new ItemServiceService();
    private CustomerDAO cd = new CustomerDAO();
    private BillDoneService bds = new BillDoneService();

    public BillView() {
        initComponents();
        controller = new MenuController(billView);
        controller.setBillView(new JButton());
        setNameService();
        backBtn.setEnabled(false);
         addBtn.setEnabled(true);
    }

    private void setNameService() {
        ArrayList<WareHouse> list = whs.selectAll();
        for (WareHouse w : list) {
            serviceName.addItem(w.getnameW());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addServiceDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serviceName = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        closeAddBtn = new javax.swing.JButton();
        addServiceBtn = new javax.swing.JButton();
        soLuong = new javax.swing.JSpinner();
        dialogMess = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        messAdd = new javax.swing.JLabel();
        payBillDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        detailBtn = new javax.swing.JButton();
        payBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        billView = new javax.swing.JPanel();

        addServiceDialog.setAlwaysOnTop(true);
        addServiceDialog.setLocation(new java.awt.Point(0, 0));
        addServiceDialog.setMinimumSize(new java.awt.Dimension(850, 365));
        addServiceDialog.setModal(true);
        addServiceDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                addServiceDialogWindowClosed(evt);
            }
        });

        jPanel2.setMinimumSize(new java.awt.Dimension(797, 353));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm Dịch Vụ Hoá Đơn Khách Hàng");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Tên Dịch Vụ");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Số lượng");

        closeAddBtn.setText("Đóng");
        closeAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAddBtnActionPerformed(evt);
            }
        });

        addServiceBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addServiceBtn.setText("Thêm");
        addServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceBtnActionPerformed(evt);
            }
        });

        soLuong.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        dialogMess.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        messAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        messAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(messAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(error2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(serviceName, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dialogMess, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(closeAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeAddBtn)))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serviceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(addServiceBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(messAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dialogMess, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout addServiceDialogLayout = new javax.swing.GroupLayout(addServiceDialog.getContentPane());
        addServiceDialog.getContentPane().setLayout(addServiceDialogLayout);
        addServiceDialogLayout.setHorizontalGroup(
            addServiceDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addServiceDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addServiceDialogLayout.setVerticalGroup(
            addServiceDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addServiceDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout payBillDialogLayout = new javax.swing.GroupLayout(payBillDialog.getContentPane());
        payBillDialog.getContentPane().setLayout(payBillDialogLayout);
        payBillDialogLayout.setHorizontalGroup(
            payBillDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        payBillDialogLayout.setVerticalGroup(
            payBillDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        addBtn.setText("Thêm Dịch Vụ");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        detailBtn.setText("Hoá Đơn Chi Tiết");
        detailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailBtnActionPerformed(evt);
            }
        });

        payBtn.setText("Thanh Toán");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Trở lại");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(detailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(detailBtn)
                    .addComponent(payBtn)
                    .addComponent(backBtn))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout billViewLayout = new javax.swing.GroupLayout(billView);
        billView.setLayout(billViewLayout);
        billViewLayout.setHorizontalGroup(
            billViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        billViewLayout.setVerticalGroup(
            billViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(billView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(billView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void detailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailBtnActionPerformed
         int cus = DefaultBillView.getCus();
        if (cus == -1) {
            JOptionPane.showMessageDialog(this, "Vui Lòng Chọn Hoá Đơn", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            controller.setBillView(detailBtn);
            backBtn.setEnabled(true);
            addBtn.setEnabled(false);
        }
    }//GEN-LAST:event_detailBtnActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
         int cus = DefaultBillView.getCus();
        if (cus == -1) {
            JOptionPane.showMessageDialog(this, "Vui Lòng Chọn Hoá Đơn", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Customer c = cd.findById(cus);
            boolean check = bds.addBillDone(c.getTenKhachHang(), UserService.currentUser.getStaff().getMaNhanVien());
            if(check){
                DefaultBillView.setCus();
                controller.setBillView(new JButton()); 
                 JOptionPane.showMessageDialog(this, "Thanh Toán Thành Công Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_payBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        int cus = DefaultBillView.getCus();
        if (cus == -1) {
            JOptionPane.showMessageDialog(this, "Vui Lòng Chọn Hoá Đơn", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

            // Tính toán vị trí x và y cho dialog
            int x = (screenSize.width - addServiceDialog.getWidth()) / 2;
            int y = (screenSize.height - addServiceDialog.getHeight()) / 2;

            // Đặt vị trí dialog
            addServiceDialog.setLocation(x, y);
            addServiceDialog.setVisible(true);

        }


    }//GEN-LAST:event_addBtnActionPerformed

    private void closeAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAddBtnActionPerformed
        addServiceDialog.setVisible(false);
        DefaultBillView.setCus();
        controller.setBillView(new JButton());
    }//GEN-LAST:event_closeAddBtnActionPerformed

    private void addServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServiceBtnActionPerformed
        String serName = (String) serviceName.getSelectedItem();
        int soLuong = (Integer) this.soLuong.getValue();
        if (soLuong <= 0) {
            error2.setForeground(new Color(255, 0, 0));
            error2.setText("Vui lòng chọn số dương");
        }else{
            
        boolean check = isd.addNewService(DefaultBillView.getCus(), soLuong, serName);
        if (check) {
            messAdd.setForeground(new Color(13, 110, 253));
            messAdd.setText("Thêm Dịch Vụ Thành Công");
        } else {
            messAdd.setForeground(new Color(255, 0, 0));
            messAdd.setText("Thêm Dịch Vụ Thất Bại");
        }
        }
    }//GEN-LAST:event_addServiceBtnActionPerformed

    private void addServiceDialogWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_addServiceDialogWindowClosed
        controller.setBillView(new JButton());
        DefaultBillView.setCus();
    }//GEN-LAST:event_addServiceDialogWindowClosed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
       controller.setBillView(new JButton());
       addBtn.setEnabled(true);
       DefaultBillView.setCus();
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addServiceBtn;
    private javax.swing.JDialog addServiceDialog;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel billView;
    private javax.swing.JButton closeAddBtn;
    private javax.swing.JButton detailBtn;
    private javax.swing.JLabel dialogMess;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel messAdd;
    private javax.swing.JDialog payBillDialog;
    private javax.swing.JButton payBtn;
    private javax.swing.JComboBox<String> serviceName;
    private javax.swing.JSpinner soLuong;
    // End of variables declaration//GEN-END:variables
}
