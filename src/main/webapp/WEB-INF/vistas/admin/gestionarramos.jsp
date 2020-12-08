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

<title>GESTIONAR MATERIA</title>
</head>
<body>



<h1 style="text-align: center;">GESTIONAR MATERIAS</h1>

	
		<nav class="navbar navbar-dark bg-dark">
	
	<a class="btn btn-outline-primary" href="/index"> index</a>

		<a class="btn btn-outline-primary" href="/admin/gestionar-profesores"> gestonar profesor</a>
		<a href="/admin/nuevoramo"><button class="btn btn-outline-success my-2 my-lg-0 ">nueva materia</button></a>


		<sec:authorize access="isAuthenticated()">
			<form:form method="get" action="/logout"><input type="submit" class="btn btn-outline-danger mb-2" value=" cerrar sesion" /></form:form>
		</sec:authorize>

		
	</nav><br><br><br>



	
	<table class="table table-dark">

		<tr>
			<th>NOMBRE</th>
			<th>HORARIO</th>
			<th>PROFESOR</th>
			<th>TOTAL CUPOS</th>
			<th>CUPOS DISPONIBLES</th>
			<th></th>
		</tr>
		
		<c:forEach items="${ramos}" var="ramo">
		<tr>
			<td>${ramo.getName()}</td>
			<td>${ramo.getDayHourHand().getDay().getDay()} : ${ramo.getDayHourHand().getHourHand().getDetail()}</td>
			<td>${ramo.getTeacher().getName()} ${ramo.getTeacher().getLastName()}</td>
			<td>${ramo.getQuantity()}</td>
			<td>${ramo.getCuposDisponibles()}</td>
	<td> </td>

			<td><a href="/admin/detalle-ramo/${ramo.getId()}">detalle</a> </td>
		</tr>
		</c:forEach>
		
	</table>

</body>
</html>