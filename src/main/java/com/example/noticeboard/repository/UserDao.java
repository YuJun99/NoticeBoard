package com.example.noticeboard.repository;

import com.example.noticeboard.dto.UserDto;

public interface UserDao {
	public UserDto getData(String userName);
	public void insert(UserDto dto);
}
