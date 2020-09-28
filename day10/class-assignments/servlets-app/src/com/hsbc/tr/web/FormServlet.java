package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FormServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html"); // mine
		PrintWriter out = res.getWriter();
		out.print("<form action=\"process\" >");
		out.print("<label>Enter Name:</label> <input id=\"i1\" type=\"text\" name=\"username\" placeholder=\"Name\"><br/>\r\n	");
		out.print("<input type=\"submit\" value = \"Find\">");
		out.print("</form>");
		
	}

}
