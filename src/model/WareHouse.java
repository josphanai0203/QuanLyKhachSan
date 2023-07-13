package model;

import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;

public class WareHouse {
public int maW;
    public String nameW;
    public int quantity;
    public Date dayIn;
    public Date hSD;
    public double priceIn;
    public double priceOut;
    
    public WareHouse(){
    }

    public WareHouse(int maW) {
        this.maW = maW;
    }

    public WareHouse(String nameW, Date dayIn, int quantity, double priceIn, double priceOut, Date hSD) {

        this.nameW = nameW;
        this.quantity = quantity;
        this.dayIn = dayIn;
        this.hSD = hSD;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
    }

    public WareHouse(int maW ,String nameW, Date dayIn, int quantity, double priceIn, double priceOut, Date hSD) {

        this.nameW = nameW;
        this.quantity = quantity;
        this.dayIn = dayIn;
        this.hSD = hSD;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.maW = maW;
    }

    public static java.sql.Date convertToDate(String dateString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date parsedDate = format.parse(dateString);
        return new java.sql.Date(parsedDate.getTime());
    }

    public int getMaW() {
        return maW;
    }

    public void setMaW(int maW) {
        this.maW = maW;
    }


    public String getnameW() {
        return nameW;
    }

    public void setnameW(String nameW) {
        this.nameW = nameW;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDayIn() {

        return dayIn;
    }

    public void setDayIn(Date dayin) {

        this.dayIn = dayIn;
    }

    public Date gethSD() {

        return hSD;
    }

    public void sethSD(Date hSD) {

        this.hSD = hSD;
    }

    public double getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(double priceIn) {
        this.priceIn = priceIn;
    }

    public double getPriceOut() {
        return priceOut;
    }

    public void setPriceOut(double priceOut) {
        this.priceOut = priceOut;
    }

    @Override
    public String toString() {
        return "WareHouse{" +
                "maW=" + maW +
                ", nameW='" + nameW +
                ", quantity=" + quantity +
                ", dayIn=" + dayIn +
                ", hSD=" + hSD +
                ", priceIn=" + priceIn +
                ", priceOut=" + priceOut +
                '}';
    }
}
