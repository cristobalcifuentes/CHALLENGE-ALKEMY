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

	<div class="row mr-3 mr-md-3">
		<div class="col mr-md-3">
			<h1>editar profesor</h1>

			<form:form method="post" action="/guardarprofesor">
			  <div class="form-row">
			  <div class="form-group col-md-3">
				<label for="name"> nombre</label>
				<br />
				<form:input path="name"></form:input>
				<br />
				<br />
				<label for="lastName"> apellido</label>
				<br />
				<form:input path="lastName"></form:input>
				<br />
				<br />
				<label for="DNI"> dni</label>
				<br />
				<form:input path="DNI"></form:input>
				<br />
				<br />
				<label for="enabled"> activo</label>
				<br />
				<form:select path="enabled">
					<form:option value="1" label="activo" />
					<form:option value="2" label="inactivo" />

				</form:select>
				<br />
				<br />
				<form:hidden path="id" />
				<br />
				<br />
				<input type="reset" value="Limpiar" />
				<input type="submit" value="Registrar" />
				
				
				</div>
				</div>
			</form:form>


			<c:if test="${asociados == 0}">



				<th><a href="/eliminarprofesor/${profesor.getId()}">eliminar</a></th>
			</c:if>

			<c:if test = "${ramos != null}" >
		</div>
		<div class="col">
			<table class="table table-dark">

				<c:forEach items="${ramos}" var="ramo">
					<tr>
						<td>${ramo.getName()}</td>
						<td>${ramo.getDayHourHand().getDay().getDay()}</td>
						<td>${ramo.getDayHourHand().getHourHand().getDetail()}</td>
						<td><a href="/detalle-ramo/${ramo.getId()}">ver detalle
								ramo</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		</c:if>
		
	</div>

</body>
</html>