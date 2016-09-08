package com.henry1.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;


public class LogInterceptor {

	public static final Logger log =Logger.getLogger(LogInterceptor.class);
	
	


	public void before(JoinPoint joinPoint){
		
	}
	
	//配置后置通知,使用在方法aspect()上注册的切入点

	public void after(JoinPoint joinPoint){
		
	}
	
	//配置环绕通知,使用在方法aspect()上注册的切入点

	public void around(JoinPoint joinPoint){
	/*	long start = System.currentTimeMillis();
		try {
			
			long end = System.currentTimeMillis();
			if(log.isInfoEnabled()){
				log.debug("around " + joinPoint + "\tUse time : " + (end - start) + " ms!");
			}
		} catch (Throwable e) {
			long end = System.currentTimeMillis();
			if(log.isInfoEnabled()){
				log.debug("around " + joinPoint + "\tUse time : " + (end - start) + " ms with exception : " + e.getMessage());
			}
		*/
	}
	
	//配置后置返回通知,使用在方法aspect()上注册的切入点

	public void afterReturn(JoinPoint joinPoint){
		
	}
	
	//配置抛出异常后通知,使用在方法aspect()上注册的切入点
	
	public void afterThrow(JoinPoint joinPoint, Exception ex){
		
	}
	
}
