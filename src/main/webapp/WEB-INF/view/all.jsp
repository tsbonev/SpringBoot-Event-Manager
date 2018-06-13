<%@ page import="com.tsbonev.Entity.Event" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

    <!-- Access the bootstrap Css like this,
        Spring boot will handle the resource mapping automcatically -->
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

    <!--
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
    <c:url value="/css/main.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />

</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Spring Boot</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">

    <div class="starter-template">
        <table class="table table-striped">

            <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Location</th>
                <th>Start</th>
                <th>End</th>
            </tr>
            </thead>

            <tbody>

            <c:forEach var="event" items="${events}">


                <tr>
                    <td><c:out value="${event.id}"></c:out></td>
                    <td><c:out value="${event.name}"></c:out></td>
                    <td><c:out value="${event.location}"></c:out></td>
                    <td><c:out value="${event.startDate}"></c:out></td>
                    <td><c:out value="${event.endDate}"></c:out></td>
                </tr>


            </c:forEach>

            </tbody>

        </table>
    </div>

</div>

<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
