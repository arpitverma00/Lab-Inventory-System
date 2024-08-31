package com.example.lab.service;

import java.util.List;

import com.example.lab.entity.Request;

public interface RequestService {
	
	List<Request> findAll();
	boolean approveRequest(Long id);
	
	boolean rejectRequest(Long id);
	
	List<Request> findAllByStatus(String status);
	List<Request> allRequest();

}
