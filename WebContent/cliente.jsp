<%@page import="unp.model.Cliente"%>
<%@page import="unp.dao.ClienteDao"%>
<%

Cliente cliente = new Cliente();

try {
	ClienteDao clienteDao = new ClienteDao();
	cliente = clienteDao.consultar(request.getParameter("codigo"));
} catch (Exception e) {
	System.out.println(e.getMessage());
	response.sendRedirect(request.getContextPath() + "/novo-cliente.jsp");
}

%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cliente</title>
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<div class="container">

		<table class="table">
			<tbody>
				<tr>
					<th>Código:</th>
					<td><%= cliente.getCodigo() %></td>
				</tr>
				<tr>
					<th>Nome:</th>
					<td><%= cliente.getNome() %></td>
				</tr>
				<tr>
					<th>Email:</th>
					<td><%= cliente.getEmail() %></td>
				</tr>
				<tr>
					<th>Telefone:</th>
					<td><%= cliente.getTelefone() %></td>
				</tr>
			</tbody>
		</table>
		
		<a href="<%= request.getContextPath() + "/novo-cliente.jsp" %>" class="btn btn-primary">Voltar</a>
		
	</div><!--  .container -->

</body>
</html>