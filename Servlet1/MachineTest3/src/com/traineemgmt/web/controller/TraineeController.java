package com.traineemgmt.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.traineemgmt.model.dao.trainee.Trainee;

/**
 * Servlet implementation class Trainee
 */
public class TraineeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TraineeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id").trim());
	
		String traineeId = request.getParameter("traineeId");
		String traineeName = request.getParameter("TraineeName");
		String branch = request.getParameter("branch");

		String percentage = request.getParameter("percentage");
		
		Double percent=Double.parseDouble(percentage);
		
		Trainee trainee = new Trainee(traineeId, traineeName, branch, percent);
		
		
		//PRG pattern
		response.sendRedirect("BookController.do?action=showall");
	}

}
