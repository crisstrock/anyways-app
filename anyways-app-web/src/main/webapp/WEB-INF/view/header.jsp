<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<script type="text/javascript"
		src="<c:url value="/js/jquery-3.6.3.js" />"></script>
<script type="text/javascript">
    	$(document).ready(function () {
    		$("#btnLogoutId").on('click', function () {
    			$("#formLogoutId").submit();
    		});
    	});
    </script>