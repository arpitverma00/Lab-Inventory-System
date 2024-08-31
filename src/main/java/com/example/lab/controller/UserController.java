package com.example.lab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.lab.entity.User;
import com.example.lab.service.impl.UserServiceImpl;

import jakarta.servlet.http.HttpSession;
@Controller
@RequestMapping()
public class UserController {
	
	@Autowired
    UserServiceImpl userServiceImpl;

	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String users(ModelMap model,HttpSession session) {
		if(session.getAttribute("isLoggedIn")!=null && (Boolean) session.getAttribute("isLoggedIn")) {
		List<User> user=userServiceImpl.getUser();
		model.addAttribute("user",user);
		return "User";
		}
		return "login";
	}

	
	@RequestMapping("/edit_users/{id}")
	public String editUserForm(@PathVariable Long id, Model model) {
		User user = userServiceImpl.getUserById(id);
		model.addAttribute("user", user);
		return "edit_user";
		
	}
	@PostMapping("/edit_users/{id}")
	public String updateUser(@PathVariable Long id,
			@ModelAttribute("user") User user, Model model) {
		
		//get user from database by id
		User existingUser= userServiceImpl.getUserById(id);
		existingUser.setId(user.getId());
		existingUser.setName(user.getName());
		existingUser.setEmail(user.getEmail());
		existingUser.setPassword(user.getPassword());
		

		//save updated user object
		userServiceImpl.updateUser(existingUser);
		return "redirect:/user";
	
	}
	
	
	@GetMapping("/delete_users/{id}")
	public String deleteUser(@PathVariable Long id) {
		userServiceImpl.deleteUsertById(id);
		return "redirect:/user";
		
	}
}
