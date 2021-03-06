package com.henry.jrt.security;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.henry.jrt.bean.CustomUserDetails;
import com.henry.jrt.bean.UserInfo;
import com.henry.jrt.service.UserService;


public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserService userService;

	//第一次验证
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		//update user_attempts first 如果超过1天重置错误次数清零
		userService.updateUserAttempts(username);
		//get userinfo
		UserInfo userInfo = userService.getUserByName(username);
		
		//错误大于3次锁定
		if(userInfo.getErrorAttemptsNum()>=3) {
			
			userInfo.setLocked("1");
		}
                      
		
		// valid

		/*
		 * boolean enabled = true; boolean accountNonExpired = true; boolean
		 * credentialsNonExpired = true; boolean accountNonLocked = true;
		 * List<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
		 */
	
		  
		
		     boolean accountNonExpired = true;
		     boolean credentialsNonExpired = true;
		    //账号失效
		   boolean enable =  userInfo.getEnable().equals("1")? true:false;
		   //账号锁定
		   boolean accountNonLocked = userInfo.getLocked().equals("0")? true:false;
		   
		   //
		CustomUserDetails user = new CustomUserDetails(userInfo.getUserName(), userInfo.getPassword(), enable, accountNonExpired,
				credentialsNonExpired, accountNonLocked, new ArrayList<GrantedAuthority>());
		
		///////
		user.setUserInfo(userInfo);
		
		return user;

	}
	
	
	

}
