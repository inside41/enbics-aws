package com.enbics.common.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class CustomLoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler { 
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth) throws IOException, ServletException { 
		
		super.onAuthenticationSuccess(request, response, auth); 
		
	} 
	
}
