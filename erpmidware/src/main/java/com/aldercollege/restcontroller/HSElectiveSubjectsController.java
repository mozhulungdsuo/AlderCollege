package com.aldercollege.restcontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aldercollege.dao.HSElectiveSubjectsDAO;
import com.aldercollege.model.HSElectiveSubjects;


@RestController
public class HSElectiveSubjectsController {
	@Autowired
	HSElectiveSubjectsDAO hSElectiveSubjectsDAO;
	@PostMapping(value="/addHSElectiveSubjects")
	public ResponseEntity<String> addHSElectiveSubjects(@RequestBody HSElectiveSubjects elective, HttpSession session)
	{
	   elective.setLastEditor("noone");
	 if (hSElectiveSubjectsDAO.addElective(elective))
	 {
		 return new  ResponseEntity<String>("Success",HttpStatus.OK);
		}
	 else
	 {
		 return new  ResponseEntity<String>("Failure",HttpStatus.NOT_FOUND);
	 }
	}

}
