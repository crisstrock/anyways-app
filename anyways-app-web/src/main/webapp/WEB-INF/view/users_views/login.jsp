<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>
<title>Login</title>
<style type="text/css">
.formato-error{
	color: red;
}
</style>
</head>
<body>
	<div class="container">
		<form:form action="${pageContext.request.contextPath}/loginProcessing" method="POST">
		<c:if test="${ param.error != null }">
			<strong class="formato-error">Usuario o contraseña incorrectos!</strong>
		</c:if>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			<div>
				<p>Usuario</p>
				<input type="text" name="username"/>
			</div>
			<div>
				<p>Contraseña</p>
				<input type="password" name="password"/>
			</div>
			<div>
				<input type="submit" value="Login"/>
			</div>
		</form:form>
	</div>
</body>
</html>