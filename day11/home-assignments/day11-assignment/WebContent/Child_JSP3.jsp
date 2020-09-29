<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Child JSP-3</title>
</head>
<body>
	<a>Header file (Child3) : </a>
	<%
		int count = 2;
		count++;
		out.println(count);
	%>
</body>
</html>