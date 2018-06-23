package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.InstituteDAO;
import com.ts.dto.Institution;


@WebServlet("/InstUpdateServlet")
public class InstUpdateServlet extends HttpServlet {
	private Connection con = null;
	private PreparedStatement pst = null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();			
		int InstituteId = Integer.parseInt(request.getParameter("instId"));
		String Institutename = request.getParameter("iname");
		String email = request.getParameter("email");
		long contact=Long.parseLong(request.getParameter("contact"));
		String location = request.getParameter("location");
		String timing = request.getParameter("timing");
		int vacancy = Integer.parseInt(request.getParameter("vacancy"));
	    Institution institute=new Institution();
		institute.setInstId(InstituteId);
		institute.setIname(Institutename);
	    institute.setEmail(email);
		institute.setContact(contact);
		institute.setLocation(location);
		institute.setTiming(timing);
		institute.setVacancy(vacancy);
		
		out.println("<html>");
		int x = new InstituteDAO().editInstitute(institute);
		if(x > 0) {											
			RequestDispatcher rd = request.getRequestDispatcher("InstitutePanel.jsp");
			out.println("<center><h1>Update Successful...</h1><center>");
			rd.include(request, response);
			
		}

		out.println("</html>");
		}
		catch(Exception e){
		e.getMessage();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
