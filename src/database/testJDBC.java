/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Trinh
 */
public class testJDBC {
    public static void main(String[] args) {
		java.sql.Connection connection = JDBCUtil.getConnection();
		//System.out.println(connection);
		JDBCUtil.printInfo(connection);
		JDBCUtil.closeConnection(connection);
		//System.out.println(connection);
	}
}
