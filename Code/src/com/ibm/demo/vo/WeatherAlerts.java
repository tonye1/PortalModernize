package com.ibm.demo.vo;

import java.util.Date;

public class WeatherAlerts 
{
	

	String alertsType="";
	String alertDesc="";
	String alertsCategory="";
	String state="";
	String headlineText="";
	String significance="";
	String severity="";
	String phoneNumber="";
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHeadlineText() {
		return headlineText;
	}
	public void setHeadlineText(String headlineText) {
		this.headlineText = headlineText;
	}
	public String getSignificance() {
		return significance;
	}
	public void setSignificance(String significance) {
		this.significance = significance;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	Date alertDate= new Date();
	public String getAlertsType() {
		return alertsType;
	}
	public void setAlertsType(String alertsType) {
		this.alertsType = alertsType;
	}
	public String getAlertDesc() {
		return alertDesc;
	}
	public void setAlertDesc(String alertDesc) {
		this.alertDesc = alertDesc;
	}
	public String getAlertsCategory() {
		return alertsCategory;
	}
	public void setAlertsCategory(String alertsCategory) {
		this.alertsCategory = alertsCategory;
	}
	public Date getAlertDate() {
		return alertDate;
	}
	public void setAlertDate(Date alertDate) {
		this.alertDate = alertDate;
	}

	
	
}
