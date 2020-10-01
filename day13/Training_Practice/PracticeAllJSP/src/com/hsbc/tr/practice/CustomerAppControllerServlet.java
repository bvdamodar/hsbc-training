package com.hsbc.tr.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerAppControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");

		CustDao dao = new CustJdbcImpl();
		CustService cs = new CustService(dao);

		switch (action) {
		case "signUp": {
			String umail = request.getParameter("email");
			String mob = request.getParameter("mob");
			String name = request.getParameter("name");
			String pwd = request.getParameter("pwd");

			boolean reg = cs.regUser(umail, name, mob, pwd);
			if (reg) {
				response.sendRedirect("signIn.jsp?Login_Succes");
//				request.getRequestDispatcher("/signIn.jsp?Login_Succes").forward(request, response);
			} else {
				response.sendRedirect("signUp.jsp?Login_Failure");
//				request.getRequestDispatcher("/signUp.jsp?Login_Failure").forward(request, response);
			}
		}
			break;

		case "signIn": {
			String email = request.getParameter("email");
			String pwd = request.getParameter("pwd");

			String reg = cs.loginUser(email, pwd);
			if (reg.equals("success")) {
				response.sendRedirect("request.jsp?Welcome");
//				request.getRequestDispatcher("/request.jsp?Welcome").forward(request, response);
			} else if (reg.equals("wrongPwd")) {
				response.sendRedirect("signIn.jsp?EnterCorrectPassword");
//				request.getRequestDispatcher("/signIn.jsp?EnterCorrectPassword").forward(request, response);
				out.print("Enter Correct Password");
			} else{	
				response.sendRedirect("signUp.jsp?NoCustomerAvailable");
//				request.getRequestDispatcher("/signUp.jsp?NoCustomerAvailable").forward(request, response);
			}
		}
			break;

		case "addRequest": {
			String umail = request.getParameter("email");
			String tool = request.getParameter("software");
			String os = request.getParameter("os");
			String prob = request.getParameter("problem");

			boolean reg = cs.regRequest(umail, tool, os, prob);
			if (reg) {
				response.sendRedirect("request.jsp?RequestProcessed");
			} else {
				response.sendRedirect("request.jsp?InvalidEmail");

			}
		}
			break;

		case "listAll": {
			List<String> reqList = cs.list();
			request.getSession().setAttribute("list", reqList);
			request.getRequestDispatcher("/list.jsp").forward(request, response);
		}
			break;

		default: { //

		}
			break;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
