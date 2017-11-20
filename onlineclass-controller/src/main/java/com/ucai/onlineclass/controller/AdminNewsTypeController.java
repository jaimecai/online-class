package com.ucai.onlineclass.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ucai.onlineclass.dto.NewsTypeDto;
import com.ucai.onlineclass.dto.ResponseDto;
import com.ucai.onlineclass.service.IAdminNewsTypeService;

@Controller
public class AdminNewsTypeController {
	@Autowired
	IAdminNewsTypeService adminNewsService;
    /*
     * 查询所有资讯类型
     */
	@RequestMapping("/noticeInfo")
	  public ModelAndView toNewsTypelist(){
		ModelAndView mv = new ModelAndView("/admin/main_news_type");
		List<NewsTypeDto> newsTypeDtos = new ArrayList<NewsTypeDto>();
		newsTypeDtos=adminNewsService.toNewsTypelist();
 		mv.addObject("newsTypeDtos", newsTypeDtos);
 		return mv;
 		
 	 }
	/*
	 * 资讯类型的模糊查询
	 */
	@RequestMapping("/noticeLike")
	  public ModelAndView toNewsTypeLikelist(String newsType){
		ModelAndView mv = new ModelAndView("/admin/main_news_type");
		List<NewsTypeDto> newsTypeLike = new ArrayList<NewsTypeDto>();
		newsTypeLike=adminNewsService.toNewsTypeLikelist(newsType);	
		mv.addObject("newsTypeDtos", newsTypeLike);
		return mv;
	 }
	/*
	 * 添加资讯类型
	 */
	@RequestMapping("/addNewsType")
	@ResponseBody
	  public String toAddNewsType(String addNewsType){
		System.out.println(addNewsType);
		adminNewsService.toAddNewsType(addNewsType);
		return "100";
	 }
	/*
	 * 修改资讯类型
	 */
	@RequestMapping("/editNewsType")
	@ResponseBody
	public ResponseDto toEditNewsType(Integer cid,String type){
		System.out.println(cid+"---"+type);
		ResponseDto responseDto=adminNewsService.toEditNewsType(type, cid);
		return responseDto;
	}
	/*
	 * 删除资讯类型
	 */
	@RequestMapping("/delNewsType")
	@ResponseBody
	public ResponseDto toDelNewsType(Integer id){
		System.out.println(id);
		ResponseDto responseDto=adminNewsService.toDelNewsType(id);
		return responseDto;
	}
}
