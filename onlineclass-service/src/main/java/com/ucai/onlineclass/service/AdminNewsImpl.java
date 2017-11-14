package com.ucai.onlineclass.service;

import com.ucai.onlineclass.dao.IAdminNewsDao;
import com.ucai.onlineclass.pojo.News;

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
	
}
