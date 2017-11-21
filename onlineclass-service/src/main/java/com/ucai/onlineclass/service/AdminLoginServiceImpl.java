package com.ucai.onlineclass.service;

import com.ucai.onlineclass.dao.IAdminLoginDao;
import com.ucai.onlineclass.pojo.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginServiceImpl extends BaseServiceImpl<User> implements IAdminLoginService{
	private IAdminLoginDao adminLoginDao;

	@Autowired
	public void setDao(IAdminLoginDao adminLoginDao) {
		this.adminLoginDao = adminLoginDao;
		this.setBaseDao(adminLoginDao);
	}
	@Override
	public boolean adminLogin(String username,String pwd){
		String hql="from User where username=? and password=?";
		String[] params={username,pwd} ;
    	List<User> adminList= this.find(hql, params);
    	System.out.println(adminList.size());
    	if(adminList.size()!=0){   		
    		return true;
    	}
       return false;
	}
}
