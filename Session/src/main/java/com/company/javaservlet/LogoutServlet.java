package com.company.javaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);

		System.out.println("Inside Session Project Init Method Logout Servlet");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		req.getRequestDispatcher("link.jsp").include(req, resp);

		HttpSession session = req.getSession();
		session.invalidate();
		
		System.out.println("Session destroyed in Logout Servlet");

		out.print("you are successfully logged out!");

		out.close();
	}
}
