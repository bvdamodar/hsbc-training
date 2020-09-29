<%@page import="java.util.ArrayList"%>
<%@page import="com.hsbc.tr.web.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Users</title>
</head>
<body>
	<table>
		<%
/* 			ArrayList<String> l = (ArrayList<String>) session.getAttribute("data");
			for (String user : l) { */
			User u = (User) session.getAttribute("user");
			for (String s: u.getUsers()) {
		%>

		<tr>
			<%-- <td><%=user%></td> --%>
			<td><%=s%></td>
		</tr>
		<%
			}
		%>

	</table>
</body>
</html>