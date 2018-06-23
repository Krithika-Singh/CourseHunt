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
import com.ts.dto.Institution;
import com.ts.dto.Student;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out=response.getWriter();
			String username=request.getParameter("uname");
			String password=request.getParameter("pwd");
			String type=request.getParameter("group");
			
			HttpSession session=request.getSession();
			session.setAttribute("loggedUser", username);
			session.setAttribute("pwd", password);
			
			response.setContentType("text/html");
		
			LoginRegister lrDao = new LoginRegister();
			  
	          if("1".equals(type)) {
			
				   Student student =lrDao.loginStud(username, password);
				   System.out.println("Inside student servlet:"+student);
				   out.println("<html>");
			       if(student != null){                  
			    	   out.println("<body> Student have Successfully logedin...!</body>");
			    	   RequestDispatcher dispatcher=request.getRequestDispatcher("ShowRegisteredInstitution");
			    	   dispatcher.include(request, response);
			    	   //dis.include(request,response);
				    }
			       else{
			    	   out.println("<body> Invalid credentials of student...!</body>");
			    	   RequestDispatcher dispatcher=request.getRequestDispatcher("khome.html");
			    	   dispatcher.include(request, response);		
				    }
				out.println("</html>");
				
	         } else if("0".equals(type)) {
	        	 Institution institute = lrDao.loginInst(username, password);
	        	 System.out.println("Inside institution servlet: "+institute);
	        	 out.println("<html>");
	        	 if(institute != null) {
	        		 out.println("<body> Institute have logged in successfully </body>");
	        		 RequestDispatcher dis=request.getRequestDispatcher("InstitutePanelServlet");
	        		 dis.include(request, response);
	        	 } else {
	        		 out.println("<body> Invalid credentials of institute...!</body>");
			    	 RequestDispatcher dispatcher=request.getRequestDispatcher("khome.html");
			    	 dispatcher.include(request, response);		
	        	 }
	        	 
	        	 out.println("</html>");
	         }
			
			
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
