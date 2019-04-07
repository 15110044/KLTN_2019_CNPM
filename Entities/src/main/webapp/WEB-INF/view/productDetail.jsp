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
	src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="resources/javascript/addCart.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
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

#rating {
	font-size: 15px;
	color: #ffbf24;
	margin-top: 10px;
}

#addCart {
	height: 23px;
	width: 90px;
	background-color: #000000b3;
	text-align: center;
	font-weight: bold;
	margin-top: 10px
}

#addCart2 {
	color: white;
}

#cmt {
	width: 550px;
	height: 100px;
}

#sbmbtn {
	height: 23px;
	width: 90px;
	background-color: #000000b3;
	text-align: center;
	font-weight: bold;
	color: white;
	margin-top: 8px;
	float: right;
	margin-right: 5px;
}

#nameInput {
	margin-top: 8px;
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

.cmt #cusName {
	font-weight: bold;
	font-size: 23px;
}

#titleCmt {
	font-size: 34px;
	text-align: center;
	font-weight: bold;
	margin-bottom: 15px
}

.cmt {
	border-right: 0.5px solid #0000001a;
}

.cmt #cusCmt {
	font-size: 15px
}

.cmt #cusRate {
	color: #ffbf24;
	font-size: 10px
}

.cmt #dateCmt {
	float: right;
	margin-top: 8px;
	font-size: 10px;
	font-weight: bold;
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
						<a id="cookName" href='<c:url value='/getCook/${product.cook.idCook }'></c:url>'>${product.cook.fname }
							${product.cook.lname }</a>
					</div>
				</div>
				<p>
					<input type="button" value="Add To CART"
						onclick="cart(${product.idProduct});">
				</p>
				<p id="rating">Rating....</p>
					<form>
						<input id="cmt" type="text" name="comment" placeholder="Write comment..."><br>
						<input id="sbmbtn" type="submit" name="submit" value="Comment">
						<input id="nameInput" type="text" placeholder="Input your name...">
					</form>
					
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
				<p>${product.description }</p>

			</div>
		</div>
		<hr>
			<div class="row">
				<p id="titleCmt">Comments</p>
				<div class="cmt col-sm-4">
				<p id="dateCmt">15/08/2017</p>
				<p id="cusName">Peter Pan</p>
				
				<p id="cusRate">Rating....</p>
				<p id="cusCmt">That was great !</p>
				</div>
				<div class="cmt col-sm-4">
				<p id="dateCmt">15/08/2017</p>
				<p id="cusName">Peter Pan</p>
				
				<p id="cusRate">Rating....</p>
				<p id="cusCmt">That was great !</p>

					
				</div>
				<div class="cmt col-sm-4">
				<p id="dateCmt">15/08/2017</p>
				<p id="cusName">Peter Pan</p>
				
				<p id="cusRate">Rating....</p>
				<p id="cusCmt">That was great !</p>
					
				</div>
					
				</div>
	</div>
	<jsp:include page="../format/footer.jsp"></jsp:include>

</body>
</html>