<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
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

img {
	height: 100px;
	width: 100px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Product List</h3>
	<c:if test="${!empty lop}">
		<table class="tg">
			<tr>
				<th width="80">PRODUCT_ID</th>
				<th width="120">PRODUCT_Name</th>
				<th width="120">PRICE</th>
				<th width="120">DESCRIPTION</th>
				<th width="120">COOK_ID</th>
				<th width="120">CATEGORY_ID</th>
				<th width="120">I1</th>
				<th width="120">I2</th>
				<th width="120">I3</th>
				<th width="120">Edit</th>
				<th width="120">Delete</th>

			</tr>
			<c:forEach items="${lop}" var="pro">
				<tr>
					<td>${pro.idProduct}</td>
					<td>${pro.nameProduct}</td>
					<td>${pro.price}</td>
					<td>${pro.description}</td>
					<td>${pro.cook.fname}</td>
					<td>${pro.category.nameCategory}</td>
					<td><img src="data:image/jpg;base64,${pro.imgEnc64}"></td>
					<td><img src="data:image/jpg;base64,${pro.img2Enc64}"></td>
					<td><img src="data:image/jpg;base64,${pro.img3Enc64}"></td>
					<td><a href='<c:url value='/updateProduct/${pro.idProduct }'></c:url>'>Update</a></td>
					<td><a href='<c:url value='/deleteProduct/${pro.idProduct }'></c:url>'>Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>