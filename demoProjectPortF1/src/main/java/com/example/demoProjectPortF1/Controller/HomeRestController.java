package com.example.demoProjectPortF1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

	@RequestMapping(path="/admin")
	public String getAdmin() {		
		return "admin";
	}
}
