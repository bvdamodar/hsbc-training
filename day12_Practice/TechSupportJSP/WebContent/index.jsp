<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XYZ Corporation</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
	<h1>Technical Support Request</h1>
	<hr>
	<form action="register" method="POST" id="frm">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" size=40 ><br><br></td>
			</tr>
			<tr>
				<td><label>Software:</label></td>
				<td><select name="software">
						<option selected>Microsoft Word</option>
						<option>Microsoft Excel</option>
						<option>Microsoft PowerPoint</option>
						<option>Microsoft Project</option>
						<option>Zoom</option>
				</select> <br><br></td>
			</tr>
			<tr>
				<td><label>Operating System:</label></td>
				<td><select name="os">
						<option selected>Windows 10</option>
						<option>Windows 8</option>
						<option>Windows 7</option>
						<option>Linux</option>
						<option>macOS</option>
				</select> <br><br></td>
			</tr>
			<tr>
				<td>Problem Description:</td>
				<td><input
					style="height: 100px; font-size: 15px; width: 300px; size: 50;"
					type="text" name="problem"></td>
					
			</tr>
			<br>
			<tr>
				<td><input type="hidden" name="action" value="addRequest"></td>
				<td><input type="submit" name="submit" value="Submit Request"></td>
			</tr>
		</table>
	</form>
	<a href="listrequests">View Requests</a>
</body>
</html>