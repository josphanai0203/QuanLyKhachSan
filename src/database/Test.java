package database;

import dao.*;
import model.*;

public class Test {

    public static void main(String[] args) {
        Service s1 = new Service("Nuoc", 1, 10, 10000.0, 1, 15000.0);
        ItemServiceDAO.getInstance().add(s1);
    }
}
