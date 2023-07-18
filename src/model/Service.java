package model;

public class Service {

    private int idItem;
    private Customer customer;
    private String nameItem;
    private int quantity;
    private double price;
    private WareHouse wareHouse;
    private double totalPay;

    public Service(int idItem, Customer customer, String nameItem, int quantity, double price, WareHouse wareHouse, double totalPay) {
        this.idItem = idItem;
        this.customer = customer;
        this.nameItem = nameItem;
        this.quantity = quantity;
        this.price = price;
        this.wareHouse = wareHouse;
        this.totalPay = totalPay;
    }

    public Service(Customer customer, String nameItem, int quantity, double price) {
        this.customer = customer;
        this.nameItem = nameItem;
        this.quantity = quantity;
        this.price = price;
        this.wareHouse = wareHouse;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public WareHouse getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    } 
}
