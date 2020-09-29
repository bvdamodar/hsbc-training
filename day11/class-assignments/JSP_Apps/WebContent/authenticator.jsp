<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.hsbc.tr.web.User"%>
<%@page import="java.util.ArrayList"%>
<jsp:useBean id="user" class="com.hsbc.tr.web.User" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authenticator</title>
</head>
<body>
	<jsp:setProperty property="userName" name="user"
		value="<%=request.getParameter(\"name\") %>" />
	<jsp:setProperty property="password" name="user"
		value="<%=request.getParameter(\"pwd\") %>" />
	<%
		User u =(User) session.getAttribute("user");
		if(u.isAuthenticated()){
	%>
	<jsp:forward page="success.jsp"/>
	<%}else{ %>
	<jsp:forward page="failure.jsp"/>
	<%} %>
</body>
</html>