package com.practice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SumServlet extends HttpServlet{
	
	/*
	 * public void service(HttpServletRequest req,HttpServletResponse res) throws
	 * IOException { int num1=Integer.valueOf(req.getParameter("num1")); int
	 * num2=Integer.valueOf(req.getParameter("num2")); int num3=num1+num2;
	 * PrintWriter pw=res.getWriter(); pw.println("res:"+num3); }
	 */
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int num1=Integer.valueOf(req.getParameter("num1"));
		int num2=Integer.valueOf(req.getParameter("num2"));
		int num3=num1+num2;
		req.setAttribute("num1", num1);
		req.setAttribute("num2", num2);
		RequestDispatcher rd=req.getRequestDispatcher("sendUrl");
		rd.forward(req, res);
	}
	
	/*
	 * public void doPost(HttpServletRequest req,HttpServletResponse res)throws
	 * IOException { int num1=Integer.valueOf(req.getParameter("num1")); int
	 * num2=Integer.valueOf(req.getParameter("num2")); int num3=num1+num2;
	 * PrintWriter pw=res.getWriter(); pw.println("res:"+num3);
	 * 
	 * }
	 */
}
