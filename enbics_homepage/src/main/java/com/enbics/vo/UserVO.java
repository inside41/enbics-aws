package com.enbics.vo;

public class UserVO extends CommonVO{
	private int idtb_user;
	private String user_id;
	private String user_pw;
	private String user_company;
	private char enable;
	
	public int getIdtb_user() {
		return idtb_user;
	}
	public void setIdtb_user(int idtb_user) {
		this.idtb_user = idtb_user;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_company() {
		return user_company;
	}
	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}
	public char getEnable() {
		return enable;
	}
	public void setEnable(char enable) {
		this.enable = enable;
	}
}
