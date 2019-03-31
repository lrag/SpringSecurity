<%@page session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<c:url value='/css/estilos.css'/>"	type="text/css" />
<title>Desconectado</title>
</head>
<body>
	<div id="content">
		<h2>Desconectado.</h2>
		<p>
			Te has desconectado. 
			<a href="<c:url value='/'/>">Comenzar de nuevo</a>.
		</p>
	</div>
</body>
</html>
