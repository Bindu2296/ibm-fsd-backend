<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
			<html>
			<style>
			body{
			font-family: Trebuchet MS, Arial, Helvetica, sans-serif;}
div {
width:650px;
  border-radius: 5px;
  background-color: #f2f2f2;
  padding-top: 50px;
  padding-bottom: 50px;
  padding-left: 50px;
  padding-right: 50px;
  margin-left: 400px;
  
}
a {
	height: 40px;  background-color: gray;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}</style>
			<body>
			<% HttpSession s =request.getSession();
	
	String uname=(String) s.getAttribute("username");
	String pword=(String) s.getAttribute("firstname");%>
<br><br><br><h2 align="center">Successfully done! </h2><br><br><br><br><br><br>
	
<div align="center">		
	
<a href="add.jsp">Add Employee</a></button><br><br><br>
<a href="viewall.jsp">View All Employee Data</a></button><br><br><br><br><br>
	<a href='index.jsp'>HOME</a>&nbsp &nbsp	
		<a href='logout.jsp'>LOGOUT</a></button></div></body>		</html>
	
