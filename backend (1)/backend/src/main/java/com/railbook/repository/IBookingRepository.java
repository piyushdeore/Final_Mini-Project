package com.railbook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.railbook.entity.*;


public interface IBookingRepository extends JpaRepository<Bookings, Integer>{
	
	@Query("select booking from Bookings booking where booking.user_id = :e")
	public List<Bookings> getBookingById(@Param("e") Integer user_id);
}
