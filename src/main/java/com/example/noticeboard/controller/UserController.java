package com.example.noticeboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@GetMapping("/user/signupform")
	public String signupform() {
		return "user/signupform";
	}
	
	@PostMapping("/user/signup")
	public String signup() {
		return "user/signup";
	}
}
