package com.mycompany.lab2exc2.Persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class OrdersCRUD extends CRUD {
    
    public static ArrayList<String[]> getOrderHistory(String userID) {
        
        ArrayList<String[]> orders = new ArrayList<>();
        
        try {
            Connection con = getCon();
            
            String q = "select * from orders where userID = '" + userID + "'";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            
            // loop through the orders and add necessary values
            while (rs.next()) {
                String[] row = new String[5];
                
                row[0] = rs.getString("orderID");
                row[2] = rs.getString("purchaseDate");
                row[3] = rs.getString("orderTotal");
                row[4] = rs.getString("paymentID");
                
                orders.add(row);
            }
            con.close();
            
            for (String[] row : orders) {
                String orderID = row[0];
                row[1] = Integer.toString(getOrderItemCount(orderID));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return orders;
        
    }
    
    public static int getOrderItemCount(String orderID) {
        
        int itemCount = -1;
        
        try {
            Connection con = getCon();
            
            String q = "select count(orderID) from orders where orderID = '" + orderID + "'";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            
            // if there is a valid response in the query
            if (rs.next()) {
                itemCount = rs.getInt(1);
            }
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return itemCount;
        
    }
    
//    public static ArrayList<String[]> getOrderItems(String orderID) {}
    
}
