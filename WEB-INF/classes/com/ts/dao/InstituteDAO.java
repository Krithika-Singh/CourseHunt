package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ts.dbutility.DBConnection;
import com.ts.dto.Student;
import com.ts.dto.student_course;
import com.ts.dto.Courses;
import com.ts.dto.Institution;

public class InstituteDAO {
	public List<Student> studentsInInst(int InstId){
		List<Student> list=new ArrayList<>();
		
		PreparedStatement pst = null;
		ResultSet rst = null;
	final String selection = "select * from student where StudId = (select StudId from stud_course where InstId = ?) ";
	try{
		Connection con = DBConnection.getConnection();
		pst = con.prepareStatement(selection);
		rst = pst.executeQuery();
		pst.setInt(1, InstId);
		while(rst.next()){
			Student student=new Student();
			student.setStuId(rst.getInt(1));
			student.setSname(rst.getString(2));
			student.setUserName(rst.getString(3));
			student.setPassword(rst.getString(4));
			student.setEmail(rst.getString(5));
			student.setContact(rst.getLong(6));
			student.setLocation(rst.getString(7));
			list.add(student);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return list;
	}
	
	public List<String> courseStudInst(int InstId){
		List<String> list=new ArrayList<>();
		
		PreparedStatement pst = null;
		ResultSet rst = null;
	final String selection = "select Cname from courses where CId = (select CId from stud_course where InstId = ?)";
	try{
		Connection con = DBConnection.getConnection();
		pst = con.prepareStatement(selection);
		rst = pst.executeQuery();
		pst.setInt(1, InstId);
		while(rst.next()){
			String cname = null;;
			cname = rst.getString(2);
			list.add(cname);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return list;
	}
	
	public void deleteFromStudList(int StudId,int cId){
		PreparedStatement pst = null;
		final String deletion = "delete from stud_course where StudId = ? and cId =?";
		
		try{
			Connection con = DBConnection.getConnection();
			pst = con.prepareStatement(deletion);
			pst.setInt(1,StudId);
			pst.setInt(2, cId);
			
			pst.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public Institution getInstitution(int InstId){
		PreparedStatement pst = null;
		final String profile = "select * from institute where InstId = ?";
		ResultSet rst = null;
		Institution institute = null;
		try{
			Connection con = DBConnection.getConnection();
			pst = con.prepareStatement(profile);
			pst.setInt(1,InstId);
			rst = pst.executeQuery();
			if(rst.next()){
				institute = new Institution();
				institute.setInstId(rst.getInt(1));
				institute.setIname(rst.getString(2));
				institute.setUserName(rst.getString(3));
				institute.setPassword(rst.getString(4));
				institute.setEmail(rst.getString(5));
				institute.setTiming(rst.getString(6));
				institute.setContact(rst.getLong(8));
				institute.setLocation(rst.getString(10));
				//institute.setTiming(rst.getString(8));
				institute.setVacancy(rst.getInt(7));
			}
			
		} catch(SQLException e){
			e.printStackTrace();
		}
		return institute;
	}
	
	public int editInstitute(Institution institute) {
		Connection con = null;
		PreparedStatement pst = null;
		int x = 0;
		try {
			con = DBConnection.getConnection();
			pst = con.prepareStatement("update institute set Iname= ?, email= ?,contact=?, location=?, timing=?, vacancy=? where instId = ?");
			pst.setString(1, institute.getIname());
			pst.setInt(7, institute.getInstId());
			pst.setString(2, institute.getEmail());
			pst.setLong(3, institute.getContact());
			pst.setString(4, institute.getLocation());
			pst.setString(5, institute.getTiming());
			pst.setInt(6, institute.getVacancy());
			x = pst.executeUpdate();
			System.out.println("Inside Update....."+institute);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return x;
	}
	public List<student_course> StudentsCoursesUnderInst(int InstId){
		List<student_course> sc = new ArrayList<student_course>();
		PreparedStatement pst = null;
		ResultSet rst = null;
	final String selection = "select s.StudId,s.Sname,s.username,s.email,s.contact,s.location,c.cId,c.Cname from student s,courses c where (s.StudId,c.cId) in (select StudId,cId from stud_course where InstId = ?)";
	try{
		Connection con = DBConnection.getConnection();
		pst = con.prepareStatement(selection);
		pst.setInt(1, InstId);
		rst = pst.executeQuery();
		while(rst.next()){
			student_course ss = new student_course();
			ss.setStudId(rst.getInt(1));
			ss.setSname(rst.getString(2));
			ss.setUsername(rst.getString(3));
			ss.setEmail(rst.getString(4));
			ss.setContact(rst.getLong(5));
			ss.setLocation(rst.getString(6));
			ss.setCid(rst.getInt(7));
			ss.setCname(rst.getString(8));
			sc.add(ss);
			
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return sc;
		}


	

	
}

