package com.servlets.maven;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoggingFilters implements Filter {
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {
	// TODO Auto-generated method stub
	 String host =(String) request.getRemoteHost();
	 System.out.println("request Received host: "+host+"at "+LocalDate.now());
	 chain.doFilter(request, response);
	
}
	
	
}
