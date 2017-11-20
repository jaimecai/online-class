package com.ucai.onlineclass.controller;

import com.ucai.onlineclass.dao.ICourseTypeDao;
import com.ucai.onlineclass.dto.CourseDto;
import com.ucai.onlineclass.pojo.Course;
import com.ucai.onlineclass.pojo.CourseType;
import com.ucai.onlineclass.service.ICourseService;
import com.ucai.onlineclass.service.ICourseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

    @Autowired
    ICourseTypeService courseTypeService;

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

    @RequestMapping("/addCourseBefore")
    public String addCourseBefore(Model model){
        List<CourseType> courseTypes=(List< CourseType>)courseTypeService.findAll();
        model.addAttribute("courseTypes",courseTypes);
        return "/admin/courseAdd";
    }

    @RequestMapping(value = "/addCourse")
    @ResponseBody
    public String addCourse(HttpServletRequest request, HttpSession session){

        return "xxx";
    }
    
}
