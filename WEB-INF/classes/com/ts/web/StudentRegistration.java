package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.LoginRegister;
import com.ts.dto.Student;

@WebServlet("/StudentRegistration")
public class StudentRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String username=request.getParameter("uname");
		String Sname=request.getParameter("name");
		String password=request.getParameter("pwd");
		String email=request.getParameter("email");
		String location=request.getParameter("location");
		long contact=Long.parseLong(request.getParameter("contact"));
		
		Student student = new Student();
		student.setContact(contact);
		student.setEmail(email);
		student.setLocation(location);
		student.setPassword(password);
		student.setSname(Sname);
		student.setUserName(username);
		response.setContentType("text/html");
		System.out.println(student);
		
		LoginRegister lrdao=new LoginRegister();
		//int status = lrdao.addStudent(student);
		out.println("<html>");
		if(lrdao.addStudent(student) != 0) {
			response.getWriter().println("<h1>Registration Success</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("khome.html");
			dispatcher.include(request, response);
		
		}
		out.println("</html>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
