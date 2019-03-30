<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="edit?id=<%=request.getParameter("id") %>" method="POST">


<label>Enter Name</label><input type="text" name="eName"
placeholder="Enter Name" value="<%=request.getParameter("name")%>"/>


<label>Enter dob</label><input type="date" name="dob" placeholder="select DOB" value="<%=request.getParameter("dob")%>"/>

<label>Enter designation</label><input type="text" name="designation" placeholder="Enter Designation" value="<%=request.getParameter("designation")%>"/>

<label>Enter dept</label><input type="text" name="dept" placeholder="Enter Department" value="<%=request.getParameter("department")%>"/>

<label>Enter salary</label><input type="number" name="salary" placeholder="Enter salary" value="<%=request.getParameter("salary")%>"/>
<br> <input type="submit" value="submit" class="button" />
<button type="reset" class="button">RESET</button>
</form><br>
</body>
</html>