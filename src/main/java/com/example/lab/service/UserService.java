package com.example.lab.service;

import java.util.List;

import com.example.lab.entity.User;


public interface UserService {


	User getUserById(Long id);

	User updateUser(User user);

	void deleteUsertById(Long id);


	List<User> getUser();
	
}
