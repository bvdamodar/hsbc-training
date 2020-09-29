<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authenticator</title>
</head>
<body>
	<%
		String uname = request.getParameter("name");
		String pwd = request.getParameter("pwd");

		if (uname.equals(pwd)) {

			ArrayList<String> users = new ArrayList<>();

			users.add("Ramesh");
			users.add("Suresh");
			users.add("Mamesh");
			users.add("Kamesh");
			users.add("Sailesh");

			session.setAttribute("data", users);
	%>
	<jsp:forward page="success.jsp" />
	<%
		} else {
	%>
	<jsp:forward page="failure.jsp" />
	<%
		}
	%>
</body>
</html>