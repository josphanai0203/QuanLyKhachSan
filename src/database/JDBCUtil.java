/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
public class JDBCUtil {
    public static Connection getConnection() {
		Connection c = null;
		
		
		try {
			//Tao ket noi
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			//Cac thong so
			String url  = "jdbc:mySQL://localHost:3306/nhasach";
			String userName = "root";
			String password = "";
			
			//Tao ket noi
			c = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}
	
	public static void closeConnection(Connection c) {
		try {
			if (c != null) {
				c.close();
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
