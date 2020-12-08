<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>INDEX</h1>
<sec:authorize access="hasRole('2')">  

This content will only be visible to users who have
the "supervisor" authority in their list of <tt>GrantedAuthority</tt>s.

</sec:authorize>
<sec:authorize access="hasRole('1')">

This content will only be visible to users who have
the "supervisor" authority in their list of <tt>GrantedAuthority</tt>s.

</sec:authorize>
<sec:authorize access="!isAuthenticated()">
  Login
</sec:authorize>
<sec:authorize access="isAuthenticated()">
  Logout
</sec:authorize>
<sec:authorize access="isAuthenticated()">
    Welcome Back, <sec:authentication property="name"/>
</sec:authorize>
<sec:authorize access="!isAuthenticated()">
   no autenticado
</sec:authorize>


</body>
</html>