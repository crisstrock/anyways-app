<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Clientes</title>
</head>
<body>
	<div class="container">
		<h1>Clientes</h1>
	</div>
	<div class="container" style="display: flex; justify-content: space-between;">
		<a href="${ pageContext.request.contextPath }/customers/add-customer">Agregar Nuevo</a>
		<a href="${ pageContext.request.contextPath }/">Home</a>
	</div>
	<div class="container">
		<table class="table table-dark">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Nombres</th>
					<th scope="col">Apellidos</th>
					<th scope="col">Fecha de Nacimiendo</th>
					<th scope="col">Genero</th>
					<th scope="col">RFC</th>
					<th scope="col">CURP</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="customer" items="${customers}">
					<tr>
						<th scope="row">${customer.id}</th>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.birtdayDate}</td>
						<td>${customer.sex}</td>
						<td>${customer.rfc}</td>
						<td>${customer.curp}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>