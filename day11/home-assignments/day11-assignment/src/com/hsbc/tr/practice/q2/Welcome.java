package com.hsbc.tr.practice.q2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
	    PrintWriter out = response.getWriter(); 
	 
	    String name=request.getParameter("uname"); 
	    out.print("<h1>Hello, "+name+"!\n</h1>");
	    out.print(" <h3>Welcome to the Welcome Servlet!!!</h3>"); 

	}

}