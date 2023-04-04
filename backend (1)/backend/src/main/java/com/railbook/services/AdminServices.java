package com.railbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railbook.entity.Admin;
import com.railbook.entity.Users;
import com.railbook.repository.AdminRepository;
import com.railbook.repository.IUserRepository;


@Service
public class AdminServices {

	@Autowired
	private AdminRepository adminrepo;
	
	public Admin registerAdmin(Admin user) {
		return adminrepo.save(user);
	}
	
	public Admin loginCheck(String email,String pass)
	{
		return adminrepo.check(email, pass);
	}
}
