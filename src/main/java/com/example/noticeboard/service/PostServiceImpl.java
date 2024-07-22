package com.example.noticeboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.noticeboard.dto.PostDto;
import com.example.noticeboard.repository.PostDao;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired PostDao dao;

	@Override
	public void PostList(Model model) {
		List<PostDto> list = dao.getList();
		model.addAttribute("list", list);
	}
}
