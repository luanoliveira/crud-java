package unp.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class BaseController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String getUrl(HttpServletRequest request, String caminho)
	{
		return request.getContextPath() + caminho;
	}

}
