package com.ucai.onlineclass.service;

import com.ucai.onlineclass.dao.IAdminNewsTypeDao;
import com.ucai.onlineclass.pojo.NewsType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminNewsTypeImpl extends BaseServiceImpl<NewsType> implements IAdminNewsTypeService{
	private IAdminNewsTypeDao adminNewsTypeDao;
	
	@Autowired
	public void setDao(IAdminNewsTypeDao adminNewsTypeDao) {
		this.adminNewsTypeDao = adminNewsTypeDao;
		this.setBaseDao(adminNewsTypeDao);
	}
	
}
