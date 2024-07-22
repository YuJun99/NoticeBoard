package com.example.noticeboard.repository;

import java.util.List;

import com.example.noticeboard.dto.PostDto;

public interface PostDao {
	public List<PostDto> getList();
	public PostDto getData(int num);
}
