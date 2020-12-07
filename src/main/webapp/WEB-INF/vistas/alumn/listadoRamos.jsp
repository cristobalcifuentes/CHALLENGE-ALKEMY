<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>LISTADO RAMOS</title>
</head>
<body>

<h1 style="text-align: center;">LISTADO MATERIAS</h1>



	
	<table class="table table-dark">

		<tr>
			<th>nombre</th>
			<th>horario</th>
			<th>profesor</th>
			<th>total cupos</th>
			<th>cupos disponibles</th>
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

			<td><a href="/alumn/detalle-ramo/${ramo.getId()}"  class="btn btn-primary">detalle</a> </td>
		</tr>
		</c:forEach>
		
	</table>

</body>
</html>