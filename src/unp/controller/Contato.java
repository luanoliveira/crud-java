package unp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Contato extends BaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) throws IOException
	{
		System.out.println("TESTE DE REQUISIÇÃO");
		response.sendRedirect(this.getUrl(request, "/"));
	}
	
}
