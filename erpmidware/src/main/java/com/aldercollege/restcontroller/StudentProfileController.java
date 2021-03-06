package com.aldercollege.restcontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aldercollege.dao.StudentProfileDAO;
import com.aldercollege.model.StudentProfile;

@RestController
public class StudentProfileController {
	@Autowired
	StudentProfileDAO studentProfileDAO;
	@GetMapping(value="/demo")
	public ResponseEntity<String> demo()
	{
		return new  ResponseEntity<String>("Demo data",HttpStatus.OK);
	}
	
	
	
	@PostMapping(value="/addStudentProfile")
	public ResponseEntity<String> addStudentProfile(@RequestBody StudentProfile student, HttpSession session)
	{
	      
	 if (studentProfileDAO.addStudent(student))
	 {
		 return new  ResponseEntity<String>("Success",HttpStatus.OK);
		}
	 else
	 {
		 return new  ResponseEntity<String>("Failure",HttpStatus.NOT_FOUND);
	 }
	}
}
