package com.ucai.onlineclass.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ucai.onlineclass.pojo.NewsType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class AdminNewsTypeDaoImplTest {
	@Autowired
	IAdminNewsTypeDao dao;
	@Test
	public void test(){
		NewsType newsType = dao.get(1);
		
	}
}
