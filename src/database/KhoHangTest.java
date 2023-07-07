package database;
import dao.*;
import model.*;
import java.sql.Date;
import java.text.ParseException;

public class KhoHangTest {
    public static void main(String[] args) throws ParseException {
       WareHouse w = new WareHouse("RedBUll", WareHouse.convertToDate("02/02/2023"), 5, 10000.0, 14000.0, WareHouse.convertToDate("09/09/2023"));

        WareHouseDAO.getInstance().update(w);
    }
}
