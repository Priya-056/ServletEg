package com.sonata.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			String n=request.getParameter("username");
			pw.print("Welcome " +n);
			
			//pw.print("<form action='SecondServlet' method='get'>");
			//pw.print("<input type='hidden' name='uname' value='"+n+"'>");
			//pw.print("<input type='submit' value='Go'>");
			//pw.print("</form>");
			pw.print("<a href='SecondServlet?uname="+n+"'> visit</a>");
			pw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
