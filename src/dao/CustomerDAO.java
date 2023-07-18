/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Customer;
import service.ICustomerService;
import util.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Room;
import util.Constants;

/**
 *
 * @author Trinh
 */
public class CustomerDAO implements ICustomerService {

    private RoomDAO rd = new RoomDAO();

    public static CustomerDAO getInstance() {
        return new CustomerDAO();
    }

    @Override
    public boolean add(Customer t) {
        int update = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.ADD_NEW_CUSTOMER);
            con.setAutoCommit(false);
            st.setString(1, t.getTenKhachHang());
            st.setInt(2, t.getNamSinh());
            st.setString(3, t.getGioiTinh());
            st.setString(4, t.getDiaChi());
            st.setString(5, t.getQuocTich());
            st.setInt(6, t.getSoCMND());
            st.setString(7, t.getSdt());
            st.setInt(8, t.getMaPhong().getId_room());
            st.setString(9, t.getKieuthue());
            update = st.executeUpdate();
            con.commit();
            JDBCUtil.closeConnection(con);
            return update > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<Customer> selectAll() {
        ArrayList<Customer> kq = new ArrayList<>();
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.SELECT_ALL_CUSTOMER);
            con.setAutoCommit(false);
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
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                boolean isUsed = rs.getBoolean("isUsed");
                String kieuThue = rs.getString("kieu_thue");
                Room r = new Room(ma_phong, ten_phong, dien_tich, loai_phong, isUsed);
                Customer c1 = new Customer(ma_khach_hang, ten_khach_hang, nam_sinh, gioi_tinh, dia_chi, quoc_tich, so_cmnd, so_dien_thoai, r, kieuThue);
                kq.add(c1);
                con.commit();
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
        int kq = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.UPDATE_CUSTOMER);
            con.setAutoCommit(false);

            st.setString(1, t.getTenKhachHang());
            st.setInt(2, t.getNamSinh());
            st.setString(3, t.getGioiTinh());
            st.setString(4, t.getDiaChi());
            st.setString(5, t.getQuocTich());
            st.setInt(6, t.getSoCMND());
            st.setString(7, t.getSdt());
            st.setInt(8, t.getMaPhong().getId_room());
            st.setString(9, t.getKieuthue());
            st.setInt(10, t.getMaKhachHang());

            kq = st.executeUpdate();
            con.commit();
            JDBCUtil.closeConnection(con);
            return kq > 0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Customer t) {
        int kq = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.DELETE_CUSTOMER_CUSTOMER);
            con.setAutoCommit(false);
            st.setInt(1, t.getMaKhachHang());
            kq = st.executeUpdate();
            con.commit();
            JDBCUtil.closeConnection(con);
            return kq > 0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Customer findById(Customer t) {
        Customer kq = null;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.FIND_CUSTOMER_BY_ID);
            con.setAutoCommit(false);
            st.setInt(1, t.getMaKhachHang());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_khach_hang = rs.getInt("ma_khach_hang");
                String ten_khach_hang = rs.getString("ten_khach_hang");
                int nam_sinh = rs.getInt("nam_sinh");
                String gioi_tinh = rs.getString("gioi_tinh");
                String dia_chi = rs.getString("dia_chi");
                String quoc_tich = rs.getString("quoc_tich");
                int so_cmnd = rs.getInt("so_cmnd");
                String so_dien_thoai = rs.getString("so_dien_thoai");
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                boolean isUsed = rs.getBoolean("isUsed");
                String kieuThue = rs.getString("kieu_thue");
                Room r = new Room(ma_phong, ten_phong, dien_tich, loai_phong, isUsed);
                kq = new Customer(ma_khach_hang, ten_khach_hang, nam_sinh, gioi_tinh, dia_chi, quoc_tich, so_cmnd, so_dien_thoai, r, kieuThue);
                con.commit();
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }

    public Customer findById(int id) {
        Customer kq = null;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.FIND_CUSTOMER_BY_ID_2);
            con.setAutoCommit(false);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_khach_hang = rs.getInt("ma_khach_hang");
                String ten_khach_hang = rs.getString("ten_khach_hang");
                int nam_sinh = rs.getInt("nam_sinh");
                String gioi_tinh = rs.getString("gioi_tinh");
                String dia_chi = rs.getString("dia_chi");
                String quoc_tich = rs.getString("quoc_tich");
                int so_cmnd = rs.getInt("so_cmnd");
                String so_dien_thoai = rs.getString("so_dien_thoai");
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                boolean isUsed = rs.getBoolean("isUsed");
                String kieuThue = rs.getString("kieu_thue");
                Room r = new Room(ma_phong, ten_phong, dien_tich, loai_phong, isUsed);
                kq = new Customer(ma_khach_hang, ten_khach_hang, nam_sinh, gioi_tinh, dia_chi, quoc_tich, so_cmnd, so_dien_thoai, r, kieuThue);
                con.commit();
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }
}
