package com.enbics.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.enbics.member.dao.UserDAO;
import com.enbics.vo.AuthoritiesVO;
import com.enbics.vo.UserVO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public void addUser(UserVO userInfo, AuthoritiesVO authoritiesInfo) {
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		userInfo.setUser_pw(passwordEncoder.encode(userInfo.getUser_pw()));
		userDAO.insertUser(userInfo);
		authoritiesInfo.setUser_idtb(userDAO.selectUser(userInfo.getUser_id()));
		userDAO.insertAuthorities(authoritiesInfo);
		
	}
}
