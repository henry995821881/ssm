package com.henry.jrt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry.jrt.bean.CustomUserDetails;
import com.henry.jrt.mapper.UserMapper;
import com.henry.jrt.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public CustomUserDetails getUserById(String id) {
		 
		return userMapper.getUserById(id);
	}

}
