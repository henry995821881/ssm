package com.henry.test;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class ContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext sc = arg0.getServletContext();
		
		System.out.println(" __________________________________________________");	
	WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		
		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		
		for (String string : beanDefinitionNames) {
			
			System.out.println(string);
					
		}
		System.out.println("____________________________________________________");
		
	}

	

}
