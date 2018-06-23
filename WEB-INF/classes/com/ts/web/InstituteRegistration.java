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

import com.ts.dao.LoginRegister;
import com.ts.dto.Institution;

@WebServlet("/InstituteRegistration")
public class InstituteRegistration extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd");
		String iname=request.getParameter("name");
		String location=request.getParameter("location");
		String timing=request.getParameter("timing");
		String email=request.getParameter("email");
		long contact=Long.parseLong(request.getParameter("contact"));
		int vacancy=Integer.parseInt(request.getParameter("vacancy"));
		
		HttpSession session=request.getSession();
		session.setAttribute("name", username);
		session.setAttribute("pwd", password);
		Institution institute = new Institution();
		institute.setIname(iname);
		institute.setUserName(username);
		institute.setLocation(location);
		institute.setContact(contact);
		institute.setEmail(email);
		institute.setPassword(password);
		institute.setVacancy(vacancy);
		institute.setTiming(timing);
		response.setContentType("text/html");
		System.out.println(institute);
		LoginRegister lrdao=new LoginRegister();
		out.println("<html>");
		if(lrdao.addInstitute(institute) != 0) {
			//response.getWriter().println("<h1>Registration Success</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("InstReg.html");
			dispatcher.forward(request, response);
		}
		out.println("</html>");
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
