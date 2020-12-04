<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center;">GESTIONAR PROFESORES</h1>
<nav class="navbar d-flex flex-row-reverse">
<a href="/nuevoprofesor"><button class="btn btn-outline-success my-2 my-lg-0 ">nuevo profesor</button></a>
</nav>


	
	<table class="table table-dark">

		<tr>
			<th>nombre</th>
			<th>apellido</th>
			<th>dni</th>
			<th>activo</th>
			<th></th>
		</tr>
		
		<c:forEach items="${profesores}" var="profesor">
		<tr>
			<td>${profesor.getName()}</td>
			<td>${profesor.getLastName()}</td>
			<td>${profesor.getDNI()}</td>
			<td>${profesor.getEnabled().getEnabled()}</td>
			<td><a href="/editarprofesor/${profesor.getId()}">gestionar</a> </td>
		</tr>
		</c:forEach>
		
	</table>
	
	
</body>
</html>