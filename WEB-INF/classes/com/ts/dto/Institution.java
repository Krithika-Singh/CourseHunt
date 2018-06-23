package com.ts.dto;

import java.util.ArrayList;

import java.util.List;



public class Institution{

private int instId;
private String iname;
private String userName;
private String password;
private String email;
private long contact;
private String location;
private String timing;
private int vacancy;
private List<Courses> course = new ArrayList<Courses>();
public int getInstId() {
	return instId;
}

public void setInstId(int instId) {
	this.instId = instId;
}


public String getIname() {
	return iname;
}

public void setIname(String iname) {
	this.iname = iname;
}

public String getTiming() {
	return timing;
}

public void setTiming(String timing) {
	this.timing = timing;
}

public List<Courses> getCourse() {
	return course;
}

public void setCourse(List<Courses> course) {
	this.course = course;
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

public int getVacancy() {
	return vacancy;
}

public void setVacancy(int vacancy) {
	this.vacancy = vacancy;
}

public List<Courses> getCourseId() {
	return course;
    
}

public void setCourseId(Courses course) {
    this.course = (List<Courses>) course;
}

@Override
public String toString() {
	return "Institution [instId = " + instId + ",iName = " + iname + ",userName = " + userName + ",password = " + password + ",email = " + email + ",contact = " + contact + ",location = " + location + ", timings=" + timing + ", vacancy=" + vacancy +"]";
}
}

