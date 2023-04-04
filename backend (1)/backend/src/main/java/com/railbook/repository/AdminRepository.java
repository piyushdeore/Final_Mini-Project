package com.railbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.railbook.entity.Admin;
import com.railbook.entity.Users;

public interface AdminRepository extends JpaRepository<Admin, Integer>{
	@Query("select user from Admin user where user.email = :e AND user.password = :p")
	public Admin check(@Param("e") String email, @Param("p") String pass);
}
