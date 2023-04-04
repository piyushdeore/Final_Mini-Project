package com.railbook.controller;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.railbook.services.*;
//import com.railbook.entity.*;
//
//@RestController
//@CrossOrigin(allowedHeaders = "", origins = "")
//public class TrainController {
//	
//	@Autowired
//	private TrainService trainService;
//	
//	@PostMapping(path="/addTrain")
//	public Trains addTrain(@RequestBody Trains trainObj) {
//		return trainService.registerTrain(trainObj);
//	}
//
//}

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railbook.entity.Trains;
import com.railbook.services.TrainService;

@RestController
@CrossOrigin(origins="http://localhost:4200")

public class Traincontroller {
	@Autowired
	private TrainService trainServ;
	
	
	
	@PostMapping(path="/addTrain")
	public String addTrain(@RequestBody Trains train)
	{
		trainServ.addTrain(train);
		return "Train Added succesfully";
	}
	@GetMapping(path="/getTrains")
	public List<Trains> getTrains()
	{
		return trainServ.getAll();
	}
	
	@GetMapping(path="/getTrainName/{name}/{id}")
	public List<Trains> getTrains(@PathVariable String name , @PathVariable int id)
	{
		System.out.println(name);
		return trainServ.getTrainsId(name,id);
	}
	

	
	
	@GetMapping(path="/getTrainSD/{src}/{dest}/{date}")
	public List<Trains> getTrains(@PathVariable String src , @PathVariable String dest, @PathVariable Date date)
	{
		
		return trainServ.getTrainsSD(src,dest,date);
	}
	
	@DeleteMapping(path="/cancel/{id}")
	public String cancel(@PathVariable int id)
	{
		trainServ.cancelTrain(id);
		return "Record delteed succsefully";
	}
	
	
	@PutMapping(path="/updateSeats/{count}/{class_type}")
	public void updateACSeats(@PathVariable int count,@PathVariable String class_type,@RequestBody Trains train)
	{
		if(class_type.equals("AC")) 
		{
			
			trainServ.updateTrainAC(train,count);
			
			
		}
		if(class_type.equals("Sleeper")) 
		{
			
			trainServ.updateTrainSleeper(train,count);
			
			
		}
		if(class_type.equals("Seater")) 
		{
			
			trainServ.updateTrainSeater(train,count);
			
			
		}
		
	}
	
	@GetMapping("/getTrain/{id}")
	public Trains getPassenger(@PathVariable int id) {
		return trainServ.getTrain(id);
	}

	
}
