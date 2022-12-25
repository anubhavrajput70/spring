<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
	<h1>this is home page</h1>
	<h2>called by home controller</h2>
	<h3>url /home</h3>
	
	<%
	//using scriplet tag
	//getting data which is set in the model with the help of key
		String name=(String)request.getAttribute("name");
		Integer id=(Integer)request.getAttribute("id");
		List<String> friends=(List<String>)request.getAttribute("f");
	%>
	
	<h1>name is <%=name%></h1>
	<h1>id is <%=id %> </h1>
	
	<%
		for(String s:friends)
		{
		%>
		
		<h1><%=s %></h1>
		
		<% 
		}
	%>
</body>
</html>