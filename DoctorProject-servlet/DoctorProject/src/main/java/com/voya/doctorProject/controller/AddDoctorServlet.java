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

@WebServlet("/addDoctorServlet")
public class AddDoctorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String doctorName = request.getParameter("doctorName");
        String speciality = request.getParameter("speciality");
        double fees = Double.parseDouble(request.getParameter("fees"));
        int ratings = Integer.parseInt(request.getParameter("ratings"));
        int experience = Integer.parseInt(request.getParameter("experience"));

        Doctor doctor = new Doctor();

        doctor.setDoctorName(doctorName);
        doctor.setSpeciality(speciality);
        doctor.setFees(fees);
        doctor.setRatings(ratings);
        doctor.setExperience(experience);


        IDoctorService doctorService = new DoctorServiceImpl();
        doctorService.addDoctor(doctor);

        RequestDispatcher dispatcher = request.getRequestDispatcher("addDoctor.jsp");
        dispatcher.forward(request, response);
    }
}
