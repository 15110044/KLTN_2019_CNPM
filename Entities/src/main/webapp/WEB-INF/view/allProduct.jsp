<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/lib/bootstrap.css">
<link rel="stylesheet" type="text/css" href="resources/css/allProduct.css">
<script src="resources/lib/jquery-3.2.1.min.js"></script>
<script src="resources/lib/bootstrap.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../format/header.jsp"></jsp:include>
	<div class="container">
		<div id="mycart"></div>
		<c:if test="${!empty lop}">

			<c:forEach items="${lop}" var="pro">
				<div id="item_div">
					<div class="items" id="item1">
						<img src="data:image/jpg;base64,${pro.imgEnc64}"> <input
							type="button" value="Add To CART"
							onclick="cart(${pro.idProduct});">
						<a href='<c:url value="/getProduct/${pro.idProduct}"></c:url>'>${pro.nameProduct}</a>
						<p>${pro.price}</p>
					</div>
				</div>
			</c:forEach>

		</c:if>
	</div>
	<div class="center">
		<div class="pagination">
			<a href="#">&laquo;</a> <a href="#" class="active">1</a> <a href="#" >2</a>
			<a href="#">3</a> <a href="#">4</a> <a href="#">5</a> <a href="#">6</a>
			<a href="#">&raquo;</a>
		</div>
	</div>
	<jsp:include page="../format/footer.jsp"></jsp:include>
</body>
</html>