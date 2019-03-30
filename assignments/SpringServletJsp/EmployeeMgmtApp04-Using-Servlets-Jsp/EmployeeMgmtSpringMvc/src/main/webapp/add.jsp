<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
button,a {
width: 150px;
	height: 40px;  background-color: black;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

a{
background-color: black;
  color: white;
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
<title>Register</title>
 
</head>
<body><h1 align="center">Add Employee </h1>
<div align="center">

<form action="add.do">

<label>Enter Employee Id</label><input type="number" name="id" placeholder="Enter Id" /><br><br>

<label>Enter the Name</label><input type="text" name="eName"
placeholder="Enter Name" /><br><br>


<label>Enter Date Of Birth</label><input type="date" name="dob" placeholder="select DOB" /><br><br>

<label>Enter Designation</label><input type="text" name="designation" placeholder="Enter Designation" /><br><br>

<label>Enter Department</label><input type="text" name="dept" placeholder="Enter Department" /><br><br>

<label>Enter the Salary</label><input type="number" name="salary" placeholder="Enter salary" /><br><br><br><br><br><br>
<button type="submit" value="submit" class="button" style="background-color: green;">Submit</button>&nbsp
<button type="reset" class="button" style="background-color: orange ;">RESET</button><br>
</form><br>
<a href="log.jsp">HOME</a><br><br><br></div>
</body>
</html>