<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<script src="resources/javascript/addCart.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

IMG.displayed {
	display: block;
	margin-left: auto;
	margin-right: auto
}

.text {
	font-family: 'Lobster';
	font-size: 30px;
}

#cart_button {
	margin-top: 20px;
	margin-left: 80px;
	cursor: pointer;
}

#cart_button img {
	width: 40px;
	height: 40px;
}

#cart_button input[type="button"] {
	background: none;
	border: none;
	background-color: gray;
	border-radius: 100%;
	height: 30px;
	width: 30px;
	margin-top: 0px;
	color: red;
	font-size: 17px;
	cursor: pointer;
}

#mycart {
	display: none;
	background-color: white;
	width: 800px;
	margin-left: 100px;
}

#mycart .cart_items {
	border-bottom: 1px dashed silver;
	padding: 20px;
	padding-left: 10px;
}

#mycart .cart_items img {
	width: 70px;
	height: 50px;
	float: left;
}

#mycart .cart_items p {
	margin: 0px;
	font-size: 17px;
	color: darkblue;
}

#item_div {
	float: left;
	margin-left: 60px;
}

.items {
	padding: 20px;
	background-color: white;
	width: 250px;
	height: 350px;
	margin-top: 20px;
	box-shadow: 0px 0px 10px 0px #A4A4A4;
	box-sizing: border-box;
	float: left;
	margin: 20px;
	position: relative;
}

.items:hover input[type="button"] {
	display: block;
}

.items input[type="button"] {
	display: none;
	background: none;
	background-color: red;
	width: 200px;
	height: 50px;
	border: none;
	font-size: 20px;
	color: white;
	position: absolute;
	top: 150px;
	left: 25px;
	cursor: pointer;
}

.items img {
	width: 200px;
	height: 200px;
}

.items p {
	color: black;
}

.center {
	text-align: center;
}

.pagination {
	display: center;
	font-size: 150%;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
	transition: background-color .3s;
	border: 1px solid #ddd;
	margin: 0 4px;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
	border: 1px solid #4CAF50;
}

.pagination
 
a
:hover
:not
 
(
.active
 
)
{
background-color
:
 
#ddd
;


}
#description {
	font-size: 34px;
	margin: 0px;
}
</style>
</head>
<body>
	<jsp:include page="../format/header.jsp"></jsp:include>
	<div class="container image-center">

		<img src="data:image/jpg;base64,${cook.avatar64bit}"
			class="img-circle
			displayed" width="200" height="200">
		<div class="text text-center">${cook.fname } ${cook.lname }</div>
		<div class="row">
			<div class="col-sm-8">
				<p id="description">Description</p>
				<p>${cook.description }</p>
			</div>
		</div>
		<div class="row">
		<p id="description">List of Foods</p>
			<c:forEach items="${lop}" var="pro">
				<div id="item_div">
					<div class="items" id="item1">
						<img src="data:image/jpg;base64,${pro.imgEnc64}">  <a
							href='<c:url value="/getProduct/${pro.idProduct}"></c:url>'>${pro.nameProduct}</a>
						<p>${pro.price}</p>
					</div>
				</div>
			</c:forEach>
		</div>


	</div>
	<jsp:include page="../format/footer.jsp"></jsp:include>
</body>
</html>