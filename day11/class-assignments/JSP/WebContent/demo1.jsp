<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Demo 1</title>
<!-- <script type="text/javascript">
	function loadPer2Seconds(){
		setTimeout(2000);
	}

</script> -->
</head>
<body>
	<h1>
		Today is
		<%=new java.util.Date()%><br>
		<% out.print("Hello there!!"); %>
	</h1>
</body>
</html>