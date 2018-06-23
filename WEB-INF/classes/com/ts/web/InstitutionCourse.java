package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

@WebServlet("/InstitutionCourse")
public class InstitutionCourse extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    HttpSession session = request.getSession();
		    String username = (String) session.getAttribute("name");
		    String password = (String) session.getAttribute("pwd");
		    
		    LoginRegister lrdao = new LoginRegister();
		    Institution institute = new Institution();
		    institute=lrdao.loginInst(username, password);
		    int instId = institute.getInstId();
		    System.out.println("institution id = "+instId);
		    
		    PrintWriter out=response.getWriter();
		    response.setContentType("text/html");
		    String[] courses=request.getParameterValues("course");
		    ArrayList<Integer> list =new ArrayList<Integer>();
		    for(String s:courses) {
			  list.add(Integer.parseInt(s));
		    }
		    System.out.println(list);
    
		    
		    out.println("<html>");
		    for(int i = 0; i < list.size();i++) {
		    	lrdao.courseOffedByInstitution(instId,list.get(i));
		    }
			out.println("<body> Institution Registered Successfully</body>");
	    	RequestDispatcher dispatcher=request.getRequestDispatcher("InstitutePanel.jsp");
	    	dispatcher.forward(request, response);
	    	out.println("</html>");
		    
		  
	        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
	      
	}

}
