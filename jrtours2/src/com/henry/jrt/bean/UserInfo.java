package com.henry.jrt.bean;

import java.io.Serializable;

public class UserInfo implements Serializable{

	
	 
	 
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean isVaild ;
	public boolean isVaild() {
		return isVaild;
	}
	public void setVaild(boolean isVaild) {
		this.isVaild = isVaild;
	}
	private String desc;
	 private String email;
	 private String userName;
	 private String nickName;
	 private String password;
	 private String authority;
	 private String enable;
	 private String locked;
	 
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public String getLocked() {
		return locked;
	}
	public void setLocked(String locked) {
		this.locked = locked;
	}

	 
	 
	 
}