<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
button {
width: 150px;
	height: 40px;  background-color: black;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  margin-left:650px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input,select {
	width: 350px;
	height: 40px;
	font-size: 15px;
	
}
body{
			font-family: Trebuchet MS, Arial, Helvetica, sans-serif;}
label {
    width:180px;
    clear:left;
    text-align:right;
    padding-right:10px;
    	font-size: 20px;
    
}

input,select, label {
   padding-left:260px; float:left;
}



div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Edit Employee Details</h2><br><br><br>
<div>
		<form action="edit?id=<%=request.getParameter("id") %>" method="POST">


<label>Enter Name</label><input type="text" name="eName"
placeholder="Enter Name" value="<%=request.getParameter("name")%>"/><br><br>


<label>Enter dob</label><input type="date" name="dob" placeholder="select DOB" value="<%=request.getParameter("dob")%>"/><br><br>

<label>Enter designation</label><input type="text" name="designation" placeholder="Enter Designation" value="<%=request.getParameter("designation")%>"/><br><br>

<label>Enter dept</label><input type="text" name="dept" placeholder="Enter Department" value="<%=request.getParameter("department")%>"/><br><br>

<label>Enter salary</label><input type="number" name="salary" placeholder="Enter salary" value="<%=request.getParameter("salary")%>"/><br><br><br><br>
<br> <button type="submit" value="submit" class="button">Submit</button><br>
<button type="reset" class="button">RESET</button>
</form><br></div>
</body>
</html>