<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> </title>
</head>
<body>
<h1>Equipo: ${nombreEquipo}</h1>
<ul>
<c:forEach items="${infoJugadores}" var = "jugador">
	<li><a href="/PlayerController?name=${jugador.name}&posicion=${jugador.position}&numero=${jugador.jerseyNumber}&fechaDeNacimiento=${jugador.dateOfBirth}&nacionalidad=${jugador.nationality}">
	${jugador.name}</a></li>
</c:forEach>
</ul>



</body>
</html>