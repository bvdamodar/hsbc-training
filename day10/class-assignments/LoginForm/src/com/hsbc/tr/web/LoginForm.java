package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pwd");

		if (uname.equals(pwd)) {
				out.print("<h1 style=\" color: green\">Login Success!!!</h1>");
				System.out.println("");
		} else {
				out.print("<h1 style=\" color: red\">Login Failed...</h1>");
				out.print("<a href = \"login.html\">Go To Login Page</a>");
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
		
	}
	
}
