/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.*;

public class JDBCUtil {

    public static Connection getConnection() {
        Connection c = null;

        try {
            //Tao ket noi
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            //Cac thong so
            Dotenv dot = Dotenv.configure().directory("./util").load();
            String url = dot.get("URL");
            String userName = dot.get("USER_NAME");
            String password = dot.get("PASS");

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

    public static void printInfo(Connection c) {
        try {
            if (c != null) {
                DatabaseMetaData dmt = c.getMetaData();
                System.out.println(dmt.getDatabaseProductName());
                System.out.println(dmt.getDatabaseProductVersion());

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
