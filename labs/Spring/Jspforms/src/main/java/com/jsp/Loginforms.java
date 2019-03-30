package com.jsp;

	

	import java.io.IOException;
	import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

	public class Loginforms  extends HttpServlet{
	public void init() {
			
			System.out.println("Login Servlet initialized");
		}
		
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	doPost(request, response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		HttpSession session =request.getSession();
		
		String uname=(String) session.getAttribute("username");
		String pword=(String) session.getAttribute("password");
		
		

		//System.out.println("usrname= " +username+" password: "+password);
		System.out.println("Session usrname= " +uname+" password: "+pword);
		
		System.out.println("Session Firstname: " +(String) session.getAttribute("firstname")+" Lastname: "+(String) session.getAttribute("lastname"));

		PrintWriter out=response.getWriter();
		if(username.equals(uname) && password.equals(pword)) {
			
		//	response.sendRedirect();
			RequestDispatcher dis=request.getRequestDispatcher("log.jsp");  
			try {
				dis.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			}
		else {
			RequestDispatcher dis=request.getRequestDispatcher("err.jsp");  
			try {
				dis.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}



	public void destroy() {
		
		System.out.println("Login Servlet destroyed");

	}

	}


