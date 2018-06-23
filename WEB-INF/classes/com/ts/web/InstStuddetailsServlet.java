package com.ts.web;

import java.util.ArrayList;

import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ts.dao.StudentDAO;
import com.ts.dto.*;
import com.ts.dao.InstituteDAO;


@WebServlet("/Stud_inst")
public class InstStuddetailsServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		HttpSession session=request.getSession();
		int InstId = (int)session.getAttribute("instId");
		InstituteDAO dao=new InstituteDAO();
		List<student_course> sc = dao.StudentsCoursesUnderInst(InstId);
				
		RequestDispatcher dispatcher=request.getRequestDispatcher("Stud_inst.jsp");
		request.setAttribute("scList", sc);
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
