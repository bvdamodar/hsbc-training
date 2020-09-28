package com.home.practice.q4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Details  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String n =req.getParameter("name") ;
		String e =req.getParameter("email") ;
		
		out.print("<h2>User <i>"+n+"</i> with e-mail <u>"+e+"</u> has been successfully registered. </h2>");
		
		
	}

}
