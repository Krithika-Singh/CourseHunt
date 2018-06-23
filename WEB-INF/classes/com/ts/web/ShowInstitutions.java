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

import com.ts.dao.StudentDAO;
import com.ts.dto.Courses;
import com.ts.dto.Institution;



@WebServlet("/ShowInstitutions")
public class ShowInstitutions extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String cid = request.getParameter("type");
		//int CID;
		
		HttpSession session=request.getSession();
		response.setContentType("text/html");
		out.println("<html>");
		
        StudentDAO d = new StudentDAO();
        Courses c = new Courses();
        List<Institution> InstitutionList = new ArrayList<Institution>();
        
        if("1001".equals(cid)) {
		         InstitutionList= d.allInstUnderCourse(1001);
		        // CID=1001;
		         c=d.getCourseFeeNdTime(1001);
        } else if("1002".equals(cid)) {
        	 InstitutionList= d.allInstUnderCourse(1002);
        	 c=d.getCourseFeeNdTime(1002);
        }
	     else if("1003".equals(cid)) {
	    	 InstitutionList= d.allInstUnderCourse(1003);
	    	 c=d.getCourseFeeNdTime(1003);
	     }
	     else if("1004".equals(cid)) {
	    	 InstitutionList= d.allInstUnderCourse(1004);
	    	 c=d.getCourseFeeNdTime(1004);
	     }

	     else if("1005".equals(cid)) {
	    	 InstitutionList= d.allInstUnderCourse(1005);
	    	 c=d.getCourseFeeNdTime(1005);
	     }

	     else if("1006".equals(cid)) {
	    	 InstitutionList= d.allInstUnderCourse(1006);
	    	 c=d.getCourseFeeNdTime(1006);
	     }

	     else if("1007".equals(cid)) {
	    	 InstitutionList= d.allInstUnderCourse(1007);
	    	 c=d.getCourseFeeNdTime(1007);
	     }

	     else if("1008".equals(cid)) {
	    	 InstitutionList= d.allInstUnderCourse(1008);
	    	 c=d.getCourseFeeNdTime(1008);
	     }

		for(Institution e: InstitutionList) {
			System.out.println(e);
		}
		
		System.out.println(c);
		
		int CID = c.getCourseId();
		session.setAttribute("CID", CID);
	    request.setAttribute("course", c);
	    RequestDispatcher dis = request.getRequestDispatcher("CourseDuration.jsp");
	    
		request.setAttribute("InstList", InstitutionList);
		RequestDispatcher dispatcher=request.getRequestDispatcher("DisplayAllInstitutions.jsp");
		dispatcher.include(request, response);	
		dis.include(request, response);
		out.println("</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
