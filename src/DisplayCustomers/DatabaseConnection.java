/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisplayCustomers;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kheang
 */
public class DatabaseConnection {
    public static Connection getDataCon() {
        return dataCon;
    }

    public static void setDataCon(Connection aDataCon) {
        dataCon = aDataCon;
    }
    private static Connection dataCon;
    public static void ConnectionDB() throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        setDataCon(dataCon= DriverManager.getConnection("jdbc:mysql://192.168.152.135/FinalSemester2?allowPublicKeyRetrieval=true&useSSL=false","admin","admin"));
    }
}
