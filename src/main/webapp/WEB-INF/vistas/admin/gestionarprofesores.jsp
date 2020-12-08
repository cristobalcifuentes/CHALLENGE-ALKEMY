<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<link rel="stylesheet" 	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">


<meta charset="ISO-8859-1">
<title>GESTION PROFESORES - ALKEMY</title>
</head>
<body>
<h1 style="text-align: center;">GESTIONAR PROFESORES</h1>

	
		<nav class="navbar navbar-dark bg-dark">
	
	<a class="btn btn-outline-primary" href="/index"> index</a>
		<a class="btn btn-outline-primary" href="/admin/gestionar-ramos"> gestonar materias</a>
		<a href="/admin/nuevoprofesor" class="btn btn-outline-success my-2 my-lg-0 "> nuevo profesor</a>
	


		<sec:authorize access="isAuthenticated()">
			<form:form method="get" action="/logout"><input type="submit" class="btn btn-outline-danger mb-2" value=" cerrar sesion" /></form:form>
		</sec:authorize>

		
	</nav><br><br><br>
<nav class="navbar d-flex flex-row-reverse">

</nav>


	
	<table class="table table-dark">

		<tr>
			<th>NOMBRE</th>
			<th>APELLIDO</th>
			<th>DNI</th>
			<th></th>
			<th></th>
		</tr>
		
		<c:forEach items="${profesores}" var="profesor">
		<tr>
			<td>${profesor.getName()}</td>
			<td>${profesor.getLastName()}</td>
			<td>${profesor.getDNI()}</td>
			<td>${profesor.getEnabled().getEnabled()}</td>
			<td><a href="/admin/editarprofesor/${profesor.getId()}">gestionar</a> </td>
		</tr>
		</c:forEach>
		
	</table>
	
	
</body>
</html>