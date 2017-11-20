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
import com.ucai.onlineclass.service.AdminNewsImpl;
import com.ucai.onlineclass.service.IAdminNewsService;

@Controller
public class AdminNewsController {
	@Autowired
	IAdminNewsService adminNewsService;
    /*
     *查询所有资讯信息 
     */
	@RequestMapping("/newsInfo")
	  public ModelAndView toNewslist(){
		ModelAndView mv = new ModelAndView("/admin/main_news");
		List<NewsDto> newsDtos = new ArrayList<NewsDto>();
		newsDtos=adminNewsService.toNewslist();
 		mv.addObject("newsDtos", newsDtos);
 		return mv;
 		
 	 }
	/*
	 * 资讯信息的模糊查询
	 */
	@RequestMapping("/newsInfoLike")
	public ModelAndView toNewsLikelist(){
		ModelAndView mv = new ModelAndView("/admin/main_news");
		List<NewsDto> newsDtos = new ArrayList<NewsDto>();
		newsDtos=adminNewsService.toNewsLikelist();
		mv.addObject("newsDtos", newsDtos);
		return mv;
		
	}
}
