<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>LOGIN ALKEMY</title>
</head>
<body>

	<h1 class="text-center">LOGIN</h1>
	<div class="container">




		<div class="card align-items-center">
			<form:form action="/login" method="post">
				<br />
				<br />
				<form:input class="form-control" placeholder="rut" path="rut" />
				<br />
				<br />


				<form:input class="form-control" type="password"
					placeholder="password" path="password" />
				<br />
				<br />
				<input type="reset" class="btn btn-secondary  mb-2" value="Limpiar" />
				<input type="submit" class="btn btn-primary mb-2" value="Acceder" />
			</form:form>
		</div>





	</div>

</body>
</html>