package dao;

import controller.ItemServiceService;
import util.JDBCUtil;
import util.Constants;
import model.Service;
import service.IItemService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;
import model.WareHouse;

public class ItemServiceDAO {

    private static ItemServiceService id = new ItemServiceService();
    private static CustomerDAO cd = new CustomerDAO();
    private static WareHouseDAO whd = new WareHouseDAO();

    public static ItemServiceDAO getInstance() {
        return new ItemServiceDAO();
    }

    public boolean add(Service s) {

        int update = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.ADD_SERVICE);
            con.setAutoCommit(false);
            st.setInt(1, s.getCustomer().getMaKhachHang());
            st.setString(2, s.getNameItem());
            st.setInt(3, s.getQuantity());
            update = st.executeUpdate();
            con.commit();
            JDBCUtil.closeConnection(con);
            return update > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Service> findByIdCus(int id) {
        ArrayList<Service> s = new ArrayList<>();
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.FIND_BY_ID_CUS_IN_SV);
            con.setAutoCommit(false);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_dich_vu = rs.getInt("ma_dich_vu");
                int ma_khach_hang = rs.getInt("ma_khach_hang");
                String ten_dich_vu = rs.getString("ten_dich_vu");
                int so_luong = rs.getInt("so_luong");
                Double don_gia = rs.getDouble("don_gia");
                int ma_kho_hang = rs.getInt("ma_kho_hang");
                Double thanh_tien = rs.getDouble("thanh_tien");
                Customer c = cd.findById(ma_khach_hang);
                WareHouse w = whd.findId(ma_kho_hang);
                Service s1 = new Service(ma_dich_vu, c, ten_dich_vu, so_luong, don_gia, w, thanh_tien);
                s.add(s1);
                con.commit();
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return s;
    }

    public ArrayList<Service> selectAll() {
        ArrayList<Service> s = new ArrayList<>();
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.SELECT_ALL_SERVICE);
            con.setAutoCommit(false);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_dich_vu = rs.getInt("ma_dich_vu");
                int ma_khach_hang = rs.getInt("ma_khach_hang");
                String ten_dich_vu = rs.getString("ten_dich_vu");
                int so_luong = rs.getInt("so_luong");
                Double don_gia = rs.getDouble("don_gia");
                int ma_kho_hang = rs.getInt("ma_kho_hang");
                Double thanh_tien = rs.getDouble("thanh_tien");
                Customer c = cd.findById(ma_khach_hang);
                WareHouse w = whd.findId(ma_kho_hang);
                Service s1 = new Service(ma_dich_vu, c, ten_dich_vu, so_luong, don_gia, w, thanh_tien);
                s.add(s1);
                con.commit();
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return s;
    }

    public boolean update(Service s) {
        int wq = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.UPDATE_SERVICE_BY_ID);
            con.setAutoCommit(false);

            st.setInt(1, s.getCustomer().getMaKhachHang());
            st.setString(2, s.getNameItem());
            st.setInt(3, s.getQuantity());
            st.setDouble(4, s.getPrice());
            st.setInt(5, s.getWareHouse().maW);
            st.setInt(6, s.getIdItem());

            wq = st.executeUpdate();
            con.commit();
            JDBCUtil.closeConnection(con);
            return wq > 0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(Service s) {
        int kq = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.DELETE_SERVICE_BY_ID);
            con.setAutoCommit(false);
            st.setInt(1, s.getIdItem());
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

    public double totalPrice(int makhachHang) {
        double total = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.TOTAL_PRICE_IN_SV);
            con.setAutoCommit(false);
            st.setInt(1, makhachHang);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                total = rs.getDouble("total");
            }
            con.commit();
            JDBCUtil.closeConnection(con);
            return total;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return total;
        }
    }

}
