/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Admin
 */
public class Bill {
    private int maHoaDon;
    private Customer maKhachHang;
    private RegistrationForm dangKi;
    private double servicePrice;
    

    public Bill() {
    }

    public Bill(int maHoaDon, Customer maKhachHang, RegistrationForm dangKi, double servicePrice) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.dangKi = dangKi;
        this.servicePrice = servicePrice;
    }

    public Bill(Customer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
    
    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Customer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Customer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public RegistrationForm getDangKi() {
        return dangKi;
    }

    public void setDangKi(RegistrationForm dangKi) {
        this.dangKi = dangKi;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }
    
    

    
    
    
   
}
