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
import model.User;
import service.IPayrollService;

/**
 *
 * @author Trinh
 */
public class PayrollDAO implements IPayrollService {

    @Override
    public boolean add(Payroll t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Payroll> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Payroll t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Payroll t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Payroll findById(Payroll t) {
        Payroll kq = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM bang_luong bl WHERE bl.ma_luong =? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getMaLuong());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_luong = rs.getInt("ma_luong");
                int thang = rs.getInt("thang");
                int so_ngay_lam_viec = rs.getInt("so_ngay_lam_viec");
                double he_so_luong = rs.getDouble("he_so_luong");
                float tang_ca = rs.getFloat("tang_ca");
                double tien_phat = rs.getDouble("tien_phat");
                double tong_luong = rs.getDouble("tong_luong");

                kq = new Payroll(ma_luong, thang, so_ngay_lam_viec, he_so_luong, tang_ca, tien_phat, tong_luong);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }

}
