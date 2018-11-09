package com.ibm.demo.web;



import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ibm.demo.utility.InternationalDisasterDataService;



/**
 * Servlet implementation class CFCOntroller
 */

public class CFCOntroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CFCOntroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside getxx.....");
		
		
		try
		{
			 
			  callService(request.getSession(), request, response);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside post");
		
		
	doGet(request, response);
		
	}

	
		
		
		

	

public void callService(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws InterruptedException
{
	
		
	  System.out.println("Inside callService");
	
	
	
	
	
	InternationalDisasterDataService internationalDisasterDataService=new InternationalDisasterDataService(response);
	internationalDisasterDataService.getAlertData();
	
	
	
	
	}
	
}

	