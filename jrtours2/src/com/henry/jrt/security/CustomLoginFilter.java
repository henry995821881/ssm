package com.henry.jrt.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


import com.henry.jrt.common.MD5Util;
import com.henry.jrt.common.StringUtils;

public class CustomLoginFilter extends UsernamePasswordAuthenticationFilter {

	
	

    public Authentication attemptAuthentication(HttpServletRequest request,
            HttpServletResponse response) throws AuthenticationException {

        // if (!request.getMethod().equals("POST")) {
        // throw new AuthenticationServiceException(
        // "Authentication method not supported: "
        // + request.getMethod());
        // }

        String username = obtainUsername(request);
        String password = obtainPassword(request);
        
        if(!StringUtils.isEmpty(password)){
        	
        	password = MD5Util.MD5(password);
        }
       

        //可以使用继承对token扩展
        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
        		username, password);

        setDetails(request, authRequest);
        return this.getAuthenticationManager().authenticate(authRequest);
    }

}
