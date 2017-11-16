package com.ucai.onlineclass.service;

import com.ucai.onlineclass.dto.CourseDto;
import com.ucai.onlineclass.pojo.Course;

import java.util.List;


public interface ICourseService extends IBaseService<Course>{
    List<CourseDto> findAll();
    List<CourseDto> findByPage();
}
