<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import = "ua.gash.db.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello but what a fuck???</h1>
<h2>I wanna get out of here!</h2>
<br>
	<%
		for(String name : DatabaseFacade.getBooks()){
			out.println(name + "<br/>");
		}
	%>
</body>
</html>