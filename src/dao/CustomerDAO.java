/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Customer;
import service.ICustomerService;
import database.JDBCUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Staff;

/**
 *
 * @author Trinh
 */
public class CustomerDAO implements ICustomerService {

    @Override
    public boolean add(Customer t) {

        return true;
    }

    @Override
    public ArrayList<Customer> selectAll() {
        ArrayList<Customer> kq = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM khach_hang";
            PreparedStatement st = con.prepareStatement(sql);
            //b3: thuc thi cau lenh sql  
            System.out.println("Ban da thuc thi: " + sql);

            ResultSet rs = st.executeQuery();

            //b4: xu li 
            while (rs.next()) {
                int ma_khach_hang = rs.getInt("ma_khach_hang");
                String ten_khach_hang = rs.getString("ten_khach_hang");
                int nam_sinh = rs.getInt("nam_sinh");
                String gioi_tinh = rs.getString("gioi_tinh");
                String dia_chi = rs.getString("dia_chi");
                String quoc_tich = rs.getString("quoc_tich");
                int so_cmnd = rs.getInt("so_cmnd");
                String so_dien_thoai = rs.getString("so_dien_thoai");

                Customer c1 = new Customer(ma_khach_hang, ten_khach_hang, nam_sinh, gioi_tinh, dia_chi, quoc_tich, so_cmnd, so_dien_thoai);
                kq.add(c1);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return kq;

    }

    @Override
    public boolean update(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
