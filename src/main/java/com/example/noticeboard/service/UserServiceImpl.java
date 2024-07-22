package com.example.noticeboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.noticeboard.dto.UserDto;
import com.example.noticeboard.repository.UserDao;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired private UserDao dao;
	@Autowired private PasswordEncoder encoder;

	@Override
	public void getInfo(Model model) {
		String userName = SecurityContextHolder.getContext().getAuthentication().getName();
		UserDto dto = dao.getData(userName);
		model.addAttribute("dto", dto);
	}

	@Override
	public void addUser(UserDto dto) {
		String encodedPwd = encoder.encode(dto.getPassword());
		dto.setPassword(encodedPwd);
		
		dao.insert(dto);
	}

}
