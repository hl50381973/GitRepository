package com.hl.StudentSystem;

public class CourseSession {
private String department;
private String number;
	
	public CourseSession(String department, String number) {
	super();
	this.department = department;
	this.number = number;
}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	

}
