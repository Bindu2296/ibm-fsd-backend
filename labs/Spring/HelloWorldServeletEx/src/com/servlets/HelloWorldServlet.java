package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{

	//Called when getting loaded into web container
	
	public void init() {
		
		System.out.println("HelloWorldServlet initialized");
	}
	
	
	//called for every HTTP request
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		System.out.println("Servlet invoked");
		
		//output stream to write data into HTTP response
		PrintWriter out= response.getWriter();
		out.println("Hello World");
		
		out.println("Current date is :"+LocalDate.now());
	}
	
	//
	public void destroy() {
		
		System.out.println("HelloWorldServlet destroyed");

	}
	
}
