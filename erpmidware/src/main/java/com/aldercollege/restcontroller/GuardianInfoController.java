package com.aldercollege.restcontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aldercollege.dao.GuardianInfoDAO;

import com.aldercollege.model.GuardianInfo;

@RestController
public class GuardianInfoController {
	@Autowired
	GuardianInfoDAO guardianInfoDAO;
	@PostMapping(value="/addGuardianInfo")
	public ResponseEntity<String> addGuardianInfo(@RequestBody GuardianInfo guardian, HttpSession session)
	{
		
	   
	 if (guardianInfoDAO.addGuardian(guardian))
	 {
		 return new  ResponseEntity<String>("Success",HttpStatus.OK);
		}
	 else
	 {
		 return new  ResponseEntity<String>("Failure",HttpStatus.NOT_FOUND);
	 }
	}
	

}
