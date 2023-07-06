package database;

import model.Service;
import dao.*;
public class Test {
    public static void main(String[] args) {
        Service s1 = new Service(1,"COCA COLA",10, 10000, 1, 12000);
            ItemServiceDAO.getInstance().add(s1);
    }

}
