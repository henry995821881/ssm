package com.henry.jrt.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.henry.jrt.bean.CustomUserDetails;
import com.henry.jrt.service.UserService;
import com.henry.jrt.service.impl.UserServiceImpl;

public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserService userService;

	//第一次验证
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {

		CustomUserDetails customUser = userService.getUserById(userId);

		// valid

		/*
		 * boolean enabled = true; boolean accountNonExpired = true; boolean
		 * credentialsNonExpired = true; boolean accountNonLocked = true;
		 * List<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
		 */
		if (customUser ==null) return null;

		CustomUserDetails user = new CustomUserDetails(customUser.getUsername(), customUser.getPassword(), true, true,
				true, true, new ArrayList<GrantedAuthority>());
		
		return user;

	}

}
