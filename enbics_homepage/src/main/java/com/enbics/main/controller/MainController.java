package com.enbics.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value={"/","/main.do"})
	public String mainPage(Model model) {
		return "main/index";
	}
	
	@RequestMapping(value={"/main2.do"})
	public String mainBackupPage(Model model) {
		return "main/index2";
	}
}
