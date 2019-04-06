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
<link rel="stylesheet" type="text/css" href="resources/css/showCart.css" />
<script src="resources/lib/jquery-3.2.1.min.js"></script>
<script src="resources/lib/bootstrap.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../format/header.jsp"></jsp:include>
	<div class="container-fluid">
		<h2>Your Cart</h2>
		<c:if test="${!empty lop}">
			<table class="tg">
				<tr>

					<th width="120">PRODUCT_Name</th>
					<th width="120">PRICE</th>

				</tr>
				<c:forEach items="${lop}" var="pro">
					<tr>
						<td>${pro.nameProduct}</td>
						<td>${pro.price}</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>

	<jsp:include page="../format/footer.jsp"></jsp:include>
</body>
</html>