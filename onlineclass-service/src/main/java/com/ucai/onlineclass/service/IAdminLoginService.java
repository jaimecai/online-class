package com.ucai.onlineclass.service;

import com.ucai.onlineclass.pojo.User;

public interface IAdminLoginService extends IBaseService<User>{
	boolean adminLogin(String username,String pwd);
}
