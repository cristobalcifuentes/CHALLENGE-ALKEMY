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
<title>INICIO ALKEMY</title>
</head>
<body>
	<h1 class="text-center">INICIO ALUMNO</h1>

	<nav class="navbar navbar-dark bg-dark">
	
	<a class="btn btn-outline-primary" href="/index"> index</a>


		<sec:authorize access="isAuthenticated()">
			<form:form method="post" action="/logout"><input type="submit" class="btn btn-outline-danger mb-2" value=" cerrar sesion" /></form:form>
		</sec:authorize>

		
	</nav><br><br><br>

	<a type="button" class="btn btn-outline-primary btn-lg btn-block"
		href="/alumn/mis-materias">MIS MATERIAS </a>
	<br />
	<br />

	<a type="button" class="btn btn-outline-success btn-lg btn-block"
		href="/alumn/Listado-materias"> LISTADO MATERIAS </a>



</body>
</html>