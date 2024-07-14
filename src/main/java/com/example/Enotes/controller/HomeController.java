package com.example.Enotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Enotes.entity.User;
import com.example.Enotes.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	@GetMapping("/")
	public String index(){
		return "index";
		
	}
	
	@GetMapping("/register")
	public String register(){
		return "register";
		
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute User user,HttpSession session){
		boolean f= userService.existEmailCheck(user.getEmail());
		if(f) {
			session.setAttribute("msg","Email id already Exist");
		}
		else {
			User saveUser=userService.saveUser(user);
			if(saveUser!=null) {
				session.setAttribute("msg","Regisration Successful");
			}else {
				session.setAttribute("msg","Something wrong on server side");
			}
		}
		
		
		return "redirect:/register";
		
	}
	
	@GetMapping("/signin")
	public String login(){
		return "login";
		
	}
	
}
