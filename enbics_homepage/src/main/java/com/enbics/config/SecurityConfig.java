package com.enbics.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.enbics.common.security.CustomAccessDeniedHandler;
import com.enbics.common.security.CustomLoginSuccessHandler;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll()
		.antMatchers("/map.do","/sanupdanji.do").authenticated()
		.antMatchers("/join.do","/main2.do").hasRole("ADMIN");
		
		//로그인 페이지 설정
		http.formLogin()
		//.loginPage("")
		.successHandler(authenticationSuccessHandler());
		
		//로그아웃 페이지 설정
		http.logout()
		.invalidateHttpSession(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/main.do");
		
		http.exceptionHandling()
		.accessDeniedHandler(accessDeniedHandler());
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		String idQuery = "SELECT user_id, user_pw, enable FROM tb_user WHERE user_id = ?";
		String authoritiesQuery = "SELECT b.user_id, a.user_authorities FROM tb_authorities a, tb_user b WHERE a.user_idtb = b.idtb_user AND b.user_id = ?";
		
		auth.jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery(idQuery)
		.authoritiesByUsernameQuery(authoritiesQuery)
		.passwordEncoder(passwordEncoder());
	}	
	
	@Bean
	public AccessDeniedHandler accessDeniedHandler() {
		return new CustomAccessDeniedHandler();
	}
	
	@Bean
	public AuthenticationSuccessHandler authenticationSuccessHandler() {
		return new CustomLoginSuccessHandler();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
