package com.practice.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendRedirectServlet extends HttpServlet
{
/*
 * this is to on send redirect i.e url change 
 */
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {

		int num1=Integer.valueOf(req.getParameter("num1"));
		int num2=Integer.valueOf(req.getParameter("num2"));
		int num3=num1+num2;
		req.setAttribute("k", num3);
		
		res.sendRedirect("disp?k="+num3);
		/*
		 * RequestDispatcher rd=req.getRequestDispatcher("disp"); rd.forward(req, res);
		 */
	
	}
}
