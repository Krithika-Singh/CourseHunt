package com.ts.dto;

public class student_course {
	private String sname;
	private String username;
	private String email;
	private long contact;
	private String location;
	private String cname;
	private int cid;
	private int studId;
	private int instid;
	private String instname;
	
	
	
	
	public int getInstid() {
		return instid;
	}
	public void setInstid(int instid) {
		this.instid = instid;
	}
	public String getInstname() {
		return instname;
	}
	public void setInstname(String instname) {
		this.instname = instname;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int i) {
		this.studId = i;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
		
	

}
