package com.railbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.railbook.repository.*;
import com.railbook.entity.*;

@Service
public class UserService {
	
	@Autowired
	private IUserRepository userRepository;
	
	public Users registerUser(Users user) {
		return userRepository.save(user);
	}
	
	public Users loginCheck(String email,String pass)
	{
		return userRepository.check(email, pass);
	}

}
