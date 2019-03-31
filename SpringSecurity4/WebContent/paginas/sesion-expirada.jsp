<%@page session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<c:url value='/css/estilos.css'/>"	type="text/css" />
<title>Inactividad de Sesión</title>
</head>
<body>
	<div id="content">
		<img src="<c:url value='/imagenes/xfiles.jpg'/>" align="right" />
		<h2>Sesión no válida</h2>

		<p>
			La sesión ha expirado. Por favor, 
			<a href="<c:url value='/'/>">vuelva	a empezar</a>.
		</p>
	</div>
</body>
</html>
