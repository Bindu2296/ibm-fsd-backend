package com.spring.mvc;


	import java.io.IOException;

	import java.io.PrintWriter;
	import java.sql.SQLException;
	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.Period;
	import java.time.format.DateTimeFormatter;
	import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;
	import com.spring.mvc.EmpService;

	import com.spring.mvc.Employees;
	public class DeleteServlet extends HttpServlet {
		
		EmpService employeeService =new EmpService();
		

		public void init() {
			System.out.println("Delete Servlet Initialized");
			
			
		}

		/*public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
		}*/

		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			
			HttpSession session = request.getSession();
			
			
			int id = Integer.parseInt( request.getParameter("id"));

					try {
				employeeService.deleteEmployee(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
					RequestDispatcher dis=request.getRequestDispatcher("viewall.jsp");  
					try {
						dis.forward(request, response);
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			
		
		}
	}
		
		

	






