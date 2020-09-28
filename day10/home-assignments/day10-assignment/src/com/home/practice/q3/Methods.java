package com.home.practice.q3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Methods extends GenericServlet{

	public Methods() {
		System.out.println("Servlet Created...");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Init method called...");
	}
	
	@Override
	public void destroy() {
		System.out.println("Servet Destroyed....");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service method Started...");
		PrintWriter out = res.getWriter();
		for (int i = 1; i <= 5; i++) {
				out.write("<h1>ID:"+i+"  This is my Servlet called in Service Method.</h1>");
		}
		System.out.println("Service method Ended...");
		
	}	

}
