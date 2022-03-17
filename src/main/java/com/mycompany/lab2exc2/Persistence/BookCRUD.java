package com.mycompany.lab2exc2.Persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.mycompany.lab2exc2.Helper.Book;


public class BookCRUD extends CRUD {
    
    public static Book getBook(int bookID) {
        
        Book book = null;
        
        try {
            Connection con = getCon();
            
            String q = "select * from book where bookID = '" + bookID + "'";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                String title = rs.getString("title");
                String isbn = rs.getString("isbn");
                String category = rs.getString("category");
                
                book = new Book(bookID, title, isbn, category);
            }
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return book;
    }
    
}
