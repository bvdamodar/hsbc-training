<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Child JSP-1</title>
</head>
<body>
	<a>Header file (Child1) : </a>
	<%
		int count = 0;
		count++;
		out.println(count);
	%>
</body>
</html>