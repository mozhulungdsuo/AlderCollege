package com.aldercollege.restcontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aldercollege.dao.StudentPreviousHistoryDAO;
import com.aldercollege.model.StudentPreviousHistory;


@RestController
public class StudentPreviousHistoryController {
	@Autowired
	StudentPreviousHistoryDAO studentPreviousHistoryDAO;
	@PostMapping(value="/addStudentPreviousHistory")
	public ResponseEntity<String> addStudentPreviousHistory(@RequestBody StudentPreviousHistory previous, HttpSession session)
	{
	 if (studentPreviousHistoryDAO.addPreviousAcademicHistory(previous))
	 {
		 return new  ResponseEntity<String>("Success",HttpStatus.OK);
		}
	 else
	 {
		 return new  ResponseEntity<String>("Failure",HttpStatus.NOT_FOUND);
	 }
	}

}
