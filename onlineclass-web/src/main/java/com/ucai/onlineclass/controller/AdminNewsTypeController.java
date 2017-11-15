package com.ucai.onlineclass.controller;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.ucai.onlineclass.dto.NewsTypeDto;
import com.ucai.onlineclass.pojo.NewsType;
import com.ucai.onlineclass.service.IAdminNewsTypeService;

@Controller
public class AdminNewsTypeController {
	@Autowired
    IAdminNewsTypeService newsTypeService;
    /*
     * 查询所有资讯类型
     */
	@RequestMapping("/noticeInfo")
	  public ModelAndView toNewsTypelist(){
		ModelAndView mv = new ModelAndView("/admin/main_news_type");
 		String hql="from NewsType";
 		List<NewsType> list = newsTypeService.findAll(hql);
 		List<NewsTypeDto> newsTypeDtos = new ArrayList<NewsTypeDto>();
 		for(int i=0;i<list.size();i++){
 			NewsTypeDto newsTypeDto = new NewsTypeDto();
 			BeanUtils.copyProperties(list.get(i), newsTypeDto);
 				newsTypeDtos.add(newsTypeDto);
 		}	
 		mv.addObject("newsTypeDtos", newsTypeDtos);
 		return mv;
 		
 	 }
	/*
	 * 资讯类型的模糊查询
	 */
	@RequestMapping("/noticeLike")
	  public ModelAndView toNewsTypeLikelist(String newsType) throws UnsupportedEncodingException{
		newsType=new String(newsType.getBytes("8859_1"), "utf8");
		if(newsType.equals(" ")||newsType==null){
			AdminNewsTypeController adminNewsTypeController= new AdminNewsTypeController();
			ModelAndView mv=adminNewsTypeController.toNewsTypelist();
			return mv;
		}
		ModelAndView mv = new ModelAndView("/admin/main_news_type");
		String hql="from NewsType t where t.type like '%"+newsType+"%'";//'%"+newsType+"%'		
		List<NewsType> list = newsTypeService.findAll(hql);
		List<NewsTypeDto> newsTypeLike = new ArrayList<NewsTypeDto>();
		for(int i=0;i<list.size();i++){
			NewsTypeDto newsTypeDto = new NewsTypeDto();
			BeanUtils.copyProperties(list.get(i), newsTypeDto);
			System.out.println(newsTypeDto.getType());
			newsTypeLike.add(newsTypeDto);
		}	
		mv.addObject("newsTypeLike", newsTypeLike);
		return mv;
	 }
	/*
	 * 添加资讯类型
	 */
	@RequestMapping("/addNewsType")
	  public String toAddNewsType(String type){
		NewsType entity= new NewsType();
		entity.setType(type);
		newsTypeService.insert(entity);
		return "/admin/main_news_type";
	 }
}
