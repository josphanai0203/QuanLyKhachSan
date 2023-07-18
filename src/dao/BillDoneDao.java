package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import util.JDBCUtil;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Constants;

/**
 *
 * @author Admin
 */
public class BillDoneDao {

    public boolean addBillDone(String nameCus, int idStaff) {
        int update = 0;
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
            PreparedStatement st = con.prepareStatement(Constants.ADD_NEW_BILL_DONE);
            con.setAutoCommit(false);
            st.setString(1, nameCus);
            LocalDateTime lo = LocalDateTime.now();
            Timestamp t = Timestamp.valueOf(lo);
            st.setTimestamp(2, t);
            st.setInt(3, idStaff);
            update = st.executeUpdate();
            PreparedStatement st1 = con.prepareStatement(Constants.DELETE_CUSTOMER_BY_NAME);
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
