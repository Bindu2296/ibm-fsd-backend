<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
			<html><body><% HttpSession s =request.getSession();
	
	String uname=(String) s.getAttribute("username");
	String pword=(String) s.getAttribute("firstname");%>
<p>You Have Successfully logged in <% out.println(uname);%>!!</p></body>
	
	
	
	<h2>Welcome <% out.println(pword); %>!</h2> </p>
	<a href='index.jsp'>HOME</a></body>		</html>
		<a href='logout.jsp'>LOGOUT</a></body>		</html>
	
