<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
	<html><body>
<p>Hey there..Registration success </p></body>
	<p>First Name is: <% HttpSession s =request.getSession();
	
	String uname=(String) s.getAttribute("firstname");
	String pword=(String) s.getAttribute("lastname");
	out.println(uname); %></p>
	<p>Last Name is: <%out.println(pword); %> </p>
<a href='index.jsp'>HOME</a><br><a href='login.jsp'>LOGIN</a></body>

</html>