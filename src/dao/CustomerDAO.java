/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.CustomerService;
import java.util.ArrayList;
import model.Customer;
import service.ICustomerService;
import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Room;

/**
 *
 * @author Trinh
 */
public class CustomerDAO implements ICustomerService {

    private CustomerService cs = new CustomerService();
    private RoomDAO rd = new RoomDAO();
    
    public static CustomerDAO getInstance() {
        return new CustomerDAO();
    }

    @Override
    public boolean add(Customer t) {
        int update = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO khach_hang (ten_khach_hang, nam_sinh, gioi_tinh, dia_chi, quoc_tich, so_cmnd, so_dien_thoai) "
                    + " VALUES ( ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement st = con.prepareStatement(sql);
            //st.setInt(1, t.getMaNhanVien());
            st.setString(1, t.getTenKhachHang());
            st.setInt(2, t.getNamSinh());
            st.setString(3, t.getGioiTinh());
            st.setString(4, t.getDiaChi());
            st.setString(5, t.getQuocTich());
            st.setInt(6, t.getSoCMND());
            st.setString(7, t.getSdt());
            //st.setInt(8, t.getMaPhong());

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
    public ArrayList<Customer> selectAll() {
        ArrayList<Customer> kq = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM khach_hang";
            PreparedStatement st = con.prepareStatement(sql);
            //b3: thuc thi cau lenh sql  
            //System.out.println("Ban da thuc thi: " + sql);

            ResultSet rs = st.executeQuery();

            //b4: xu li 
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
                Room r = rd.findById(new Room(ma_phong));
                Customer c1 = new Customer(ma_khach_hang, ten_khach_hang, nam_sinh, gioi_tinh, dia_chi, quoc_tich, so_cmnd, so_dien_thoai, r);
                        kq.add(c1);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return kq;

    }

    @Override
    public boolean update(Customer t) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE khach_hang "
                    + "SET "
                    + "ten_khach_hang=?, " + "nam_sinh=?, " + "gioi_tinh=?, " + "dia_chi=?, " + "quoc_tich=?, " + "so_cmnd=?, " + "so_dien_thoai=?"
                    + " WHERE ma_khach_hang=?";
            PreparedStatement st = con.prepareStatement(sql);
            //st.setInt(1, t.getMaNhanVien());
            st.setString(1, t.getTenKhachHang());
            st.setInt(2, t.getNamSinh());
            st.setString(3, t.getGioiTinh());
            st.setString(4, t.getDiaChi());
            st.setString(5, t.getQuocTich());
            st.setInt(6, t.getSoCMND());
            st.setString(7, t.getSdt());
            st.setInt(8, t.getMaKhachHang());
            //st.setInt(9, t.getMaPhong());
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
    public boolean delete(Customer t) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "DELETE from khach_hang "
                    + "WHERE ma_khach_hang=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getMaKhachHang());

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
    public Customer findById(Customer t) {
        return cs.findById(t);
    }

}
