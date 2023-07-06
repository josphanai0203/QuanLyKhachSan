/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Staff;
import service.IStaffService;
import java.sql.*;
import database.JDBCUtil;

public class StaffDAO implements IStaffService {

    public static StaffDAO getInstance() {
        return new StaffDAO();
    }

    @Override
    public boolean add(Staff t) {
        int update = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO nhan_vien (ten_nhan_vien, ngay_sinh, gioi_tinh, ma_chuc_vu, so_dien_thoai, dia_chi, ma_luong) "
                    + " VALUES ( ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement st = con.prepareStatement(sql);
            //st.setInt(1, t.getMaNhanVien());
            st.setString(1, t.getTenNhanVien());
            st.setDate(2, (Date) t.getNgaySinh());
            st.setString(3, t.getGioiTinh());
            st.setInt(4, t.getMaChucVu());
            st.setString(5, t.getSdt());
            st.setString(6, t.getDiaChi());
            st.setInt(7, t.getMaLuong());

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
    public ArrayList<Staff> selectAll() {
        ArrayList<Staff> kq = new ArrayList<Staff>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM nhan_vien";
            PreparedStatement st = con.prepareStatement(sql);
            //b3: thuc thi cau lenh sql  
            System.out.println("Ban da thuc thi: " + sql);

            ResultSet rs = st.executeQuery();

            //b4: xu li 
            while (rs.next()) {
                int ma_nhan_vien = rs.getInt("ma_nhan_vien");
                String ten_nhan_vien = rs.getString("ten_nhan_vien");
                Date ngay_sinh = rs.getDate("ngay_sinh");
                String gioi_tinh = rs.getString("gioi_tinh");
                int ma_chuc_vu = rs.getInt("ma_chuc_vu");
                String so_dien_thoai = rs.getString("so_dien_thoai");
                String dia_chi = rs.getString("dia_chi");
                int ma_luong = rs.getInt("ma_luong");

                Staff s1 = new Staff(ma_nhan_vien, ten_nhan_vien, ngay_sinh, gioi_tinh, ma_chuc_vu, so_dien_thoai, dia_chi, ma_luong);
                //Staff s1 = new User(username, password, hoVaTen);
                //kq.add(u1);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
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
                    + "ten_nhan_vien=?, " + "ngay_sinh=?, " + "gioi_tinh=?, " + "ma_chuc_vu=?, " + "so_dien_thoai=?, " + "dia_chi=?, " + "ma_luong=?"
                    + " WHERE ma_nhan_vien=?";
            PreparedStatement st = con.prepareStatement(sql);
            //st.setInt(1, t.getMaNhanVien());
            st.setString(1, t.getTenNhanVien());
            st.setDate(2, (Date) t.getNgaySinh());
            st.setString(3, t.getGioiTinh());
            st.setInt(4, t.getMaChucVu());
            st.setString(5, t.getSdt());
            st.setString(6, t.getDiaChi());
            st.setInt(7, t.getMaLuong());
            st.setInt(8, t.getMaNhanVien());
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

    @Override
    public boolean delete(Staff t) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "DELETE from nhan_vien "
                    + "WHERE ma_nhan_vien=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getMaNhanVien());
            st.setString(2, t.getTenNhanVien());
            st.setDate(3, (Date) t.getNgaySinh());
            st.setString(4, t.getGioiTinh());
            st.setInt(5, t.getMaChucVu());
            st.setString(6, t.getSdt());
            st.setString(7, t.getDiaChi());
            st.setInt(8, t.getMaLuong());
            //b3: thuc thi cau lenh sql
            kq = st.executeUpdate();
            //b4: xu li 
            System.out.println("Ban da thuc thi: " + sql);
            System.out.println("Co " + kq + " dong bi thay doi");

            //b5: ngat ket noi
            JDBCUtil.closeConnection(con);
            return kq>0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

}
