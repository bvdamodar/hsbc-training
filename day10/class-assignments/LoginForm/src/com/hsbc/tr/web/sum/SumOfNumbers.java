package com.hsbc.tr.web.sum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SumOfNumbers extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();

	String n1 = req.getParameter("n1");
	String n2 = req.getParameter("n2");
	
	if (!(n1.equals("") || n2.equals(""))) {
			Integer a = Integer.parseInt(n1);
			Integer b = Integer.parseInt(n2);
			String x = String.valueOf((a+b));
			out.print("<h1 style=\" color: blue\">Sum of "+n1+" and "+n2+" is "+x+"</h1>");
	}else {
		out.print("Please Enter the numbers.");		
	}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
		
	}
}
