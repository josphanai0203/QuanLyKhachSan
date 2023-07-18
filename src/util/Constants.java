/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Admin
 */
public class Constants {
    public static final String ADD_NEW_BILL_DONE = "INSERT INTO hoa_don_hoan_thanh(ten_khach_hang,ngay_thanh_toan,ma_nhan_vien) VALUES (?, ?, ?)";
    public static final String DELETE_CUSTOMER_BY_NAME = "DELETE from khach_hang WHERE ten_khach_hang=?";
}
