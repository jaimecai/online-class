package com.ucai.onlineclass.service;

import com.ucai.onlineclass.dao.ICourseDao;
import com.ucai.onlineclass.dto.CourseDto;
import com.ucai.onlineclass.pojo.Course;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CourseServiceImpl extends BaseServiceImpl<Course> implements ICourseService{
    private ICourseDao courseDao;

    @Autowired
    public void setCourseDao(ICourseDao courseDao){
        this.courseDao=courseDao;
        this.setBaseDao(courseDao);
    }

    @Override
    public List<CourseDto> findAll(){
        String hql="from Course";
        List<Course> courses=this.findAll(hql);
        List<CourseDto> courseDtos=new ArrayList<>();
        for(int i=0;i<courses.size();i++){
            CourseDto courseDto=new CourseDto();
            BeanUtils.copyProperties(courses.get(i),courseDto);
            courseDtos.add(courseDto);
        }
        return courseDtos;
    }

}
