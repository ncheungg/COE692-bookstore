package com.mycompany.lab2exc2.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.PrintWriter;

public class UserCRUD {
    
    private static Connection getCon() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms?autoReconnect=true&useSSL=false", "root", "student");
            System.out.println("Connection established.");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return con;
    }
    
    public static boolean isValidUser(String username, String password) {
        boolean isUser = false;
        
        try {
            Connection con = getCon();
            
            String q = "select * from user where username = '" + username + "' and password = '" + password + "'";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            
            // if there is a valid response in the query
            if (rs.next()) {
                isUser = true;
            }
            
            con.close();
            
            System.out.println(q);
            System.out.println(isUser);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return isUser;
    }
    
}
