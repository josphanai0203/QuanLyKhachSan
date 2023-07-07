package dao;

import database.JDBCUtil;
import model.WareHouse;
import service.IWareHouseService;

import java.sql.*;
import java.util.ArrayList;

public class WareHouseDAO implements IWareHouseService {
    public static WareHouseDAO getInstance() {
        return new WareHouseDAO();
    }


    @Override
    public boolean add(WareHouse w) {
        int update = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO kho_hang (ten_san_pham, ngay_nhap,so_luong, gia_nhap, gia_ban, han_su_dung) "
                    + " VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, w.getnameW());
            st.setDate(2, (Date) w.getDayIn());
            st.setInt(3, w.getQuantity());
            st.setDouble(4, w.getPriceIn());
            st.setDouble(5, w.getPriceOut());
            st.setDate(6, (Date) w.gethSD());


            update = st.executeUpdate();

            System.out.println("Ban da thuc thi: " + sql);
            System.out.println("Co " + update + " dong bi thay doi");

            JDBCUtil.closeConnection(con);
            return update > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<WareHouse> selectAll() {
        ArrayList<WareHouse> w = new ArrayList<WareHouse>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM kho_hang";
            PreparedStatement st = con.prepareStatement(sql);
            //b3: thuc thi cau lenh sql
            System.out.println("Ban da thuc thi: " + sql);

            ResultSet rs = st.executeQuery();

            //b4: xu li
            while (rs.next()) {
                String ten_san_pham = rs.getString("ten_san_pham");
                Date ngay_nhap = rs.getDate("ngay_nhap");
                int so_luong = rs.getInt("so_luong");
                Double gia_nhap = rs.getDouble("gia_nhap");
                Double gia_ban = rs.getDouble("gia_ban");
                Date han_su_dung = rs.getDate("han_su_dung");


                WareHouse w1 = new WareHouse(ten_san_pham, ngay_nhap, so_luong, gia_nhap, gia_ban, han_su_dung);
                //Staff s1 = new User(username, password, hoVaTen);
                //kq.add(u1);
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
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE kho_hang "
                    + "SET "
                    + "ten_san_pham=?," + "ngay_nhap=?," + "so_luong=?," + "gia_nhap=?," + "gia_ban=?," + "han_su_dung=?"
                    + "WHERE ma_san_pham=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, w.getnameW());
            st.setDate(2, (Date) w.getDayIn());
            st.setInt(3, w.getQuantity());
            st.setDouble(4, w.getPriceIn());
            st.setDouble(5, w.getPriceOut());
            st.setDate(6, w.gethSD());
           st.setInt(7,w.getMaW());

            //b3: thuc thi cau lenh sql
            wq = st.executeUpdate();
            //b4: xu li
//            System.out.println("Ban da thuc thi: " + sql);
//            System.out.println("Co " + wq + " dong bi thay doi");

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
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "DELETE from kho_hang "
                    + "WHERE ma_kho_hang=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1,w.getMaW());
//            st.setString(2, w.getnameW());
//            st.setDate(3, (Date) w.getDayIn());
//            st.setInt(4, w.getQuantity());
//            st.setDouble(5, w.getPriceIn());
//            st.setDouble(6, w.getPriceOut());
//            st.setDate(7, (Date) w.gethSD());

            //b3: thuc thi cau lenh sql
            kq = st.executeUpdate();
            //b4: xu li
            System.out.println("Ban da thuc thi: " + sql);
            System.out.println("Co " + kq + " dong bi thay doi");

            //b5: ngat ket noi
            JDBCUtil.closeConnection(con);
            return kq > 0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }
}
