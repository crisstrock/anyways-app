<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div class="container"></div>
	<div class="container">
		<form:form action="${ pageContext.request.contextPath }/loginUser" method="POST">
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