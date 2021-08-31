package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		HttpSession session = request.getSession();

		String flowerAmount = request.getParameter("flower");
		String cardAmount = request.getParameter("card");
		

		if(cardAmount!=null) {
			Integer cardCost=(Integer) session.getAttribute("cardAmount");			
			if(cardCost==null) {
				cardCost=Integer.parseInt(cardAmount);
				session.setAttribute("cardAmount", cardCost);
			}else {
				cardCost+=Integer.parseInt(cardAmount);
				session.setAttribute("cardAmount", cardCost);				
			}
		}
		
		if(flowerAmount!=null) {
			Integer flowerCost=(Integer) session.getAttribute("flowerAmount");			
			if(flowerCost==null) {
				flowerCost=Integer.parseInt(flowerAmount);
				session.setAttribute("flowerAmount", flowerCost);
			}else {
				flowerCost+=Integer.parseInt(flowerAmount);
				session.setAttribute("flowerAmount", flowerCost);				
			}
		}

		request.getRequestDispatcher("welcome.jsp").forward(request, response);
	}

}
