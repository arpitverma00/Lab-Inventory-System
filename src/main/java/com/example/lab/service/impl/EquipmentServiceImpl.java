package com.example.lab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab.entity.Equipment;
import com.example.lab.service.EquipmentService;
import com.example.lab.repository.EquipmentRepository;

@Service
public class EquipmentServiceImpl implements EquipmentService{
	
    @Autowired
	 EquipmentRepository equipmentRepository;

	@Override
	public List<Equipment> getAllEquipments() {
		// TODO Auto-generated method stub
		return equipmentRepository.findAll();
	}
	@Override
	public Equipment save(Equipment equipment) {
		return equipmentRepository.save(equipment);
	}
	@Override
	public Equipment getEquipmentById(Long id) {
		
		return equipmentRepository.findById(id).get();
	}
	@Override
	public Equipment updateEquipment(Equipment equipment) {
		
		return equipmentRepository.save(equipment);
	}
	@Override
	public void deleteEquipmentById(Long id) {
		equipmentRepository.deleteById(id);
		
	}
	
	

//	@Override
//	public Object getAllEquipments() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public List<Equipment> getAllEquipments() {
//		// TODO Auto-generated method stub
//		return equipmentRepository.findAll();
//	}
}
