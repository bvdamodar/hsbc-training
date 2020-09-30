<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>
</head>
<body>
	<% List<String> rl = (List<String>) session.getAttribute("list");
		for(String s: rl){
			out.print(s);
		}
	%>
</body>
</html>