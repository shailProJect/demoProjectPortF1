package com.example.demoProjectPortF1.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	/*
	 * @Value("${Name}") private String name;
	 */
	
	@RequestMapping(path="/admin1")
	public ModelAndView getAdmin() {	
		ModelAndView m =new ModelAndView("home");
		return m;
	}
}
