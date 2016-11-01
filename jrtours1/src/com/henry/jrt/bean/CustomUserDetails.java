package com.henry.jrt.bean;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.access.prepost.PreInvocationAttribute;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
/**
 * User implements UserDetails
 * @author henry
 *
 */
public class CustomUserDetails extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	private String email;
	private String desc;
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	private int authoritie;
	private String nickName;
	

	public CustomUserDetails(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getAuthoritie() {
		return authoritie;
	}

	public void setAuthoritie(int authoritie) {
		this.authoritie = authoritie;
	}


	


}
