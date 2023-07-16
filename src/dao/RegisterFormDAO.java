/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import util.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.RegistrationForm;

/**
 *
 * @author Admin
 */
public class RegisterFormDAO {

    public boolean add(RegistrationForm r) {
        int update = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO dang_ki (ma_phong,thoi_gian_thue) "
                    + " VALUES ( ?, ?)";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, r.getMaPhong().getId_room());
            st.setInt(2, r.getThoiGianThue());
            update = st.executeUpdate();
            JDBCUtil.closeConnection(con);
            return update > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public RegistrationForm findByIDCus(int id) {
        RegistrationForm r = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM dang_ki dk WHERE dk.ma_khach_hang = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                int id1 = rs.getInt("ma_dang_ki");
                int time = rs.getInt("thoi_gian_thue");
                r = new RegistrationForm(id1, null, null, time);
            }

            JDBCUtil.closeConnection(con);
            return r;

        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return  null;
    }
    public boolean Update(int id,int time){
        int kq = 0;
            String sql = "UPDATE dang_ki SET thoi_gian_thue = ?  WHERE ma_dang_ki= ? ";
        try (Connection con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(sql);
                ){
             st.setInt(1, time);
            st.setInt(2, id);

            kq = st.executeUpdate();
            JDBCUtil.closeConnection(con);
            return kq > 0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

}
