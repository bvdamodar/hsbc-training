<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1 style="color: blue"> Login Here</h1>
	<hr>
	<form action="register" method="POST">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td><input type="hidden" name="action" value="signIn"></td>
				<td><input type="submit" value="Sign In"></td>
			</tr>
		</table>
	</form>

</body>
</html>