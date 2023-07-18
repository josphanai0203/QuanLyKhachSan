/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.StaffService;
import controller.UserService;
import util.JDBCUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Staff;
import model.User;
import service.IUser;

/**
 *
 * @author Trinh
 */
public class UserDAO implements IUser {

    private static UserService cu = new UserService();
    private static StaffDAO sd = new StaffDAO();

    public static UserDAO getInstance() {
        return new UserDAO();
    }

    public boolean add(User t) {
        int update = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO tai_khoan (ten_tai_khoan, mat_khau, admin) "
                    + " VALUES ( ?, ?, ?)";

            PreparedStatement st = con.prepareStatement(sql);

            String matKhau = cu.encryptPassword(t.getMatKhau());

            st.setString(1, t.getTenTaiKhoan());
            //st.setString(2, t.getMatKhau());
            st.setString(2, matKhau);
            st.setBoolean(3, t.isAdmin());

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

    public ArrayList<User> selectAll() {
        ArrayList<User> kq = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM tai_khoan tk inner join nhan_vien nv on nv.ma_nhan_vien = tk.ma_nhan_vien inner join chuc_vu cv on cv.ma_chuc_vu = nv.ma_chuc_vu";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            //b4: xu li 
            while (rs.next()) {
                int ma_tai_khoan = rs.getInt("ma_tai_khoan");
                String ten_tai_khoan = rs.getString("ten_tai_khoan");
                String mat_khau = rs.getString("mat_khau");
                boolean admin = rs.getBoolean("admin");
                int ma_nhan_vien = rs.getInt("ma_nhan_vien");
                String ten_nhan_vien = rs.getString("ten_nhan_vien");
                Date ngay_sinh = rs.getDate("ngay_sinh");
                String gioi_tinh = rs.getString("gioi_tinh");
                String chuc_vu = rs.getString("ten_chuc_vu");
                String so_dien_thoai = rs.getString("so_dien_thoai");
                String dia_chi = rs.getString("dia_chi");
                Staff s1 = new Staff(ma_nhan_vien, ten_nhan_vien, ngay_sinh, gioi_tinh, chuc_vu, so_dien_thoai, dia_chi);
                User u1 = new User(ma_tai_khoan, ten_tai_khoan, mat_khau, admin, s1);
                kq.add(u1);

            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return kq;
    }

    public boolean update(User t) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE tai_khoan "
                    + "SET "
                    + "ten_tai_khoan=?, " + "mat_khau=?, " + "admin=?"
                    + " WHERE ma_tai_khoan=?";
            PreparedStatement st = con.prepareStatement(sql);
            //st.setInt(1, t.getMaTaiKhoan());

            st.setString(1, t.getTenTaiKhoan());
            st.setString(2, t.getMatKhau());
            st.setBoolean(3, t.isAdmin());
            st.setInt(4, t.getMaTaiKhoan());
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

    public boolean delete(User t) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "DELETE from tai_khoan "
                    + "WHERE ma_tai_khoan=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getMaTaiKhoan());

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
    public User findById(User t) {
        User kq = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM tai_khoan tk WHERE tk.ma_tai_khoan =? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getMaTaiKhoan());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_tai_khoan = rs.getInt("ma_tai_khoan");
                String ten_tai_khoan = rs.getString("ten_tai_khoan");
                String mat_khau = rs.getString("mat_khau");
                boolean admin = rs.getBoolean("admin");

                boolean isUsed = rs.getBoolean("isUsed");
                kq = new User(ma_tai_khoan, ten_tai_khoan, mat_khau, admin);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }

    public User findByName(String name) {
        User kq = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM tai_khoan tk WHERE tk.ten_tai_khoan =? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_tai_khoan = rs.getInt("ma_tai_khoan");
                String ten_tai_khoan = rs.getString("ten_tai_khoan");
                String mat_khau = rs.getString("mat_khau");
                boolean admin = rs.getBoolean("admin");

            
                kq = new User(ma_tai_khoan, ten_tai_khoan, mat_khau, admin);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }

    public boolean checkLogin(String tenTaiKhoan, String matKhau) {
        String sql = "SELECT * FROM tai_khoan tk WHERE tk.ten_tai_khoan = ? and mat_khau = ?";
        try (Connection con = JDBCUtil.getConnection(); PreparedStatement st = con.prepareStatement(sql);) {
            st.setString(1, tenTaiKhoan);
            st.setString(2, matKhau);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Staff s = sd.findID(rs.getInt("ma_nhan_vien"));
                int ma_tai_khoan = rs.getInt("ma_tai_khoan");
                String ten_tai_khoan = rs.getString("ten_tai_khoan");
                String mat_khau = rs.getString("mat_khau");
                boolean admin = rs.getBoolean("admin");
                UserService.currentUser = new User(ma_tai_khoan, ten_tai_khoan, mat_khau, admin, s);
                return true;

            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }

    }
}
