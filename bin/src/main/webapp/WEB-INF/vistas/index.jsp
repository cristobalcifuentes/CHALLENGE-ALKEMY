<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>simulacion 3</h1>
	
	<table class="table table-dark">

		<tr>
			<th>curso</th>
			<th>cantidad de alumnos</th>
			<th>listado de alumnos</th>
		</tr>
		
		<c:forEach items="${cursos}" var="cursos">
		<tr>
			<td>${cursos.getNombre()}</td>
			<td>${cursos.getAlumnos().size()}</td>
			<td><a href="/listar/${cursos.getId()}">listado</a> </td>
		</tr>
		</c:forEach>
		
	</table>

	




	

	



</body>
</html>