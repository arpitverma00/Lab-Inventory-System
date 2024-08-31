package com.example.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lab.entity.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long>{

}
