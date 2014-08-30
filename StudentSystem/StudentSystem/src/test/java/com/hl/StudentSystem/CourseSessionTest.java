package com.hl.StudentSystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;
public class CourseSessionTest extends TestCase {

	public void testCreate(){
	
		
		CourseSession session=new CourseSession("ENGL","101");
		
		assertEquals("ENGL",session.getDepartment());
		assertEquals("101",session.getNumber());
		assertEquals(0,session.getNumberOfStudents());
	}
	
	public void testEnrollStudents(){
		CourseSession session=new CourseSession("ENGL","101");
		
		Student student1=new Student("Cain DiVoe");
		session.enroll(student1);
		assertEquals(1,session.getNumberOfStudents());
		//ArrayList<Student> allStudents=session.getAllStudents();
		//assertEquals(1,allStudents.size());
		assertEquals(student1,session.get(0));
		
		Student student2=new Student("huang liang");
		session.enroll(student2);
		assertEquals(2,session.getNumberOfStudents());
		//assertEquals(2,allStudents.size());
		assertEquals(student1,session.get(0));
		assertEquals(student2,session.get(1));
		
	}
	
	
	public void testCourseDates(){
		
		int year =103;
		int month=0;
		int date=6;
		Date startDate = createDate(2003,1,6);
		CourseSession session= new CourseSession("ABCD","200",startDate);
		year=103;
		month=3;
		date=25;
		Date sixteenWeeksOut=new Date(year,month,date);
		assertEquals(sixteenWeeksOut,session.getEndDate());
	}
	
	Date createDate(int year,int month,int date){
		GregorianCalendar g= new GregorianCalendar();
		g.clear();
		g.set(Calendar.YEAR, year);
		g.set(Calendar.MONTH, month-1);
		g.set(Calendar.DATE, date);

		return g.getTime();
	}
}
