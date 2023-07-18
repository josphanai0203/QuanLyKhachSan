package controller;

import dao.ItemServiceDAO;
import model.Service;
import service.IService;

import java.util.ArrayList;
import model.Customer;

public class ItemServiceService implements IService<Service> {
    private static ItemServiceDAO id = new ItemServiceDAO();

    @Override
    public boolean add(Service s) {
        return id.add(s);
    }

    @Override
    public ArrayList<Service> selectAll() {
        return id.selectAll();
    }

    @Override
    public boolean update(Service s) {
        return id.update(s);
    }

    @Override
    public boolean delete(Service s) {
        return id.delete(s);
    }

    @Override
    public Service findById(Service s) {
        return null;
    }
     public double totalPrice(int makhachHang){
        return  id.totalPrice(makhachHang);
    }
     public boolean addNewService(int c,int soLuong, String serName){
        Customer cus = new Customer(c);
        Service ser = new Service(cus, serName, soLuong, 0);
        
        
        return add(ser);
    }
     public ArrayList<Service> findByIdCus(int idCus){
         return id.findByIdCus(idCus);
     }
}
