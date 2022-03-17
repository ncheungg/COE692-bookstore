/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2exc2.Business;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

import com.mycompany.lab2exc2.Persistence.OrdersCRUD;
import com.mycompany.lab2exc2.Persistence.UserCRUD;
import com.mycompany.lab2exc2.Helper.Order;
import com.mycompany.lab2exc2.Helper.User;

/**
 *
 * @author student
 */
@WebServlet(name = "CustomerHome", urlPatterns = {"/CustomerHome"})
public class CustomerHome extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("customer-action");
        int userID = Integer.parseInt(request.getParameter("userID"));
        
        RequestDispatcher rd;
        
        switch (action) {
            case "profile":
                User user = UserCRUD.getUserInfo(userID);
                request.setAttribute("user", user);
                
                rd = request.getRequestDispatcher("customerProfile.jsp");
                rd.forward(request, response);
                break;
            
            case "history":
                ArrayList<Order> history = OrdersCRUD.getOrderHistory(userID);
                request.setAttribute("history", history);
                
                rd = request.getRequestDispatcher("customerHistory.jsp");
                rd.forward(request, response);
                break;
            
            case "search":
                rd = request.getRequestDispatcher("search.jsp");
                rd.forward(request, response);
                break;
            
            default:
                rd = request.getRequestDispatcher("error.jsp");
                rd.forward(request, response);
                break;
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  //      processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
