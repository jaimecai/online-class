package com.ucai.onlineclass.service;

import com.ucai.onlineclass.dao.ICourseDao;
import com.ucai.onlineclass.dto.CourseDto;
import com.ucai.onlineclass.dto.PageInfo;
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
        courseDtos=copyCourseDto(courses,courseDtos);
        return courseDtos;
    }

    /**
     * 分页查询
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public List<CourseDto> queryByPage(int pageNo, int pageSize) {
        String hql="from Course";
        List<Course> courses=courseDao.queryPage(hql,pageNo,pageSize);
        String countHql="select count(*) from Course";
        Object totalCountObj= courseDao.find(countHql).get(0);
        PageInfo pageInfo=new PageInfo();
        //报错Long不能直接转换成Integer类型
        int totalCount=(int)(long)totalCountObj;
        pageInfo.setTotalCount(totalCount);
        pageInfo.setCurrentPage(pageNo);
        pageInfo.setTotalPage(totalCount/pageSize+1);

        List<CourseDto> courseDtos=new ArrayList<>();
        courseDtos=copyCourseDto(courses,courseDtos,pageInfo);
        return courseDtos;
    }

    /**
     * 拷贝工具
     * @param courses
     * @param courseDtos
     * @param params 分页查询需要需要添加PageInfo
     * @return
     */
    private List<CourseDto> copyCourseDto(List<Course> courses,List<CourseDto> courseDtos,Object... params){
        for(int i=0;i<courses.size();i++){
            CourseDto courseDto=new CourseDto();
            BeanUtils.copyProperties(courses.get(i),courseDto);
            courseDto.setType(courses.get(i).getCourseTypeByCourseTypeId().getType());
            courseDto.setPageInfo((PageInfo) params[0]);
            courseDtos.add(courseDto);
        }
        return courseDtos;
    }

}
