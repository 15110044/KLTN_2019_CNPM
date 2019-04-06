<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default rounded borders and increase the bottom margin */
.navbar {
	margin-bottom: 0px;
	border-radius: 0;
}

/* Remove the jumbotron's default bottom margin */
.jumbotron {
	margin-bottom: 0;
}

/* Add a gray background color and some padding to the footer */
footer {
	width: 100%;
	background: #f2f2f2;
	z-index: 4000;
	clear: both;
	line-height: 1.7em;
	padding: 30px 0 10px;
	min-height: 90px;
	font-size: 12px;
	border-top: #ddd 1px solid;
	height: 110px;
}

#img1 {
	height: 315px;
	width: 530px;
	margin: 10px;
}

#foodName {
	font-size: 44px;
	font-weight: bold;
	margin: 0px;
}

#price {
	margin-top: 45px;
}

#cookName {
	font-size: 15px;
	margin-top: 10px;
	color: #000000b3;
}

#cookImg {
	height: 40px;
	width: 40px;
}

#modify {
	height: 23px;
	width: 90px;
	background-color: #000000b3;
	text-align: center;
	font-weight: bold;
	margin-top: 10px
}

#modify2 {
	color: white;
}

#img2 {
	height: 215px;
	width: 330px;
	margin: 10px;
}

#img3 {
	height: 215px;
	width: 330px;
	margin: 10px;
}

#description {
	font-size: 34px;
	margin: 0px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../format/header.jsp"></jsp:include>

	<div class="container">
		<div class="row">
			<div class="col-sm-6">
				<img id="img1" src="data:image/jpg;base64,${product.imgEnc64}"
					class="img-responsive">
			</div>
			<div class="col-sm-6">
				<div class="row">
					<div class="col-sm-6">
						<p id="foodName">${product.nameProduct }</p>
					</div>
					<div class="col-sm-6">
						<p id="price">${product.price }</p>

					</div>
				</div>

				<div class="row">
					<div class="col-sm-1">
						<img id="cookImg"
							src="data:image/jpg;base64,${product.cook.avatar64bit}"
							class="img-circle">
					</div>
					<div class="col-sm-11">
						<a id="cookName" href="#">${product.cook.fname }
							${product.cook.lname }</a>
					</div>
				</div>
				<p id="modify">
					<a id="modify2" href='<c:url value="/updateProduct/${product.idProduct }"></c:url>'>Modify</a>
				</p>

			</div>
		</div>
		<hr>
		<div class="row">
			<div class="col-sm-4">
				<img id="img2" src="data:image/jpg;base64,${product.img2Enc64}"
					class="img-responsive"> <img id="img3"
					src="data:image/jpg;base64,${product.img3Enc64}"
					class="img-responsive">

			</div>
			<div class="col-sm-8">
				<p id="description">Description</p>
				<p>${cook.description }</p>

			</div>
		</div>
		<hr>
	</div>
	<jsp:include page="../format/footer.jsp"></jsp:include>
</body>
</html>