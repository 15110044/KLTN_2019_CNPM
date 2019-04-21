<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<style>
.blue-button {
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',
		endColorstr='#188BC0', GradientType=0);
	padding: 3px 5px;
	color: #fff;
	font-family: 'Helvetica Neue', sans-serif;
	font-size: 12px;
	border-radius: 2px;
	-moz-border-radius: 2px;
	-webkit-border-radius: 4px;
	border: 1px solid #1A87B9
}

table {
	font-family: "Helvetica Neue", Helvetica, sans-serif;
	width: 50%;
}

th {
	background: SteelBlue;
	color: white;
}

td, th {
	border: 1px solid gray;
	width: 25%;
	text-align: left;
	padding: 5px 10px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<form:form method="POST" modelAttribute="category" action="addCategory">
		<table>
			<tr>
				<th colspan="2">Add Category</th>
			</tr>
			<tr>
				<form:hidden path="categoryID" />
				<td><form:label path="nameCategory">Category  name</form:label></td>
				<td><form:input path="nameCategory" size="30" maxlength="30"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="description">Description</form:label></td>
				<td><form:input path="description" size="30" maxlength="30" /></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" class="blue-button">
				</td>
			</tr>
		</table>

	</form:form>

</body>
</html>