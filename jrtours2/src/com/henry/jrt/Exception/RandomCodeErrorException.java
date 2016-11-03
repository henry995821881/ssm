package com.henry.jrt.Exception;

import org.springframework.security.core.AuthenticationException;

public class RandomCodeErrorException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RandomCodeErrorException(String msg) {
		super(msg);
		
	}

}
