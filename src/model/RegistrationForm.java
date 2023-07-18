package model;

import java.time.LocalDateTime;


public class RegistrationForm {
    private int maSoDangKi;
    private Customer maKhachhang;
    private Room maPhong;
    private int thoiGianThue;
    private double tongTien;
    private LocalDateTime ngayDangki;

    public RegistrationForm() {
    }

    public RegistrationForm(int maSoDangKi, Customer maKhachhang, Room maPhong, int thoiGianThue, double tongTien, LocalDateTime ngayDangki) {
        this.maSoDangKi = maSoDangKi;
        this.maKhachhang = maKhachhang;
        this.maPhong = maPhong;
        this.thoiGianThue = thoiGianThue;
        this.tongTien = tongTien;
        this.ngayDangki = ngayDangki;
    }

   

    public RegistrationForm(Room maPhong, int thoiGianThue) {
        this.maPhong = maPhong;
        this.thoiGianThue = thoiGianThue;
    }

    public RegistrationForm(int maSoDangKi, Customer maKhachhang, Room maPhong, int thoiGianThue) {
        this.maSoDangKi = maSoDangKi;
        this.maKhachhang = maKhachhang;
        this.maPhong = maPhong;
        this.thoiGianThue = thoiGianThue;
    }
    
   

    public int getMaSoDangKi() {
        return maSoDangKi;
    }

    public void setMaSoDangKi(int maSoDangKi) {
        this.maSoDangKi = maSoDangKi;
    }

    public Customer getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(Customer maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public Room getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(Room maPhong) {
        this.maPhong = maPhong;
    }

    public int getThoiGianThue() {
        return thoiGianThue;
    }

    public void setThoiGianThue(int thoiGianThue) {
        this.thoiGianThue = thoiGianThue;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

   

    

 
}