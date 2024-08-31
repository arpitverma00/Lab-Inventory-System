package com.example.lab.service.impl;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab.entity.Equipment;
import com.example.lab.entity.Request;
import com.example.lab.repository.EquipmentRepository;
import com.example.lab.repository.RequestRepository;
import com.example.lab.service.RequestService;

@Service
public class RequestServiceImpl implements RequestService{
	
	
	@Autowired
	RequestRepository requestRepository;
	
	@Autowired
	EquipmentRepository equipmentRepository;
	
	@Override
	public List<Request> findAll(){
		return requestRepository.findAll();
	}
	
	
	@Override
	public boolean approveRequest(Long id) {
		java.util.Optional<Request> req=requestRepository.findById(id);
		Request approveReq=null;
		approveReq=req.orElseGet(null);
		try {
			if(approveReq!=null) {
				
				@SuppressWarnings("deprecation")
				Equipment equipment=equipmentRepository.getById(approveReq.getpId());
				if(approveReq.getQuantity()>=equipment.getQuantity()) {
					
					approveReq.setStatus("Insufficient quantity");
					Request req1=requestRepository.save(approveReq);
					System.out.println(req1);
				}else {
					equipment.setQuantity(equipment.getQuantity()-approveReq.getQuantity());
					equipmentRepository.save(equipment);
					approveReq.setStatus("approved");
					Request req1=requestRepository.save(approveReq);
					System.out.println(req1);
				}
				return true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return false;
		
	}
	
	
	@Override
	public boolean rejectRequest(Long id) {
		java.util.Optional<Request> req= requestRepository.findById(id);
		Request rejectReq=null;
		rejectReq=req.orElseGet(null);
		if(rejectReq!=null) {
			rejectReq.setStatus("rejected");
			Request req1=requestRepository.save(rejectReq);
			return true;
		}
		return false;
		}


	@Override
	public List<Request> findAllByStatus(String status) {
		// TODO Auto-generated method stub
		return requestRepository.findAllByStatus(status);
	}


	@Override
	public List<Request> allRequest() {
		// TODO Auto-generated method stub
		return requestRepository.findAll();
	}
	
	
}
