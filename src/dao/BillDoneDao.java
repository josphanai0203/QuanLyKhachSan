
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import util.JDBCUtil;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BillDoneDao {
    public boolean addBillDone(String nameCus,int idStaff){
        int update = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            String sql = "INSERT INTO hoa_don_hoan_thanh(ten_khach_hang,ngay_thanh_toan,ma_nhan_vien)"
                    + " VALUES (?, ?, ?)";
            con.setAutoCommit(false);
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nameCus);
            LocalDateTime lo = LocalDateTime.now();
            Timestamp t = Timestamp.valueOf(lo);
            st.setTimestamp(2, t);
            st.setInt(3, idStaff);
            update = st.executeUpdate();
            String delSql = " DELETE from khach_hang "
                    + "WHERE ten_khach_hang=?";
            PreparedStatement st1 = con.prepareStatement(delSql);
            st1.setString(1, nameCus);
            st1.execute();
            con.commit();
            JDBCUtil.closeConnection(con);
            return update > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(BillDoneDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
    }
}
