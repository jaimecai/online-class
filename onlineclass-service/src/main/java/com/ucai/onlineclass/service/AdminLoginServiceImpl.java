package com.ucai.onlineclass.service;

import com.ucai.onlineclass.dao.IAdminLoginDao;
import com.ucai.onlineclass.pojo.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginServiceImpl extends BaseServiceImpl<Admin> implements IAdminLoginService{
	private IAdminLoginDao adminLoginDao;
	
	@Autowired
	public void setDao(IAdminLoginDao adminLoginDao) {
		this.adminLoginDao = adminLoginDao;
		this.setBaseDao(adminLoginDao);
	}
	
}
