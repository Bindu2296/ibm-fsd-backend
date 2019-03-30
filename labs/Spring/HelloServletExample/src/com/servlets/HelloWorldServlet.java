package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Enumeration;

import javax.print.DocFlavor.STRING;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class HelloWorldServlet extends HttpServlet{

	//Called when getting loaded into web container
	
	public void init() {
		
		System.out.println("HelloWorldServlet initialized");
	}
	
	
	//called for every HTTP request
	/*public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		System.out.println("Servlet invoked");
		
		//output stream to write data into HTTP response
		PrintWriter out= response.getWriter();
		out.println("Hello World");
		
		out.println("Current date is :"+LocalDate.now());
	}*/
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	System.out.println("context Path"+request.getContextPath());
	Enumeration<String> headerNames=request.getHeaderNames();
	while(headerNames.hasMoreElements()) {
		String hn=headerNames.nextElement();
		System.out.println(hn+":"+request.getHeader(hn));
	}
	response.setContentType("text/html");
	System.out.println("Service is called");
PrintWriter out=response.getWriter();
out.println("<!DOCTYPE html>");
out.println("<html><body>");
out.println("<p>Hey there</p></body>");
out.println("</html>");



	
	}
	
	
	//
	public void destroy() {
		
		System.out.println("HelloWorldServlet destroyed");

	}
	
}
