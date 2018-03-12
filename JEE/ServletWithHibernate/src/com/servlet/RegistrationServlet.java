package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.apt.model.Factory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.User;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SessionFactory factory;
	Session session;
    public RegistrationServlet() {
        super();
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
    	
    	Configuration cf=new Configuration();
    	cf.configure("config.xml");
       factory=cf.buildSessionFactory();
    	
    	
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		PrintWriter out=response.getWriter();
		String fName=request.getParameter("firstName");
        String lName=request.getParameter("lastName");
        String email=request.getParameter("email");
        String pass=request.getParameter("password");
        String gender=request.getParameter("sex");
        String location=request.getParameter("city");
        String contactNo=request.getParameter("contact");
        
        System.out.println(fName);
        
		session=factory.openSession();
		User u=new User();
		
		u.setContact(Integer.valueOf(contactNo));
		u.setFirstName(fName);
		u.setLastName(lName);
		u.setPassword(pass);
		u.setGender(gender);
		u.setCity(location);
		u.setEmail(email);
	    boolean flag=true;
	    if(flag)
	    {
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(u);
		tr.commit();
		flag=false;
	    }
	    if(flag==false)
	    {
	    	response.sendRedirect("success.jsp");
	    }
	}
	@Override
	public void destroy() {
	      session.close();
	      factory.close();
	}

}
