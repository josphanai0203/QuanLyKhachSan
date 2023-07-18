/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import model.Bill;
import model.Customer;
import model.RegistrationForm;
import model.Room;
import util.JDBCUtil;

/**
 *
 * @author Admin
 */
public class BillDAO {
    private RoomDAO rd = new RoomDAO();
    public ArrayList<Bill> selectAll(){
       ArrayList<Bill> s = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * , IFNULL(SUM(dv.thanh_tien),0) AS total FROM khach_hang kh INNER JOIN dang_ki dk ON dk.ma_khach_hang = kh.ma_khach_hang inner join phong p on p.ma_phong = kh.ma_phong left JOIN dich_vu dv ON dv.ma_khach_hang = kh.ma_khach_hang GROUP BY kh.ma_khach_hang ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            int i =1;
            while (rs.next()) {
                 int ma_khach_hang = rs.getInt("ma_khach_hang");
                String ten_khach_hang = rs.getString("ten_khach_hang");
                int nam_sinh = rs.getInt("nam_sinh");
                String gioi_tinh = rs.getString("gioi_tinh");
                String dia_chi = rs.getString("dia_chi");
                String quoc_tich = rs.getString("quoc_tich");
                int so_cmnd = rs.getInt("so_cmnd");
                String so_dien_thoai = rs.getString("so_dien_thoai");
                int ma_phong = rs.getInt("ma_phong");
                String kieuThue = rs.getString("kieu_thue");
                Room ro = rd.findById(new Room(ma_phong));
                Customer c = new Customer(ma_khach_hang, ten_khach_hang, nam_sinh, gioi_tinh, dia_chi, quoc_tich, so_cmnd, so_dien_thoai,ro, kieuThue);
                int id1 = rs.getInt("ma_dang_ki");
                int time = rs.getInt("thoi_gian_thue");
                double total = rs.getDouble("tong_tien_phong");
                Timestamp t = rs.getTimestamp("ngay_dang_ki");
                LocalDateTime l = t.toLocalDateTime();
                RegistrationForm r = new RegistrationForm(id1, null, null, time, total, l);
                double price = rs.getDouble("total");
                s.add(new Bill(i, c, r, price));
                i++;
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return s; 
    }
}
