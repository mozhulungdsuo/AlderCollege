package com.aldercollege.restcontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aldercollege.dao.BASubjectComboDAO;
import com.aldercollege.model.BASubjectCombo;

@RestController
public class BASubjectComboController {
	@Autowired
	BASubjectComboDAO bASubjectComboDAO;
	@PostMapping(value="/addBASubjectCombo")
	public ResponseEntity<String> addBASubjectCombo(@RequestBody BASubjectCombo subjects, HttpSession session)
	{
		subjects.setLastEditor("noone");
	   
	 if (bASubjectComboDAO.addBAStudentSubjectCombination(subjects))
	 {
		 return new  ResponseEntity<String>("Success",HttpStatus.OK);
		}
	 else
	 {
		 return new  ResponseEntity<String>("Failure",HttpStatus.NOT_FOUND);
	 }
	}

}
