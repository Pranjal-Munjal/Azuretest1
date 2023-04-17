package com.assign5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping()
	public String homePage() {
		return "index";
	}
	
	@GetMapping("/taxform")
	public String taxformPage() {
		return "taxform";
	}
	
	@GetMapping("/reviews")
	public String reviewsPage() {
		return "reviews";
	}
	
	@GetMapping("/contact")
	public String contactPage() {
		return "contact";
	}
}