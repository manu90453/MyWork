package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LoginDao;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String uName=request.getParameter("userName");
		String pass=request.getParameter("password");
		boolean flag=LoginDao.veriftLoginData(uName,pass);
		//System.out.println(flag);
		if(flag)
		{
			response.sendRedirect("home.jsp");
		}
		else
		{
			out.print("plese enter the correct details");
			out.print("<br><a href=login.jsp>click here</a>");
		}
	}

}
