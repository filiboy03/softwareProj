<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="/resource/css/main.css"/>

<title>Student Registration Form</title>
<spring:url value="/resource/css/main.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
</head>
<body>

<div id="global" class="form-group">
<form:form action="addnewstudent" method="POST" modelAttribute="newstudent">
    <fieldset>
       <legend>New Student</legend>
         
        <p>
            <label for="name"> Name: </label>
             <form:input path="firstName" />
                       <form:errors path="firstName" class="errors"/><br>
        </p>
        <p>
            <label for="lastname">Last name: </label>
           <form:input  path= "lastName" />
             <form:errors path="lastName" class="errors"/><br>
        </p>
        <p>
            <label for="email">Email: </label>
           <form:input  path= "email" />
             <form:errors path="email" class="errors"/><br>
        </p>
        <p id="buttons">
            
            <input id="submit" type="submit" value="Add Student" class="btn btn-default">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
