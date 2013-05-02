<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
	</head>
	<form:errors path="loginForm.*"/>
	<body>
		<form:form action="/login" method="POST" modelAttribute="login" >
			<form:input path="id"/>
			<br/>
			<form:input path="password"/>
			<br/>
			<button type="submit">送信</button>
		</form:form>
	</body>
</html>
