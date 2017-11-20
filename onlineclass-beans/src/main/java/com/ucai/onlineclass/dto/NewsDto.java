package com.ucai.onlineclass.dto;

import java.util.Date;

import com.ucai.onlineclass.pojo.NewsType;

public class NewsDto {
	private Integer id;
    private NewsType newsType;
    private String type;
    public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String title;
    private String picture;
    private Date postTime;
    private String content;
    private String author;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public NewsType getNewsType() {
		return newsType;
	}
	public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public NewsDto(Integer id, NewsType newsType,String type, String title, String picture, Date postTime, String content,
			String author) {
		super();
		this.id = id;
		this.newsType = newsType;
		this.title = title;
		this.picture = picture;
		this.postTime = postTime;
		this.content = content;
		this.author = author;
		this.type = type;
	}
	public NewsDto() {
		super();
	}
    

}
