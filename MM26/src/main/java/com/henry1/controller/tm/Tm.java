package com.henry1.controller.tm;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.henry.ssm.po.User;
import com.henry1.bean.tm.SidoukikanData;
import com.henry1.service.tm.SidoukikanService;

@Controller
public class Tm {

	@Autowired
	private SidoukikanService sidoukikanService;
	
	@RequestMapping("tmMs21")
	public String tmMs21(Model model){
		
		List<SidoukikanData> sidoukikanList = sidoukikanService.getSidoukikanList();
		
		model.addAttribute("sidoukikanList", sidoukikanList);
		
		
		return "tm/tmMs21";
	}
	
	@RequestMapping(value="doInitUpdate/{skCd}")
       public String doInitUpdate(Model model ,@PathVariable String skCd ){
    	   
    	   
		SidoukikanData sidoukikanData =sidoukikanService.getSidoukikanDataById( skCd);
		
		model.addAttribute("sidoukikanData", sidoukikanData);
		
    	   return "tm/tmMs22";
       }
	//springmvc 通过jackson 把 User转换成json数据返回
	@RequestMapping(value="test1/{name}")
	@ResponseBody
	public User testResponsebody(@PathVariable String name){
		
		
		User user = new User();
		user.setUsername(name);
		user.setSex("male");
		user.setId(1);	
		return user;
	}
	
	//自定义date转换器 ，float转换器
	@RequestMapping(value="test2" ,method=RequestMethod.POST)
	public String dateConveter(Date date,Float dollar){
		
		System.out.println(date);
		return "tm/tmMs22";
	}
	
}
