/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */

package com.mycompany.lab2exc2;

import java.util.ArrayList;

public class User {
    
    private String username;
    private double balance;
    private ArrayList<Book> shoppingCart;
    
    public User(String username, String password) {
        this.username = username;
        this.balance = 0.00;
        this.shoppingCart = new ArrayList<Book>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public <any> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(<any> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    
}
