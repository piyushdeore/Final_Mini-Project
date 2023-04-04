package com.railbook.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Bookings")
public class Bookings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id")
	private int booking_id;

	@Column(name = "no_of_passengers")
	private int no_of_passengers;

	@Column(name = "journey_class")
	private String journey_class;

	@Column(name = "user_id")
	private int user_id;

	@Column(name = "train_id")
	private int train_id;
	
	@Column(name = "passengerList")
	private List<Integer> passengerList;

	public Bookings() {
		
	}
	public Bookings(int booking_id, int no_of_passengers, String journey_class, int user_id, int train_id,
			List<Integer> passengerList) {
		super();
		this.booking_id = booking_id;
		this.no_of_passengers = no_of_passengers;
		this.journey_class = journey_class;
		this.user_id = user_id;
		this.train_id = train_id;
		this.passengerList = passengerList;
	}

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public int getNo_of_passengers() {
		return no_of_passengers;
	}

	public void setNo_of_passengers(int no_of_passengers) {
		this.no_of_passengers = no_of_passengers;
	}

	public String getJourney_class() {
		return journey_class;
	}

	public void setJourney_class(String journey_class) {
		this.journey_class = journey_class;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getTrain_id() {
		return train_id;
	}

	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}

	public List<Integer> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<Integer> passengerList) {
		this.passengerList = passengerList;
	}

	

	
}
