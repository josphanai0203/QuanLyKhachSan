/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Trinh
 */
public class Payroll {

    private int maLuong;
    private int thang;
    private int soNgayLamViec;
    private double heSoLuong;
    private float tangCa;
    private int luongTangCa;
    private double tienPhat;
    private double tongLuong;

    public Payroll() {
    }

    public Payroll(int maLuong, int thang, int soNgayLamViec, double heSoLuong, float tangCa, int luongTangCa, double tienPhat, double tongLuong) {
        this.maLuong = maLuong;
        this.thang = thang;
        this.soNgayLamViec = soNgayLamViec;
        this.heSoLuong = heSoLuong;
        this.tangCa = tangCa;
        this.luongTangCa = luongTangCa;
        this.tienPhat = tienPhat;
        this.tongLuong = tongLuong;
    }

    public int getLuongTangCa() {
        return luongTangCa;
    }

    public void setLuongTangCa(int luongTangCa) {
        this.luongTangCa = luongTangCa;
    }

    public int getMaLuong() {
        return maLuong;
    }

    public void setMaLuong(int maLuong) {
        this.maLuong = maLuong;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public float getTangCa() {
        return tangCa;
    }

    public void setTangCa(float tangCa) {
        this.tangCa = tangCa;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(double tongLuong) {
        this.tongLuong = tongLuong;
    }

}
