<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>

<h1>login</h1>
 <form:form  action="login" method="post">
		<label for="rut"> rut</label><br/> <form:input path="rut" /><br/><br/>
		<label for="password"> password</label> <br/><form:input path="password" /><br/><br/>
        <input type="reset" value="Limpiar" />
		<input type="submit" value="Registrar" />
	</form:form>
	

</body>
</html>