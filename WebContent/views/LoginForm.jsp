<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring and Struts Integration Demo</title>
</head>
<body>
	<div align="center">
		<h1>Spring and Struts Integration Demo</h1>
		<h2>Users Login</h2>
		<s:form action="login" method="post">
			<s:textfield label="Username" name="user.userName" />
			<s:password label="Password" name="user.password" />
			<s:submit value="Login" />
		</s:form>
	</div>
</body>
</html>