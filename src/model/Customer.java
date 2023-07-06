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
    private int soCMN;
    private String sdt;

    public Customer() {
    }

    public Customer(int maKhachHang, String tenKhachHang, int namSinh, String gioiTinh, String diaChi, String quocTich, int soCMN, String sdt) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.quocTich = quocTich;
        this.soCMN = soCMN;
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

    public int getSoCMN() {
        return soCMN;
    }

    public void setSoCMN(int soCMN) {
        this.soCMN = soCMN;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "Customer{" + "maKhachHang=" + maKhachHang + ", tenKhachHang=" + tenKhachHang + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", quocTich=" + quocTich + ", soCMN=" + soCMN + ", sdt=" + sdt + '}';
    }
    
    

}
