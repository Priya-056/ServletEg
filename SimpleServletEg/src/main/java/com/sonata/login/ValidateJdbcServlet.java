package com.sonata.login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ValidateJdbcServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("text");
		String pass=request.getParameter("pass");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Priya056*");
			PreparedStatement ps=con.prepareStatement("select * from Login where name=? and password=?");
			ps.setString(1, name);
			ps.setString(2, pass);
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				//out.println("Login Successfull");
			
			RequestDispatcher rd=request.getRequestDispatcher("display.html");	
			rd.forward(request, response);
			}
		
		else {
			out.println("Invalid UserLogin");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");	
			rd.include(request, response);
		}}
		catch(Exception e) {
			out.println(e.getMessage());
		}
}
}
