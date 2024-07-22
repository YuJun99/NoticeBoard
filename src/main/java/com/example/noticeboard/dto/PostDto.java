package com.example.noticeboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

	/*	CREATE TABLE post_table(
		  NUM NUMBER PRIMARY KEY,
		  TITLE VARCHAR2(100) NOT NULL,
		  AUTHOR VARCHAR2(30) NOT NULL,
		  CONTENT VARCHAR2(1000)
		  regdate date);
		  
		  create sequence post_table_seq;
	*/
public class PostDto {
	private int num;
	private String title;
	private String author;
	private String content;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
