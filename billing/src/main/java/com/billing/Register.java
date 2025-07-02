package com.billing;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     String uname = request.getParameter("name");
	     String uemail = request.getParameter("email");
	     String upwd = request.getParameter("pass");
	     String umobile = request.getParameter("contact");
	     
	     RequestDispatcher dispatcher =null;
		 Connection con = null;
	     
			/*
			 * PrintWriter out = response.getWriter(); out.print(uname); out.print(umail);
			 * out.print(upwd); out.print(umobile);
			 */
	     
			 
		  try { 
			  Class.forName("com.mysql.cj.jdbc.Driver"); 
		      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing?useSSL=false","root","root");
			  PreparedStatement pst = con.prepareStatement("insert into users(uname,upwd,uemail,umobile) values(?,?,?,?)");
			  pst.setString(1,uname);
              pst.setString(2,upwd);
              pst.setString(3,uemail);
              pst.setString(4,umobile);
              
			  int rowCount = pst.executeUpdate(); 
			  if(rowCount > 0) {
			  request.setAttribute("status","sucess");
			  dispatcher = request.getRequestDispatcher("registration.jsp");
			  }
			  dispatcher.forward(request,response); 
			  } 
		  catch(Exception e) { 
			  e.printStackTrace(); 
			 }
			 
	}

}
