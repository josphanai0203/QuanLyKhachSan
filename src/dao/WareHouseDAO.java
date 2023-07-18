package dao;

import controller.WareHouseService;
import util.JDBCUtil;
import util.Constants;
import model.WareHouse;
import service.IWareHouseService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
//import java.util.*;
import java.util.ArrayList;

public class WareHouseDAO implements IWareHouseService {

    public static WareHouseService ws = new WareHouseService();

    public static WareHouseDAO getInstance() {
        return new WareHouseDAO();
    }

    @Override
    public boolean add(WareHouse w) {
        int update = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();

            PreparedStatement st = con.prepareStatement(Constants.ADD_NEW_WAREHOUSEITEM);

            con.setAutoCommit(false);
            st.setString(1, w.getnameW());
            st.setDate(2, (Date) w.getDayIn());
            st.setInt(3, w.getQuantity());
            st.setDouble(4, w.getPriceIn());
            st.setDouble(5, w.getPriceOut());
            st.setDate(6, (Date) w.gethSD());

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
    public ArrayList<WareHouse> selectAll() {
        ArrayList<WareHouse> w = new ArrayList<>();
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.SELECT_ALL_WAREHOUSE);
            con.setAutoCommit(false);
            ResultSet rs = st.executeQuery();

            //b4: xu li
            while (rs.next()) {
                int ma_kho_hang = rs.getInt("ma_kho_hang");
                String ten_san_pham = rs.getString("ten_san_pham");
                Date ngay_nhap = rs.getDate("ngay_nhap");
                int so_luong = rs.getInt("so_luong");
                Double gia_nhap = rs.getDouble("gia_nhap");
                Double gia_ban = rs.getDouble("gia_ban");
                Date han_su_dung = rs.getDate("han_su_dung");

                WareHouse w1 = new WareHouse(ma_kho_hang, ten_san_pham, ngay_nhap, so_luong, gia_nhap, gia_ban, han_su_dung);
                w.add(w1);
                con.commit();
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return w;

    }

    @Override
    public boolean update(WareHouse w) {
        int wq = 0;
        Connection con = null;
        try {

            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.UPDATE_WAREHOUSEITEM);
            con.setAutoCommit(false);

            st.setString(1, w.getnameW());
            st.setDate(2, (Date) w.getDayIn());
            st.setInt(3, w.getQuantity());
            st.setDouble(4, w.getPriceIn());
            st.setDouble(5, w.getPriceOut());
            st.setDate(6, (Date) w.gethSD());
            st.setInt(7, w.getMaW());
            wq = st.executeUpdate();
            con.commit();
            //b5: ngat ket noi
            JDBCUtil.closeConnection(con);
            return wq > 0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(WareHouse w) {
        int kq = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.DELETE_WAREHOUSE_BY_NAME);
            con.setAutoCommit(false);
            st.setInt(1, w.getMaW());
            kq = st.executeUpdate();
            con.commit();

            //b5: ngat ket noi
            JDBCUtil.closeConnection(con);
            return kq > 0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public WareHouse findById(WareHouse w) {
        return ws.findById(w);
    }

    public WareHouse findId(int maKhoHang) {

        WareHouse kq = null;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.FIND_ID_WAREHOUSE);
            con.setAutoCommit(false);
            st.setInt(1, maKhoHang);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id1 = rs.getInt("ma_kho_hang");
                String ten_san_pham = rs.getString("ten_san_pham");
                Date ngay_nhap = rs.getDate("ngay_nhap");
                int so_luong = rs.getInt("so_luong");
                double gia_nhap = rs.getDouble("gia_nhap");
                double gia_ban = rs.getDouble("gia_ban");
                Date han_su_dung = rs.getDate("han_su_dung");
                kq = new WareHouse(maKhoHang, ten_san_pham, ngay_nhap, so_luong, gia_nhap, gia_ban, han_su_dung);
                con.commit();
            }
            JDBCUtil.closeConnection(con);
            return kq;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }
}
