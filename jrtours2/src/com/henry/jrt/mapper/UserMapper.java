package com.henry.jrt.mapper;

import org.apache.ibatis.annotations.Param;


import com.henry.jrt.bean.UserInfo;

public interface UserMapper {

	
	
	public UserInfo getUserByName(@Param("userName") String userName);
	
	public void updateUserAttempts(@Param("userName") String userName);
	public void updateUserAttemptsErrors(@Param("userName") String userName);

	public String checkUserIsExist(@Param("userName") String userName);

	public void registerUser(@Param("userInfo") UserInfo userInfo);

	public void insertAttempts(@Param("userInfo") UserInfo userInfo);

	public void insertAuthority(@Param("userInfo") UserInfo userInfo);
}
