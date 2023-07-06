package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            st.setDouble(3, r.getArea());
            st.setInt(4, r.getMax_people());
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
}
