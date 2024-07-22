package com.example.noticeboard.service;

import org.springframework.ui.Model;

import com.example.noticeboard.dto.UserDto;

public interface UserService {
	public void getInfo(Model model);
	public void addUser(UserDto dto);
}
