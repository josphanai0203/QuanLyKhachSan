/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Payroll;
import model.Position;
import service.IPosition;

/**
 *
 * @author Trinh
 */
public class PositionDAO implements IPosition{

    @Override
    public boolean add(Position t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Position> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Position t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Position t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Position findById(Position t) {
        Position kq = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM chuc_vu cv bl WHERE cv.ma_chuc_vu =? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getMaChucVu());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_chuc_vu = rs.getInt("ma_chuc_vu");
                String ten_chuc_vu = rs.getString("ten_chuc_vu");

                kq = new Position(ma_chuc_vu, ten_chuc_vu);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }
    
    public Position findByName(String name) {
        Position kq = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM chuc_vu cv bl WHERE cv.ma_chuc_vu =? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_chuc_vu = rs.getInt("ma_chuc_vu");
                String ten_chuc_vu = rs.getString("ten_chuc_vu");

                kq = new Position(ma_chuc_vu, ten_chuc_vu);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }
    
}
