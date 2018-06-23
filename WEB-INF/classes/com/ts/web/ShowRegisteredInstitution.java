package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ts.dao.LoginRegister;
import com.ts.dao.StudentDAO;
import com.ts.dto.Courses;
import com.ts.dto.Institution;
import com.ts.dto.Student;
import com.ts.dto.student_course;

@WebServlet("/ShowRegisteredInstitution")
public class ShowRegisteredInstitution extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		response.setContentType("text/html");
		String username = (String) session.getAttribute("loggedUser");
		String password =(String)session.getAttribute("pwd");
		
		out.println("<html>");
		StudentDAO d = new StudentDAO();
		LoginRegister lrdao = new LoginRegister();
		Student s = lrdao.loginStud(username, password);
		int sId = s.getStuId();
		List<student_course> sc = new ArrayList<student_course>();
		sc = d.allInstUnderAStudent(sId);
       // List<Institution> InstitutionList = new ArrayList<Institution>();
        //InstitutionList =d.allInstUnderAStudent(sId);
         System.out.print(sc);
		request.setAttribute("InstList", sc);
		RequestDispatcher dispatcher=request.getRequestDispatcher("kstudentpanel.jsp");
		dispatcher.include(request, response);	
		out.println("</html>");
        
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
