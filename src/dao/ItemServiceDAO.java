package dao;

import controller.ItemServiceService;
import database.JDBCUtil;
import model.Service;
import service.IItemService;

import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemServiceDAO implements IItemService {
    private static ItemServiceService id = new ItemServiceService();

    public static ItemServiceDAO getInstance() {
        return new ItemServiceDAO();
    }

    @Override
    public boolean add(Service s) {

        int update = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO dich_vu (ten_dich_vu, ma_khach_hang, so_luong, don_gia, ma_kho_hang )"
                    + " VALUES (?, ?, ?, ?, ? )";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, s.getNameItem());
            st.setInt(2, s.getConditionkhach());
            st.setInt(3, s.getQuantity());
            st.setDouble(4, s.getBill());
            st.setInt(5, s.getConditionkho());

            update = st.executeUpdate();

//            System.out.println("Ban da thuc thi: " + sql);
//            System.out.println("Co " + update + " dong bi thay doi");

            JDBCUtil.closeConnection(con);
            return update > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<Service> selectAll() {
        ArrayList<Service> s = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM dich_vu dv inner join kho_hang kh on kh.ma_kho_hang = dv.ma_kho_hang inner join khach_hang kh1 on kh1.ma_khach_hang = dv.ma_khach_hang";
            PreparedStatement st = con.prepareStatement(sql);
            //b3: thuc thi cau lenh sql
//            System.out.println("Ban da thuc thi: " + sql);

            ResultSet rs = st.executeQuery();

            //b4: xu li
            while (rs.next()) {
                int ma_dich_vu = rs.getInt("ma_dich_vu");
                int ma_khach_hang = rs.getInt("ma_khach_hang");
                String ten_dich_vu = rs.getString("ten_dich_vu");
                int so_luong = rs.getInt("so_luong");
                Double don_gia = rs.getDouble("don_gia");
                int ma_kho_hang = rs.getInt("ma_kho_hang");
                Double thanh_tien = rs.getDouble("thanh_tien");

                Service s1 = new Service(ma_dich_vu, ma_khach_hang, ten_dich_vu, so_luong, don_gia, ma_kho_hang, thanh_tien);
                s.add(s1);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return s;
    }

    @Override
    public boolean update(Service s) {
        int wq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE dich_vu "
                    + "SET "
                    + "ma_khach_hang=?," + "ten_dich_vu=?," + "so_luong=?," + "don_gia=?," + "ma_kho_hang=?," + "thanh_tien=?"
                    + "WHERE ma_dich_vu=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(2, s.getConditionkhach());
            st.setString(1, s.getNameItem());
            st.setInt(3, s.getQuantity());
            st.setDouble(4, s.getBill());
            st.setInt(5, s.getConditionkho());
            st.setDouble(6, s.getBillOut());
            st.setInt(7, s.getIdItem());

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
    public boolean delete(Service s) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "DELETE from dich_vu "
                    + "WHERE ma_dich_vu=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, s.getIdItem());


            //b3: thuc thi cau lenh sql
            kq = st.executeUpdate();
            //b4: xu li
//            System.out.println("Ban da thuc thi: " + sql);
//            System.out.println("Co " + kq + " dong bi thay doi");

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
    public Service findById(Service s) {
        return id.findById(s);
    }
}
