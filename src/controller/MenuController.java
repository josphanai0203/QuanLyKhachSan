/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import view.BillView;
import view.customerView.CustomerView;
import view.DefaultView;
import view.ReportView;
import view.roomView.RoomView;
import view.ServiceView;
import view.customerView.AddCustomerView;
import view.customerView.DefaultCustomerView;
import view.customerView.FixCusView;
import view.staffView.StaffView;

/**
 *
 * @author Admin
 */
public class MenuController {

    private JPanel root;
    private JPanel node;

    public MenuController(JPanel root) {
        this.root = root;
    }

    public void setView(JButton btn) {
        switch (btn.getText()) {
            case "Nhân Viên":
                node = new StaffView();
                break;
            case "Khách Hàng":
                node = new CustomerView();
                break;
            case "Dịch vụ":
                node = new ServiceView();
                break;
            case "Phòng":
                node = new RoomView();
                break;
            case "Hoá Đơn":
                node = new BillView();
                break;
            case "Báo Cáo":
                node = new ReportView();
                break;
            default:
                node = new DefaultView();
                break;

        }
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();
    }
     public void setViewCustomer(JButton btn) {
        switch (btn.getText()) {
            case "Thêm Khách Hàng":
                node = new AddCustomerView();
                break;
            case "Sửa Khách Hàng":
                node = new FixCusView();
                break;
            case "Trở Lại":
                node = new DefaultCustomerView();
                break;
            default:
                node = new DefaultCustomerView();
                break;

        }
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();
    }
    public void sentDate(Object data){
        
    }
     
}
