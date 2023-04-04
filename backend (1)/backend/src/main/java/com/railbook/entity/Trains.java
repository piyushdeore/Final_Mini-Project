package com.railbook.entity;

import java.sql.Date;
import java.util.*;

import jakarta.persistence.*;




@Entity
@Table(name="Trains")
public class Trains {
	@Id
	private int train_id;
	
	@Column(name="train_name")
	private String train_name;
	
	@Column(name="source_station")
	private String source_station;
	
	@Column(name="destination_station")
	private String destination_station;
	
	@Column(name="departure_time")
	private String departure_time;
	
	@Column(name="arrival_time")
	private String arrival_time;
	
	@Column(name="departure_date")
	private Date departure_date;
	
	@Column(name="arrival_date")
	private Date arrival_date;
	
	@Column(name="no_of_AC")
	private int no_of_AC;
	
	@Column(name="no_of_Seater")
	private int no_of_Seater;
	
	@Column(name="no_of_Sleeper")
	private int no_of_Sleeper;

	
	
	
	
	Trains(){}





	public Trains(int train_id, String train_name, String source_station, String destination_station,
			String departure_time, String arrival_time, Date departure_date, Date arrival_date, int no_of_AC,
			int no_of_Seater, int no_of_Sleeper) {
		super();
		this.train_id = train_id;
		this.train_name = train_name;
		this.source_station = source_station;
		this.destination_station = destination_station;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.departure_date = departure_date;
		this.arrival_date = arrival_date;
		this.no_of_AC = no_of_AC;
		this.no_of_Seater = no_of_Seater;
		this.no_of_Sleeper = no_of_Sleeper;
	}





	public int getTrain_id() {
		return train_id;
	}





	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}





	public String getTrain_name() {
		return train_name;
	}





	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}





	public String getSource_station() {
		return source_station;
	}





	public void setSource_station(String source_station) {
		this.source_station = source_station;
	}





	public String getDestination_station() {
		return destination_station;
	}





	public void setDestination_station(String destination_station) {
		this.destination_station = destination_station;
	}





	public String getDeparture_time() {
		return departure_time;
	}





	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}





	public String getArrival_time() {
		return arrival_time;
	}





	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}





	public Date getDeparture_date() {
		return departure_date;
	}





	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}





	public Date getArrival_date() {
		return arrival_date;
	}





	public void setArrival_date(Date arrival_date) {
		this.arrival_date = arrival_date;
	}





	public int getNo_of_AC() {
		return no_of_AC;
	}





	public void setNo_of_AC(int no_of_AC) {
		this.no_of_AC = no_of_AC;
	}





	public int getNo_of_Seater() {
		return no_of_Seater;
	}





	public void setNo_of_Seater(int no_of_Seater) {
		this.no_of_Seater = no_of_Seater;
	}





	public int getNo_of_Sleeper() {
		return no_of_Sleeper;
	}





	public void setNo_of_Sleeper(int no_of_Sleeper) {
		this.no_of_Sleeper = no_of_Sleeper;
	}





	@Override
	public String toString() {
		return "Trains [train_id=" + train_id + ", train_name=" + train_name + ", source_station=" + source_station
				+ ", destination_station=" + destination_station + ", departure_time=" + departure_time
				+ ", arrival_time=" + arrival_time + ", departure_date=" + departure_date + ", arrival_date="
				+ arrival_date + ", no_of_AC=" + no_of_AC + ", no_of_Seater=" + no_of_Seater + ", no_of_Sleeper="
				+ no_of_Sleeper + "]";
	}


}
