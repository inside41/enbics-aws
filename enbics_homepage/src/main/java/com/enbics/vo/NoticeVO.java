package com.enbics.vo;

import java.time.LocalDateTime;

public class NoticeVO {
	private int idtb_notice;
	private String title;
	private String contents;
	private int hit_cnt;
	private LocalDateTime create_date;
	private String create_id;
	private LocalDateTime update_date;
	private String update_id;
	private char delete_flag;
	
	public int getIdtb_notice() {
		return idtb_notice;
	}
	public void setIdtb_notice(int idtb_notice) {
		this.idtb_notice = idtb_notice;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getHit_cnt() {
		return hit_cnt;
	}
	public void setHit_cnt(int hit_cnt) {
		this.hit_cnt = hit_cnt;
	}
	public LocalDateTime getCreate_date() {
		return create_date;
	}
	public void setCreate_date(LocalDateTime create_date) {
		this.create_date = create_date;
	}
	public String getCreate_id() {
		return create_id;
	}
	public void setCreate_id(String create_id) {
		this.create_id = create_id;
	}
	public LocalDateTime getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(LocalDateTime update_date) {
		this.update_date = update_date;
	}
	public String getUpdate_id() {
		return update_id;
	}
	public void setUpdate_id(String update_id) {
		this.update_id = update_id;
	}
	public char getDelete_flag() {
		return delete_flag;
	}
	public void setDelete_flag(char delete_flag) {
		this.delete_flag = delete_flag;
	}
}
