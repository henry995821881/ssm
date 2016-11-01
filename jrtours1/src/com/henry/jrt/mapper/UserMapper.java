package com.henry.jrt.mapper;

import org.apache.ibatis.annotations.Param;

import com.henry.jrt.bean.CustomUserDetails;

public interface UserMapper {

	
	
	public CustomUserDetails getUserById(@Param("userId") String id);
	
}
