<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success page</title>
</head>
<body>
<h1>${head }</h1>
<p>${desc }</p>
<hr>
	<h1>welcome, ${user.userName }</h1>
	<h1>your email is ${user.email }</h1>
	<h1>your password is ${user.password } try to secure it</h1>


</body>
</html>