package com.ucai.onlineclass.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ucai.onlineclass.pojo.User;
import com.ucai.onlineclass.service.IAdminLoginService;

@Controller
public class AdminLoginController {
	@Autowired
    IAdminLoginService AdminLoginService;

    @RequestMapping("/login")
    public String adminLogin(String username,String pwd){
    	String hql="from User where username='"+username+"' and password='"+pwd+"'";
    	List<User> adminList= AdminLoginService.findAll(hql);
    	System.out.println(adminList.size());
    	if(adminList.size()!=0){
    		return "/admin/index";
    	}

       return "/admin/login2";

    }
}
