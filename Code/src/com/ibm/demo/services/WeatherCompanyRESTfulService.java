package com.ibm.demo.services;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.demo.utility.AlertsException;
import com.ibm.demo.utility.DemoCodeConstants;

import com.ibm.demo.weathercompany.json.InternationalAlerts;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.http.utils.Base64Coder;

public class WeatherCompanyRESTfulService  {
	
	
	public static void main (String[] args) throws Exception
	{
		postHttp("https://removed.net/api/weather/v1/country/US/state/NY/alerts.json?language=en-US");
	}
	
	public static InternationalAlerts postHttp(String url) throws UnirestException, AlertsException {
		
		InternationalAlerts internationalAlerts=null;
		
		try {
			System.out.println("Inside postHTTP to invoke WeatherCompanyServiceAlerts");
			
			HttpResponse<String> response=Unirest.get(url).header("cache-control", "no-cache").header("Content-Type", "application/json").
			header("Authorization", "Basic " + Base64Coder.encodeString(DemoCodeConstants.userName + ":" + DemoCodeConstants.password))
					  					.asString();
					  
					  
					  //int status=jsonResponse.getStatus();
					  //String statusText=jsonResponse.getStatusText();
					  
					  System.out.println(response.getBody()+"Status="+response.getStatus());
					  ObjectMapper objectMapper=new ObjectMapper();
					  internationalAlerts=
							  objectMapper.readValue(response.getBody(), InternationalAlerts.class);
					  System.out.println("INternationalAlerts statusCode="+internationalAlerts.getMetadata().getStatusCode());
					  System.out.println("INternationalAlerts transactionID="+internationalAlerts.getMetadata().getTransactionId());
					  
					  
			}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			throw new AlertsException(e.getMessage());
		}
		return internationalAlerts;
	}

}
