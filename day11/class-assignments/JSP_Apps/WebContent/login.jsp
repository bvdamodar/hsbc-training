<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<style type="text/css">
	input {
	font-family: sans-serif;
}

	td {
	font-size: 15px;
	font-family: cursive;
}
</style>
</head>
<body bgcolor="cyan">
	<h1 style="color: darkgreen">Login</h1>
	<hr>
	<!-- <form action="authenticate.jsp" method="POST"> -->
	<form action="authenticator.jsp" method="POST">
		<table>
			<tr>
				<td>Name-</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Password-</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td><input type="submit" name="Register" style="background-color: black; color: white;font-size:  15px"></td>
			</tr>
		</table>
	</form>

</body>
</html>