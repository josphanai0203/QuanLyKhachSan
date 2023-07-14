/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.StaffService;
import java.util.ArrayList;
import model.Staff;
import service.IStaffService;
import java.sql.*;
import database.JDBCUtil;

public class StaffDAO implements IStaffService {

    public static StaffService ss = new StaffService();

    public static StaffDAO getInstance() {
        return new StaffDAO();
    }

    @Override
    public boolean add(Staff t) {
        int update = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO nhan_vien (ten_nhan_vien, ngay_sinh, gioi_tinh, ma_chuc_vu, so_dien_thoai, dia_chi) "
                    + " VALUES ( ?, ?, ?, ?, ?, ?)";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getTenNhanVien());
            st.setDate(2, (Date) t.getNgaySinh());
            st.setString(3, t.getGioiTinh());
            int ma_chuc_vu = findMaChucVu(t.getChucVu());
            st.setInt(4, ma_chuc_vu);
            st.setString(5, t.getSdt());
            st.setString(6, t.getDiaChi());
            update = st.executeUpdate();
            JDBCUtil.closeConnection(con);
            return update > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public ArrayList<Staff> selectAll() {
        ArrayList<Staff> kq = new ArrayList<Staff>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM nhan_vien nv inner join chuc_vu cv on cv.ma_chuc_vu = nv.ma_chuc_vu";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_nhan_vien = rs.getInt("ma_nhan_vien");
                String ten_nhan_vien = rs.getString("ten_nhan_vien");
                Date ngay_sinh = rs.getDate("ngay_sinh");
                String gioi_tinh = rs.getString("gioi_tinh");
                String chuc_vu = rs.getString("ten_chuc_vu");
                String so_dien_thoai = rs.getString("so_dien_thoai");
                String dia_chi = rs.getString("dia_chi");
                Staff s1 = new Staff(ma_nhan_vien, ten_nhan_vien, ngay_sinh, gioi_tinh, chuc_vu, so_dien_thoai, dia_chi);
                kq.add(s1);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;

    }

    @Override
    public boolean update(Staff t) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE nhan_vien "
                    + "SET "
                    + "ten_nhan_vien=?, " + "ngay_sinh=?, " + "gioi_tinh=?, " + "ma_chuc_vu=?, " + "so_dien_thoai=?, " + "dia_chi=?"
                    + " WHERE ma_nhan_vien=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getTenNhanVien());
            st.setDate(2, (Date) t.getNgaySinh());
            st.setString(3, t.getGioiTinh());
            st.setInt(4, findMaChucVu(t.getChucVu()));
            st.setString(5, t.getSdt());
            st.setString(6, t.getDiaChi());
            st.setInt(7, t.getMaNhanVien());
            kq = st.executeUpdate();
            JDBCUtil.closeConnection(con);
            return kq > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Staff t) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "DELETE from nhan_vien "
                    + "WHERE ma_nhan_vien=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getMaNhanVien());

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
    public Staff findById(Staff t) {
        return ss.findById(t);
    }
    public int findMaChucVu(String tenChucVu) {
        int maChucVu = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM chuc_vu WHERE ten_chuc_vu = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, tenChucVu);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                maChucVu = rs.getInt("ma_chuc_vu");
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maChucVu;
    }

    public Staff findID(int maNhanVien) {
        Staff s = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM nhan_vien nv inner join chuc_vu cv on cv.ma_chuc_vu = nv.ma_chuc_vu  WHERE nv.ma_nhan_vien = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, maNhanVien);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                int id1 = rs.getInt("ma_nhan_vien");
                String ten_nhan_vien = rs.getString("ten_nhan_vien");
                Date ngay_sinh = rs.getDate("ngay_sinh");
                String gioi_tinh = rs.getString("gioi_tinh");
                String chuc_vu = rs.getString("ten_chuc_vu");
                String so_dien_thoai = rs.getString("so_dien_thoai");
                String dia_chi = rs.getString("dia_chi");
                s = new Staff(maNhanVien, ten_nhan_vien, ngay_sinh, gioi_tinh, chuc_vu, so_dien_thoai, dia_chi);
            }

            JDBCUtil.closeConnection(con);
            return s;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }
}
