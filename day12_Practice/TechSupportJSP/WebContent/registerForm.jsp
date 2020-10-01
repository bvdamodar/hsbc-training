<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
	<h1 align="center">Customer Registration</h1>
	<hr>
	<form action="register" method="POST" id="frm">
		<table>
			<tr>
				<td>Please register.<br><br></td><td></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" size=30 ><br></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName" size=30 ><br></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName" size=30 ><br></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><input type="text" name="phoneNumber" size=30 ><br></td>
			</tr>
			<br>
			<tr>
				<td><input type="hidden" name="action" value="register"></td>
				<td><br><input type="submit" value="Submit Request"></td>
			</tr>
		</table>
	</form>
</body>
</html>