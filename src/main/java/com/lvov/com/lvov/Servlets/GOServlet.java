package com.lvov.com.lvov.Servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( name="ListServlet", displayName="ListServlet", urlPatterns = {"/list","/modify", "/search"}, loadOnStartup=1)
public class GOServlet extends HttpServlet  {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json");
		ServletInputStream in = request.getInputStream();
		PrintWriter out = response.getWriter();
		out.print("list sevlet");
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IllegalStateException {
		response.setContentType("application/json");
		ServletInputStream in = request.getInputStream();
		PrintWriter out = response.getWriter();
		out.print("POST");
	}
}
