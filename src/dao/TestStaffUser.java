/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Staff;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Trinh
 */
public class TestStaffUser {
    public static void main(String[] args) {
        Staff s = new Staff(6,"Võ Thành Quang", Date.valueOf("1988-10-09"), "Nam", "0923471211", "HCM");
        StaffDAO.getInstance().update(s);

//        ArrayList<Staff> list = StaffDAO.getInstance().selectAll();
//        for (Staff s : list) {
//            System.out.println(s.toString());
//        }
        
    }
}
