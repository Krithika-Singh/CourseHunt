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

import com.ts.dao.InstituteDAO;
import com.ts.dao.LoginRegister;
import com.ts.dto.Institution;


@WebServlet("/StudentDeletionServlet")
public class StudentDeletionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		 PrintWriter out = response.getWriter();	
		//start
		 HttpSession session=request.getSession();
		 String iname =(String) session.getAttribute("loggedUser");
		 String password = (String) session.getAttribute("pwd");
		 Institution institute =new Institution();
		 LoginRegister lrdao = new LoginRegister();
		 institute=lrdao.loginInst(iname, password);
		 int instId = institute.getInstId();
		 //stop
		 int studId = Integer.parseInt(request.getParameter("studId"));
		int cId =  Integer.parseInt(request.getParameter("cId"));
		 System.out.print("student id in the current page is =" +studId);
		// System.out.print("student id in the current page is =" +custId);
		 InstituteDAO idao = new InstituteDAO();
		 idao.deleteFromStudList(studId,cId);
		 out.println("<html>");     
		 out.println("<h3> deletion successful</h3>");
		 RequestDispatcher dis=request.getRequestDispatcher("InstitutePanel.jsp");
		 dis.include(request, response);
		 //edited it now to update table
		 RequestDispatcher dis1=request.getRequestDispatcher("InstitutePanelServlet");
		 dis1.forward(request, response);
		 out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
