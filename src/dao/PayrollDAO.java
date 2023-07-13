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
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE bang_luong "
                    + "SET "
                    + "thang=?, " + "so_ngay_lam=?, " + "he_so_luong=?, " + "tang_ca=?, " + "luong_tang_ca=?, " + "tien_phat=?, " + "tong_luong=?"
                    + " WHERE ma_luong=?";
            PreparedStatement st = con.prepareStatement(sql);
            //st.setInt(1, t.getMaTaiKhoan());
            st.setInt(1, t.getThang());
            st.setInt(2, t.getSoNgayLamViec());
            st.setDouble(3, t.getHeSoLuong());
            st.setFloat(4, t.getTangCa());
            st.setInt(5, t.getLuongTangCa());
            st.setDouble(6, t.getTienPhat());
            st.setDouble(7, t.getTongLuong());
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
    public boolean delete(Payroll t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Payroll findByIdUpdate(int maLuong) {
        Payroll kq = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM bang_luong bl WHERE bl.ma_luong =? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, maLuong);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_luong = rs.getInt("ma_luong");
                int thang = rs.getInt("thang");
                int so_ngay_lam_viec = rs.getInt("so_ngay_lam_viec");
                double he_so_luong = rs.getDouble("he_so_luong");
                float tang_ca = rs.getFloat("tang_ca");
                int luong_tang_ca = rs.getInt("luong_tang_ca");
                double tien_phat = rs.getDouble("tien_phat");
                double tong_luong = rs.getDouble("tong_luong");

                kq = new Payroll(maLuong, thang, so_ngay_lam_viec, he_so_luong, tang_ca, luong_tang_ca, tien_phat, tong_luong);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }

    @Override
    public Payroll findById(Payroll t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}