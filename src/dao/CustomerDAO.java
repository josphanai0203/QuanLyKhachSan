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
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO khach_hang (ten_khach_hang, nam_sinh, gioi_tinh, dia_chi, quoc_tich, so_cmnd, so_dien_thoai,ma_phong,kieu_thue) "
                    + " VALUES ( ?, ?, ?, ?, ?, ?, ?,?,?)";

            PreparedStatement st = con.prepareStatement(sql);
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
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM khach_hang kh INNER JOIN phong p ON p.ma_phong = kh.ma_phong left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong";
            PreparedStatement st = con.prepareStatement(sql);
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
                Customer c1 = new Customer(ma_khach_hang, ten_khach_hang, nam_sinh, gioi_tinh, dia_chi, quoc_tich, so_cmnd, so_dien_thoai, r,kieuThue);
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
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE khach_hang "
                    + "SET "
                    + "ten_khach_hang=?, " + "nam_sinh=?, " + "gioi_tinh=?, " + "dia_chi=?, " + "quoc_tich=?, " + "so_cmnd=?, " + "so_dien_thoai=?,"+ "ma_phong =? , kieu_thue=?"
                    + " WHERE ma_khach_hang=?";
            PreparedStatement st = con.prepareStatement(sql);

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
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "DELETE from khach_hang "
                    + "WHERE ma_khach_hang=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getMaKhachHang());

            kq = st.executeUpdate();

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
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM khach_hang kh INNER JOIN phong p ON p.ma_phong = kh.ma_phong left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong WHERE kh.ma_khach_hang =? ";
            PreparedStatement st = con.prepareStatement(sql);
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
                kq = new Customer(ma_khach_hang, ten_khach_hang, nam_sinh, gioi_tinh, dia_chi, quoc_tich, so_cmnd, so_dien_thoai, r,kieuThue);

            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }
    public Customer findById(int id) {
        Customer kq = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM khach_hang kh INNER JOIN phong p ON p.ma_phong = kh.ma_phong left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong WHERE kh.ma_khach_hang =? ";
            PreparedStatement st = con.prepareStatement(sql);
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
                kq = new Customer(ma_khach_hang, ten_khach_hang, nam_sinh, gioi_tinh, dia_chi, quoc_tich, so_cmnd, so_dien_thoai, r,kieuThue);

            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }
}
