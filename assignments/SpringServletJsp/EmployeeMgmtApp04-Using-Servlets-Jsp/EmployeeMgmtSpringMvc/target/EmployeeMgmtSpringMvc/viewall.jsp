<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.spring.mvc.EmpService, com.spring.mvc.Employees, com.spring.mvc.E,java.util.*" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table >
		
			<tr style="border: 2px;">
				<th>ID</th>
				<th> Name</th>
				<th>Age</th>
				<th>Designation</th>
				<th>Department</th>
				<th>Salary</th>
		
			</tr>
		<%
		EmpService es=new EmpService();
		E e= new E();
		List<Employees> emplist= new ArrayList();
		emplist=e.viewEmployees();
		for(Employees emp:emplist)
		{ %>
	
			<tr>
						 <td><%= emp.getEmpId()  %></td>			
			
			 <td><%= emp.getEmpName()  %></td>			
			  <td><%= emp.getAge()  %></td>
			  <td><%= emp.getDesignation()  %></td>
			  <td><%= emp.getDepartment()  %></td>
			  <td><%= emp.getSalary()  %></td>
			 <td><a href="edit.jsp?name=<%=emp.getEmpName()%>&id=<%=emp.getEmpId()%>&dob=<%=emp.getAge()  %>&designation=<%=emp.getDesignation()%>&department=<%= emp.getDepartment()%>&salary=<%=emp.getSalary()%>">Edit</a></td>

				<td><a href="delete?id=<%=emp.getEmpId()%>">Delete</a>

			 
			
		 <% 
		 } 
		 %>
		 			
		 
	</table>	
			
	<a href='log.jsp'>HOME</a></body></html>
			
</body>
</html>