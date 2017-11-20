package com.ucai.onlineclass.service;

import com.ucai.onlineclass.dao.ICourseTypeDao;
import com.ucai.onlineclass.pojo.CourseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author:jaimecai
 * @date:17-11-19 下午6:30
 * @description:
 */
@Service
public class CourseTypeServiceImpl extends BaseServiceImpl<CourseType> implements ICourseTypeService{
    private ICourseTypeDao courseTypeDao;

    @Autowired
    public void setCourseTypeDao(ICourseTypeDao courseTypeDao){
        this.courseTypeDao=courseTypeDao;
        this.setBaseDao(courseTypeDao);
    }

}
