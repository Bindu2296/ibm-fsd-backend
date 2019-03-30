<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

	<html>
	<style>
div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
body{
			font-family: Trebuchet MS, Arial, Helvetica, sans-serif;}
a {
width: 150px;
	height: 40px;  background-color: gray;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}</style><body><div align="center">
<p>Registration success </p>
	<p>First Name is: <% HttpSession s =request.getSession();
	
	String uname=(String) s.getAttribute("firstname");
	String pword=(String) s.getAttribute("lastname");
	out.println(uname); %></p>
	<p>Last Name is: <%out.println(pword); %> </p><br>
<a href='index.jsp'>HOME</a><br><br><br><a href='login.jsp'>LOGIN</a></button></div></body>

</html>