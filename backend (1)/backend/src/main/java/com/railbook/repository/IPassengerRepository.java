package com.railbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.railbook.entity.Passengers;

public interface IPassengerRepository extends JpaRepository<Passengers, Integer> {

}
