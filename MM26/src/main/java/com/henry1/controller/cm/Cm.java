package com.henry1.controller.cm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Cm {

	@RequestMapping(value = "cm0000")
	public String init() {

		return "cm/home";
	}

	@RequestMapping("leftMenu")
	public String initMenu() {

		return "cm/left-menu";
	}

	@RequestMapping("centerContent")
	public String initContent() {

		return "cm/center-content";
	}

}
