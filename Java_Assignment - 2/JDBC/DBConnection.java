package com.lnt.assignment2_6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DBConnection {
public static Connection getConnect() {
    Connection con=null;
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver loaded successfully ....");
        //http://google.com:80
        //syntax : protocol:ipaddress:portno
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="hr";
        String pwd="hr";
         con=DriverManager.getConnection(url,username,pwd);
        System.out.println("connected successfully with database");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return con;
}
}