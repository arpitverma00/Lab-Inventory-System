package com.example.lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.lab.entity.Equipment;
import com.example.lab.service.EquipmentService;

import jakarta.servlet.http.HttpSession;
@Controller
public class EquipmentController {
	
	private EquipmentService EquipmentService;

	public EquipmentController(com.example.lab.service.EquipmentService equipmentService) {
		super();
		EquipmentService = equipmentService;
	}
	
	
	@RequestMapping(value="/Equipments",method=RequestMethod.GET)
	public String equipments(HttpSession session) {
		if(session.getAttribute("isLoggedIn")!=null && (Boolean) session.getAttribute("isLoggedIn")) {
			return "Equipments";
		}
		
		return "login";
	}
	
	
	@GetMapping("/equipments")
	public String listEquipments(Model model,HttpSession session ) {
		if(session.getAttribute("isLoggedIn")!=null && (Boolean) session.getAttribute("isLoggedIn")) {
		model.addAttribute("equipments", EquipmentService.getAllEquipments());
		return "Equipments";
		}
		return "login";
	}
		
	@GetMapping("add_equipment")
	public String addEquipmentForm(Model model,HttpSession session) {
	if(session.getAttribute("isLoggedIn")!=null && (Boolean) session.getAttribute("isLoggedIn")){
		Equipment equipment =new Equipment();
		model.addAttribute("equipment", equipment);
		return "add_equipment";
	}
	return "login";
	}
	@PostMapping("/equipments")
	public String saveEquipment(@ModelAttribute("equipment") Equipment equipment) {
		EquipmentService.save(equipment);
		return "redirect:/equipments";
		
	}
//	@GetMapping("/edit_equipments")
//	public String edit() {
//		return "update";
//	}
	
	@RequestMapping("/edit_equipments/{id}")
	public String editEquipmentForm(@PathVariable Long id, Model model) {
		Equipment equipment = EquipmentService.getEquipmentById(id);
		model.addAttribute("equipment", equipment);
		return "edit_equipment";
		
	}
	@PostMapping("/edit_equipments/{id}")
	public String updateEquipment(@PathVariable Long id,
			@ModelAttribute("equipment") Equipment equipment, Model model) {
		
		//get equipment from database by id
		Equipment existingEquipment= EquipmentService.getEquipmentById(id);
		existingEquipment.setId(equipment.getId());
		existingEquipment.setName(equipment.getName());
		existingEquipment.setBrand(equipment.getBrand());
		existingEquipment.setPrice(equipment.getPrice());
		existingEquipment.setQuantity(equipment.getQuantity());
		
		//save updated equipment object
		EquipmentService.updateEquipment(existingEquipment);
		return "redirect:/equipments";
	
	}
	
	
	@GetMapping("/delete_equipments/{id}")
	public String deleteEquipment(@PathVariable Long id) {
		EquipmentService.deleteEquipmentById(id);
		return "redirect:/equipments";
		
	}
}
