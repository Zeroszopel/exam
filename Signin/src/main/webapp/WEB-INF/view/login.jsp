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
	<h1>Đăng nhập</h1>
	<p>
	<c:if test="${message!=null }">
	<span class="message">${message}</span>
	</c:if>
	</p>
	<form:form action="login" method="post" modelAttribute="account">
		
		<table>
		<tr>
                    <td><form:label path="username">Tên tài khoản:</form:label></td>
                    <td><form:input path="username"/> </td>
                </tr>
                <tr>
                    <td><form:label path="password">Mật khẩu:</form:label></td>
                    <td><form:input path="password"/> </td>
                </tr>
                <tr>
                    <td></td>
                    <td><form:button>Đăng nhập</form:button> </td>
                </tr>
		</table>
		</form:form>
</body>
</html>