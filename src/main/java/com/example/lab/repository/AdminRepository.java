package com.example.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lab.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{
	Admin findByEmail(String email);


}

