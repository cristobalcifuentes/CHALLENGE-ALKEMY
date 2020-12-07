<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>GESTIONAR MATERIA</title>
</head>
<body>

<h1 style="text-align: center;">GESTIONAR MATERIAS</h1>
<nav class="navbar d-flex flex-row-reverse">
<a href="/admin/nuevoramo"><button class="btn btn-outline-success my-2 my-lg-0 ">nuevo ramo</button></a>
</nav>


	
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