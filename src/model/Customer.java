/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Customer {

    private int maKhachHang;
    private String tenKhachHang;
    private int namSinh;
    private String gioiTinh;
    private String diaChi;
    private String quocTich;
    private int soCMND;
    private String sdt;

    public Customer() {
    }

    public Customer(int maKhachHang, String tenKhachHang, int namSinh, String gioiTinh, String diaChi, String quocTich, int soCMND, String sdt) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.quocTich = quocTich;
        this.soCMND = soCMND;
        this.sdt = sdt;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "Customer{" + "maKhachHang=" + maKhachHang + ", tenKhachHang=" + tenKhachHang + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", quocTich=" + quocTich + ", soCMND=" + soCMND + ", sdt=" + sdt + '}';
    }

   
    
    

}
