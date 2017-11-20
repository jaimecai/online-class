package com.ucai.onlineclass.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ucai.onlineclass.dto.NewsDto;
import com.ucai.onlineclass.pojo.News;
import com.ucai.onlineclass.service.IAdminNewsService;

@Controller
public class AdminNewsController {
	@Autowired
    IAdminNewsService newsService;
    /*
     *查询所有资讯信息 
     */
	@RequestMapping("/newsInfo")
	  public ModelAndView toNewslist(){
		ModelAndView mv = new ModelAndView("/admin/main_news");
		String hql ="from News n";
 		List<News> list = newsService.find(hql,null);
 		System.out.println(list.size());
 		List<NewsDto> newsDtos = new ArrayList<NewsDto>();
 		for(int i=0;i<list.size();i++){
 			NewsDto newsDto = new NewsDto();
 			BeanUtils.copyProperties(list.get(i), newsDto);
 			System.out.println(list.get(i).getAuthor());
 				newsDtos.add(newsDto);
 		}	
 		mv.addObject("newsDtos", list);
 		return mv;
 		
 	 }
	/*
	 * 资讯信息的模糊查询
	 */
	@RequestMapping("/newsInfoLike")
	public ModelAndView toNewsLikelist(){
		ModelAndView mv = new ModelAndView("/admin/main_news");
		String hql ="from News n where";
		List<News> list = newsService.find(hql,null);
		System.out.println(list.size());
		List<NewsDto> newsDtos = new ArrayList<NewsDto>();
		for(int i=0;i<list.size();i++){
			NewsDto newsDto = new NewsDto();
			BeanUtils.copyProperties(list.get(i), newsDto);
			System.out.println(list.get(i).getAuthor());
			newsDtos.add(newsDto);
		}	
		mv.addObject("newsDtos", list);
		return mv;
		
	}
}
