package database;
import dao.*;
import model.*;
import java.sql.Date;
import java.text.ParseException;

public class KhoHangTest {
    public static void main(String[] args) throws ParseException {
       WareHouse w2 = new WareHouse("Sprice", WareHouse.convertToDate("01/01/2023"), 10, 10000.0, 13000.0, WareHouse.convertToDate("06/06/2023"));

        WareHouseDAO.getInstance().add(w2);
    }
}
