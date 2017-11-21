package com.ucai.onlineclass.service;

import com.ucai.onlineclass.dao.IAdminNewsDao;
import com.ucai.onlineclass.dto.NewsDto;
import com.ucai.onlineclass.pojo.News;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminNewsImpl extends BaseServiceImpl<News> implements IAdminNewsService{
	private IAdminNewsDao adminNewsDao;
	
	@Autowired
	public void setDao(IAdminNewsDao adminNewsDao) {
		this.adminNewsDao = adminNewsDao;
		this.setBaseDao(adminNewsDao);
	}
	//查询所有资讯信息
	@Override
	public List<NewsDto> toNewslist() {
		String hql ="from News n";
 		List<News> list = this.findAll(hql);
 		System.out.println(list.size());
 		List<NewsDto> newsDtos = new ArrayList<NewsDto>();
 		for(int i=0;i<list.size();i++){
 			NewsDto newsDto = new NewsDto();
 			BeanUtils.copyProperties(list.get(i), newsDto);
 			System.out.println(list.get(i).getPostTime());
 			newsDtos.add(newsDto);
 		}
 		System.out.println(newsDtos.get(2).getPostTime());
		return newsDtos;
	}
	//资讯信息的模糊查询
	@Override
	public List<NewsDto> toNewsLikelist(String news,String newsStartTime,String newsEndTime) {
		String hql ="from News n where n.title like '%"+"?"+"%' or n.newsType.type like '%"+news+"%'";//or (postTime>'?' and postTime<'?')";
		String []params=new String[3];
		params[0]=news;
		List<News> list = this.find(hql,null);//new String[]{news,newsStartTime,newsEndTime}
		System.out.println(list.size());
		List<NewsDto> newsDtos = new ArrayList<NewsDto>();
		for(int i=0;i<list.size();i++){
			NewsDto newsDto = new NewsDto();
			BeanUtils.copyProperties(list.get(i), newsDto);
			System.out.println(list.get(i).getAuthor());
			newsDtos.add(newsDto);
		}
		return newsDtos;
	}
	
}
