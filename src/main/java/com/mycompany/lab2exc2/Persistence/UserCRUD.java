package com.mycompany.lab2exc2.Persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mycompany.lab2exc2.Helper.User;

public class UserCRUD extends CRUD {
    
    public static User getUserInfo(String username, String password) {
        User user = null;
        
        try {
            Connection con = getCon();
            
            String q = "select * from user where username = '" + username + "' and password = '" + password + "'";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            
            // if there is a valid response in the query
            if (rs.next()) {
                int userID = Integer.parseInt(rs.getString("userID"));
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String phoneNumber = rs.getString("phoneNumber");
                
                user = new User(userID, firstName, lastName, username, phoneNumber);
            }
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return user;
        
    }
    
    public static User getUserInfo(int userID) {
        User user = null;
        
        try {
            Connection con = getCon();
            
            String q = "select * from user where userID = '" + userID + "'";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            
            // if there is a valid response in the query
            if (rs.next()) {
                String username = rs.getString("username");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String phoneNumber = rs.getString("phoneNumber");
                
                user = new User(userID, firstName, lastName, username, phoneNumber);
            }
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return user;
        
    }
    
}
