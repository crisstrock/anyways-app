<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet"
	href="<c:url value="/css/bootstrap.css" />">
<title>Acceso Denegado</title>
</head>
<body>
	<h1>Acceso Denegado</h1>
	<h2>Oops! no tienes los permisos necesarios para acceder a este
		recurso.</h2>

	<p>
		Click
		<button id="btnBackId" class="btn btn-secondary">
			<strong>Here</strong>
		</button>
		<%-- ${ pageContext.request.contextPath }/home/ --%>
		para ir al Home.
	</p>
	<script type="text/javascript" src="<c:url value="/js/bootstrap.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/js/jquery-3.6.3.js" />"></script>
	<script type="text/javascript">
$(document).ready(function () {
	$('#btnBackId').on('click', function(){
		window.history.back();
	});
});
</script>
</body>
</html>