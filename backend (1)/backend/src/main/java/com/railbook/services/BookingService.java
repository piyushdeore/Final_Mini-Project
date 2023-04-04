package com.railbook.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railbook.repository.*;
import com.railbook.entity.*;

@Service
public class BookingService {
	
	@Autowired
	private IBookingRepository bookingRepository;
	
	public Bookings bookTicket(Bookings book) {
		return bookingRepository.save(book);
	}
	
	public List<Bookings> getAllBookings(){
		return bookingRepository.findAll();
	}
	
	public void deleteTicket(int id) {
		bookingRepository.deleteById(id);
	}
	
	public List<Integer> getPassengers(int id){
		Optional<Bookings> passOptional = bookingRepository.findById(id);
		Bookings ticket = passOptional.get();
		return ticket.getPassengerList();
	}
	
	public List<Bookings> getBookingsById(Integer id){
		return bookingRepository.getBookingById(id);
	}

}
