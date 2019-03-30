<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
			<html><body><% HttpSession s =request.getSession();
	
	String uname=(String) s.getAttribute("username");
	String pword=(String) s.getAttribute("firstname");%>
<p>Successfully done! </p></body>
	
		
	
	<a href="add.jsp">Add Employee</a><br>
<a href="viewall.jsp">View All Employee Data</a><br>
	<a href='index.jsp'>HOME</a></body>		</html>
		<a href='logout.jsp'>LOGOUT</a></body>		</html>
	
