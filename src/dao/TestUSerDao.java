/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.UserService;
import java.util.ArrayList;
import model.User;

/**
 *
 * @author Trinh
 */
public class TestUSerDao {
    public static UserService us= new UserService();
    public static void main(String[] args) {
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
        String tenTaiKhoan = "fpt";
        String matKhau = "0123";
        System.out.println(us.encryptPassword(matKhau));
        if(us.checkLogIn(tenTaiKhoan, matKhau)){
            System.out.println("Long in thanh cong");
        }else{
            System.out.println("Log in that bai");
        }
    }
}
