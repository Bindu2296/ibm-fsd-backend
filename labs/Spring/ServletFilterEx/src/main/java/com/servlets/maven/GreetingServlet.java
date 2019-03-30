package com.servlets.maven;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

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
//System.out.println("Hello there..");

response.setContentType("text/html");

// Output stream to write data into HTTP response
PrintWriter out = response.getWriter();
out.println("<!DOCTYPE html>");
out.println("<html><body>");
out.println("<h1>Hello World Servlet</h1>");
out.println("<h2>Current Date: " + LocalDateTime.now()+"</h2>");
out.println("</body></html>");		
}



public void destroy() {
	
	System.out.println("greetings Servlet destroyed");

}
}
