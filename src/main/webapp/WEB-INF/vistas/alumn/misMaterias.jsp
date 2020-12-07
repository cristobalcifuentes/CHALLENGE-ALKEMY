<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

	<h1  class="text-center">MIS MATERIAS</h1>

	<c:forEach items="${ramos}" var="ramo">
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



	</c:forEach>



</body>
</html>