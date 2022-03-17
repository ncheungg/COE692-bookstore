package com.mycompany.lab2exc2.Helper;

import java.util.ArrayList;

public class Order {
    
    private int orderID;
    private int userID;
    private int paymentID;
    private String purchaseDate;
    private double orderTotal;
    private ArrayList<Book> books;

    public Order(int orderID, int userID, int paymentID, String purchaseDate, double orderTotal) {
        this.orderID = orderID;
        this.userID = userID;
        this.paymentID = paymentID;
        this.purchaseDate = purchaseDate;
        this.orderTotal = orderTotal;
    }

    public Order(int orderID, int userID, int paymentID, String purchaseDate, double orderTotal, ArrayList<Book> books) {
        this.orderID = orderID;
        this.userID = userID;
        this.paymentID = paymentID;
        this.purchaseDate = purchaseDate;
        this.orderTotal = orderTotal;
        this.books = books;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public ArrayList<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    
    public int getBookCount() {
        return books.size();
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    
}