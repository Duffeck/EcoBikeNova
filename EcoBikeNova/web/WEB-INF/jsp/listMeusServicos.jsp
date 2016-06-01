<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body style="background: url('img/backeco.jpg') no-repeat; background-size: cover;">	
	<div class="container">
		<div class="well col-xs-3">
			<ul class="nav nav-pills nav-stacked">
				<li><a href="index.jsp"> Home </a></li>
				<li><a href="cadServico.jsp"> Cadastrar Serviço </a></li>
				<li><a href="index.jsp"> Sair </a></li>
			</ul>
		</div>
		<div class="col-xs-9">
			<div class="well">
				<h3 class="page-header">Meus Serviços</h3>
				<form action="buscar.html" method="post">
					<div class="col-xs-6 form-group">
						<input type="text" name="livro" value="${livro}" class="form-control">
					</div>
					<div class="col-xs-6 form-group">
						<input type="text" name="autor" value="${autor}" class="form-control">
					</div>
					<input type="submit" value="pesquisar" class="btn btn-info">
				</form>
			<table class="table table-bordered table-hover">
				<tr>
                                    <th>Rota</th>
                                    <th>Categoria da Carga</th>
                                    <th>Preço</th>
				</tr>
                                    <tr>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td>
                                        <a href="detalhes.html?id=" class="btn btn-info">
                                            <span class="glyphicon glyphicon-edit"></span>
                                        </a>
                                        <a href="excluir.html?id=" class="btn btn-danger" onclick="return confirm('Deseja excluir?')">
                                            <span class="glyphicon glyphicon-remove-sign"></span>
                                        </a>
                                        </td>
                                    </tr>
			</table>
			</div>
		</div>
	</div>
</body>
</html>