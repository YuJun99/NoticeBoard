package com.example.noticeboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.noticeboard.dto.UserDto;
import com.example.noticeboard.service.UserService;

@Controller
public class UserController {
	
	@Autowired UserService service;
	
	@GetMapping("/user/signupform")
	public String signupform() {
		return "user/signupform";
	}
	
	@PostMapping("/user/signup")
	public String signup(UserDto dto) {
		service.addUser(dto);
		return "user/signup";
	}
}
