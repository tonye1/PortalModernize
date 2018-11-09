package com.ibm.demo.utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.ibm.demo.services.WeatherCompanyRESTfulService;
import com.ibm.demo.vo.WeatherAlerts;
import com.ibm.demo.weathercompany.json.Alert;
import com.ibm.demo.weathercompany.json.InternationalAlerts;
import com.mashape.unirest.http.exceptions.UnirestException;

public class InternationalDisasterDataService 
{

	
	Map internationalWeatherMap=new HashMap();
	
	
	
	List<String> numbers=null;
	HttpServletResponse response=null;
	
	
	public InternationalDisasterDataService (HttpServletResponse response)
	{
		
		
		this.response=response;
		
		
		
	}
	public Map getInternationHashMap()
	{
		return internationalWeatherMap;
	}
	
		
	public void getAlertData() {

		List<String> numbers = new ArrayList<String>();
		List<WeatherAlerts> uialertList = new ArrayList<WeatherAlerts>();
		System.out.println("Entering getAkertData");

	
		
		//String sampleURL="https://twcservice.mybluemix.net/api/weather/v1/country/US/state/GA/alerts.json?language=en-US";
	
		//String baseURL="https://twcservice.mybluemix.net/api/weather/v1/country/US/state/";
	
		//String postfixURL="/alerts.json?language=en-US";
	
		InternationalAlerts internationalAlerts = null;
	
		
		//String states[]={"UT","ID","FL","CA"};
	
		String states[]={"FL","CA"};
		
		
		for(String state : states)
		{
			
			
			System.out.println("StateName="+state);
			String url=DemoCodeConstants.baseURL+state+DemoCodeConstants.postfixURL;
		
		
			try
			{
			 internationalAlerts = WeatherCompanyRESTfulService.postHttp(url);
			}
			catch(Exception ae)
			{
				
			}
			
		
			
			if(internationalAlerts!=null)
				{
					
					   int statusCode = Integer.parseInt(internationalAlerts.getMetadata().getStatusCode().toString()); 
					   System.out.println("Status Code for state" + state +"="+statusCode);
					   if(statusCode==400)
					   {
						 System.out.println("400 for a state. Means Data temporarily unavailable");   
						 
						 WeatherAlerts weatherAlerts=new WeatherAlerts();
						 weatherAlerts.setAlertDesc("Data not available");
						// weatherAlerts.setState(internationalAlerts.getMetadata().getStateCd());
						 weatherAlerts.setPhoneNumber("Phone nummber removed for security");
						 weatherAlerts.setState("NA");
						 uialertList.add(weatherAlerts);
						 
	
						
						   
					   }
					   else
					   {
						   
						   List<Alert> alertList=internationalAlerts.getAlerts();
							for(Alert alert:alertList)
								{
				
									if(alert.getHeadlineText()!=null && !alert.getHeadlineText().equalsIgnoreCase(""))
								
										{
										WeatherAlerts weatherAlerts=new WeatherAlerts();
										
										weatherAlerts.setAlertDesc(alert.getEventDesc());
										weatherAlerts.setState(internationalAlerts.getMetadata().getStateCd());
										weatherAlerts.setHeadlineText(alert.getHeadlineText());
										weatherAlerts.setSeverity(alert.getSeverity());
										weatherAlerts.setSignificance(alert.getSignificance());
										
									
										
										uialertList.add(weatherAlerts);
										
	
							
										 
										break ;
										}
								}
					   }
				}
		
		     //internationalWeatherMap.put(state,uialertList );
		     
		    
		} 
		handleResponse(response, uialertList);
		
		 
		
	}
	
	public void handleResponse(HttpServletResponse response,List<WeatherAlerts> uialertList)
	{
		String json = new Gson().toJson(uialertList);
		System.out.println("Inside Handle Response. Printing JSON="+json);
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    try {
			response.getWriter().write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
}
