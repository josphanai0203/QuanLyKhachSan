/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**

 * @author Admin
 */
public class Service {

    protected int idItem;
    protected String nameItem;

    protected int quantity;

    private double price;
    public int iDWareHouse;
    public double priceOut;

    public Service() {
        super();
    }

    public Service(int idItem, String nameItem, int quantity, double price, int iDWareHouse, double priceOut) {
        this.idItem = idItem;
        this.nameItem = nameItem;
        this.quantity = quantity;
        this.price = price;
        this.iDWareHouse = iDWareHouse;
        this.priceOut = priceOut;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
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

    public int getiDWareHouse() {
        return iDWareHouse;
    }

    public void setiDWareHouse(int iDWareHouse) {
        this.iDWareHouse = iDWareHouse;
    }

    public double getPriceOut() {
        return priceOut;
    }

    public void setPriceOut(double priceOut) {
        this.priceOut = priceOut;
    }

    @Override
    public String toString() {
        return "Service{" +
                "idItem=" + idItem +
                ", nameItem='" + nameItem + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", iDWareHouse=" + iDWareHouse +
                ", priceOut=" + priceOut +
                '}';
    }
}

