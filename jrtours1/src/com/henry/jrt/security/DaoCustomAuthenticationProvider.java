package com.henry.jrt.security;


import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

import com.henry.jrt.Exception.PasswordErrorException;
import com.henry.jrt.Exception.UserNotFoundException;
import com.henry.jrt.bean.CustomUserDetails;
import com.henry.jrt.common.MD5Util;



public class DaoCustomAuthenticationProvider extends DaoAuthenticationProvider{
	
	//第二次验证
	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
	
		
		if(userDetails ==null){
			
			throw new UserNotFoundException("not found user");
			
		}
		
		CustomUserDetails  customUser = (CustomUserDetails) userDetails;
		//
		//authentication.getPrincipal()     user_id
		//authentication.getCredentials()   user_pw
		Object credentials =  authentication.getCredentials();
		if(credentials ==null ||"".equals((String)credentials)){
			
			throw new PasswordErrorException(" password is null");
		}
		
		String md5Password = MD5Util.MD5((String)credentials);
		
		/*if(!md5Password.equals(customUser.getPassword())){
			
			throw new PasswordErrorException("error password");
		}*/
		
		System.out.println(md5Password);
		
		super.additionalAuthenticationChecks(userDetails, authentication);
	}
}


