package dao;

import database.JDBCUtil;
import model.*;
import service.*;

import java.sql.*;
import java.util.ArrayList;

public class ItemServiceDAO implements IItemService {

    public static ItemServiceDAO getInstance(){
        return new ItemServiceDAO();
    }
    private ArrayList<Service> serviceList;

    public ItemServiceDAO() {
        serviceList = new ArrayList<>();
    }

    @Override
    public boolean add(Service s) {
        int update = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO dich_vu (ma_dich_vu, ma_khach_hang, ten_dich_vu, so_luong, don_gia, ma_kho_hang, thanh_tien) "
                    + " VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, s.getIdItem());
            st.setInt(2, s.getIdItem());
            st.setString(3, s.getNameItem());
            st.setInt(4, s.getQuantity());
            st.setDouble(5, s.getPrice());
            st.setInt(6, s.getiDWareHouse());
            st.setDouble(7, s.getPriceOut());


            update = st.executeUpdate();

            System.out.println("Ban da thuc thi: " + sql);
            System.out.println("Co " + update + " dong bi thay doi");

            JDBCUtil.closeConnection(con);
            return update > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<Service> selectAll() {
        return serviceList;
    }

    @Override
    public boolean update(Service s) {
        int index = serviceList.indexOf(s);
        if (index != -1) {
            serviceList.set(index, s);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Service s) {
        return serviceList.remove(s);
    }

}
