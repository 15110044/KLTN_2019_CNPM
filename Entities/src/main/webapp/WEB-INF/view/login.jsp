<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="resources/lib/bootstrap.css">
<link rel="stylesheet" type="text/css" href="resources/css/login.css" />
<script src="resources/lib/jquery-3.2.1.min.js"></script>
<script src="resources/lib/bootstrap.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../format/header.jsp"></jsp:include>
	<div class="container">
		<form method="POST" action="loginProcess" modelAttribute="cook">
			<table>
				<tr>
					<th colspan="2">Log in</th>
				</tr>
				<tr>
					<input id="idCook" type="hidden" name="idCook"
						value="${cook.idCook} ">
				</tr>
				<tr>
					<td><label>Cook name</label></td>
					<td><input size="30" maxlength="30" name="cookName"
						value="${cook.fname }"></input></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><input type="password" size="30" maxlength="30"
						name="cookPass" value="${cook.password }" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" class="blue-button">
					</td>
				</tr>
			</table>
		</form>
	</div>

	<jsp:include page="../format/footer.jsp"></jsp:include>
</body>
</html>