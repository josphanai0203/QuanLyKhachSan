/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.StaffService;
import controller.UserService;
import java.util.ArrayList;
import model.Staff;
import model.User;
import java.sql.*;

/**
 *
 * @author Trinh
 */
public class TestUSerStaffDao {

    public static UserService us = new UserService();
    public static StaffService ss = new StaffService();

    public static void main(String[] args) {

//----------------------USER--------------------------------------------------
//       ----Test Add---
//        User s1 = new User( "fpt", "0123", false);
//        UserDAO.getInstance().add(s1);
//      ----Select all---
//        ArrayList<User> list = UserDAO.getInstance().selectAll();
//        for (User user : list) {
//            System.out.println(user.toString());
//        }
        // ---Delete---
//        User s1 = new User(10, "root", "abc", false);
//       UserDAO.getInstance().delete(s1);
// --update--
//        User s2 = new User(4, "xyz", "xyz", true);
//        UserDAO.getInstance().update(s2);
//checkTenTaiKhoan
//        User s1 = new User("Name3", "abc", false);
//        UserDAO.getInstance().add(s1);
// checkLogIn
//        String tenTaiKhoan = "fpt";
//        String matKhau = "0123";
//        if (us.checkLogIn(tenTaiKhoan, matKhau)) {
//            System.out.println("Log in thanh cong");
//        } else {
//            System.out.println("Log in that bai");
//        }
//-------------------------STAFF-------------------------------------------
// add
//    Staff s1 = new Staff( "Nguyen Vo Y", Date.valueOf("1999-11-12"), "Nu", 3, "0978123478", "DN", 1);
//    StaffDAO.getInstance().add(s1);
//select all
//    ArrayList<Staff> list = StaffDAO.getInstance().selectAll();
//        for (Staff s : list) {
//            System.out.println(s.toString());
//        }
//        if(list.isEmpty()) System.out.println("Trong");
//delete
//        Staff s1 = new Staff(4);
//        StaffDAO.getInstance().delete(s1);
//check sdt
//String sdt = "12121212";
//if(ss.checkSDT(sdt)){
//    System.out.println("Thanh cong");
//}else System.out.println("Fail");
//check ngay sinh
//        String date = "2004-12-32";
//        if (ss.checkNgaySinh(date)) {
//            System.out.println("Thanh cong");
//        }else{
//            System.out.println("Fail");
//        }
//check tenNhanVien
//        String name = "Nguyen van a12";
//        if (ss.checkTenNhanVien(name)) {
//            System.out.println("Succes");
//        } else {
//            System.out.println("Fail");
//        }
    }
}
