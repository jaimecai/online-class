package com.ucai.onlineclass.controller;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ucai.onlineclass.pojo.Admin;
import com.ucai.onlineclass.pojo.Course;
import com.ucai.onlineclass.service.AdminLoginServiceImpl;
import com.ucai.onlineclass.service.IAdminLoginService;
import com.ucai.onlineclass.service.ICourseService;

@Controller
public class AdminLoginController {
	@Autowired
    IAdminLoginService AdminLoginService;
     
    @RequestMapping("/login")
    public String adminLogin(String username,String pwd){
    	String hql="from Admin where name=:name and password=password";
    	HashMap<String, Object>map = new HashMap<String, Object>();
    	map.put("name",username);
    	map.put("password", pwd);
    	List<Admin> adminList= AdminLoginService.queryAll(hql, map);
    	System.out.println(adminList.size());
    	if(adminList.size()!=0){
    		return "/admin/index";
    	}
    	
        return "/admin/login2";
    	
    }
}
