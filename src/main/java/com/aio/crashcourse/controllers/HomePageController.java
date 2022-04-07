package com.aio.crashcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
	
	@RequestMapping("/homepage.html")
	private ModelAndView homePage() {
		String user = "John Smith";
		return new ModelAndView("homepage", "omcUser",user );
	}

}
