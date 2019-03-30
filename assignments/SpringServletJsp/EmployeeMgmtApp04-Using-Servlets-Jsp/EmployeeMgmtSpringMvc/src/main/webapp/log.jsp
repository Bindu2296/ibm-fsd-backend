<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html><style>
body{
			font-family: Trebuchet MS, Arial, Helvetica, sans-serif;}
div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 50px;
  padding-bottom: 200px;
}
a {
width: 150px;
	height: 40px;  background-color: olive;
  color: white;
  padding: 14px 20px 14px 14px;
  
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}</style>
			<html><body><div align="center"><% HttpSession s =request.getSession();
	
	String uname=(String) s.getAttribute("username");
	String pword=(String) s.getAttribute("firstname");%>
<p>You Have Successfully logged in as <% out.println(uname);%>!!</p></body>
	
	
	
	<h2>Welcome <% out.println(pword); %>!</h2> </p>
	
	
	<br><br><br><a href="add.jsp">Add Employees</a><br><br><br></button>
<a href="viewall.jsp">List Employees Data</a><br><br><br><br></button>
<a href='index.jsp'>HOME</a></body>	</button>	
	<a href='logout.jsp'>LOGOUT</a></button></div></body>		</html>
	
