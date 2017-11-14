package com.ucai.onlineclass.controller;

import com.ucai.onlineclass.dao.ICourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    ICourseDao courseDao;

    @RequestMapping("/test/test01")
    @ResponseBody
    public String test01(){
        return courseDao.get(2).getSubject();
    }
}
