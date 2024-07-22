package com.example.noticeboard.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.noticeboard.dto.UserDto;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired private SqlSession session;

	@Override
	public UserDto getData(String userName) {
		
		return session.selectOne("user.getData", userName);
	}

	@Override
	public void insert(UserDto dto) {
		
		session.insert("user.insert", dto);
	}
	
}
