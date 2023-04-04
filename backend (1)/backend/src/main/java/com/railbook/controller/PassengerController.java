package com.railbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.railbook.entity.Passengers;
import com.railbook.services.PassengerService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PassengerController {

	@Autowired
	private PassengerService passService;
	
	@PostMapping(path="/registerPassenger")
	public int registerPassenger(@RequestBody Passengers passObj) {
		 return passService.registerPassenger(passObj);
	}
	
	@GetMapping("/getPasseneger/{id}")
	public Passengers getPassenger(@PathVariable int id) {
		return passService.getPassenger(id);
	}
	
}
