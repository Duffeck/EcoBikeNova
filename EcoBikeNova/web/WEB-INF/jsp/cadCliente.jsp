<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body style="background: url('/img/backeco.jpg'); background-size: cover;">
	<div class="container">
		<div class="col-xs-6 col-xs-offset-3" >
			<div class="well">
				<h3 class="page-header">Nova Empresa</h3>
				<form action="cadastrar.html" method="post">
					<div class="form-group">
						Nome:
						<input type="text" name="nome" class="form-control">
					</div>
					<div class="form-group">
						Telefone
						<input type="text" name="email" class="form-control">
					</div>
					<div class="form-group">
						E-mail
						<input type="text" name="login" class="form-control">
					</div>
					<div class="form-group">
						Senha
						<input type="text" name="senha" class="form-control">
					</div>
					<div class="form-group">
						CNPJ
						<input type="text" name="senha" class="form-control">
					</div>
                                        <div class="form-group col-xs-8">
						Rua
						<input type="text" name="senha" class="form-control">
					</div>
                                        <div class="form-group col-xs-4">
						Numero
						<input type="text" name="senha" class="form-control">
					</div>
                                        <div class="form-group form-group col-xs-12">
						Complemento
						<input type="text" name="senha" class="form-control">
					</div>
                                        <div class="form-group form-group col-xs-6">
						Bairro
						<input type="text" name="senha" class="form-control">
					</div>
                                        <div class="form-group form-group col-xs-6">
						Cidade
						<input type="text" name="senha" class="form-control">
					</div>
					<input type="submit" value="Cadastrar" class="btn btn-default">
				</form>
			</div>
		</div>
	</div>
</body>
</html>