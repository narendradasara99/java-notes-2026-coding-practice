package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserRegister;
import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<UserRegister, Integer>{

	
	Optional<UserRegister> findByEmail(String email);
}
