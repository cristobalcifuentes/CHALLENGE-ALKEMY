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

	<h1>simulacion 3</h1>


	<table class="table table-dark">
		<tr>
			<th>id</th>
			<th>nombre</th>
		</tr>

		<c:forEach items="${alumnos}" var="alumnos">
			<tr>
				<td>${alumnos.getId()}</td>
				<td>${alumnos.getNombre()}</td>
			</tr>
		</c:forEach>

	</table>
	
	<a href="/index" class="btn btn-primary stretched-link">index</a>

</body>
</html>