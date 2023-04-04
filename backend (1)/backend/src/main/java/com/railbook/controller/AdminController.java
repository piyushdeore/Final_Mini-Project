package com.railbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.railbook.entity.Admin;
import com.railbook.entity.Users;
import com.railbook.services.AdminServices;
import com.railbook.services.UserService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AdminController {
	
	@Autowired
	private AdminServices adminServ;
	
	
	@PostMapping(path="/registerAdmin")
	public Admin registerUser(@RequestBody Admin adminObj) {
		 return adminServ.registerAdmin(adminObj);
	}
	 @GetMapping(path="/loginAdmin/{email}/{pass}")
	 public Admin loginAdmin(@PathVariable String email, @PathVariable String pass)
	 {
		 return adminServ.loginCheck(email, pass);
	 }
}
