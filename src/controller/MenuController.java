/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import view.billView.BillView;
import view.customerView.CustomerView;
import view.DefaultView;
import view.ReportView;
import view.roomView.RoomView;
import view.WareHouseView.AddWareHouseView;
import view.WareHouseView.DefauseWareHouseView;
import view.WareHouseView.FixWareView;
import view.WareHouseView.WareHouseView;
import view.billView.DefaultBillView;
import view.billView.DetailBillView;
import view.customerView.AddCustomerView;
import view.customerView.DefaultCustomerView;
import view.roomView.AddRoomView;
import view.roomView.DefaultRoomView;
import view.staffView.AddStaffView;
import view.staffView.DefaultStaffView;
import view.staffView.FixStaffView;
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
            case "Kho Hàng":
                node = new WareHouseView();
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

    public void setViewRoom(JButton btn) {
        switch (btn.getText()) {
            case "Tạo Phòng Mới":
                node = new AddRoomView();
                break;
            case "Sửa Thông Tin Phòng":
                node = new AddRoomView(1);
                break;
            case "Trở Lại":
                node = new DefaultRoomView();
                break;
            default:
                node = new DefaultRoomView();
                break;

        }
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();

    }

    public void setViewStaff(JButton btn) {
        switch (btn.getText()) {
            case "Thêm Nhân Viên":
                node = new AddStaffView();
                break;
            case "Sửa Nhân Viên":
                node = new FixStaffView();
                break;
            case "Trở Lại":
                node = new DefaultStaffView();
                break;
            default:
                node = new DefaultStaffView();
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
                node = new AddCustomerView("fix");
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

    public void setViewWareHouse(JButton btn) {
        switch (btn.getText()) {
            case "Thêm Sản Phẩm":
                node = new AddWareHouseView();
                break;
            case "Sửa Mã Hàng":
                node = new FixWareView();
                break;
            case "Trở Lại":
                node = new DefauseWareHouseView();
               break;
            default:
                node = new DefauseWareHouseView();
                break;
        }
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();

    }
    public void setBillView(JButton btn ){
        switch (btn.getText()) {
            case "Hoá Đơn Chi Tiết":
                node = new DetailBillView();
                break;
            case "Thanh Toán":
                node = new DefauseWareHouseView();
               break;
            case "Trở lại":
                node = new DefaultBillView();
               break;
            default:
                node = new DefaultBillView();
                break;
        }
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();
    }
    

}
