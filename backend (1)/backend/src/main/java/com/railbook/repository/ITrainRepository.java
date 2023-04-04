package com.railbook.repository;



//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import com.railbook.entity.*;
//
//public interface ITrainRepository extends JpaRepository<Trains, Integer>{
//	Optional<Trains> findByName(String name);
//}


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.railbook.entity.Trains;

public interface ITrainRepository extends JpaRepository<Trains, Integer>{
	
	
	
	//List<Trains> findbySrcAndDest(String source_station,String destination_station);
	@Query("select u from Trains u where u.train_name=:N ")
	public List<Trains> getTrainName(@Param("N") String name); 
	
	@Query("select u from Trains u where u.train_name=:N AND u.train_id=:id ")
	public List<Trains> getTrainNameId(@Param("N") String name,@Param("id") int id); 

	@Query("select u from Trains u where u.source_station=:N AND u.destination_station=:id  AND u.departure_date=:d")
	public List<Trains> getTrainNameSD(@Param("N") String name,@Param("id") String id,@Param("d") Date date); 

}
