package com.voya.doctorProject.controller;

import com.voya.doctorProject.model.Doctor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

       if (username.equals("prabhakar") && password.equals("123")){
           RequestDispatcher dispatcher = request.getRequestDispatcher("adminDashboard.jsp");
           dispatcher.forward(request, response);
       }
    }
}
