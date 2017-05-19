package test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FirstServlet")
public class TestServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1;
	
	public TestServlet() 
	{
		super();
		System.out.println("in constructor");
	}

	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("in init");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("in service");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>second servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Hello");
		out.println("</body>");
		out.println("</html>");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("in main");
			
	}

}
