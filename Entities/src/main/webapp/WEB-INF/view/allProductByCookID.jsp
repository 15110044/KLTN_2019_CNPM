<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/proID.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="lib/jquery/3.2.1/jquery.min.js"></script>
<script src="resources/javascript/addCart.js"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.navbar {
	margin-bottom: 0px;
	border-radius: 0;
}
</style>
</head>
<body>
	<div class="jumbotron">
		<div class="container text-center">
			<h1>Find Food</h1>
			<p>Fast, Delicious & Comfortable</p>
		</div>

		<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Logo</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href='<c:url value="/"></c:url>'>Home</a></li>
					<li><a href='<c:url value="/getAllCook"></c:url>'>Cooks</a></li>
					<li><a href='<c:url value="/getAllProduct"></c:url>'>Products</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href='<c:url value="/newProduct"></c:url>'>Create
							Product</a></li>
					<li><a href='<c:url value="/updateCook/${cookID}"></c:url>'><span
							class="glyphicon glyphicon-user"></span> Update Profile</a></li>
					<li><a href='<c:url value="/getAllProduct"></c:url>'><span
							class="glyphicon glyphicon-user"></span> LOG OUT</a></li>

				</ul>
			</div>
		</div>

		</nav>

		<div class="container">

			<c:if test="${!empty lopid}">

				<c:forEach items="${lopid}" var="pro">
					<div id="item_div">
						<div class="items" id="item1">
							<img src="data:image/jpg;base64,${pro.imgEnc64}"> <a
								href='<c:url value="/getCookProduct/${pro.idProduct }"></c:url>'>${pro.nameProduct}</a>
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
	</div>
	</div>
	<footer class="container-fluid text-center"> ©2020 FoodFind
	Corporation. Lầu 5, Tòa nhà Khang Thông, 67 Nguyễn Thị Minh Khai, Quận
	1, TP.HCM <br>
	Số giấy phép ÐKKD: 0311828012 do sở Kế hoạch và Ðầu Tư TP.HCM cấp ngày
	11/06/2020 </footer>

	<script>
		var a = "${cookID}";
		document.cookie = a;
	</script>
</body>
</html>