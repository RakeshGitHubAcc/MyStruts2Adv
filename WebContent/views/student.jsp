<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<s:form action="addStudent">
		<s:textfield name="firstName" label="First Name" />
		<s:textfield name="lastName" label="Last Name" />
		<s:textfield name="marks" label="Marks" />
		<s:submit />
		<hr />
		<table>
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Marks</td>
			</tr>
			<s:iterator value="students">
				<tr>
					<td><s:property value="firstName" /></td>
					<td><s:property value="lastName" /></td>
					<td><s:property value="marks" /></td>
				</tr>
			</s:iterator>
		</table>
	</s:form>
</body>
</html>