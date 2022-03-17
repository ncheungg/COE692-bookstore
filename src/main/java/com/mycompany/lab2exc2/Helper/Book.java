package com.mycompany.lab2exc2.Helper;

public class Book {
    
    private int bookID;
    private String title;
    private String isbn;
    private String category;

    public Book(int bookID, String title, String isbn, String category) {
        this.bookID = bookID;
        this.title = title;
        this.isbn = isbn;
        this.category = category;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
}