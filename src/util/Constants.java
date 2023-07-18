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

//RegisterForm
    public static final String ADD_NEW_FORM = "INSERT INTO dang_ki (ma_phong,thoi_gian_thue,ngay_dang_ki) VALUES ( ?, ?,?)";
    public static final String FIND_FORM_BY_ID = "SELECT * FROM dang_ki dk WHERE dk.ma_khach_hang = ?";
    public static final String UPDATE_FORM_BY_ID = "UPDATE dang_ki SET thoi_gian_thue = ?  WHERE ma_dang_ki= ? ";
//User
    public static final String ADD_NEW_USER = "INSERT INTO tai_khoan (ten_tai_khoan, mat_khau, admin) VALUES ( ?, ?, ?)";
    public static final String SELECT_ALL_USER = "SELECT * FROM tai_khoan tk inner join nhan_vien nv on nv.ma_nhan_vien = tk.ma_nhan_vien inner join chuc_vu cv on cv.ma_chuc_vu = nv.ma_chuc_vu";
    public static final String UPDATE_USER_BY_ID = "UPDATE tai_khoan "
            + "SET "
            + "ten_tai_khoan=?, " + "mat_khau=?, " + "admin=?"
            + " WHERE ma_tai_khoan=?";
    public static final String DELETE_USER_BY_ID = "DELETE from tai_khoan WHERE ma_tai_khoan=?";
    public static final String FIND_USER_BY_ID = "SELECT * FROM tai_khoan tk WHERE tk.ma_tai_khoan =? ";
    public static final String FIND_USER_BY_NAME = "SELECT * FROM tai_khoan tk WHERE tk.ten_tai_khoan =? ";
    public static final String CHECK_LOGIN = "SELECT * FROM tai_khoan tk WHERE tk.ten_tai_khoan = ? and mat_khau = ?";

//Staff 
    public static final String ADD_NEW_STAFF = "INSERT INTO nhan_vien (ten_nhan_vien, ngay_sinh, gioi_tinh, ma_chuc_vu, so_dien_thoai, dia_chi) VALUES ( ?, ?, ?, ?, ?, ?)";
    public static final String SELECT_ALL_STAFF = "SELECT * FROM nhan_vien nv inner join chuc_vu cv on cv.ma_chuc_vu = nv.ma_chuc_vu";
    public static final String UPDATE_STAFF_BY_ID = "UPDATE nhan_vien "
            + "SET "
            + "ten_nhan_vien=?, " + "ngay_sinh=?, " + "gioi_tinh=?, " + "ma_chuc_vu=?, " + "so_dien_thoai=?, " + "dia_chi=?"
            + " WHERE ma_nhan_vien=?";
    public static final String DELETE_STAFF_BY_ID = "DELETE from nhan_vien WHERE ma_nhan_vien=?";
    public static final String FIND_MA_CHUC_VU = "SELECT * FROM chuc_vu WHERE ten_chuc_vu = ?";
    public static final String FIND_STAFF_BY_ID = "SELECT * FROM nhan_vien nv inner join chuc_vu cv on cv.ma_chuc_vu = nv.ma_chuc_vu  WHERE nv.ma_nhan_vien = ?";

//Payroll
    public static final String UPDATE_PAY_BY_ID = "UPDATE bang_luong "
            + "SET "
            + "thang=?, " + "so_ngay_lam=?, " + "he_so_luong=?, " + "tang_ca=?, " + "luong_tang_ca=?, " + "tien_phat=?, " + "tong_luong=?"
            + " WHERE ma_luong=?";
    public static final String FIND_BY_ID_UPDATE = "SELECT * FROM bang_luong bl WHERE bl.ma_luong =? ";

//Customers
    public static final String ADD_NEW_CUSTOMER = "INSERT INTO khach_hang (ten_khach_hang, nam_sinh, gioi_tinh, dia_chi, quoc_tich, so_cmnd, so_dien_thoai,ma_phong,kieu_thue) VALUES ( ?, ?, ?, ?, ?, ?, ?,?,?)";
    public static final String SELECT_ALL_CUSTOMER = "SELECT * FROM khach_hang kh INNER JOIN phong p ON p.ma_phong = kh.ma_phong left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong";
    public static final String UPDATE_CUSTOMER = "UPDATE khach_hang "
            + "SET "
            + "ten_khach_hang=?, " + "nam_sinh=?, " + "gioi_tinh=?, " + "dia_chi=?, " + "quoc_tich=?, " + "so_cmnd=?, " + "so_dien_thoai=?," + "ma_phong =? , kieu_thue=?"
            + " WHERE ma_khach_hang=?";
    public static final String DELETE_CUSTOMER_CUSTOMER = "DELETE from khach_hang WHERE ma_khach_hang=?";
    public static final String FIND_CUSTOMER_BY_ID = "SELECT * FROM khach_hang kh INNER JOIN phong p ON p.ma_phong = kh.ma_phong left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong WHERE kh.ma_khach_hang =? ";
    public static final String FIND_CUSTOMER_BY_ID_2 = "SELECT * FROM khach_hang kh INNER JOIN phong p ON p.ma_phong = kh.ma_phong left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong WHERE kh.ma_khach_hang =? ";
