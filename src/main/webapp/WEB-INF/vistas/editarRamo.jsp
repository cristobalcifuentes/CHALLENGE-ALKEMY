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

<title>editar ramo</title>
</head>
<body>
	<h1>EDITAR RAMO</h1>



			<form:form method="post" action="/guardar-ramo-editado">
				<div class="form-group">
					<div class="form-group col-md-3">
					
						<label for="name"> nombre</label> <br />
						<form:input path="name"></form:input>

						<br /> <br /> <label for="quantity"> cantidad cupos</label> <br />
						<form:input path="quantity"></form:input>
						
						<br /> <br /> <label for="quantity"> profesor</label> <br />
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
						
						<br /> <br /> <label for="description"> descripcion</label> <br />
						<form:textarea class="form-control" rows="5" path="description"></form:textarea>
						
						<form:hidden path="id" />
						
						<br /> <br /> <input type="reset" value="Limpiar" /> <input
							type="submit" value="Registrar" />


					</div>
				</div>
			</form:form>
</body>
</html>