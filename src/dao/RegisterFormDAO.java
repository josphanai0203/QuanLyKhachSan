/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import util.JDBCUtil;
import util.Constants;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.sql.Timestamp;
import model.RegistrationForm;

/**
 *
 * @author Admin
 */
public class RegisterFormDAO {

    public boolean add(RegistrationForm r) {
        int update = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.ADD_NEW_FORM);
            con.setAutoCommit(false);
            st.setInt(1, r.getMaPhong().getId_room());
            st.setInt(2, r.getThoiGianThue());
            LocalDateTime lo = LocalDateTime.now();
            Timestamp t = Timestamp.valueOf(lo);
            st.setTimestamp(3, t);
            update = st.executeUpdate();
            con.commit();
            JDBCUtil.closeConnection(con);
            return update > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public RegistrationForm findByIDCus(int id) {
        RegistrationForm r = null;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.FIND_FORM_BY_ID);
            con.setAutoCommit(false);

            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                int id1 = rs.getInt("ma_dang_ki");
                int time = rs.getInt("thoi_gian_thue");
                double total = rs.getDouble("tong_tien_phong");
                Timestamp t = rs.getTimestamp("ngay_dang_ki");
                LocalDateTime l = t.toLocalDateTime();
                r = new RegistrationForm(id1, null, null, time, total, l);
                con.commit();
            }

            JDBCUtil.closeConnection(con);
            return r;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public boolean Update(int id, int time) {
        int kq = 0;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.UPDATE_FORM_BY_ID);
            con.setAutoCommit(false);
            st.setInt(1, time);
            st.setInt(2, id);

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

}
