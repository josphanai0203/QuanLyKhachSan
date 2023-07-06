/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.BillView;
import view.CustomerView;
import view.DefaultView;
import view.ServiceView;
import view.StaffView;

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
            case "Quản Lý Nhân Viên":
                node = new StaffView();
                break;
            case "Quản Lý Khách Hàng":
                node = new CustomerView();
                break;
            case "Quản Lý Dịch vụ":
                node = new ServiceView();
                break;
            case "Quản Lý Phòng":
                node = new CustomerView();
                break;
            case "Hoá Đơn":
                node = new BillView();
                break;
            case "Báo Cáo":
                node = new CustomerView();
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

}
