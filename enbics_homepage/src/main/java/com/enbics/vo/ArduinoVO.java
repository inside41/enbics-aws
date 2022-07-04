package com.enbics.vo;

import java.time.LocalDateTime;

public class ArduinoVO extends CommonVO{
	private LocalDateTime write_date;
	private double temperature;
	private int heart_rate;
	private int oxygen_saturation;
	
	public LocalDateTime getWrite_date() {
		return write_date;
	}
	public void setWrite_date(LocalDateTime write_date) {
		this.write_date = write_date;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public int getHeart_rate() {
		return heart_rate;
	}
	public void setHeart_rate(int heart_rate) {
		this.heart_rate = heart_rate;
	}
	public int getOxygen_saturation() {
		return oxygen_saturation;
	}
	public void setOxygen_saturation(int oxygen_saturation) {
		this.oxygen_saturation = oxygen_saturation;
	}
}
