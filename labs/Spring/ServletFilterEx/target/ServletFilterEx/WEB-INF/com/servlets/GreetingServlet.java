package com.servlets.maven;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingServlet extends  HttpServlet{

	public void init() {
		
		System.out.println("Greeting Servlet initialized");
	}
	
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
{
doPost(request, response);
}

public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
{
System.out.println("Hello there..");
}



public void destroy() {
	
	System.out.println("greetings Servlet destroyed");

}
}
