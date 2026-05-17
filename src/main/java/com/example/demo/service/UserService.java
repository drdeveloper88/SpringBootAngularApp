package com.example.demo.service;

import java.util.List;

import com.exmple.demo.model.User;

public interface UserService {

	public User insert(User userVO);

	public List<User> findAll();

	public void delete(int id);

	public User findById(int id);

	public User updateUser(int id, User userVO);
}