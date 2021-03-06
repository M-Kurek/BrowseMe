package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(method = RequestMethod.GET, value={"", "/"})
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "now : " + new java.sql.Timestamp(System.currentTimeMillis()));
		return "hello";
	}

}