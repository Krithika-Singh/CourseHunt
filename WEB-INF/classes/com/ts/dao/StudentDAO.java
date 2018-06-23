package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ts.dbutility.DBConnection;
import com.ts.dto.Courses;
import com.ts.dto.Institution;
import com.ts.dto.Student;
import com.ts.dto.student_course;

public class StudentDAO {
	public List<Institution> allInstUnderCourse (int cId){
		List<Institution> list=new ArrayList<Institution>();
		
		PreparedStatement pst = null;
		ResultSet rst = null;
		final String selection = "select *from institute where instId in(select instId from inst_course where cId=?)";
		
		try(Connection con = DBConnection.getConnection();){
			//pst.setInt(1,cId);
			pst = con.prepareStatement(selection);
			pst.setInt(1,cId);
			rst = pst.executeQuery();
			while(rst.next()){
				Institution institute=new Institution();
				institute.setInstId(rst.getInt(1));
				institute.setIname(rst.getString(2));
				institute.setUserName(rst.getString(3));
				institute.setPassword(rst.getString(4));
				institute.setEmail(rst.getString(5));
				institute.setTiming(rst.getString(6));
				institute.setVacancy(rst.getInt(7));
				institute.setContact(rst.getLong(8));
				institute.setLocation(rst.getString(10));
				
				list.add(institute);
			}
		   }catch (SQLException e) {
				e.printStackTrace();
		   }
		   return list;
		}
	
	public int addToStudCourses(int studId,int instId,int cId){
		PreparedStatement pst = null;
		int status = 0;
		final String insert = "insert into stud_course values(?,?,?)";
		try{
			Connection con = DBConnection.getConnection();
			pst = con.prepareStatement(insert);
			pst.setInt(1, studId);
			pst.setInt(2, instId);
			pst.setInt(3, cId);
			status = pst.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
		}
		return status;
	}
	
	public Student getStudent(int StudId){
		PreparedStatement pst = null;
		final String profile = "select * from student where StudId = ?";
		ResultSet rst = null;
		Student student = null;
		try{
			Connection con = DBConnection.getConnection();
			pst = con.prepareStatement(profile);
			pst.setInt(1,StudId);
			rst = pst.executeQuery();
			if(rst.next()){
				student = new Student();
				student.setStuId(rst.getInt(1));
				student.setSname(rst.getString(2));
				student.setUserName(rst.getString(3));
				student.setPassword(rst.getString(4));
				student.setEmail(rst.getString(5));
				student.setContact(rst.getLong(6));
				student.setLocation(rst.getString(7));
			}
			
		} catch(SQLException e){
			e.printStackTrace();
		}
		return student;
	}
	//to get the course object so that i can duration and fee
	public Courses getCourseFeeNdTime(int cid) {
		PreparedStatement pst = null;
		final String FEE_EXTRACTION = "select * from courses where cId = ?";
		ResultSet rst = null;
		Courses course = null;
		try{
			Connection con = DBConnection.getConnection();
			pst = con.prepareStatement(FEE_EXTRACTION);
			pst.setInt(1,cid);
			rst = pst.executeQuery();
			if(rst.next()){
				course = new Courses();
				course.setCourseId(rst.getInt(1));
				course.setCourseName(rst.getString(2));
		        course.setCourseDuration(rst.getString(4));
		        course.setFee(rst.getInt(3));
			}
		} catch(SQLException e){
			e.printStackTrace();
		}
		return course;
	
	}
	public int editStudent(Student student) {
		Connection con = null;
		PreparedStatement pst = null;
		int x = 0;
		try {
			con = DBConnection.getConnection();
			pst = con.prepareStatement("update Student set Sname= ?, email= ?,contact=?, location=? where studId = ?");
			pst.setString(1, student.getSname());
			pst.setString(2, student.getEmail());
			pst.setLong(3, student.getContact());
			pst.setString(4, student.getLocation());
			pst.setInt(5, student.getStuId());
			x = pst.executeUpdate();
			System.out.println("Inside Update....."+student);
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

	public List<student_course> allInstUnderAStudent(int sId) {
		// TODO Auto-generated method stub
        List<student_course> list=new ArrayList<student_course>();
		
		PreparedStatement pst = null;
		ResultSet rst = null;
		final String selection = "select i.Iname,i.username,i.email,i.contact,i.location,c.cName,i.instId from institute i,courses c where (i.instId,c.cId) in(select instId,cId from stud_course where studId = ?)";
		try(Connection con = DBConnection.getConnection();){
			//pst.setInt(1,cId);
			pst = con.prepareStatement(selection);
			pst.setInt(1,sId);
			rst = pst.executeQuery();
			while(rst.next()){
				student_course s = new student_course();
				s.setInstname(rst.getString(1));
				s.setUsername(rst.getString(2));
				s.setEmail(rst.getString(3));
				s.setContact(rst.getLong(4));
				s.setLocation(rst.getString(5));
				s.setCname(rst.getString(6));
				s.setInstid(rst.getInt(7));
				list.add(s);
			}
		}catch (SQLException e) {
			e.printStackTrace();
	   }
	   return list;
		
	}
	
	public int addRating(int sid,int instid,int rating,String comment) {
		PreparedStatement pst = null;
		final String insert = "insert into ratings values(?,?,?,?)";
		int status = 0;
		try(Connection con=DBConnection.getConnection();) {
			pst=con.prepareStatement(insert);
			pst.setInt(1,rating);
			pst.setInt(2,sid);
			pst.setInt(3,instid);
			pst.setString(4, comment);
			status=pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}




}
