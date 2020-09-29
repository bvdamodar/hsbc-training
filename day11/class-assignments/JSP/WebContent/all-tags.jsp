<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Tags Demo</title>
</head>
<body>
	<%-- Declaration tag puts code outside _jspService()--%>
	<%!String fname = "Karthik";
	String lname = "Subbaraj";

	public String concat(String s1, String s2) {
		return "Concat: " + s1 + " " + s2 + "\n";
	}%>

	<%-- Expression tag puts code inside out.print() in  _jspService()--%>
	<%=("Expression: " + fname + " " + lname + "\n")%>

	<%=concat("Kamal", "Hassan")%>

	<%-- Scripplets put code as such inside _jspService()--%>
	<%
		out.print("Snippet: " + fname + " " + lname + "\n");
		ArrayList<String> a1 = new ArrayList<>();
	%>
</body>
</html>