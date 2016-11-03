package com.henry.jrt.service;


import com.henry.jrt.bean.UserInfo;

public interface UserService {

	
	public UserInfo getUserByName(String userName);
	public void updateUserAttempts(String userName);
	public void updateUserAttemptsErrors(String userName);
}
