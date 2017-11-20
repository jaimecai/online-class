package com.ucai.onlineclass.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ucai.onlineclass.pojo.User;
import com.ucai.onlineclass.service.AdminLoginServiceImpl;
import com.ucai.onlineclass.service.IAdminLoginService;

@Controller
public class AdminLoginController {
	@Autowired
	IAdminLoginService adminLoginService;
    @RequestMapping("/login")
    public String adminLogin(String username,String pwd){
    	boolean flag=false;
    	flag=adminLoginService.adminLogin(username, pwd);
    	if(flag){
    		return "/admin/index";
    	}else{
    		return "/admin/login2";
    	}       
    }
}
