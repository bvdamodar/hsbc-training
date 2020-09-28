package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet1  extends GenericServlet{

	public Servlet1() {
		System.out.println("Servlet Created");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Init method called");
	}
	
	@Override
	public void destroy() {
		System.out.println("Servet Destroyed.");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service method called");
		PrintWriter out = res.getWriter();
		out.write("<h1>This is my First Servlet.</h1>");
		
	}

	

}
