package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogOutServlet")
public class LogOutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		  HttpSession session = request.getSession();
		  
		  
		  //  out.println("<html>");
		    RequestDispatcher dispatcher=request.getRequestDispatcher("khome.html");
		      dispatcher.forward(request, response);
		      session.invalidate();
		      out.println("You are successfully logged out!");
		  //    out.println("</html>");
		      out.close();
		    
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
