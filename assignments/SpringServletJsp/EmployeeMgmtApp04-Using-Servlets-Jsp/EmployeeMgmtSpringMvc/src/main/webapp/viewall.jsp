<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.spring.mvc.EmpService, com.spring.mvc.Employees, com.spring.mvc.E,java.util.*" %>  
<!DOCTYPE html>
<html>
<style>
div {
  border-radius: 5px;
  padding: 20px;
}
a {
	height: 20px;  background-color: gray;
  color: white;
padding-left:10px;
padding-right:10px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
#home {
width: 150px;
	height: 40px;  background-color: black;
  color: white;
  padding: 14px 20px;
  margin: 20px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

table {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #ddd;
  padding: 8px;
}

 tr:nth-child(even){background-color: #f2f2f2;}

tr:hover {background-color: #ddd;}

 th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: olive;
  color: white;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><div align="center">
<h2 style=" font-family: Trebuchet MS, Arial, Helvetica, sans-serif;">Employees List</h2>
<table >
		
			<tr style="border: 2px;">
				<th>ID</th>
				<th> Name</th>
				<th>Age</th>
				<th>Designation</th>
				<th>Department</th>
				<th>Salary</th>
		        <th>Actions<th>
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
			 <td><a href="edit.jsp?name=<%=emp.getEmpName()%>&id=<%=emp.getEmpId()%>&dob=<%=emp.getAge()  %>&designation=<%=emp.getDesignation()%>&department=<%= emp.getDepartment()%>&salary=<%=emp.getSalary()%>">Edit</a></button></td>

				<td><a href="delete?id=<%=emp.getEmpId()%>">Delete</a><tr>

			 
			
		 <% 
		 } 
		 %>
		 			
		<br><br><br> 
	</table>	
			
	<br><br><br><br><a id="home" href='log.jsp'>HOME</a></body></html>
</div>			
</body>
</html>