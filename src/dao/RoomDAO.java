package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Room;
import service.IService;

public class RoomDAO implements IService<Room> {

    public static RoomDAO getInstance() {
        return new RoomDAO();
    }

    public boolean add(Room r) {
        int update = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO phong ( ten_phong, so_nguoi_toi_da, dien_tich, ma_loai_phong, ma_kieu_thue,isUsed) VALUES (?,?,?,?,?,?)";
            String findRoomTypeSql = "Select * from loai_phong lk where lk.Loai_phong=?";
            String findRentTypeSql = "Select * from kieu_thue kt where kt.ten_kieu_thue=?";
            PreparedStatement st = con.prepareStatement(findRoomTypeSql);
            st.setString(1, r.getRoomType());
            ResultSet rs = st.executeQuery();
            int maLoaiPhong = 0;
            if (rs.next()) {
                maLoaiPhong = rs.getInt("ma_loai_phong");
            }
            System.out.println(maLoaiPhong);
            PreparedStatement st1 = con.prepareStatement(findRentTypeSql);
            st1.setString(1, r.getRentType());
            ResultSet rs1 = st1.executeQuery();
            int maKieuThue = 0;
            if (rs1.next()) {
                maKieuThue = rs1.getInt("ma_kieu_thue");
            }
            System.out.println(maKieuThue);
            PreparedStatement st2 = con.prepareStatement(sql);
            st2.setString(1, r.getName());
            st2.setInt(2, r.getMax_people());
            st2.setDouble(3, r.getArea());
            st2.setInt(4, maLoaiPhong);
            st2.setInt(5, maKieuThue);
            st2.setBoolean(6, r.isIsUsed());
            update = st2.executeUpdate();
            JDBCUtil.closeConnection(con);
            return update > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Room> selectAll() {
        ArrayList<Room> kq = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM phong p left JOIN kieu_thue kt ON kt.ma_kieu_thue = p.ma_kieu_thue left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                int so_nguoi_toi_da = rs.getInt("so_nguoi_toi_da");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                String kieu_thue = rs.getString("ten_kieu_thue");
                boolean isUsed = rs.getBoolean("isUsed");
                kq.add(new Room(ma_phong, ten_phong, dien_tich, so_nguoi_toi_da, loai_phong, kieu_thue, isUsed));
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }

    public ArrayList<Room> getAvailableRooms() {
        ArrayList<Room> kq = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM phong p left JOIN kieu_thue kt ON kt.ma_kieu_thue = p.ma_kieu_thue left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong where p.isUsed=0 ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                int so_nguoi_toi_da = rs.getInt("so_nguoi_toi_da");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                String kieu_thue = rs.getString("ten_kieu_thue");
                boolean isUsed = rs.getBoolean("isUsed");
                kq.add(new Room(ma_phong, ten_phong, dien_tich, so_nguoi_toi_da, loai_phong, kieu_thue, isUsed));
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }

    public ArrayList<Room> getBookedRooms() {
        ArrayList<Room> kq = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM phong p left JOIN kieu_thue kt ON kt.ma_kieu_thue = p.ma_kieu_thue left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong where p.isUsed=1 ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                int so_nguoi_toi_da = rs.getInt("so_nguoi_toi_da");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                String kieu_thue = rs.getString("ten_kieu_thue");
                boolean isUsed = rs.getBoolean("isUsed");
                kq.add(new Room(ma_phong, ten_phong, dien_tich, so_nguoi_toi_da, loai_phong, kieu_thue, isUsed));
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }

    public boolean update(Room r) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String findRoomTypeSql = "Select * from loai_phong lk where lk.Loai_phong=?";
            String findRentTypeSql = "Select * from kieu_thue kt where kt.ten_kieu_thue=?";
            String sql = "UPDATE phong "
                    + "SET ten_phong=? ,so_nguoi_toi_da=? ,dien_tich=? ,ma_loai_phong=? ,ma_kieu_thue=? , isUsed=? WHERE ma_phong = ?";
            PreparedStatement st1 = con.prepareStatement(findRoomTypeSql);
            st1.setString(1, r.getRoomType());
            ResultSet rs1 = st1.executeQuery();
            int maLoaiPhong = 0;
            if (rs1.next()) {
                maLoaiPhong = rs1.getInt("ma_loai_phong");
            }
            System.out.println(maLoaiPhong);
            PreparedStatement st2 = con.prepareStatement(findRentTypeSql);
            st2.setString(1, r.getRentType());
            ResultSet rs2 = st2.executeQuery();
            int maKieuThue = 0;
            if (rs2.next()) {
                maKieuThue = rs2.getInt("ma_kieu_thue");
            }

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(7, r.getId_room());
            st.setString(1, r.getName());
            st.setInt(2, r.getMax_people());
            st.setDouble(3, r.getArea());
            st.setInt(4, maLoaiPhong);
            st.setInt(5, maKieuThue);
            st.setBoolean(6, r.isIsUsed());

            kq = st.executeUpdate();

            JDBCUtil.closeConnection(con);
            return kq > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(Room r) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "DELETE from phong "
                    + "WHERE ma_phong=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, r.getId_room());

            kq = st.executeUpdate();

            JDBCUtil.closeConnection(con);
            return kq > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Room findById(Room t) {
        Room kq = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM phong p left JOIN kieu_thue kt ON kt.ma_kieu_thue = p.ma_kieu_thue left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong WHERE p.ma_phong =? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getId_room());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                int so_nguoi_toi_da = rs.getInt("so_nguoi_toi_da");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                String kieu_thue = rs.getString("ten_kieu_thue");
                boolean isUsed = rs.getBoolean("isUsed");
                kq = new Room(ma_phong, ten_phong, dien_tich, so_nguoi_toi_da, loai_phong, kieu_thue, isUsed);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;

    }
    public Room findByName(String Name) {
        Room kq = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM phong p left JOIN kieu_thue kt ON kt.ma_kieu_thue = p.ma_kieu_thue left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong WHERE p.ten_phong =? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, Name);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                int so_nguoi_toi_da = rs.getInt("so_nguoi_toi_da");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                String kieu_thue = rs.getString("ten_kieu_thue");
                boolean isUsed = rs.getBoolean("isUsed");
                kq = new Room(ma_phong, ten_phong, dien_tich, so_nguoi_toi_da, loai_phong, kieu_thue, isUsed);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;

    }
}
