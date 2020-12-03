<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>editar profesor</h1>

 <form:form method="post" action="/guardarprofesor" >
		<label for="name"> nombre</label><br/> <form:input path="name" ></form:input><br/><br/>
		<label for="lastName"> apellido</label> <br/><form:input path="lastName" ></form:input><br/><br/>
		<label for="DNI"> dni</label><br/> <form:input path="DNI" ></form:input><br/><br/>
		<label for="enabled"> activo</label><br/> <form:input path="enabled" ></form:input><br/><br/>
		<form:hidden path="id" /><br/><br/>
        <input type="reset" value="Limpiar" />
		<input type="submit" value="Registrar" />
	</form:form>


</body>
</html>