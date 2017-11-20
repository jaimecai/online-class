package com.ucai.onlineclass.service;

import com.ucai.onlineclass.dao.IAdminNewsTypeDao;
import com.ucai.onlineclass.dto.NewsTypeDto;
import com.ucai.onlineclass.dto.ResponseDto;
import com.ucai.onlineclass.pojo.NewsType;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminNewsTypeImpl extends BaseServiceImpl<NewsType> implements IAdminNewsTypeService{
	private IAdminNewsTypeDao adminNewsTypeDao;
	
	@Autowired
	public void setDao(IAdminNewsTypeDao adminNewsTypeDao) {
		this.adminNewsTypeDao = adminNewsTypeDao;
		this.setBaseDao(adminNewsTypeDao);
	}

	@Override
	public List<NewsTypeDto> toNewsTypelist() {
		String hql="from NewsType";
 		List<NewsType> list = this.findAll(hql);
 		List<NewsTypeDto> newsTypeDtos = new ArrayList<NewsTypeDto>();
 		for(int i=0;i<list.size();i++){
 			NewsTypeDto newsTypeDto = new NewsTypeDto();
 			BeanUtils.copyProperties(list.get(i), newsTypeDto);
 				newsTypeDtos.add(newsTypeDto);
 		}
		return newsTypeDtos;
	}

	@Override
	public List<NewsTypeDto> toNewsTypeLikelist(String newsType) {
		try {
			newsType=new String(newsType.getBytes("8859_1"), "utf8");
				
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
		String hql="from NewsType t where t.type like '%"+newsType+"%'";//'%"+newsType+"%'		
		List<NewsType> list = this.findAll(hql);
		List<NewsTypeDto> newsTypeLike = new ArrayList<NewsTypeDto>();
		for(int i=0;i<list.size();i++){
			NewsTypeDto newsTypeDto = new NewsTypeDto();
			BeanUtils.copyProperties(list.get(i), newsTypeDto);
			System.out.println(newsTypeDto.getType());
			newsTypeLike.add(newsTypeDto);
		}
		return newsTypeLike;
	}

	@Override
	public void toAddNewsType(String addNewsType) {
		System.out.println(addNewsType);
		NewsType entity= new NewsType();
		entity.setType(addNewsType);
		this.insert(entity);
		
	}

	@Override
	public ResponseDto toEditNewsType(String newsType, Integer id) {
		System.out.println(newsType);
		NewsType entity= new NewsType();
		entity.setId(id);
		entity.setType(newsType);
		ResponseDto responseDto = new ResponseDto();
		try {
			this.update(entity);
			responseDto.setCode("200");
			responseDto.setMessage("修改成功！");
		} catch (Exception e) {
			e.printStackTrace();
			responseDto.setCode("100");
			responseDto.setMessage("修改失败！");
		}
		
		return responseDto;
	}

	@Override
	public ResponseDto toDelNewsType(Integer id) {
		NewsType entity= new NewsType();
		entity.setId(id);
		ResponseDto responseDto = new ResponseDto();
		try {
			this.delete(entity);
			responseDto.setCode("200");
			responseDto.setMessage("删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			responseDto.setCode("100");
			responseDto.setMessage("删除失败！");
		}
		
		return responseDto;
	}
	
}
