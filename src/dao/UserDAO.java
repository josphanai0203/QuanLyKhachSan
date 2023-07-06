/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.UserService;
import database.JDBCUtil;
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
public class UserDAO implements IUser{
    private static UserService cu = new UserService();
    public static UserDAO getInstance(){
        return new UserDAO();
    }
   
    @Override
    public  boolean add(User t) {
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
    public ArrayList<User> selectAll() {
        ArrayList<User> kq = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM tai_khoan";
            PreparedStatement st = con.prepareStatement(sql);
            //b3: thuc thi cau lenh sql  
            //System.out.println("Ban da thuc thi: " + sql);

            ResultSet rs = st.executeQuery();

            //b4: xu li 
            while (rs.next()) {
                int ma_tai_khoan = rs.getInt("ma_tai_khoan");
                String ten_tai_khoan = rs.getString("ten_tai_khoan");
                String mat_khau = rs.getString("mat_khau");
                boolean admin = rs.getBoolean("admin");
                
                User u1 = new User(ma_tai_khoan, ten_tai_khoan, mat_khau, admin);
                kq.add(u1);
                
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return kq;
    }

    @Override
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

    @Override
    public boolean checkTenTaiKhoan(String tenTaiKhoan) {
        return cu.checkTenTaiKhoan(tenTaiKhoan);
    }

    @Override
    public boolean checkLogIn(String tenTaiKhoan, String matKhau) {
        return cu.checkLogIn(tenTaiKhoan, matKhau);
    }
    
}
