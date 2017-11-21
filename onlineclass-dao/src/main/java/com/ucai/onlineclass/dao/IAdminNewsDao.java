package com.ucai.onlineclass.dao;

import java.util.List;

import com.ucai.onlineclass.pojo.*;

public interface IAdminNewsDao extends IBaseDao<News>{
	List<News> newsLikefind(String hql,Object[] params);
}
