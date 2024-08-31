package com.example.lab.service;

import java.util.List;

import com.example.lab.entity.Equipment;

public interface EquipmentService {
    List<Equipment> getAllEquipments();
    
    Equipment save(Equipment equipment); 
    
    Equipment getEquipmentById(Long id);
	Equipment updateEquipment(Equipment equipment);
	
	void deleteEquipmentById(Long id);

	
}
