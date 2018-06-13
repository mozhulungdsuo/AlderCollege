package com.aldercollege.restcontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aldercollege.dao.UsersDAO;

import com.aldercollege.model.Users;

@RestController
public class UsersController {
	@Autowired
	UsersDAO usersDAO;
	@PostMapping(value="/addUsers")
	public ResponseEntity<String> addUsers(@RequestBody Users user, HttpSession session)
	{
	      
	 if (usersDAO.addUsers(user))
	 {
		 return new  ResponseEntity<String>("Success",HttpStatus.OK);
		}
	 else
	 {
		 return new  ResponseEntity<String>("Failure",HttpStatus.NOT_FOUND);
	 }
	}
}
