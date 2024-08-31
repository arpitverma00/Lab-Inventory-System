package com.example.lab.service;

import com.example.lab.entity.Admin;


public interface AdminService {
    Admin getAdmin(String email);
	
	void save(Admin admin);
	 Admin getadmin(String email);
	Admin updatepassword(Admin admin);
}

