package com.jafa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	public HomeController() {
		System.out.println("HomeController 빈 생성");
	}
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
