<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Info</title>
</head>
<body>
<h1>Informacion sobre ${requestScope.nombre}</h1>


<p>Posición: ${posicion}</p>
<p>Numero de dorsal: ${numero}</p>
<p>Fecha de nacimiento: ${fechaNacimiento}</p>
<p>Nacionalidad: ${nacionalidad}</p>

 <c:forEach items="${embed.items}" var="video">
 <iframe width="560" height="315" src="https://www.youtube.com/embed/${video.id.videoId}" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
 </c:forEach>

</body>
</html>