<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<c:url value='/css/estilos.css'/>"	type="text/css" />
<title>Expedientes X</title>
</head>

<script>

	function clasificar(id){
		document.formulario.action = "../clasificar";
		document.getElementById("id").value = id;
		document.formulario.submit();
	}

	function desclasificar(id){
		document.formulario.action = "../desclasificar";
		document.getElementById("id").value = id;
		document.formulario.submit();
	}		

</script>

<body>

	<div id="content">

		<h1>
			Expedientes X para
			<sec:authentication property="principal.username" />
		</h1>
		<a href="<c:url value="/index.jsp"/>">Inicio</a><br>
		<br>
		
		<form action="" name="formulario" method="POST">
		
			<input type="hidden" id="id" name="id"/>

			<table width="800px">
				<tr>
					<th>ID</td>
					<th align="center">Imagen</th>
					<th align="right">Titulo</th>
					<th width="40%">Informe</th>
					<th align="right">Investigador</th>
					<th align="center">Clasificado</th>
					<th>Operaciones</th>
				</tr>
				<c:forEach var="expediente" items="${expedientes}">
					<tr valign="top">
						<td>${expediente.id}</td>
						<td align="center"><img src="<c:url value='/${expediente.imagen}'/>" height="100px" /></td>
						<td align="right"><b>${expediente.titulo}</b></td>
						<td width="40%"><font size="-1">${expediente.informe}</font></td>
						<td align="right"><b>${expediente.investigador}</b></td>
						<td align="center"><b>${expediente.clasificado}</b></td>
						<td>
							<a href="<c:url value='/expedientesx/mostrar/${expediente.id}'/>">mostrar</a>
							<!-- 
							<a href="<c:url value='/expedientesx/clasificar?id=${expediente.id}'/>">clasificar</a>
							<a href="<c:url value='/expedientesx/desclasificar?id=${expediente.id}'/>">desclasificar</a>
							-->
							<!--  -->
							<a href="#" onclick="clasificar(${expediente.id})">clasificar</a>
							<a href="#" onclick="desclasificar(${expediente.id})">desclasificar</a>
						</td>
					</tr>
				</c:forEach>
			</table>

		</form>		

	</div>
</body>
</html>













