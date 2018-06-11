package com.aldercollege.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aldercollege.controller.DBConfig;
import com.aldercollege.dao.AddOnCoursesDAO;
import com.aldercollege.dao.StudentProfileDAO;
import com.aldercollege.model.AddOnCourses;

public class SampleTest {
	private static DBConfig config;
	@Autowired
	private static AddOnCoursesDAO addOnCoursesDAO;
	
	@BeforeClass	
	public static void setup()
	{
		  config = new DBConfig();
	
	     AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	      context.scan("com.aldercollege");
	     context.refresh();
	     
	
	     addOnCoursesDAO=(AddOnCoursesDAO) context.getBean("addOnCoursesDAO");
	}
	@Test
	public void insertTest()
	{
		AddOnCourses course=new AddOnCourses();
		course.setId("a");
		course.setBaking(true);
		course.setComputer(false);
        course.setMusic(false);
        course.setViolin(false);
		assertTrue("Data inserted in job table",addOnCoursesDAO.addADDonCourse(course));
	}
}
