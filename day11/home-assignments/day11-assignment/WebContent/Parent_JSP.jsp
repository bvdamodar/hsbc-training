<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Child_JSP1.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parent JSP</title>
</head>
<body>
	<br>
	<jsp:include page="Child_JSP2.jsp" />
	<br>
	<jsp:include page="Child_JSP3.jsp" />	
</body>
</html>