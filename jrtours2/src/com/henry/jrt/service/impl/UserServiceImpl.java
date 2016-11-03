package com.henry.jrt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.henry.jrt.bean.UserInfo;
import com.henry.jrt.common.MD5Util;
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

	@Override
	public String checkUserIsExist(String username) {
		
		return userMapper.checkUserIsExist(username);
	}

	@Override
	public UserInfo register(UserInfo userInfo) {
	
		userInfo.setPassword(MD5Util.MD5(userInfo.getPassword()));
		userMapper.registerUser(userInfo);
		userMapper.insertAttempts(userInfo);
		userMapper.insertAuthority(userInfo);
		return userMapper.getUserByName(userInfo.getUserName());
		
	}
	
	

}
