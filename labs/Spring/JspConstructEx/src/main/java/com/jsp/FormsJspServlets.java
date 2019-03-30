package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FormsJspServlets extends HttpServlet{
public void init() {
		
		System.out.println("Forms Servlet initialized");

		}
	
	
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
{
doPost(request, response);
}

public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
{
	
	
	String fname=request.getParameter("firstname");
	String lname=request.getParameter("lastname");
	
	
	PrintWriter out=response.getWriter();
	out.println("<!DOCTYPE html>");
	out.println("<html><body>");
	out.println("<p>Hey there</p></body>");
	out.println("<p>First Name is: "+fname+"</p>");
	out.println("<p>Last Name is: "+lname+"</p>");
	out.println("<a href='index.html'>HOME</a></body>"); 
out.println("</html>");


HttpSession session = request.getSession();

session.setAttribute("firstname", fname);
session.setAttribute("lastname", lname);
System.out.println("usrname= " +fname+" password: "+lname);

}



public void destroy() {
	
	System.out.println("Forms Servlet destroyed");

}

}
