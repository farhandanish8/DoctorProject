package com.voya.doctorProject.controller;

import com.voya.doctorProject.model.Doctor;
import com.voya.doctorProject.service.DoctorServiceImpl;
import com.voya.doctorProject.service.IDoctorService;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateDoctorServlet")
public class UpdateDoctorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int doctorId = Integer.parseInt(request.getParameter("doctorId"));
        String doctorName = request.getParameter("doctorName");
        String speciality = request.getParameter("speciality");
        double fees = Double.parseDouble(request.getParameter("fees"));
        int ratings = Integer.parseInt(request.getParameter("ratings"));
        int experience = Integer.parseInt(request.getParameter("experience"));


        Doctor updatedDoctor = new Doctor(doctorId, doctorName, speciality, fees, ratings, experience);


        IDoctorService doctorService = new DoctorServiceImpl();
        doctorService.updateDoctor(doctorId,fees);
        RequestDispatcher dispatcher = request.getRequestDispatcher("updateDoctor.jsp");
        dispatcher.forward(request, response);


    }
}
