package com.enbics.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/logout")
	public String logoutForm() {
		return "login";
	}

}
