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
import com.ts.dao.StudentDAO;
import com.ts.dto.Student;


@WebServlet("/GetRegisteredIntoInstitute")
public class GetRegisteredIntoInstitute extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		int instId =Integer.parseInt(request.getParameter("id"));
		System.out.println("Institution id :"+ instId);
		int cId = (int) session.getAttribute("CID");
		System.out.println("CourseId :" +cId);
		String sname = (String) session.getAttribute("loggedUser");
		String spassword = (String) session.getAttribute("pwd");
		System.out.print("username of student =" + sname);
		System.out.print("spassword of student = "+ spassword);
		response.setContentType("text/html");
		out.println("<html>");
		Student student = new Student();
		LoginRegister lrdao = new LoginRegister();
		student = lrdao.loginStud(sname, spassword);
		int studId = student.getStuId();
		System.out.println("student id: "+studId);
		StudentDAO stdao = new StudentDAO();
		int status = stdao.addToStudCourses(studId, instId, cId);
		System.out.println(status);
	    out.println("<body> Student have registered successfully...!</body>");
 	    RequestDispatcher dispatcher=request.getRequestDispatcher("kstudentpanel.jsp");
 	    dispatcher.include(request, response);
 	    // now added to update table;
 	    RequestDispatcher dispatcher1=request.getRequestDispatcher("ShowRegisteredInstitution");
	    dispatcher1.forward(request, response);
		out.println("</html>");
		
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
