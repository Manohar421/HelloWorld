package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HelloWorld")  
public class HelloWorld extends HttpServlet {
	private String message;

	   public void init() throws ServletException {
	      // Do required initialization
	      message = "Hello World";
	   }

	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
		   
		  HttpSession session = request.getSession(false);
		  Object attribute = session.getAttribute("rohit");
	      
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message+ " - "+ (String) attribute + "</h1>");
	   }

	   public void destroy() {
	      // do nothing.
	   }
}
