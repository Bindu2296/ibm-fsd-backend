package com.spring.mvc;


	

	import java.io.IOException;

	import java.io.PrintWriter;
	import java.sql.SQLException;
	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.Period;
	import java.time.format.DateTimeFormatter;
	import java.util.Enumeration;

	import javax.servlet.ServletConfig;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	import com.spring.mvc.Employees;
	import com.spring.mvc.EmpService;

	public class AddServlet extends HttpServlet {
		EmpService employeeService =new EmpService();


		public void init() {
			System.out.println("Employee Servlet Initialized");
			
			
		}

		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
		}

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
			
			HttpSession session = request.getSession();
			
			
			int id = Integer.parseInt( request.getParameter("id"));

			String ename = request.getParameter("eName");
			String designation = request.getParameter("designation");
			String dept = request.getParameter("dept");
			String salary=request.getParameter("salary");
			Double sal=Double.parseDouble(salary);
			
			String date=request.getParameter("dob");
			int age =calculateAge(date);

			
			
			Employees emp=new Employees(ename,id,age,designation,dept,sal);
			try {
				employeeService.addEmployee(emp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("add.jsp");
			

			

		}
		
		private int calculateAge(String dob) {
			// TODO Auto-generated method stub
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        LocalDate bday=LocalDate.parse(dob, formatter);
			Period p=Period.between(bday, LocalDate.now());
			int age=p.getYears();
			return age;
		}

	}


