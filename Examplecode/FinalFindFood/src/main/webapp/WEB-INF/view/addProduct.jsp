<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/addCook.css" />
<link rel="stylesheet" type="text/css"
	href="resources/css/cart_style.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
					<li class="active"><a href="#">Home</a></li>
					<li><a href='<c:url value="/getAllCook"></c:url>'>Cooks</a></li>
					<li><a href='<c:url value="/getAllProduct"></c:url>'>Products</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href='<c:url value="/newProduct"></c:url>'>Create
							Product</a></li>
					<li><a href='<c:url value="/getAllProduct"></c:url>'><span
							class="glyphicon glyphicon-user"></span> LOG OUT</a></li>

				</ul>
			</div>
		</div>

		</nav>

		<div class="container"
			style="background: #f2f2f2; width: 1000px; height: 500px">
			<form class="form-horizontal" method="POST" modelAttribute="product"
				action="addProduct" enctype="multipart/form-data">
				<fieldset>

					<!-- Form Name -->
					<legend></legend>


					<!-- Text input-->
					<td><input path="idProduct" type="hidden" name="proID"
						value="${product.idProduct }"></td>

					<div class="form-group">
						<label class="col-md-4 control-label" path="nameProduct"
							for="product_name">FOOD NAME</label>
						<div class="col-md-4">
							<input id="product_name" path="nameProduct" size="30"
								maxlength="30" name="proName" placeholder="PRODUCT NAME"
								class="form-control input-md" required="" type="text">

						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label" path="price" for="price">PRICE</label>
						<div class="col-md-4">
							<input path="price" size="30" maxlength="30" name="proPrice"
								placeholder="PRICE" class="form-control input-md" required=""
								type="text">

						</div>
					</div>
					<input id="cookID" path="cook" size="30" maxlength="30"
						name="proCook" placeholder="COOK" class="form-control input-md"
						required="" type="hidden">
					<!-- Select Basic -->
					<div class="form-group">
						<label class="col-md-4 control-label" for="product_categorie">FOOD
							CATEGORY</label>
						<div class="col-md-4">
							<select id="product_categorie" name="proCategory"
								class="form-control">
								<c:forEach items="${categories }" var="cate">
									<option value="${cate.categoryID }">${cate.nameCategory }</option>
								</c:forEach>
							</select>
						</div>
					</div>

					<!-- Textarea -->
					<div class="form-group">
						<label class="col-md-4 control-label" path="description"
							for="product_description">FOOD DESCRIPTION</label>
						<div class="col-md-4">
							<textarea class="form-control" id="product_description"
								path="description" size="30" maxlength="30" name="proDesc"></textarea>
						</div>
					</div>
					<!-- File Button -->
					<div class="form-group">
						<label class="col-md-4 control-label" path="imagedata"
							for="filebutton">IMAGE 1</label>
						<div class="col-md-4">
							<input id="filebutton" class="input-file" type="file"
								path="imagedata" size="30" name="img1">
						</div>
					</div>
					<!-- File Button -->
					<div class="form-group">
						<label class="col-md-4 control-label" path="image2data"
							for="filebutton">IMAGE 2</label>
						<div class="col-md-4">
							<input id="filebutton" class="input-file" type="file"
								path="image2data" size="30" name="img2">
						</div>
					</div>

					<!-- File Button -->
					<div class="form-group">
						<label class="col-md-4 control-label" path="image3data"
							for="filebutton">IMAGE 3</label>
						<div class="col-md-4">
							<input id="filebutton" class="input-file" type="file"
								path="image3data" size="30" name="img3">
						</div>
					</div>

					<!-- Button -->
					<div class="form-group">
						<label class="col-md-4 control-label" for="singlebutton"></label>
						<div class="col-md-4">
							<button id="addProduct" name="addProduct" class="btn btn-primary">Add</button>
						</div>
					</div>
				</fieldset>
			</form>

		</div>
		<br> <br>
		<footer class="container-fluid text-center"> ©2020 FoodFind
		Corporation. Lầu 5, Tòa nhà Khang Thông, 67 Nguyễn Thị Minh Khai, Quận
		1, TP.HCM <br>
		Số giấy phép ÐKKD: 0311828012 do sở Kế hoạch và Ðầu Tư TP.HCM cấp ngày
		11/06/2020 </footer>

		<script>
			document.getElementById("cookID").value = document.cookie;
		</script>
</body>
</html>