package com.railbook.controller;

import java.util.List;
import com.railbook.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.railbook.entity.Bookings;
import com.railbook.entity.Users;
import com.railbook.repository.IBookingRepository;
import com.railbook.repository.IUserRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BookingController {
	
	@Autowired
	private BookingService bookingServie;
	
	@Autowired
	private PassengerService passServie;
	
	@GetMapping("/getAllBookings")
	public List<Bookings> getAllBookings(){
		return bookingServie.getAllBookings();
	}
	
	@PostMapping(path="/bookTicket")
	public Bookings bookTicket(@RequestBody Bookings bookObj) {
		return bookingServie.bookTicket(bookObj);
	}
	
	@DeleteMapping(path="/deleteTicket/{id}")
	public void deleteTicket(@PathVariable int id) {
		List<Integer> passlist = bookingServie.getPassengers(id);
		
		for(int i=0; i<passlist.size(); i++) {
			passServie.deletePassenger(passlist.get(i));
		}
		bookingServie.deleteTicket(id);
	}
	
	@GetMapping("/getBookingsByid/{id}")
	public List<Bookings> getBookingsById(@PathVariable int id){
		return bookingServie.getBookingsById(id);
	}

}
