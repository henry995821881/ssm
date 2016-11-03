package com.henry.jrt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.henry.jrt.bean.UserInfo;
import com.henry.jrt.mapper.UserMapper;
import com.henry.jrt.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserInfo getUserByName(String userName) {
		 
		return userMapper.getUserByName(userName);
	}

	@Override
	public void updateUserAttempts(String userName) {

		
		userMapper.updateUserAttempts(userName);
		
	}

	@Override
	public void updateUserAttemptsErrors(String userName) {
		userMapper.updateUserAttemptsErrors(userName);
		
	}
	
	

}
