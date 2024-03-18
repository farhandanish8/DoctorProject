package com.voya.doctorProject.controller;



import com.voya.doctorProject.service.DoctorServiceImpl;
import com.voya.doctorProject.service.IDoctorService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteDoctorServlet")
public class DeleteDoctorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int doctorIdToDelete = Integer.parseInt(request.getParameter("doctorId"));


        IDoctorService doctorService = new DoctorServiceImpl();
        doctorService.deleteDoctor(doctorIdToDelete);

        RequestDispatcher dispatcher = request.getRequestDispatcher("adminDashboard.jsp");
        dispatcher.forward(request, response);
    }
}
