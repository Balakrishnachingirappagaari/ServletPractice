package com.practice.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet{
 
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		HttpSession session=req.getSession();
		/*
		 * session will carry all the request parameter and attributes through out the session
		 * 
		 */
		session.getId();
	}
}
