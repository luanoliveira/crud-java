package unp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Home extends BaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) throws IOException, ServletException
	{
		
		String nome = "Luan da Silva Oliveira";
		System.out.println("HOME");
		request.setAttribute("nome", nome);
		 getServletConfig().getServletContext().getRequestDispatcher(

			        "/JSP/home.jsp").forward(request,response);
	}
	
}