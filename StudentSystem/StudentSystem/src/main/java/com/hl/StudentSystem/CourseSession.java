package com.hl.StudentSystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * provides a representation of a single-semester
 * session of a specific university course
 * @author Administrator
 * 
 * */
public class CourseSession {
	private String department;
	private String number;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Date startDate;

	/**
	 * Constrcts a 
	 * @param startDate the date on whihc the courseSession begins
	 * 
	 * */
	public CourseSession(String department, String number,
			 Date startDate) {
		super();
		this.department = department;
		this.number = number;
		
		this.startDate = startDate;
	}

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

	public int getNumberOfStudents() {
		return students.size();
	}

	public void enroll(Student student1) {
		students.add(student1);
	}

	public ArrayList<Student> getAllStudents() {

		return students;
	}

	public Student get(int i) {
		// TODO Auto-generated method stub
		return students.get(i);
	}

	public Object getEndDate() {
		// TODO Auto-generated method stub
		GregorianCalendar calendar = new GregorianCalendar(); 
		calendar.setTime(startDate);
		int numberOfDays=16*7-3;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		Date endDate=calendar.getTime();
		return endDate;
	}
	
	

}
