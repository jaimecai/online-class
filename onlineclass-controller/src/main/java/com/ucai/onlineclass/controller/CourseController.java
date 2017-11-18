package com.ucai.onlineclass.controller;

import com.ucai.onlineclass.dto.CourseDto;
import com.ucai.onlineclass.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
/**
 * @author:jaimecai
 * @date:17-11-18
 * @description:
 */
@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    ICourseService courseService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<CourseDto> findAll(){
        List<CourseDto> courseDtos=courseService.findAll();
        return courseDtos;

    }

    @RequestMapping("/findByPage")
    @ResponseBody
    public List<CourseDto> findByPage(int pageNum,int pageSize){
        List<CourseDto> courseDtos=courseService.queryByPage(pageNum,pageSize);
        return courseDtos;
    }
    
}
