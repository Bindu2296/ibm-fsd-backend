<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<style>body{
			font-family: Trebuchet MS, Arial, Helvetica, sans-serif;}</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%session.invalidate();%>
You have logged out. Please
<a href="login.jsp"><b>Login</b>s</a>
</body>
</html>