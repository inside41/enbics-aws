package com.enbics.vo;

import java.time.LocalDateTime;

public class SanupdanjiVO {
	private String dan_id;
	private String dan_name;
	private String dan_type;
	private double lat;
	private double lng;
	private LocalDateTime create_date;
	public String getDan_id() {
		return dan_id;
	}
	public void setDan_id(String dan_id) {
		this.dan_id = dan_id;
	}
	public String getDan_name() {
		return dan_name;
	}
	public void setDan_name(String dan_name) {
		this.dan_name = dan_name;
	}
	public String getDan_type() {
		return dan_type;
	}
	public void setDan_type(String dan_type) {
		this.dan_type = dan_type;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public LocalDateTime getCreate_date() {
		return create_date;
	}
	public void setCreate_date(LocalDateTime create_date) {
		this.create_date = create_date;
	}
}
