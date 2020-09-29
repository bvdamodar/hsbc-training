package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String name = getServletConfig().getInitParameter("name");
		String driver = getServletContext().getInitParameter("driver");

		out.print("<h1>Welcome to Servlet S2.</h1>");
		out.print("<h2>Name: " + name + "</h2>");
		out.print("<h2>Driver: " + driver + "</h2>");
		out.print("<h1>You have been forwarded here.</h1>");

	}

}
