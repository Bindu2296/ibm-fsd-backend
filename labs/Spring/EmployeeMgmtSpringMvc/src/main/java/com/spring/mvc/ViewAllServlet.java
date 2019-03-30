package com.spring.mvc;




	import java.io.IOException;

	import java.io.PrintWriter;
	import java.sql.SQLException;
	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.Period;
	import java.time.format.DateTimeFormatter;
	import java.util.Enumeration;
	import java.util.List;

	import javax.servlet.ServletConfig;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	import com.spring.mvc.Employees;
	import com.spring.mvc.EmpService;

	public class ViewAllServlet  extends HttpServlet {
		EmpService employeeService =new EmpService();



		public void init() {
			System.out.println("Employee Servlet Initialized");
			
			
		}

		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			doPost(request, response);
		}

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
			
			HttpSession session = request.getSession();
			try {
			List<Employees> elist=employeeService.viewEmployees();
			request.setAttribute("employeeDetails",elist);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			response.sendRedirect("viewall.jsp");
			

			

		}

	}
	

