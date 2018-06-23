package com.ts.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ts.dao.*;

import com.ts.dto.*;
@WebServlet("/InstitutePanelServlet")
public class InstitutePanelServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd");
		 //changes
		 String iname =(String) session.getAttribute("loggedUser");
		 String password1 = (String) session.getAttribute("pwd");
		 
			Institution inst = new Institution();
			LoginRegister dao=new LoginRegister();
			inst = dao.loginInst(iname, password1);
			int InstId = inst.getInstId();
			System.out.print("present...."+InstId);
			
		InstituteDAO dao1 = new InstituteDAO();
		
		List<student_course> sclist=dao1.StudentsCoursesUnderInst(InstId);
		System.out.print(sclist);
		RequestDispatcher dispatcher=request.getRequestDispatcher("kInstitutePanel.jsp");
		request.setAttribute("scList", sclist);
		dispatcher.forward(request, response);	
		}

		 
		/*Institution inst = new Institution();
		LoginRegister dao=new LoginRegister();
		inst = dao.loginInst(username, password);
		int InstId = inst.getInstId();
		System.out.print("present...."+InstId);
		
	InstituteDAO dao1 = new InstituteDAO();
	
	List<student_course> sclist=dao1.StudentsCoursesUnderInst(InstId);
	System.out.print(sclist);
	RequestDispatcher dispatcher=request.getRequestDispatcher("InstitutePanel.jsp");
	request.setAttribute("scList", sclist);
	dispatcher.forward(request, response);	
	}*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
