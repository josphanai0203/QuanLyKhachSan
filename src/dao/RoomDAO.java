package dao;

import controller.ItemServiceService;
import controller.RoomService;
import util.JDBCUtil;
import util.Constants;
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
        Connection con = null;
        try {

            con = JDBCUtil.getConnection();
            PreparedStatement st2 = con.prepareStatement(Constants.ADD_ROOM);
            con.setAutoCommit(false);

            st2.setString(1, r.getName());
            st2.setDouble(2, r.getArea());
            st2.setInt(3, r.getId_room());
            st2.setBoolean(4, r.isIsUsed());
            update = st2.executeUpdate();
            con.commit();
            JDBCUtil.closeConnection(con);
            return update > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Room> selectAll() {
        ArrayList<Room> kq = new ArrayList<>();
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.SELECT_ALL_ROOM);
            con.setAutoCommit(false);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                boolean isUsed = rs.getBoolean("isUsed");
                kq.add(new Room(ma_phong, ten_phong, dien_tich, loai_phong, isUsed));
                con.commit();
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }

    public ArrayList<Room> getAvailableRooms() {
        ArrayList<Room> kq = new ArrayList<>();
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.GET_AVAILABLE_ROOM);
            con.setAutoCommit(false);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                boolean isUsed = rs.getBoolean("isUsed");
                kq.add(new Room(ma_phong, ten_phong, dien_tich, loai_phong, isUsed));
                con.commit();
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }

    public ArrayList<Room> getBookedRooms() {
        ArrayList<Room> kq = new ArrayList<>();
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.GET_BOOKED_ROOM);
            con.setAutoCommit(false);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                boolean isUsed = rs.getBoolean("isUsed");
                kq.add(new Room(ma_phong, ten_phong, dien_tich, loai_phong, isUsed));
                con.commit();
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;
    }

    public boolean update(Room r) {
        int kq = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st1 = con.prepareStatement(Constants.FIND_ROOM_TYPE);
            con.setAutoCommit(false);
            st1.setString(1, r.getRoomType());
            ResultSet rs1 = st1.executeQuery();
            int maLoaiPhong = 0;
            if (rs1.next()) {
                maLoaiPhong = rs1.getInt("ma_loai_phong");
            }

            PreparedStatement st = con.prepareStatement(Constants.UPDATE_ROOM_BY_ID);
            con.setAutoCommit(false);
            st.setInt(5, r.getId_room());
            st.setString(1, r.getName());
            st.setDouble(2, r.getArea());
            st.setInt(3, maLoaiPhong);
            st.setBoolean(4, r.isIsUsed());

            kq = st.executeUpdate();
            con.commit();
            JDBCUtil.closeConnection(con);
            return kq > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(Room r) {
        int kq = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.DELETE_ROOM_BY_ID);
            con.setAutoCommit(false);
            st.setInt(1, r.getId_room());

            kq = st.executeUpdate();
            con.commit();
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
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.FIND_ROOM_BY_ID);
            con.setAutoCommit(false);
            st.setInt(1, t.getId_room());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");

                boolean isUsed = rs.getBoolean("isUsed");
                kq = new Room(ma_phong, ten_phong, dien_tich, loai_phong, isUsed);
                con.commit();
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;

    }

    public Room findByName(String Name) {
        Room kq = null;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.FIND_ROOM_BY_NAME);
            con.setAutoCommit(false);
            st.setString(1, Name);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                double dien_tich = rs.getDouble("dien_tich");
                String loai_phong = rs.getString("Loai_phong");
                boolean isUsed = rs.getBoolean("isUsed");
                kq = new Room(ma_phong, ten_phong, dien_tich, loai_phong, isUsed);
                con.commit();
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kq;

    }

    public void chaneRoom(int idRoomOld, int idRoomNew) {
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.CHANE_ROOM);
            con.setAutoCommit(false);
            st.setBoolean(1, false);
            st.setInt(2, idRoomOld);
            st.execute();
            st.setBoolean(1, true);
            st.setInt(2, idRoomNew);
            st.execute();
            con.commit();
            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
