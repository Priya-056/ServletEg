package com.sonata.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	@GetMapping("/")
	public String greeting() {
		return "Welcome your SECURITY ENABLED";
	}
}
