<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<c:url value='/css/estilos.css'/>"	type="text/css" />
<title>Expedientes X</title>
</head>
<body>
	<div id="content">

		<h1>Expedientes X</h1>
		<a href="<c:url value='/expedientesx/mostrar/todos'/>">
			VOLVER
		</a>
		<br>
		<br>

		<table>
			<tr>
				<td colspan="2">
					<img src="<c:url value='/${expediente.imagen}'/>" height="200px"/>
				</td>
			</tr>
			<tr>
				<td><b>Titulo:</b></td>
				<td>${expediente.titulo}</td>
			</tr>
			<tr>
				<td><b>Informe:</b></td>
				<td>${expediente.informe}</td>
			</tr>
			<tr>
				<td><b>Investigador</b></td>
				<td>${expediente.investigador}</td>
			<tr>
				<td><b>Clasificado</b></td>
				<td>${expediente.clasificado}</td>
			</tr>
		</table>
	</div>
</body>
</html>













