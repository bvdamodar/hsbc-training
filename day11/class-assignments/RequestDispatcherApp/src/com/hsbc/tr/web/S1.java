package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String mode = req.getParameter("mode");
		String name = getServletConfig().getInitParameter("name");
		String driver = getServletContext().getInitParameter("driver");

		out.print("<h1>Welcome to Servlet S1.</h1>");
		out.print("<h2>Name: " + name + "</h2>");
		out.print("<h2>Driver: " + driver + "</h2>");

		switch (mode) {
		case "forward":
			RequestDispatcher rd = req.getRequestDispatcher("/s2");
			rd.forward(req, resp);
			break;
		case "include":
			RequestDispatcher rd1 = req.getRequestDispatcher("/s3");
			rd1.include(req, resp);
			break;
		case "redirect":
			resp.sendRedirect("http://www.google.co.in/");
			break;
		default:
			out.print("<h2>Not a Valid Input Mode</h2>");
			break;
		}

	}

}
