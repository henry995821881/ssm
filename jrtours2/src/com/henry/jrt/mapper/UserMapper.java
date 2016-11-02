package com.henry.jrt.mapper;

import org.apache.ibatis.annotations.Param;

import com.henry.jrt.bean.CustomUserDetails;
import com.henry.jrt.bean.UserInfo;

public interface UserMapper {

	
	
	public UserInfo getUserByName(@Param("userName") String userName);
	
}
