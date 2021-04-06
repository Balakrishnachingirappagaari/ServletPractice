package com.practice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ReqDispServlet extends HttpServlet {
	/*
	 * This method is for request dispatcher
	 */
	/*
	 * public void doGet(HttpServletRequest req,HttpServletResponse res) throws
	 * IOException { int a=(int)req.getAttribute("k"); a=a*a; PrintWriter
	 * pw=res.getWriter(); pw.println("response:"+a); }
	 */
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a =Integer.parseInt(req.getParameter("k"));
		HttpSession session=req.getSession();
		System.out.println("session data:"+session.getAttributeNames().toString());
		a = a * a;
		PrintWriter pw = res.getWriter();
		pw.println("response:" + a);
	}
	 

}