//Room
    public static final String ADD_ROOM = "INSERT INTO phong ( ten_phong, dien_tich, ma_loai_phong,isUsed) VALUES (?,?,?,?)";
    public static final String SELECT_ALL_ROOM = "SELECT * FROM phong p left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong";
    public static final String GET_AVAILABLE_ROOM = "SELECT * FROM phong p left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong where p.isUsed=0 ";
    public static final String GET_BOOKED_ROOM = "SELECT * FROM phong p left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong where p.isUsed=1";
    public static final String FIND_ROOM_TYPE = "Select * from loai_phong lk where lk.Loai_phong=?";
    public static final String UPDATE_ROOM_BY_ID = "UPDATE phong "
            + "SET ten_phong=?  ,dien_tich=? ,ma_loai_phong=?,isUsed =? WHERE ma_phong = ?";
    public static final String DELETE_ROOM_BY_ID = "DELETE from phong WHERE ma_phong=?";
    public static final String FIND_ROOM_BY_ID = "SELECT * FROM phong p left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong WHERE p.ma_phong =? ";
    public static final String FIND_ROOM_BY_NAME = "SELECT * FROM phong p left JOIN loai_phong lp ON lp.ma_loai_phong = p.ma_loai_phong WHERE p.ten_phong =? ";
    public static final String CHANE_ROOM = "UPDATE phong SET isUsed=? WHERE ma_phong = ?";

//WareHouse
    public static final String ADD_NEW_WAREHOUSEITEM = "INSERT INTO kho_hang (ten_san_pham, ngay_nhap,so_luong, gia_nhap, gia_ban, han_su_dung)VALUES (?, ?, ?, ?, ?, ?)";
    public static final String SELECT_ALL_WAREHOUSE = "SELECT * FROM kho_hang";
    public static final String UPDATE_WAREHOUSEITEM = "UPDATE kho_hang "
            + "SET "
            + "ten_san_pham=?," + "ngay_nhap=?," + "so_luong=?," + "gia_nhap=?," + "gia_ban=?," + "han_su_dung=?"
            + " WHERE ma_kho_hang= ?";
    public static final String DELETE_WAREHOUSE_BY_NAME = "DELETE from kho_hang WHERE ma_kho_hang=?";
    public static final String FIND_ID_WAREHOUSE = "SELECT * FROM kho_hang kh WHERE kh.ma_kho_hang =? ";

//ItemService
    public static final String ADD_SERVICE = "INSERT INTO dich_vu ( ma_khach_hang,ten_dich_vu, so_luong) VALUES (?, ?, ?)";
    public static final String FIND_BY_ID_CUS_IN_SV = "SELECT * FROM dich_vu dv inner join kho_hang kh on kh.ma_kho_hang = dv.ma_kho_hang inner join khach_hang kh1 on kh1.ma_khach_hang = dv.ma_khach_hang where dv.ma_khach_hang = ?";
    public static final String SELECT_ALL_SERVICE = "SELECT * FROM dich_vu dv inner join kho_hang kh on kh.ma_kho_hang = dv.ma_kho_hang inner join khach_hang kh1 on kh1.ma_khach_hang = dv.ma_khach_hang";
    public static final String UPDATE_SERVICE_BY_ID = "UPDATE dich_vu "
            + "SET "
            + "ma_khach_hang=?," + "ten_dich_vu=?," + "so_luong=?," + "don_gia=?," + "ma_kho_hang=?,"
            + "WHERE ma_dich_vu=?";
    public static final String DELETE_SERVICE_BY_ID = "DELETE from dich_vu WHERE ma_dich_vu=?";
    public static final String TOTAL_PRICE_IN_SV = "SELECT Sum(thanh_tien) as total from dich_vu dv where dv.ma_khach_hang = ?";
//Bill
    public static final String SELECT_ALL_INFO = "SELECT * , IFNULL(SUM(dv.thanh_tien),0) AS total FROM khach_hang kh INNER JOIN dang_ki dk ON dk.ma_khach_hang = kh.ma_khach_hang inner join phong p on p.ma_phong = kh.ma_phong left JOIN dich_vu dv ON dv.ma_khach_hang = kh.ma_khach_hang GROUP BY kh.ma_khach_hang ";
//Bill Done 
    public static final String ADD_NEW_BILL_DONE = "INSERT INTO hoa_don_hoan_thanh(ten_khach_hang,ngay_thanh_toan,ma_nhan_vien) VALUES (?, ?, ?)";
    public static final String DELETE_CUSTOMER_BY_NAME = "DELETE from khach_hang WHERE ten_khach_hang=?";
}
