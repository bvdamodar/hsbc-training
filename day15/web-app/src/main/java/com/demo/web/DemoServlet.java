package com.demo.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
           
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		resp.getWriter().write("<h1>Welcome to Maven Project.</h1>");
		
		
	}

	
}
