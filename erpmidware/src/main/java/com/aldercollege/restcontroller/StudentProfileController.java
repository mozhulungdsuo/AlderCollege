package com.aldercollege.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aldercollege.dao.StudentProfileDAO;

@RestController
public class StudentProfileController {
	@Autowired
	StudentProfileDAO studentProfileDAO;
	@GetMapping(value="/demo")
	public ResponseEntity<String> demo()
	{
		return new  ResponseEntity<String>("Demo data",HttpStatus.OK);
	}
}
