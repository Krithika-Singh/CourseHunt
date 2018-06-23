package com.ts.dto;

public class Courses {
	private int courseId;
	private String courseName;
	private String courseDuration;
	private int fee;
	
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public void setCourseId(int courseId){
		this.courseId = courseId;
	}
	public int getCourseId() {
		return courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Courses[courseId=" + courseId + ", courseName=" + courseName +",courseDuration= " + courseDuration+ ",fee="+fee+"]";
	}
	
}

