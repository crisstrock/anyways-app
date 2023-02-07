<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customers</title>
<link type="text/css" rel="stylesheet"
	href="<c:url value="/css/bootstrap.css" />">
<script type="text/javascript" src="<c:url value="/js/bootstrap.js" />"></script>
</head>
<body>
	<div class="container">
		<h1>Customers</h1>
	</div>
	<div class="container">
	<a href="${ pageContext.request.contextPath }/">Home</a>
		<form:form action="process_customer" method="get" modelAttribute="customerDTO">
			<div class="mb-3">
				<label for="firstName" class="form-label">Nombre</label>
				<form:input type="text" cssClass="form-control"
					path="firstName" aria-describedby="firstNameHelp" />
				<form:errors path="firstName" cssClass="error"></form:errors>
			</div>
			<div class="mb-3">
				<label for="lastName" class="form-label">Apellido</label>
				<form:input type="text" cssClass="form-control"
					path="lastName" aria-describedby="lastNameHelp" />
				<form:errors path="lastName" cssClass="error"></form:errors>
			</div>
			<div class="mb-3">
				<label for="fechaNacimiento" class="form-label">Fecha de Nacimiento</label>
				<form:input type="date" cssClass="form-control"
					path="fechaNacimiento" aria-describedby="fechaNacimientoHelp" />
			</div>
			<div class="mb-3">
				<label for="genero" class="form-label">Genero</label>
				<form:input type="text" cssClass="form-control"
					path="genero" aria-describedby="generoHelp" />
			</div>
			<div class="mb-3">
				<label for="rfc" class="form-label">RFC</label> 
				<form:input type="text" cssClass="form-control"
					path="rfc" aria-describedby="rfcHelp" />
					<div id="firstNameHelp" class="form-text">El RFC debe ser único para caa cliente.</div>
			</div>
			<div class="mb-3">
				<label for="curp" class="form-label">CURP</label>
				<form:input type="text" cssClass="form-control"
					path="curp" aria-describedby="curpHelp" />
				<div id="firstNameHelp" class="form-text">La CURP debe ser única para caa cliente.</div>
			</div>
			<div class="mb-3 form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me
					out</label>
			</div>
			<button type="submit" class="btn btn-primary">Guardar Cliente</button>
		</form:form>
	</div>
</body>
</html>