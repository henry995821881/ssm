package com.henry.test;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.annotation.Bean;
import org.springframework.transaction.interceptor.TransactionInterceptor;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.henry1.aop.LogInterceptor;
import com.sun.accessibility.internal.resources.accessibility;

public class ContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void contextInitialized(ServletContextEvent arg0) {

		ServletContext sc = arg0.getServletContext();

		String realPath = sc.getRealPath("/");
		System.out.println(realPath);
		System.out.println(" __________________________________________________");
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);

		String[] beanDefinitionNames = ac.getBeanDefinitionNames();

		for (String string : beanDefinitionNames) {

			System.out.println(string);


		}
		System.out.println("____________________________________________________");
		//事务拦截器
		TransactionInterceptor txAdvice =(TransactionInterceptor) ac.getBean("txAdvice");
			//log拦截器
		LogInterceptor logInterceptor = (LogInterceptor) ac.getBean("logInterceptor");

	}

}
