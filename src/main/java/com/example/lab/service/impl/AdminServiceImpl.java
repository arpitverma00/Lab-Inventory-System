package com.example.lab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab.entity.Admin;
import com.example.lab.repository.AdminRepository;
import com.example.lab.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	 AdminRepository adminRepository;
    
	@Override
	public void save(Admin admin) {
		adminRepository.save(admin);
		
	}

	@Override
	public Admin getAdmin(String email) {
		Admin admin=adminRepository.findByEmail(email);
		// TODO Auto-generated method stub
		return admin;
	}
	
	@Override
	public Admin updatepassword(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public Admin getadmin(String email) {
		Admin admin=adminRepository.findByEmail(email);
		return admin;
	}

	public Object isEmailAlreadyInUse(String email) {
		Admin admin=adminRepository.findByEmail(email);
		return admin;
	}

}
