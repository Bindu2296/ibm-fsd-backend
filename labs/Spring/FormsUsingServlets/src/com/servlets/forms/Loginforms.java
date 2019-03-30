package com.servlets.forms;

	

	import java.io.IOException;
	import java.io.PrintWriter;

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
		
		String uname=(String) session.getAttribute("firstname");
		String pword=(String) session.getAttribute("lastname");
		
		

		System.out.println("usrname= " +username+" password: "+password);
		System.out.println("Session usrname= " +uname+" password: "+pword);
		
		System.out.println("Session usrname= " +(String) session.getAttribute("firstname")+" password: "+(String) session.getAttribute("lastname"));

		PrintWriter out=response.getWriter();
		if(username.equals(uname) && password.equals(pword)) {
			out.println("<!DOCTYPE html>");
			out.println("<html><body>");
			out.println("<p>Login success</p><h1>"+username+"</h1><br><h1>"+password+"</h1></body>");
			out.println("</html>");
		//	response.sendRedirect();

			}
		else {
			out.println("<!DOCTYPE html>");
			out.println("<html><body>");
			out.println("<p>Login not success</p></body>");
			out.println("</html>");
		}
		
		
		
	}



	public void destroy() {
		
		System.out.println("Login Servlet destroyed");

	}

	}


