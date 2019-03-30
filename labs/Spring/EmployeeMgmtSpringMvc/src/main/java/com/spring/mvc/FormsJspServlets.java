package com.spring.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
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
	String uname=request.getParameter("username");
	String pword=request.getParameter("password");

	
	
	HttpSession session = request.getSession();

	session.setAttribute("firstname", fname);
	session.setAttribute("lastname", lname);
	session.setAttribute("username", uname);
	session.setAttribute("password", pword);

	System.out.println("usrname= " +uname+" password: "+pword);
	
	// out=response.getWriter();
	RequestDispatcher dis=request.getRequestDispatcher("reg.jsp");  
	try {
		dis.forward(request, response);
	} catch (ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}



}



public void destroy() {
	
	System.out.println("Forms Servlet destroyed");

}

}
