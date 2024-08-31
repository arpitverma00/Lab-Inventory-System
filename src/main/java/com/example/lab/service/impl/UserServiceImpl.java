package com.example.lab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.lab.entity.User;
import com.example.lab.repository.UserRepository;
import com.example.lab.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
    
	
	@Override
     public List<User> getUser() {
		
		return userRepository.findAll();
	 }
	
	

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}


	@Override
	public void deleteUsertById(Long id) {
		
		userRepository.deleteById(id);
		
	}




	@Override
	public User updateUser(User user) {
		
		return userRepository.save(user);
		
	}


	




	

	
}

