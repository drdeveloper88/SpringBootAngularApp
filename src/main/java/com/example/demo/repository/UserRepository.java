package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exmple.demo.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
}