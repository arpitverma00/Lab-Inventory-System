package com.example.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lab.entity.Admin;
import com.example.lab.service.impl.AdminServiceImpl;

import jakarta.servlet.http.HttpSession;



@Controller
@RequestMapping()
public class AdminController {
	
	@Autowired
	AdminServiceImpl adminServiceImpl;
	
	
	@GetMapping("/")
	public String ViewHone() {
		return "home";
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String welcomeAdminPage(ModelMap model,@RequestParam String email,@RequestParam String password,HttpSession session){
	Admin admin=adminServiceImpl.getAdmin(email);
	if(admin!=null && admin.getPassword().equals(password)) {
		session.setAttribute("admin",admin);
		session.setAttribute("isLoggedIn",true);
	   return "Welcome";
	}

	model.put("errorMsg","Please provide the correct email and password");
	return "login";
	}
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String welcome(HttpSession session) {
		if(session.getAttribute("isLoggedIn")!=null && (Boolean)session.getAttribute("isLoggedIn")) {
			return "Welcome";	
		}
		else {
			return "login";
		}
	}
	
	@RequestMapping(value="/signup",method=RequestMethod.GET)

	public String signup() {

	return "signup";

	}



	@RequestMapping(value="/signup",method=RequestMethod.POST)

	public String addUser(@ModelAttribute Admin admin,ModelMap model) {
		if(adminServiceImpl.isEmailAlreadyInUse(admin.getEmail())!=null) {
			model.addAttribute("errorMsg","Email Already Registered!");
			return "signup";
		}

	adminServiceImpl.save(admin);
	model.addAttribute("successMsg","Admin Registered Successfully!");
    return "redirect:/login";
    }
	
	@RequestMapping(value="/resetPassword",method=RequestMethod.GET)

	public String updatePassword() {
	return "resetPassword";


	}


	@PostMapping("/resetPassword/{email}")

	public String resetPassword(@RequestParam String email,@ModelAttribute("update") Admin admin, Model model) {

	Admin admin1= adminServiceImpl.getAdmin(email);

	System.out.println(admin1);
	admin1.setPassword(admin.getPassword());
	

	adminServiceImpl.updatepassword(admin1);

	    return "redirect:/login";
	    }
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();	
		return "home";
		}
	

}
