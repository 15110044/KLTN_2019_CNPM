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
<link rel="stylesheet" type="text/css" href="resources/css/index.css">
<script src="resources/lib/jquery-3.2.1.min.js"></script>
<script src="resources/lib/bootstrap.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../format/header.jsp"></jsp:include>
	<div class="container">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img
						src="https://static1.squarespace.com/static/58ce15126b8f5b67ee588aeb/t/58ceee61d482e9f3c6bdfe23/1489956453606/India+Cover+Photo.jpg?format=2500w"
						alt="Image" style="height: 400px; width: 1200px">
					<div class="carousel-caption">
						<h1>Good Quality Food</h1>
						<p>Homemade only.</p>
					</div>
				</div>

				<div class="item">
					<img
						src="https://static.independent.co.uk/s3fs-public/thumbnails/image/2017/01/09/15/michelin-chef.jpg"
						alt="Image" style="height: 400px; width: 1200px">
					<div class="carousel-caption">
						<h1>Home Chef</h1>
						<p>Professional Skill</p>
					</div>
				</div>
				<!-- Left and right controls -->
				<a class="left carousel-control" href="#myCarousel" role="button"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#myCarousel" role="button"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
		</div>
		<div class="container text-center">
			<h3>What We Have</h3>
			<br>
			<div class="row">
				<div class="col-sm-6">
					<img
						src="http://www.seriouseats.com/images/2016/12/20161208-sous-vide-lobster-59-lobster-roll-duo.jpg"
						class="image" style="width: 100%" alt="Image">
					<div class="middle">
						<div class="text"><a href='<c:url value="/getAllProduct"></c:url>'>Food</a></div>
					</div>

				</div>
				<div class="col-sm-6">
					<img
						src="http://img.smedunia.in/sites/default/files/products/image/457698/Cook.jpg"
						class="image" style="width: 100%" alt="Image">
					<div class="middle">
						<div class="text"><a href='<c:url value="/getAllCook"></c:url>'>Cook</a></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="../format/footer.jsp"></jsp:include>
</body>
</html>