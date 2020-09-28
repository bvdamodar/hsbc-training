package com.home.practice.q6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();

	String n1 = req.getParameter("n1");
	String n2 = req.getParameter("n2");
	
	if (!(n1.equals("") ||  n2.equals(""))) {
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		int ans=0;
		String answer = "";
		
		if(req.getParameter("Sum") != null) {
			ans = num1 + num2;
			answer = Integer.toString(ans);
			out.print("<h1 style=\" color: blue\">"+n1+" + "+n2+" = "+answer+"</h1>");
		}
		else if(req.getParameter("Subtract") != null) {
			ans = num1 - num2;
			answer = Integer.toString(ans);
			out.print("<h1 style=\" color: blue\">"+n1+" - "+n2+" = "+answer+"</h1>");
		}
		if(req.getParameter("Product") != null) {
			ans = num1*num2;
			answer = Integer.toString(ans);
			out.print("<h1 style=\" color: blue\">"+n1+" * "+n2+" = "+answer+"</h1>");
		}
		if(req.getParameter("Divide") != null) {
			if(num2 == 0) {
				out.print("Second value cannot be zero"); 
			}
			else {
				ans = num1/num2;
				answer = Integer.toString(ans);
				out.print("<h1 style=\" color: blue\">"+n1+" / "+n2+" = "+answer+"</h1>");
			}
		}
	}	
	else
		out.print("<h1>Please enter both the values.<br><br></h1>");
		out.print("<h2><a href = \"nums.html\">Click to goto Arthematic Page</a></h2>");
}


protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	doGet(req, res);
}

}