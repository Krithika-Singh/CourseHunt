package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.ts.dao.StudentDAO;
import com.ts.dto.Student;

@WebServlet("/StudentUpdateServlet")
public class StudentUpdateServlet extends HttpServlet {
	private Connection con = null;
	private PreparedStatement pst = null;
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			int sid = Integer.parseInt(request.getParameter("studId"));
			String studname = request.getParameter("sname");
			String email = request.getParameter("email");
			Long contact = Long.parseLong(request.getParameter("contact"));
			String location = request.getParameter("location");
			Student stud = new Student();
			stud.setStuId(sid);
			stud.setSname(studname);
			stud.setEmail(email);
			stud.setContact(contact);
			stud.setLocation(location);
			int x = new StudentDAO().editStudent(stud);
			System.out.println(x);
			if(x > 0){
				RequestDispatcher rd = request.getRequestDispatcher("StudentPanel.jsp");
				rd.include(request, response);
				out.println("<center><h2>Updated Successfully:)</h2></center>");
			}
		} catch(Exception e){
			e.getMessage();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


}
