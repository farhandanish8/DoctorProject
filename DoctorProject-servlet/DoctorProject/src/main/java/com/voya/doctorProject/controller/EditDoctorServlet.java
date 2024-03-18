package com.voya.doctorProject.controller;

import com.voya.doctorProject.exceprion.IdNotFoundException;
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

@WebServlet("/editDoctorServlet")
public class EditDoctorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int doctorId = Integer.parseInt(request.getParameter("doctorId"));


        IDoctorService doctorService = new DoctorServiceImpl();
        Doctor doctor = null;
        try {
            doctor = doctorService.getById(doctorId);
            if (doctor != null) {
                request.setAttribute("doctor", doctor);
                RequestDispatcher dispatcher = request.getRequestDispatcher("updateDoctor.jsp");
                dispatcher.forward(request, response);
            }
        } catch (IdNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
