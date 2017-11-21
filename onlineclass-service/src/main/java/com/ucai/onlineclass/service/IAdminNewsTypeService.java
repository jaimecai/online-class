package com.ucai.onlineclass.service;

import java.util.List;

import com.ucai.onlineclass.dto.NewsTypeDto;
import com.ucai.onlineclass.dto.ResponseDto;
import com.ucai.onlineclass.pojo.NewsType;

public interface IAdminNewsTypeService extends IBaseService<NewsType>{
	//查询所有资讯类型
	List<NewsTypeDto> toNewsTypelist();
	//资讯类型的模糊查询
	List<NewsTypeDto> toNewsTypeLikelist(String newsType);
	//添加资讯类型
	void toAddNewsType(String addNewsType);
	//修改资讯类型
	ResponseDto toEditNewsType(String newsType,Integer id);
	//删除资讯类型
	ResponseDto toDelNewsType(Integer id);
}
