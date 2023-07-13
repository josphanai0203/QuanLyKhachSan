package dao;

import controller.ItemServiceService;
import controller.RoomService;
import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Room;
import service.IService;

public class RoomDAO implements IService<Room> {

    private static RoomService rd = new RoomService();

    public static RoomDAO getInstance() {
        return new RoomDAO();
    }

    public boolean add(Room r) {
        int update = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO phong ( ten_phong, dien_tich, ma_loai_phong,isUsed) VALUES (?,?,?,?)";
            PreparedStatement st2 = con.prepareStatement(sql);
            st2.setString(1, r.getName());
            st2.setDouble(2, r.getArea());
            st2.setInt(3, r.getId_room());
            st2.setBoolean(4, r.isIsUsed());
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
            String sql = "SELECT * FROM phong p left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                boolean isUsed = rs.getBoolean("isUsed");
                kq.add(new Room(ma_phong, ten_phong, dien_tich, loai_phong, isUsed));
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
            String sql = "SELECT * FROM phong p left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong where p.isUsed=0 ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                boolean isUsed = rs.getBoolean("isUsed");
                kq.add(new Room(ma_phong, ten_phong, dien_tich, loai_phong, isUsed));
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
            String sql = "SELECT * FROM phong p left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong where p.isUsed=1 ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                boolean isUsed = rs.getBoolean("isUsed");
                kq.add(new Room(ma_phong, ten_phong, dien_tich, loai_phong, isUsed));
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
            String sql = "UPDATE phong "
                    + "SET ten_phong=?  ,dien_tich=? ,ma_loai_phong=? , isUsed=? WHERE ma_phong = ?";
            PreparedStatement st1 = con.prepareStatement(findRoomTypeSql);
            st1.setString(1, r.getRoomType());
            ResultSet rs1 = st1.executeQuery();
            int maLoaiPhong = 0;
            if (rs1.next()) {
                maLoaiPhong = rs1.getInt("ma_loai_phong");
            }

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(5, r.getId_room());
            st.setString(1, r.getName());
            st.setDouble(2, r.getArea());
            st.setInt(3, maLoaiPhong);
            st.setBoolean(4, r.isIsUsed());

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
            String sql = "SELECT * FROM phong p left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong WHERE p.ma_phong =? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getId_room());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");

                boolean isUsed = rs.getBoolean("isUsed");
                kq = new Room(ma_phong, ten_phong, dien_tich, loai_phong, isUsed);
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
            String sql = "SELECT * FROM phong p left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong WHERE p.ten_phong =? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, Name);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                boolean isUsed = rs.getBoolean("isUsed");
                kq = new Room(ma_phong, ten_phong, dien_tich, loai_phong, isUsed);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;

    }

    public void chaneRoom(int idRoomOld, int idRoomNew) {
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE phong "
                    + "SET isUsed=? WHERE ma_phong = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setBoolean(1, false);
            st.setInt(2, idRoomOld);
            st.execute();
            st.setBoolean(1, true);
            st.setInt(2, idRoomNew);
            st.execute();

            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
