package com.enbics.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enbics.member.service.UserService;
import com.enbics.vo.AuthoritiesVO;
import com.enbics.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/join.do")
	public String addUserPage(Model model) {
		return "user/join";	
	}
	
	@RequestMapping(value="/addUser.do")
	public String addUser(Model model, UserVO userInfo, AuthoritiesVO authoritiesInfo) {
		
		userService.addUser(userInfo,authoritiesInfo);
		
		return "redirect:/main.do";
	}
	
}
