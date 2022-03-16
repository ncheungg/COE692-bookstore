package com.mycompany.lab2exc2.Persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserCRUD extends CRUD {
    
    public static int getUserID(String username, String password) {
        int userID = -1;
        
        try {
            Connection con = getCon();
            
            String q = "select * from user where username = '" + username + "' and password = '" + password + "'";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            
            // if there is a valid response in the query
            if (rs.next()) {
                userID = Integer.parseInt(rs.getString("userID"));
            }
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return userID;
    }
    
}
