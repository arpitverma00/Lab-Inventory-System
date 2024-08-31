package com.example.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab.entity.Request;


public interface RequestRepository extends JpaRepository<Request, Long>{

	Request getRequestById(Long id);
	List<Request> findAllByStatus(String status);

}
