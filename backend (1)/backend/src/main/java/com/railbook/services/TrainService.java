package com.railbook.services;

//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.railbook.repository.*;
//import com.railbook.entity.*;
//import java.util.Optional;
//@Service
//public class TrainService {
//	@Autowired
//	private ITrainRepository trainRepository;
//	
//	public Trains registerTrain(Trains trains) {
//		return trainRepository.save(trains);
//	}
//
//}


import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railbook.entity.Trains;
import com.railbook.repository.ITrainRepository;

@Service
public class TrainService {
	@Autowired
	ITrainRepository trainRepo;
	
	public Trains addTrain(Trains train)
	{
		return trainRepo.save(train);
	}
	public List<Trains> getAll()
	{
		return trainRepo.findAll();
	}

	
	public List<Trains> getTrainsId(String name,int id)
	{
		return trainRepo.getTrainNameId(name,id);
	}
	public List<Trains> getTrainsSD(String src,String dest,Date date)
	{
		return trainRepo.getTrainNameSD(src,dest,date);
	}
	public void cancelTrain(int id)
	{
		trainRepo.deleteById(id);
	}
	
	
	public Trains updateTrainSleeper(Trains train,int x)
	{
		Optional<Trains> T1 = trainRepo.findById(train.getTrain_id());
		
		
			Trains updatedTrain = T1.get();
			updatedTrain.setNo_of_Sleeper(train.getNo_of_Sleeper()-x);
			System.out.print(updatedTrain.getNo_of_Sleeper());
			return trainRepo.save(updatedTrain);
		
		
		
	}
	
	public Trains updateTrainSeater(Trains train,int x)
	{
		Optional<Trains> T1 = trainRepo.findById(train.getTrain_id());
		
		
			Trains updatedTrain = T1.get();
			updatedTrain.setNo_of_Seater(train.getNo_of_Seater()-x);
			System.out.print(updatedTrain.getNo_of_Seater());
			return trainRepo.save(updatedTrain);
		
		
		
	}
	
	public Trains updateTrainAC(Trains train,int x)
	{
		System.out.print("in ac");
		Optional<Trains> T1 = trainRepo.findById(train.getTrain_id());
		
		
			Trains updatedTrain = T1.get();
			updatedTrain.setNo_of_AC(train.getNo_of_AC()-x);
			System.out.print(updatedTrain.getNo_of_AC());
			return trainRepo.save(updatedTrain);
		
		
		
	}
	
	public Trains getTrain(int id) {
		Optional<Trains> optTrain = trainRepo.findById(id);
		return optTrain.get();
	}
	
}
