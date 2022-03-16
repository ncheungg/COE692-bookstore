package com.mycompany.lab2exc2.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;


public abstract class CRUD {
    
    public static Connection getCon() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bookstore?serverTimezone=UTC&autoReconnect=true&useSSL=false";
            con = DriverManager.getConnection(url, "root", "student");
            System.out.println("Connection established.");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return con;
    }
    
}
