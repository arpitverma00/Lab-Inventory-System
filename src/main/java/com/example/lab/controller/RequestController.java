package com.example.lab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lab.entity.Request;
import com.example.lab.service.RequestService;

import jakarta.servlet.http.HttpSession;

@Controller
public class RequestController {
	
	@Autowired
	private RequestService requestService;
	
	@RequestMapping("/requests")
	public String getAllRequests(@RequestParam(value="status",required=false) String status,Model model,HttpSession session) {
		if(session.getAttribute("isLoggedIn")!=null && (Boolean) session.getAttribute("isLoggedIn")) {
		List<Request> requests= requestService.findAll();
		
		if(status!=null && status.equalsIgnoreCase("pending")) {
			requests=requestService.findAllByStatus(status);
		}
		else if(status!=null && status.equalsIgnoreCase("approved")) {
			requests=requestService.findAllByStatus(status);
		}
		else if(status!=null && status.equalsIgnoreCase("rejected")) {
			requests=requestService.findAllByStatus(status);
		}
		else {
			requests=requestService.allRequest();
		}
		
		
		model.addAttribute("requests",requests);
		System.out.println(requests);
		return "Requests";
		}
		return "login";
		
	}
	
	
	@GetMapping("/approve/{id}")
	public String approveRequest(@PathVariable Long id) {
		boolean b=requestService.approveRequest(id);
		if(b) {
			System.out.println("Success");
			return "redirect:/requests";
		}else {
			System.out.println("error occured!");
			return "redirect:/requests";
		}
	}
	
	@GetMapping("/reject/{id}")
	public String rejectRequest(@PathVariable Long id) {
		boolean b=requestService.rejectRequest(id);
		if(b) {
			System.out.println("Successfully Rejected!!");
			return "redirect:/requests";
		}else {
			System.out.println("error occured");
			return "redirect:/requests";
		}
	}

}
