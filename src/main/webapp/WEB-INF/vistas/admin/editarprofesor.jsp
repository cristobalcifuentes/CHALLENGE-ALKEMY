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
<title>GESTIONAR PROFESOR</title>
</head>
<body>
<h1  class="text-center"> GESTIONAR PROFESOR</h1>
	
		<nav class="navbar navbar-dark bg-dark">
	
	<a class="btn btn-outline-primary" href="/index"> index</a>
		<a class="btn btn-outline-primary" href="/admin/gestionar-ramos"> gestonar materias</a>
		<a class="btn btn-outline-primary" href="/admin/gestionar-profesores"> gestonar profesores</a>
	


		<sec:authorize access="isAuthenticated()">
			<form:form method="get" action="/logout"><input type="submit" class="btn btn-outline-danger mb-2" value=" cerrar sesion" /></form:form>
		</sec:authorize>

		
	</nav><br><br><br>

	<div class="row mr-3 mr-md-3">
		<div class="col mr-md-3">
			<c:if test="${profesor == null}">
				<h2>CREAR PROFESOR</h2>
			</c:if>
			<c:if test="${profesor != null}">
				<h2>EDITAR PROFESOR</h2>
			</c:if>


			<form:form method="post" action="/admin/guardarprofesor">
				<div class="form-group">
					<div class="form-group col-md-3">
						<div class="form-row">
							<div class="form-group col-md-3">
								<form:input placeholder="NOMBRE" path="name"></form:input>
								<br /> <br />
								<form:input placeholder="APELLIDO" path="lastName"></form:input>
								<br /> <br />
								<form:input placeholder="DNI" path="DNI"></form:input>
								<br /> <br /> <label for="enabled"> activo</label> <br />
								<form:select path="enabled">
									<form:option value="1" label="activo" />
									<form:option value="2" label="inactivo" />

								</form:select>
								<br /> <br />
								<form:hidden path="id" />

								<input class="btn btn-secondary mb-2" type="reset"
									value="Limpiar" /> <input type="submit"
									class="btn btn-primary mb-2" value="Registrar" />


							</div>
						</div>
					</div>
				</div>
			</form:form>


			<c:if test="${asociados == 0}">



				<th><a type="button" class="btn btn-danger"
					href="/admin/eliminarprofesor/${profesor.getId()}">eliminar</a></th>
			</c:if>


		</div>
		<c:if test="${ramos != null}">
			<div class="col">
				<table class="table table-dark">

					<c:forEach items="${ramos}" var="ramo">
						<tr>
							<td>${ramo.getName()}</td>
							<td>${ramo.getDayHourHand().getDay().getDay()}</td>
							<td>${ramo.getDayHourHand().getHourHand().getDetail()}</td>
							<td><a type="button" class="btn btn-primary"
								href="/admin/detalle-ramo/${ramo.getId()}">ver detalle ramo</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</c:if>

	</div>

</body>
</html>