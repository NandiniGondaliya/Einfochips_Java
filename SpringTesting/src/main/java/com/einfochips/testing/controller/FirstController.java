package com.einfochips.testing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.einfochips.testing.model.Member;

@RestController
public class FirstController {

	@RequestMapping("home")
	public String getHome() {
		return "Home page is here";
	}
	
	@RequestMapping("index")
	public String getIndex() {
		return "index page is here";
	}
	@RequestMapping("login")
	public String getLogin() {
		return "Login page is here";
	}
}
