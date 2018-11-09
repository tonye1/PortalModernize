package com.ibm.demo.utility;

import java.util.Date;

public class CitiDataServiceEntity {

	String cityName;
	String weatherAlertType;
	Date time=null;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getWeatherAlertType() {
		return weatherAlertType;
	}
	public void setWeatherAlertType(String weatherAlertType) {
		this.weatherAlertType = weatherAlertType;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
	
	
	
	
}
