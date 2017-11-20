package com.ucai.onlineclass.dao;

import com.ucai.onlineclass.pojo.CourseType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CourseTypeDaoImplTest {

    @Autowired
    ICourseTypeDao courseTypeDao;

    @Test
    public void queryAll() throws Exception {
       List<CourseType> result= courseTypeDao.queryAll();
        System.out.println(result);
    }

}