<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign in</title>
<style>
.message{color:green;}
</style>
</head>
<body>
	<h1>Xin chào ${name}</h1>
	<p>
	<c:if test="${message!=null }">
	<span class="message">${message}</span>
	</c:if>
	</p>
</body>
</html>