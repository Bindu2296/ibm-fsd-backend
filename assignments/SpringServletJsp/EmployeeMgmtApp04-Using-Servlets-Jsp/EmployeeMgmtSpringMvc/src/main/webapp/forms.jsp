
<html>
<style>



button {
width: 150px;
	height: 40px;  background-color: black;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
label {
	font-size: 20px;
	text-align: left;
}

input,select {
	width: 350px;
	height: 40px;
	font-size: 15px;
}

body{
			font-family: Trebuchet MS, Arial, Helvetica, sans-serif;}


#b {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

#rad{
display:inline;}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Admin registration form</title>
</head>
<body><div align="center" id="b"><h2>Registration Form</h2>
<form action="register.do">
<label>Enter first name</label><input name="firstname" type="text"/><br><br>
<label>Enter last name</label><input name="lastname" type="text"/><br><br>
<label>Enter your Age</label><input name="age" type="number"/><br><br>
<label>Enter your city </label><select>
  <option >--select--</option>
  <option value="blore">Bangalore</option>
  <option value="chennai">Chennai</option>
  <option value="mysore">Mysore</option>
  <option value="delhi">Delhi</option>
</select><br><br>

<label>Enter username</label><input name="username" type="text"/><br><br>
<label>Enter password</label><input name="password" type="password"/><br><br>

<button type="submit">Submit</button><br>
<button type="reset">Reset</button>
</form></div>
</body>
</html>