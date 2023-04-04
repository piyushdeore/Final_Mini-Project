package com.railbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.railbook.entity.Users;

public interface IUserRepository extends JpaRepository<Users, Integer> {

	
	@Query("select user from Users user where user.email = :e AND user.password = :p")
	public Users check(@Param("e") String email, @Param("p") String pass);
}
