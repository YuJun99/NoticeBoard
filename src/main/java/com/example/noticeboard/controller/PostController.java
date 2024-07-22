package com.example.noticeboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.noticeboard.dto.PostDto;
import com.example.noticeboard.repository.PostDao;
import com.example.noticeboard.service.PostService;

@Controller
public class PostController {
	
	@Autowired private PostService service;
	
	@PostMapping("/post/list")
	public String list(Model model) {
		service.PostList(model);
		return "post/list";
	}
}
