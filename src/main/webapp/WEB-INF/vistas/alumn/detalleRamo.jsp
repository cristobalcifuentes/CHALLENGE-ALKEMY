<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<link rel="stylesheet" 	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<title>${ramo.getName()}</title>
</head>
<body>

<h1 style=" text-transform: uppercase;" class="text-center">${ramo.getName()}</h1>
	<nav class="navbar navbar-dark bg-dark">
	
	<a class="btn btn-outline-primary" href="/index"> index</a>
	<a class="btn btn-outline-primary" href="/alumn/mis-materias">mis materias</a>
	<a class="btn btn-outline-primary" href="/alumn/Listado-materias"> listado materias</a>


		<sec:authorize access="isAuthenticated()">
			<form:form method="post" action="/logout"><input type="submit" class="btn btn-outline-danger mb-2" value=" cerrar sesion" /></form:form>
		</sec:authorize>

		
	</nav><br><br><br>

	<div class="card text-center">
		<div class="card-header">
			PROFESOR: <a href="#">${ramo.getTeacher().getName()}
				${ramo.getTeacher().getLastName()}</a>
		</div>
		<div class="card-body">
			<h5 class="card-title">${ramo.getName()}</h5>
			<p class="card-text">${ramo.getDescription()}</p>
			
			<c:if test="${cursoTomado == 0}">
			<c:if test="${cupos == 0}">
				<p class="alert alert-primary" role="alert">no quedan cupos disponibles en este curso</p>
			</c:if>
				<c:if test="${cupos > 0}">
				<c:if test="${horarioTomado == 0}">
					<a href="/alumn/inscribirse/${ramo.getId()}"
						class="btn btn-primary">Inscribirse</a>
				</c:if>
				<c:if test="${horarioTomado != 0}">
					<p class="alert alert-primary" role="alert">usted tiene este horario ocupado</p>
				</c:if>
				</c:if>
			</c:if>
			
			<c:if test="${cursoTomado != 0}">
				<p class="alert alert-primary" role="alert">usted ya esta inscrito en esta materia</p>

			</c:if>
		</div>
		<div class="card-footer text-muted">
			${ramo.getDayHourHand().getDay().getDay()} :
			${ramo.getDayHourHand().getHourHand().getDetail()}</div>
	</div>

</body>
</html>