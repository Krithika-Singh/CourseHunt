package com.ts.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ts.dao.InstituteDAO;
import com.ts.dao.LoginRegister;
import com.ts.dto.Institution;
@WebServlet("/InstituteProfileservlet")
public class InstituteProfileservlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String username = (String)session.getAttribute("loggedUser");
		String password = (String)session.getAttribute("pwd");
		System.out.println(username+" " + password );
	   LoginRegister dao = new LoginRegister();
	   Institution inst = new Institution();
	   inst = dao.loginInst(username,password);  
	   System.out.println(inst);
	   RequestDispatcher dispatcher=request.getRequestDispatcher("InstituteProfile.jsp");
	   request.setAttribute("inst", inst);
	   dispatcher.forward(request, response);	
	  
	   
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
