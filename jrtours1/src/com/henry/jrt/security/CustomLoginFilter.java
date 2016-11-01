package com.henry.jrt.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class CustomLoginFilter extends UsernamePasswordAuthenticationFilter {

	
	

    public Authentication attemptAuthentication(HttpServletRequest request,
            HttpServletResponse response) throws AuthenticationException {

        // if (!request.getMethod().equals("POST")) {
        // throw new AuthenticationServiceException(
        // "Authentication method not supported: "
        // + request.getMethod());
        // }

        String userId = obtainUsername(request);
        String password = obtainPassword(request);

        //可以使用继承对token扩展
        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
        		userId, password);

        setDetails(request, authRequest);
        return this.getAuthenticationManager().authenticate(authRequest);
    }

}
