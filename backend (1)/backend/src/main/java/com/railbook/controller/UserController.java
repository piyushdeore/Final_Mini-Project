package com.railbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.railbook.entity.Passengers;
import com.railbook.entity.Users;
import com.railbook.repository.IUserRepository;

import com.railbook.services.*;
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping(path="/registerUser")
	public Users registerUser(@RequestBody Users userObj) {
		 return userService.registerUser(userObj);
	}
	 @GetMapping(path="/loginUser/{email}/{pass}")
	 public Users loginUser(@PathVariable String email, @PathVariable String pass)
	 {
		 return userService.loginCheck(email, pass);
	 }
	
	

}
