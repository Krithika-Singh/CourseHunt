package com.ts.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ts.dao.LoginRegister;
import com.ts.dto.Student;
@WebServlet("/StudentProfileServlet")
public class StudentProfileServlet extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("loggedUser");
		String password = (String)session.getAttribute("pwd");
		LoginRegister dao = new LoginRegister();
		Student stud = new Student();
		stud = dao.loginStud(username,password);
		System.out.println(stud);
		RequestDispatcher dispatcher=request.getRequestDispatcher("kStudentProfile.jsp");
		request.setAttribute("stud", stud);
		dispatcher.forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
