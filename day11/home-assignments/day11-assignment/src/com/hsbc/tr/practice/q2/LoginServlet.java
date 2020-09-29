package com.hsbc.tr.practice.q2;

/**
 * @author bvdam
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("uname");
		String pwd = req.getParameter("pwd");
		
		if (name.equals(pwd)) {
			RequestDispatcher dis = req.getRequestDispatcher("welcome");
			dis.forward(req, resp);
		} else {
			out.print("<b>User name or password is Incorrect...</b>");
			RequestDispatcher dis = req.getRequestDispatcher("login.html");
			dis.include(req, resp);
		}
		out.print("<h2><a href=\"http://www.google.co.in\" style=\"color:white\" >Click redirect to google</a></h2>");
	}

}