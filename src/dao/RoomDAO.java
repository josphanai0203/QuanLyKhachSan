package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Room;

public class RoomDAO {
    
    public static RoomDAO getInstance(){
        return new RoomDAO();
    }
    
    public boolean add(Room r) { 
        int update = 0;
        try{
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO phong (ma_phong, ten_phong, so_nguoi_toi_da, dien_tich, ma_loai_phong, ma_kieu_thue) VALUES (?,?,?,?,?,?)";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, r.getId_room());
            st.setString(2, r.getName());
            st.setInt(3, r.getMax_people());
            st.setDouble(4, r.getArea());
            st.setInt(5, r.getId_room_type());
            st.setInt(6, r.getId_rent_type());
            
            update = st.executeUpdate();
            
            System.out.println("Ban da thuc thi: " +sql);
            System.out.println("Co " + update + " dong bi thay doi ");
             
            JDBCUtil.closeConnection(con);
            return update > 0;
            
        }catch (SQLException e){
            e.printStackTrace();
            return false;  
        } 
    }
    
    public ArrayList<Room> selectAll() {
        ArrayList<Room> kq = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM phong";
            PreparedStatement st = con.prepareStatement(sql);
             
            System.out.println("Ban da thuc thi: " + sql);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                int so_nguoi_toi_da = rs.getInt("so_nguoi_toi_da");
                double dien_tich = rs.getDouble("dien_tich");
                int ma_loai_phong = rs.getInt("ma_loai_phong");
                int ma_kieu_thue = rs.getInt("ma_kieu_thue");
                
                Room s1 = new Room(ma_phong, ten_phong, so_nguoi_toi_da, dien_tich, ma_loai_phong, ma_kieu_thue);
                }
                JDBCUtil.closeConnection(con);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            return kq;
        }
    public ArrayList<Room> getAvailableRooms() {
        ArrayList<Room> availableRooms = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM phong WHERE ma_phong NOT IN (SELECT ma_phong FROM dat_phong)";
            PreparedStatement st = con.prepareStatement(sql);
            
            System.out.println("Ban da thuc thi: " + sql);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                int so_nguoi_toi_da = rs.getInt("so_nguoi_toi_da");
                double dien_tich = rs.getDouble("dien_tich");
                int ma_loai_phong = rs.getInt("ma_loai_phong");
                int ma_kieu_thue = rs.getInt("ma_kieu_thue");
                
                Room room = new Room(ma_phong, ten_phong, so_nguoi_toi_da, dien_tich, ma_loai_phong, ma_kieu_thue);
                availableRooms.add(room);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return availableRooms;
    }
    
    public ArrayList<Room> getBookedRooms() {
        ArrayList<Room> bookedRooms = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM phong WHERE ma_phong IN (SELECT ma_phong FROM dat_phong)";
            PreparedStatement st = con.prepareStatement(sql);
            
            System.out.println("Ban da thuc thi: " + sql);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int ma_phong = rs.getInt("ma_phong");
                String ten_phong = rs.getString("ten_phong");
                int so_nguoi_toi_da = rs.getInt("so_nguoi_toi_da");
                double dien_tich = rs.getDouble("dien_tich");
                int ma_loai_phong = rs.getInt("ma_loai_phong");
                int ma_kieu_thue = rs.getInt("ma_kieu_thue");
                
                Room room = new Room(ma_phong, ten_phong, so_nguoi_toi_da, dien_tich, ma_loai_phong, ma_kieu_thue);
                bookedRooms.add(room);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return bookedRooms;
    }
     
     public boolean update(Room r) {
         int kq = 0;
         try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE phong "
                    + "SET "
                    + "ten_phong=?" + "so_nguoi_toi_da=?" + "dien_tich=?" + "ma_loai_phong=?" + "ma_kieu-thue=?" 
                    + "WHERE ma_phong=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, r.getId_room());
            st.setString(2, r.getName());
            st.setInt(3, r.getMax_people());
            st.setDouble(4, r.getArea());
            st.setInt(5, r.getId_room_type());
            st.setInt(6, r.getId_rent_type());
            
            kq = st.executeUpdate();
            
            System.out.println("Ban da thuc thi: " + sql);
            System.out.println("Co " + kq + "dong bi thay doi");
            
            JDBCUtil.closeConnection(con);
            return kq > 0;
         } catch (SQLException e) {
             e.printStackTrace();
             return false;
         }
     }
    
     
     
    public boolean delete(Room r){
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "DELETE from phong "
                    + "WHERE ma_phong=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, r.getId_room());
            st.setString(2, r.getName());
            st.setInt(3, r.getMax_people());
            st.setDouble(4, r.getArea());
            st.setInt(5, r.getId_room_type());
            st.setInt(6, r.getId_rent_type());
            
            kq = st.executeUpdate();
            
            System.out.println("Ban da thuc thi: " + sql);
            System.out.println("Co " + kq + " dong bi thay doi");
            
            JDBCUtil.closeConnection(con);
            return kq>0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }    
}

    


