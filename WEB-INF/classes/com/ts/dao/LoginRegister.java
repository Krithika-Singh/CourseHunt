 package com.ts.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ts.dbutility.DBConnection;
import com.ts.dto.Institution;
import com.ts.dto.Student;
import com.ts.dto.Courses;


public class LoginRegister {
	public int addInstitute(Institution institution){
		final String insertion = "insert into institute(Iname,username,password,email,timing,vacancy,contact,location) values(?,?,?,?,?,?,?,?)";
        PreparedStatement pst = null;
		
		int status=0;
		
		try(Connection con=DBConnection.getConnection();) {
			pst=con.prepareStatement(insertion);
			pst.setString(1, institution.getIname());
			pst.setString(2, institution.getUserName());
			pst.setString(3, institution.getPassword());
			pst.setString(4, institution.getEmail());
			pst.setString(5, institution.getTiming());
			pst.setInt(6, institution.getVacancy());
			pst.setString(8, institution.getLocation());
			pst.setLong(7, institution.getContact());
			
			status=pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public int addStudent(Student student){
		final String insertion = "insert into student(Sname,username,password,email,contact,location) values(?,?,?,?,?,?)";
        PreparedStatement pst = null;
		
		int status=0;
		
		try(Connection con=DBConnection.getConnection();) {
			pst=con.prepareStatement(insertion);
			pst.setString(1, student.getSname());
			pst.setString(2, student.getUserName());
			pst.setString(3, student.getPassword());
			pst.setString(4, student.getEmail());
			pst.setLong(5, student.getContact());
			pst.setString(6, student.getLocation());
			
			status=pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	public Institution loginInst(String username,String password){
		
		PreparedStatement pst = null;
		ResultSet rst = null;
		Institution institute=null;
	final String selection = "select * from institute where username = ? and password = ?";
	try(Connection con = DBConnection.getConnection();){
		
		pst = con.prepareStatement(selection);
		pst.setString(1, username);
		pst.setString(2, password);
		rst = pst.executeQuery();
		if(rst.next()){
			 institute=new Institution();
			 institute.setInstId(rst.getInt(1));
			 institute.setIname(rst.getString(2));
			 institute.setUserName(rst.getString(3));
			 institute.setPassword(rst.getString(4));
			 institute.setEmail(rst.getString(5));
			 institute.setTiming(rst.getString(6));
			 institute.setVacancy(rst.getInt(7));
			 institute.setContact(rst.getLong(8));
			 institute.setLocation(rst.getString(10));
			 
		System.out.println(institute);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return institute;
	}
	
public Student loginStud(String username,String password){
		
		PreparedStatement pst = null;
		ResultSet rst = null;
		Student student=null;
	final String selection = "select * from student where username = ? and password = ?";
	try(Connection con = DBConnection.getConnection();){
		
		pst = con.prepareStatement(selection);
		pst.setString(1, username);
		pst.setString(2, password);
		rst = pst.executeQuery();
		if(rst.next()){
			 student=new Student();
			 student.setStuId(rst.getInt(1));
			 student.setSname(rst.getString(2));
			 student.setUserName(rst.getString(3));
			 student.setPassword(rst.getString(4));
			 student.setEmail(rst.getString(5));
			 student.setContact(rst.getLong(6));
			 student.setLocation(rst.getString(7));
			 
		System.out.println(student);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	System.out.println(student);

	return student;
	}

    public void courseOffedByInstitution(int instId ,int cId) {
    	final String ADD="insert into inst_course values(?,?)";
    	PreparedStatement pst = null;
 
    	    
			try {
    		Connection con = DBConnection.getConnection();
    		pst=con.prepareStatement(ADD);
			pst.setInt(1, instId);
			pst.setInt(2, cId);
		    pst.executeUpdate();
			
    	    } catch(SQLException e){
    	    	 e.printStackTrace();
    	    }
    	  
    }

	
	
}