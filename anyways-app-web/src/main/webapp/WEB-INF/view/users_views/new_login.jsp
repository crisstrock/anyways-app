<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
    integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
    crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
    integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
    crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
    integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
    crossorigin="anonymous"></script>
<title>Login</title>
<style>
    .form-signin {
      width: 100%;
      max-width: 330px;
      padding: 15px;
      margin: auto;
    }
    .formato-error{
		color: red;
	}
	.formato-logout{
		color: green;
		font-weight: bold;
	}
  </style>
</head>
<body>
	<div class="container h-100">
		<div class="row h-100 justify-content-center align-items-center">
			<form:form action="${pageContext.request.contextPath}/loginProcessing" method="POST" cssClass="form-signin" >
				<c:if test="${ param.error != null }">
					<strong class="formato-error">Usuario o contraseña incorrectos!</strong>
				</c:if>
				<c:if test="${ param.logout != null }">
					<strong class="formato-logout">Has cerrado sesión correctamente</strong>
				</c:if>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				<div class="mb-3">
					<h1 class="h3 mb-3 font-weight-normal text-center">Iniciar sesión</h1>
				</div>
				<div class="mb-3">
					<label for="inputEmail" class="sr-only">Dirección de correo electrónico</label>
		        	<input type="text" id="usernameId" class="form-control mb-2" name="username" placeholder="Username"
		          	required autofocus>
				</div>
				<div class="mb-3">
    				<label for="inputPassword" class="sr-only">Contraseña</label>
		        	<input type="password" class="form-control mb-2" name="password" />
  				</div>
				<input type="submit" class="btn btn-primary" value="Log In">
			</form:form>
		</div>
	</div>
</body>
</html>