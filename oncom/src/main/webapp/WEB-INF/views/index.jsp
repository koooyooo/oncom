<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
	</head>
	<body>
		<form:form action="/login" method="POST" modelAttribute="login" >
			<form:input path="id"/>
			<br/>
			<form:input path="password"/>
		</form:form>
	</body>
</html>
