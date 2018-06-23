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

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.ts.dao.LoginRegister;
import com.ts.dao.StudentDAO;
import com.ts.dto.Student;

/**
 * Servlet implementation class RatingServlet
 */
@WebServlet("/RatingServlet")
public class RatingServlet extends HttpServlet {
	private Connection con = null;
	private PreparedStatement pst = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String username = (String) session.getAttribute("loggedUser");
		String password = (String) session.getAttribute("pwd");
		LoginRegister dao = new LoginRegister();
		Student s = dao.loginStud(username,password);
		int sid = s.getStuId();
		System.out.print(sid);
		int instid = Integer.parseInt(request.getParameter("iid"));
		System.out.print(instid);
		int rating = Integer.parseInt(request.getParameter("rate"));
		System.out.print(rating);
		String comment = request.getParameter("comment");
		System.out.print(comment);
		StudentDAO sd = new StudentDAO();
		int status = sd.addRating(sid,instid,rating,comment);
		 out.println("<html>");
		if(status != 0) {
			out.println("<body text = green>Rating is submitted...:)</body>");
			 RequestDispatcher dispatcher1=request.getRequestDispatcher("StudentPanel.jsp");
	    	  dispatcher1.include(request, response);
	    	 RequestDispatcher dispatcher2=request.getRequestDispatcher("ShowRegisteredInstitution");
	    	  dispatcher2.include(request, response);
		} else {
	    	   out.println("<body>Couldn't submit your rating...!</body>");
	    	   RequestDispatcher dispatcher=request.getRequestDispatcher("StudentPanel.jsp");
	    	   dispatcher.include(request, response);		
		}
		out.println("</html>");
		
		response.setContentType("text/html");
		} catch(Exception e) {
			e.getMessage();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
