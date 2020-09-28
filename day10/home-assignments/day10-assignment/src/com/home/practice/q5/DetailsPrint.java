package com.home.practice.q5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DetailsPrint extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>User Enroll Form</title>");
		out.println("</head>");
		out.println("<body bgcolor=\"cyan\">");
		out.println("<h1 style=\"color: darkgreen\">User Details Here</h1>");
		out.println("<hr>");
		out.println("<form action=\"print_details\" method=\"POST\">");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>Name-</td>");
		out.println("<td><input type=\"text\" name=\"name\"></td>");
		out.println("</tr>	<tr>");
		out.println("<td>Email-</td>");
		out.println("<td><input type=\"text\" name=\"email\"></td>");
		out.println("</tr>	<tr>");
		out.println("<td><input type=\"submit\" name=\"Register\" ></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String n =req.getParameter("name") ;
		String e =req.getParameter("email") ;
		
		out.print("<h2>User <i>"+n+"</i> with e-mail <u>"+e+"</u> has been successfully registered. </h2>");
		
	}
	
}
