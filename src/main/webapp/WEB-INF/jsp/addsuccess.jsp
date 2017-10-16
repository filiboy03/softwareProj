<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
<head>
<title>Success</title>
 <spring:url value="/resource/css/main.css" var="mainCss" /> 
<link href="${mainCss}" rel="stylesheet" />
</head>
<body>


	<div class="form-group">
		<h3>
		${student.firstName} saved with id: ${student.id} successfully!
		</h3>
	</div>
	<div class="form-group">
	<form:form method="get" action="/">
		<button type="submit" class="btn btn-default">Add Another Student</button>
	</form:form>
	</div>
</body>
</html>