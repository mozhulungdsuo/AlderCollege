package com.aldercollege.restcontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aldercollege.dao.AddOnCoursesDAO;
import com.aldercollege.model.AddOnCourses;

@RestController
public class AddOnCoursesController {
	@Autowired
	AddOnCoursesDAO addOnCoursesDAO;
	@PostMapping(value="/addAddOnCourses")
	public ResponseEntity<String> addAddOnCourses(@RequestBody AddOnCourses courses, HttpSession session)
	{
	   courses.setLastEditor("noone");
	 if (addOnCoursesDAO.addADDonCourse(courses))
	 {
		 return new  ResponseEntity<String>("Success",HttpStatus.OK);
		}
	 else
	 {
		 return new  ResponseEntity<String>("Failure",HttpStatus.NOT_FOUND);
	 }
	}
}
