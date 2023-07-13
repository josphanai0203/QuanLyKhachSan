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
import model.Position;

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
            String sql = "INSERT INTO nhan_vien (ten_nhan_vien, ngay_sinh, gioi_tinh, so_dien_thoai, dia_chi) "
                    + " VALUES ( ?, ?, ?, ?, ?)";

            PreparedStatement st = con.prepareStatement(sql);
            //st.setInt(1, t.getMaNhanVien());
            st.setString(1, t.getTenNhanVien());
            st.setDate(2, (Date) t.getNgaySinh());
            st.setString(3, t.getGioiTinh());
            //st.setInt(4, t.getMaChucVu());
            st.setString(4, t.getSdt());
            st.setString(5, t.getDiaChi());
           // st.setInt(7, t.getMaLuong());

            update = st.executeUpdate();

//            System.out.println("Ban da thuc thi: " + sql);
//            System.out.println("Co " + update + " bi thay doi");

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
            //System.out.println("Ban da thuc thi: " + sql);

            ResultSet rs = st.executeQuery();

            //b4: xu li 
            while (rs.next()) {
                int ma_nhan_vien = rs.getInt("ma_nhan_vien");
                String ten_nhan_vien = rs.getString("ten_nhan_vien");
                Date ngay_sinh = rs.getDate("ngay_sinh");
                String gioi_tinh = rs.getString("gioi_tinh");
                int ma_chuc_vu = rs.getInt("ma_chuc_vu");
                Position position = findTenChucVu(ma_chuc_vu);
                
                String so_dien_thoai = rs.getString("so_dien_thoai");
                String dia_chi = rs.getString("dia_chi");
                //int ma_luong = rs.getInt("ma_luong");

                Staff s1 = new Staff(ma_nhan_vien, ten_nhan_vien, ngay_sinh, gioi_tinh, so_dien_thoai, dia_chi);
                s1.setMaChucVu(position);
                kq.add(s1);
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
                    + "ten_nhan_vien=?, " + "ngay_sinh=?, " + "gioi_tinh=?, " + "so_dien_thoai=?, " + "dia_chi=?" 
                    + " WHERE ma_nhan_vien=?";
            PreparedStatement st = con.prepareStatement(sql);
            //st.setInt(1, t.getMaNhanVien());
            st.setString(1, t.getTenNhanVien());
            st.setDate(2, (Date) t.getNgaySinh());
            st.setString(3, t.getGioiTinh());
            //st.setInt(4, t.getMaChucVu());
            st.setString(4, t.getSdt());
            st.setString(5, t.getDiaChi());
            //st.setInt(7, t.getMaLuong());
            st.setInt(6, t.getMaNhanVien());
            //b3: thuc thi cau lenh sql	
            kq = st.executeUpdate();
            //b4: xu li 
//            System.out.println("Ban da thuc thi: " + sql);
//            System.out.println("Co " + kq + " bi thay doi");

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

            kq = st.executeUpdate();
 
            JDBCUtil.closeConnection(con);
            return kq>0;
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

    public Position findTenChucVu(int maChucVu) {
        Position kq = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM chuc_vu WHERE ma_chuc_vu = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, maChucVu);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
               // int ma_chuc_vu = rs.getInt("ma_chuc_vu");
                String ten_chuc_vu = rs.getString("ten_chuc_vu");

                kq = new Position(maChucVu, ten_chuc_vu);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }


}
