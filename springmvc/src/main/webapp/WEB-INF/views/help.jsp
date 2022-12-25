<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- now it will not ignore expression language -->
<%@page isELIgnored="false" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>

	<%
		/* String name=(String)request.getAttribute("name");
		Integer roll=(Integer)request.getAttribute("rollnumber");
		LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
		
		%>

	<h1>this is my help page</h1>
<!-- 	fetching name directly with the help of JSP Expression language -->
	<h1>hello my name is <%-- <%=name %> --%>${name}</h1>
	<h1>my rollnumber is <%-- <%=roll %> --%>${roll } </h1>
	<!-- we can use toString method too but scriplet tag will automatically change time to string -->
	<h1>Date and Time is <%-- <%=time%> --%>${time }</h1>
	
	<hr>
	<!-- using jstl tag and taglib to print list -->
	
	<c:forEach var="item" items="${marks }">
		<h3>${item}</h2>
	</c:forEach>
	
	
</body>
</html>