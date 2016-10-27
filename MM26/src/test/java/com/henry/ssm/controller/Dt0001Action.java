package com.henry.ssm.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.henry.ssm.po.DaiDhpTaisyosya;
import com.henry.ssm.service.DtService;
import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

import net.sf.ehcache.Cache;

@Controller
public class Dt0001Action {

	// 如果service的注解有value值，beanId就是value
	// 如果没有value值，默认beanId就是类名首字母小写
	@Autowired
	private DtService dtService;

	@RequestMapping(value = "/edit/{restful}")
	public String editItem(HttpSession hs, Model model, @PathVariable(value = "restful") String restful) {

		/*
		 * WebApplicationContext ac =
		 * WebApplicationContextUtils.getWebApplicationContext(hs.
		 * getServletContext());
		 * 
		 * String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		 * 
		 * for (String string : beanDefinitionNames) {
		 * 
		 * System.out.println(string);
		 * 
		 * 
		 * }
		 */

		List<DaiDhpTaisyosya> dhpTaisyosyaList = dtService.getDhpTaisyosyaList();

		model.addAttribute("dhpTaisyosyaList", dhpTaisyosyaList);
		model.addAttribute("restful", restful);

		return "edit";
	}

}
