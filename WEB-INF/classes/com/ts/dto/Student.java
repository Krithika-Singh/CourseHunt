package com.ts.dto;

import java.util.ArrayList;

import java.util.List;

public class Student {
	private int stuId;
	private String userName;
	private String password;
	private String email;
	private long contact;
	private String location;
	private String sname;
	private List<Courses> course  = new ArrayList<Courses>();
	
	
	public int getStuId() {
		return stuId;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public void setCourse(List<Courses> course) {
		this.course = course;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public List<Courses> getCourse() {
		return course;
	    
	}

	public void setCourse(Courses course) {
	    this.course = (List<Courses>) course;
	}
	@Override
	public String toString() {
		return "Student [stuId = " + stuId + ",Sname = " + sname + ",userName = " + userName + ",password = " + password + ",email = " + email + ",contact = " + contact + ",location = " + location + "]";
	}
	

}

