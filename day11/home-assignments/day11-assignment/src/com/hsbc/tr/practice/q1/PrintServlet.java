package com.hsbc.tr.practice.q1;
/**
 * @author bvdam
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print("<h1>Servlet Class printing from the init-parameters in web.xml.</h1>");
		
		String name=getServletConfig().getInitParameter("username");
		String password=getServletConfig().getInitParameter("password");
		String jdbcurl=getServletConfig().getInitParameter("jdbcurl");
		
		out.print("<h2>Username - "+name+"</h2>");
		out.print("<h2>Password - "+password+"</h2>");
		out.print("<h2>JDBC-URL - "+jdbcurl+"</h2>");
		
	}

}
