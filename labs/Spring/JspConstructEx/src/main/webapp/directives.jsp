<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<html>
<body>
<h2>Hello World!</h2>

<!-- Declerations -->
<% 
List<String> countries = Arrays.asList("UK","US","India");

out.println(countries);


out.println(request.getRemoteAddr());
%>



<!-- Scriplets -->





</body>
</html>