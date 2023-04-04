package com.railbook.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Passengers")
public class Passengers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "passenger_id")
	private int passenger_id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "gender")
	private String gender;


	Passengers() {

	}


	public Passengers(int passenger_id, String name, int age, String gender) {
		super();
		this.passenger_id = passenger_id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	public int getPassenger_id() {
		return passenger_id;
	}


	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

}
