package com.ucai.onlineclass.service;

import java.util.List;

import com.ucai.onlineclass.dto.NewsDto;
import com.ucai.onlineclass.pojo.News;

public interface IAdminNewsService extends IBaseService<News>{
	//查询所有资讯信息
	List<NewsDto> toNewslist();
	//	  资讯信息的模糊查询 
	List<NewsDto> toNewsLikelist(String news,String newsStartTime,String newsEndTime);
}
