package com.henry.jrt.Exception;

import org.springframework.security.core.AuthenticationException;

public class PasswordErrorException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PasswordErrorException(String msg) {
		super(msg);
		
	}

}
