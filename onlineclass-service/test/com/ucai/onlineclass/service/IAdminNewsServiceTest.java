package com.ucai.onlineclass.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ucai.onlineclass.pojo.News;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class IAdminNewsServiceTest {

	@Autowired
	IAdminNewsService service;
	@Test
	public void test(){
		String hql ="from News";
		List<News> list = service.find(hql, null);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getNewsType().getType());
		}
	}

}
