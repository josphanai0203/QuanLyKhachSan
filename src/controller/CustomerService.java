/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.CustomerDAO;
import dao.RoomDAO;
import java.util.ArrayList;
import model.Customer;
import model.Room;
import service.IService;

/**
 *
 * @author Admin
 */
public class CustomerService implements IService<Customer>{
    private static  RoomDAO rd = new RoomDAO();
    private static CustomerDAO cd = new CustomerDAO();
    public void createCustomer(String tenKhachHang, int namSinh,String gioiTinh , String diaChi, String quocTich, int soCMND, String sdt, String maPhong){
        Room n = rd.findByName(maPhong);
        Customer c = new Customer(tenKhachHang, namSinh, gioiTinh, diaChi, quocTich, soCMND, sdt, n);
        add(c);
    }
    @Override
    public boolean add(Customer t) {
        return cd.add(t);
    }

    @Override
    public ArrayList<Customer> selectAll() {
         return cd.selectAll();
    }

    @Override
    public boolean update(Customer t) {
        return cd.update(t);
    }

    @Override
    public boolean delete(Customer t) {
        return cd.update(t);
    }

    @Override
    public Customer findById(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
