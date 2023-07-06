package database;

import dao.*;
import model.*;

public class DichVuTest {

    public static void main(String[] args) {
        Service s = new Service("Nuoc", 1, 10, 13000.0, 3, 0.0);
        ItemServiceDAO.getInstance().add(s);
    }
}
