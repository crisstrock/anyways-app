<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="_csrf" content="${_csrf.token}" />
<meta name="_csrf_header" content="${_csrf.headerName}" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="canonical"
	href="https://getbootstrap.com/docs/4.0/examples/dashboard/">
<link type="text/css" rel="stylesheet"
	href="<c:url value="/css/bootstrap.css" />">
<title>Home</title>
<style type="text/css">
#formLogoutId {
	display: none;
}
</style>
</head>
<body>
	<form:form id="formLogoutId"
		action="${ pageContext.request.contextPath }/logout" method="POST">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form:form>
	<nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0">
		<a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Anyways</a> <input
			class="form-control form-control-dark w-100" type="text"
			placeholder="Search" aria-label="Search">
		<ul class="navbar-nav px-3">
			<li class="nav-item text-nowrap"><a class="nav-link"
				id="btnLogoutId" href="#">Sign out</a></li>
		</ul>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<nav class="col-md-2 d-none d-md-block bg-light sidebar">
				<div class="sidebar-sticky">
					<ul class="nav flex-column">
						<li class="nav-item"><a class="nav-link active" href="#">
								<span data-feather="home"></span> Dashboard <span
								class="sr-only">(current)</span>
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="file"></span> <security:authentication
									property="principal.username" />
						</a></li>
						<security:authorize
							access="hasAnyRole('ADMINISTRADOR','AYUDANTE')">
							<li class="nav-item"><a class="nav-link"
								href="${ pageContext.request.contextPath }/customers/">
									<span data-feather="users"></span> Customers
							</a></li>
						</security:authorize>
						<li class="nav-item"><a class="nav-link"
							href="${ pageContext.request.contextPath }/devices/"> <span
								data-feather="shopping-cart"></span> Devices
						</a></li>
						<security:authorize access="hasRole('ADMINISTRADOR')">
							<li class="nav-item"><a class="nav-link"
								href="${ pageContext.request.contextPath }/licenses/"> <span
									data-feather="bar-chart-2"></span> Licenses
							</a></li>
						</security:authorize>
						<security:authorize access="hasRole('ADMINISTRADOR')">
							<li class="nav-item"><a class="nav-link"
								href="${ pageContext.request.contextPath }/prestamos/"> <span
									data-feather="bar-chart-2"></span>Prestamos
							</a></li>
						</security:authorize>

						<h6
							class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
							<span>Saved reports</span> <a
								class="d-flex align-items-center text-muted" href="#"> <span
								data-feather="plus-circle"></span>
							</a>
						</h6>
						<ul class="nav flex-column mb-2">
							<li class="nav-item"><a class="nav-link" href="#"> <span
									data-feather="file-text"></span> Current month
							</a></li>
							<li class="nav-item"><a class="nav-link" href="#"> <span
									data-feather="file-text"></span> Last quarter
							</a></li>
							<li class="nav-item"><a class="nav-link" href="#"> <span
									data-feather="file-text"></span> Social engagement
							</a></li>
							<li class="nav-item"><a class="nav-link" href="#"> <span
									data-feather="file-text"></span> Year-end sale
							</a></li>
						</ul>
				</div>
			</nav>

			<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
				<div
					class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
					<h1 class="h2">
						<security:authentication property="principal.authorities" />
					</h1>
					<div class="btn-toolbar mb-2 mb-md-0">
						<div class="btn-group mr-2">
							<button class="btn btn-sm btn-outline-secondary">Share</button>
							<button class="btn btn-sm btn-outline-secondary">Export</button>
						</div>
						<button class="btn btn-sm btn-outline-secondary dropdown-toggle">
							<span data-feather="calendar"></span> This week
						</button>
					</div>
				</div>

				<canvas class="my-4" id="myChart" width="900" height="380"></canvas>

				<h2>Section title</h2>
				<div class="table-responsive">
					<table class="table table-striped table-sm">
						<thead>
							<tr>
								<th>#</th>
								<th>Header</th>
								<th>Header</th>
								<th>Header</th>
								<th>Header</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1,001</td>
								<td>Lorem</td>
								<td>ipsum</td>
								<td>dolor</td>
								<td>sit</td>
							</tr>
							<tr>
								<td>1,002</td>
								<td>amet</td>
								<td>consectetur</td>
								<td>adipiscing</td>
								<td>elit</td>
							</tr>
							<tr>
								<td>1,003</td>
								<td>Integer</td>
								<td>nec</td>
								<td>odio</td>
								<td>Praesent</td>
							</tr>
							<tr>
								<td>1,003</td>
								<td>libero</td>
								<td>Sed</td>
								<td>cursus</td>
								<td>ante</td>
							</tr>
							<tr>
								<td>1,004</td>
								<td>dapibus</td>
								<td>diam</td>
								<td>Sed</td>
								<td>nisi</td>
							</tr>
							<tr>
								<td>1,005</td>
								<td>Nulla</td>
								<td>quis</td>
								<td>sem</td>
								<td>at</td>
							</tr>
							<tr>
								<td>1,006</td>
								<td>nibh</td>
								<td>elementum</td>
								<td>imperdiet</td>
								<td>Duis</td>
							</tr>
							<tr>
								<td>1,007</td>
								<td>sagittis</td>
								<td>ipsum</td>
								<td>Praesent</td>
								<td>mauris</td>
							</tr>
							<tr>
								<td>1,008</td>
								<td>Fusce</td>
								<td>nec</td>hidden
								<td>tellus</td>
								<td>sed</td>
							</tr>
							<tr>
								<td>1,009</td>
								<td>augue</td>
								<td>semper</td>
								<td>porta</td>
								<td>Mauris</td>
							</tr>
							<tr>
								<td>1,010</td>
								<td>massa</td>
								<td>Vestibulum</td>
								<td>lacinia</td>
								<td>arcu</td>
							</tr>
							<tr>
								<td>1,011</td>
								<td>eget</td>
								<td>nulla</td>
								<td>Class</td>
								<td>aptent</td>
							</tr>
							<tr>
								<td>1,012</td>
								<td>taciti</td>
								<td>sociosqu</td>
								<td>ad</td>
								<td>litora</td>
							</tr>
							<tr>
								<td>1,013</td>
								<td>torquent</td>
								<td>per</td>
								<td>conubia</td>
								<td>nostra</td>
							</tr>
							<tr>
								<td>1,014</td>
								<td>per</td>
								<td>inceptos</td>
								<td>himenaeos</td>
								<td>Curabitur</td>
							</tr>
							<tr>
								<td>1,015</td>
								<td>sodales</td>
								<td>ligula</td>
								<td>in</td>
								<td>libero</td>
							</tr>
						</tbody>
					</table>
				</div>
			</main>
		</div>
	</div>
	<script type="text/javascript" src="<c:url value="/js/bootstrap.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/js/jquery-3.6.3.js" />"></script>
	<!-- Icons -->
	<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
	<script>
      feather.replace()
    </script>

	<!-- Graphs -->
	<script
		src="https://cdn.jsdelivr.net/npm/chart.js@2.7.1/dist/Chart.min.js"></script>
	<script type="text/javascript">
    	$(document).ready(function () {
    		$("#btnLogoutId").on('click', function () {
    			$("#formLogoutId").submit();
    		});
    	});
    </script>
</body>
</html>