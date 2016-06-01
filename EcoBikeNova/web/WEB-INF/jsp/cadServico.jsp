<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap/css/bootstrap.min.css">
<title>Insert title here</title>
        <style type="text/css">
            /*É importante que essas duas linhas estejam setadas no CSS ou o mapa nao aparecerá*/
            #mapa { width: 700px; height: 400px; float: left }
            #trajeto-texto { width: 300px; height: 400px; float: right; overflow: scroll }
        </style>
</head>
<body style="background: url('img/backeco.jpg'); background-size: cover;">
	<div class="container">
		<div class="col-xs-12 " >
			<div class="well">
				<h3 class="page-header">Novo Serviço</h3>
				<form action="" method="">
					<div class="form-group col-xs-6">
						Nome:
						<input type="text" name="" class="form-control">
					</div>
					
                                        <div class="form-group col-xs-6">
						Categoria
                                                <select class="form-control">
                                                    <option value="volvo">Grande</option>
                                                    <option value="saab">Médio</option>
                                                    <option value="mercedes">Pequeno</option>
                                                    <option value="audi">De Bolso</option>
                                                  </select>
					</div>
                                        <div class="form-group col-xs-12">
						Descrição
                                                <textarea class="form-control"></textarea>
                                                <!--<input type="textarea" name="" class="form-control" placeholder="Digite a descrição (opcional)">-->
					</div>
                                        <div class="form-group col-xs-6">
						Endereço origem
						<input type="text" name="" class="form-control" id="txtEnderecoPartida">
					</div>
                                        <div class="form-group col-xs-6">
						Endereço destino
						<input type="text" name="" class="form-control"  id="txtEnderecoChegada">
					</div>
                                        <div class="form-group col-xs-8">
                                            <div id="mapa"></div>
					</div>
                                        <div class="form-group col-xs-4">
                                            <div id="trajeto-texto"></div>
					</div>
                                        <input type="submit" id="btnEnviar" name="btnEnviar" value="Verificar Rota" class="btn btn-default"/>
                                    
					<input type="submit" value="Cadastrar" class="btn btn-default">
				</form>
			</div>
		</div>
	</div>
        <script src="js/jquery-2.2.4.min.js"></script>
        <script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyBJrMYCFmeqs1xWM-EQqQ7mvnr9mt9js8E"></script>
        <script src="js/mapa-rota.js"></script>
</body>
</html>