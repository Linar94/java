package com.eg.WebProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
		response.setContentType("text/html");
		String str=request.getParameter("text");
		PrintWriter out=response.getWriter();
			out.print("<html><head><title></title></head><body><form action='/WebProject/'>"+"Hello!  "+str+"<br><input type='submit' value='back'></form>"+
					"</body></html>");
		out.close();
	}
	
}
