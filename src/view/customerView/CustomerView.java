/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.customerView;

import controller.MenuController;
import dao.CustomerDAO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.Customer;

/**
 *
 * @author Admin
 */
public class CustomerView extends javax.swing.JPanel {
    private MenuController controller;
    /**
     * Creates new form khachHang
     */
    private ArrayList<Customer> list;
    public CustomerView() {
        CustomerDAO cd = new CustomerDAO();
        list = cd.selectAll();
        initComponents();
        controller = new MenuController(cusView);
        setTableCustomer();
        
    }

    private void setTableCustomer() {
        DefaultTableModel dtm = new DefaultTableModel();
        cusTable.setModel(dtm);
        dtm.addColumn("ID");
        dtm.addColumn("Tên Khách Hàng");
        dtm.addColumn("Năm Sinh");
        dtm.addColumn("Giới Tính");
        dtm.addColumn("Địa Chỉ");
        dtm.addColumn("Quốc Tịch");
        dtm.addColumn("Số CMND");
        dtm.addColumn("Số Điện Thoại");
        dtm.addColumn("Phòng");
        setColumnWidths(cusTable, 50, 400, 100, 100, 400, 200, 200, 200,100);
        setRow(dtm);
    }

    public void setColumnWidths(JTable table, int... widths) {
        TableColumnModel columnModel = table.getColumnModel();
        for (int i = 0; i < widths.length; i++) {
            if (i < columnModel.getColumnCount()) {
                columnModel.getColumn(i).setMaxWidth(widths[i]);
            } else {
                break;
            }
        }
    }
    public void setRow(DefaultTableModel dfm){
        Vector v = null;
         for(Customer c : list){
             v =new Vector();
             v.removeAllElements();
            v.add(c.getMaKhachHang());
            v.add(c.getTenKhachHang());
            v.add(c.getNamSinh());
            v.add(c.getGioiTinh());
            v.add(c.getDiaChi());
            v.add(c.getQuocTich());
            v.add(c.getSoCMND());
            v.add(c.getSdt());
            dfm.addRow(v);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cusMenu = new javax.swing.JPanel();
        addCustomerBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        cusView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cusTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1110, 800));

        addCustomerBtn.setText("Thêm Khách Hàng");
        addCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerBtnActionPerformed(evt);
            }
        });

        jButton3.setText("Sửa Khách Hàng");

        jButton4.setText("Xoá Khách Hàng");

        backBtn.setText("Trở Lại");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cusMenuLayout = new javax.swing.GroupLayout(cusMenu);
        cusMenu.setLayout(cusMenuLayout);
        cusMenuLayout.setHorizontalGroup(
            cusMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cusMenuLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(addCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        cusMenuLayout.setVerticalGroup(
            cusMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cusMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(cusMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerBtn)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(backBtn))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        cusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(cusTable);

        javax.swing.GroupLayout cusViewLayout = new javax.swing.GroupLayout(cusView);
        cusView.setLayout(cusViewLayout);
        cusViewLayout.setHorizontalGroup(
            cusViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cusViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE))
        );
        cusViewLayout.setVerticalGroup(
            cusViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cusViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cusView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cusMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cusMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cusView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void addCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerBtnActionPerformed
       controller.setViewCustomer(addCustomerBtn);
    }//GEN-LAST:event_addCustomerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel cusMenu;
    private javax.swing.JTable cusTable;
    private javax.swing.JPanel cusView;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}