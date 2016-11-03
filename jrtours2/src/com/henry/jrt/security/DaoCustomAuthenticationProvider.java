package com.henry.jrt.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

import com.henry.jrt.Exception.PasswordErrorException;
import com.henry.jrt.Exception.UserNotFoundException;
import com.henry.jrt.bean.CustomUserDetails;
import com.henry.jrt.bean.UserInfo;
import com.henry.jrt.common.MD5Util;
import com.henry.jrt.service.UserService;




public class DaoCustomAuthenticationProvider extends DaoAuthenticationProvider{
	
	@Autowired
	private UserService userService;
	
	//第二次验证
	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
	
		
		
		CustomUserDetails  customUser = (CustomUserDetails) userDetails;
		
		UserInfo userInfo = customUser.getUserInfo();
		
		if(userInfo ==null){
			
			throw new UserNotFoundException("not found user");
			
		}
		
		//
		//authentication.getPrincipal()     user_name
		//authentication.getCredentials()   user_pw
		Object credentials =  authentication.getCredentials();
		if(credentials ==null ||"".equals((String)credentials)){
			
			throw new PasswordErrorException(" password is empty");
		}
		
           	
	
		if(!credentials.equals(userInfo.getPassword())){
			
			//密码错误insert or update user_attemps
			userService.updateUserAttemptsErrors(customUser.getUsername());
			
			throw new PasswordErrorException("error password");
			
			
		}
		
		
		
		super.additionalAuthenticationChecks(userDetails, authentication);
	}
	
	
	
}


