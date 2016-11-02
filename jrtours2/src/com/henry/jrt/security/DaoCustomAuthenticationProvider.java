package com.henry.jrt.security;


import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

import com.henry.jrt.Exception.PasswordErrorException;
import com.henry.jrt.Exception.UserNotFoundException;
import com.henry.jrt.bean.CustomUserDetails;
import com.henry.jrt.bean.UserInfo;




public class DaoCustomAuthenticationProvider extends DaoAuthenticationProvider{
	
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
		//authentication.getPrincipal()     user_id
		//authentication.getCredentials()   user_pw
		Object credentials =  authentication.getCredentials();
		if(credentials ==null ||"".equals((String)credentials)){
			
			throw new PasswordErrorException(" password is empty");
		}
		
	
		
	
		if(!credentials.equals(userInfo.getPassword())){
			
			throw new PasswordErrorException("error password");
		}
		
		
		
		super.additionalAuthenticationChecks(userDetails, authentication);
	}
	
	
	
}


