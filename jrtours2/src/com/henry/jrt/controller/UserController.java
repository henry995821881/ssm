package com.henry.jrt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.henry.jrt.Exception.PasswordErrorException;
import com.henry.jrt.Exception.UserNotFoundException;
import com.henry.jrt.bean.UserInfo;
import com.henry.jrt.service.UserService;

@Controller
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
	public ModelAndView welcome() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Welcome - Spring Security Custom login/logout Filter");
		model.addObject("message", "This is welcome page!");
		model.setViewName("welcome");
		return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", getErrorMessage(request, "SPRING_SECURITY_LAST_EXCEPTION"));
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}

		model.setViewName("login");

		return model;

	}

	@RequestMapping("/main")
	public String main(Model model) {

		model.addAttribute("msg", "mainmain");
		return "main";
	}

	@RequestMapping("/register")
	public String register() {

		return "register";

	}

	@RequestMapping("/checkRegister")
	public String checkRegister( Model model,UserInfo userInfo) {

		
		String isExist =userService.checkUserIsExist(userInfo.getUserName());
		
		if("1".equals(isExist)){
			model.addAttribute("error", "username is exist");
		}else {
			UserInfo newUser = userService.register(userInfo);
			//
			if(newUser !=null){
				model.addAttribute("msg", "register ok");
				
			}else{
				
				model.addAttribute("msg", "register failed");
			}
		}
		
		
		return "register";
	}

	private String getErrorMessage(HttpServletRequest request, String key) {
		Exception exception = (Exception) request.getSession().getAttribute(key);
		String error = "";
		if (exception instanceof PasswordErrorException) {
			error = exception.getMessage();
		} else if (exception instanceof UserNotFoundException) {
			error = exception.getMessage();
		} else if (exception instanceof DisabledException) {
			error = exception.getMessage();
		} else if (exception instanceof LockedException) {
			error = exception.getMessage();
		} else {
			error = "Invalid username and password!";
		}

		return error;
	}

}
