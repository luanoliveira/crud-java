<%@page import="unp.dao.ClienteDao"%>
<%@page import="unp.model.Cliente"%>
<%

if (request.getMethod().equals("POST")) {
	try {
		Cliente cliente = new Cliente();
		cliente.setCodigo(request.getParameter("codigo"));
		cliente.setNome(request.getParameter("nome"));
		cliente.setEmail(request.getParameter("email"));
		cliente.setTelefone(request.getParameter("telefone"));
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.inserir(cliente);
		response.sendRedirect(request.getContextPath() + "/cliente.jsp?codigo=" + cliente.getCodigo());
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}	
}

%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Novo Cliente</title>
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<div class="container">	
		<h1>Novo Cliente</h1>
		
		<form method="POST" action="novo-cliente.jsp">
			<div class="form-group">
				<label for="codigo">Código</label>
				<input type="text" name="codigo" id="codigo" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="nome">Nome</label>
				<input type="text" name="nome" id="nome" class="form-control">
			</div>	
			
			<div class="form-group">
				<label class="email">E-mal:</label>
				<input type="text" name="email" id="email" class="form-control">
			</div>
			
			<div class="form-group">
				<label class="telefone">Telefone:</label>
				<input type="text" name="telefone" id="telefone" class="form-control">
			</div>
			
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div><!--  .container -->
</body>
</html>