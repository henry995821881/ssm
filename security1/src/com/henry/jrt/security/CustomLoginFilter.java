package com.henry.jrt.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.henry.jrt.Exception.PasswordErrorException;
import com.henry.jrt.Exception.RandomCodeErrorException;
import com.henry.jrt.Exception.UserNotFoundException;
import com.henry.jrt.common.MD5Util;

import com.henry.jrt.service.UserService;

public class CustomLoginFilter extends UsernamePasswordAuthenticationFilter {

	
	
	@Autowired
	private UserService userService;
	
	
    public Authentication attemptAuthentication(HttpServletRequest request,
            HttpServletResponse response) throws AuthenticationException {

        // if (!request.getMethod().equals("POST")) {
        // throw new AuthenticationServiceException(
        // "Authentication method not supported: "
        // + request.getMethod());
        // }

        String username = obtainUsername(request);
        String password = obtainPassword(request);
        
        //验证码
        String formRandomCode = request.getParameter("randomCode");
        String sysRandomCode = (String)request.getSession().getAttribute("randomCode");
        if("".equals(formRandomCode)|| formRandomCode ==null || !formRandomCode.equalsIgnoreCase(sysRandomCode)){
        	
        	throw new RandomCodeErrorException("randomCode is error");
        }
        //验证用户名
        if(username ==null || "".equals(username)){
        	throw new UserNotFoundException("username is empty");
        }
        
        if(password ==null || "".equals(password)){
        	throw new PasswordErrorException("password is empty");
        }
        
        String salt = userService.getUserByName(username).getSalt();

        password = MD5Util.MD5(password+salt);
        //密码要和userdetail中的一致
        //可以使用继承对token扩展
        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
        		username, password);

        setDetails(request, authRequest);
        return this.getAuthenticationManager().authenticate(authRequest);
    }

}
