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
	<h1  class="text-center">GESTIONAR MATERIA</h1>
	
	
		<nav class="navbar navbar-dark bg-dark">
	
	<a class="btn btn-outline-primary" href="/index"> index</a>
		<a class="btn btn-outline-primary" href="/admin/gestionar-ramos"> gestonar materias</a>
		<a class="btn btn-outline-primary" href="/admin/gestionar-profesores"> gestonar profesores</a>
	


		<sec:authorize access="isAuthenticated()">
			<form:form method="get" action="/logout"><input type="submit" class="btn btn-outline-danger mb-2" value=" cerrar sesion" /></form:form>
		</sec:authorize>

		
	</nav><br><br><br>

			<c:if test="${ramo == null}">
				<h2>CREAR MATERIA</h2>
			</c:if>
			<c:if test="${ramo != null}">
				<h2>EDITAR MATERIA</h2>
			</c:if>

			<form:form method="post" action="/admin/guardar-ramo-editado">
				<div class="form-group">
					<div class="form-group col-md-3">
					
						<form:input placeholder="NOMBRE" path="name"></form:input>
						<br><br>
						<form:input placeholder="CANTIDAD CUPOS" path="quantity"></form:input>
						
						<br /> <br /> <label for="teacher"> profesor</label> <br />
						<form:select path="teacher" >
						<c:forEach items="${profesores}" var="profesor">
							<form:option value="${profesor.getId()}" label="${profesor.getName()} ${profesor.getLastName()}" />
						</c:forEach>
						</form:select>
						
						<br /> <br /> <label for="dayHourHand.day"> dia</label> <br />
						<form:select path="dayHourHand.day">
							<form:option value="1" label="lunes" />
							<form:option value="2" label="martes" />
							<form:option value="3" label="miercoles" />
							<form:option value="4" label="jueves" />
							<form:option value="5" label="viernes" />
						</form:select>
						
						<br /> <br /><label for="dayHourHand.hourHand"> horarios</label> <br />
						<form:select path="dayHourHand.hourHand">
							<form:option value="1" label="08:00 - 09:30" />
							<form:option value="2" label="09:45 - 11:15" />
							<form:option value="3" label="11:30 - 13:00" />
						</form:select>
						<br><br>
						<form:textarea placeholder="DESCRIPCION" class="form-control" rows="5" path="description"></form:textarea>
						
						<form:hidden path="id" />
						
						<br /> <br /> <input type="reset" class="btn btn-secondary  mb-2"  value="Limpiar" /> <input
							type="submit" class="btn btn-primary mb-2" value="Registrar" />


					</div>
				</div>
			</form:form>
</body>
</html>