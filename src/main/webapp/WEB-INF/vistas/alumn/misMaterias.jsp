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

<title>>MIS MATERIAS</title>
</head>
<body>_

	<h1  class="text-center">MIS MATERIAS</h1>
	
		<nav class="navbar navbar-dark bg-dark">
	
	<a class="btn btn-outline-primary" href="/index"> index</a>
		<a class="btn btn-outline-primary" href="/alumn/Listado-materias"> listado materias</a>
	


		<sec:authorize access="isAuthenticated()">
			<form:form method="get" action="/logout"><input type="submit" class="btn btn-outline-danger mb-2" value=" cerrar sesion" /></form:form>
		</sec:authorize>

		
	</nav><br><br><br>
	
	
	<div class="row row-cols-1 row-cols-md-3">
	
	

	<c:forEach items="${ramos}" var="ramo">
	<div class="col mb-4">
	<div class="card" style="width: 18rem;">
		<div class="card text-center">
			<div class="card-header">
				PROFESOR: ${ramo.getTeacher().getName()}
					${ramo.getTeacher().getLastName()}
			</div>
			<div class="card-body">
				<h5 class="card-title">${ramo.getName()}</h5>
				<p class="card-text">${ramo.getDescription()}</p>
			</div>
			<div class="card-footer text-muted">
				${ramo.getDayHourHand().getDay().getDay()} :
				${ramo.getDayHourHand().getHourHand().getDetail()}</div>
		</div>
		</div>


</div>

	</c:forEach>
	</div>
	


</body>
</html>