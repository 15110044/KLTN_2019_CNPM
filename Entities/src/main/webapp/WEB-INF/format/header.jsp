<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="resources/javascript/addCart.js"></script>

<div class="jumbotron">
	<div class="container text-center" style="background-image: url("http://diadiemsukien.vn/wp-content/uploads/2017/08/Banner-am-thuc.png");width:100%">
		
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
					<li class="active"><a href='<c:url value="/"></c:url>'><spring:message
								code="label.home" /></a></li>

					<li><a href='<c:url value="/getAllCook"></c:url>'><spring:message
								code="label.cooks" /></a></li>
					<li><a href='<c:url value="/getAllProduct"></c:url>'><spring:message
								code="label.products" /></a></li>
					<li><a href="#"><spring:message code="label.contact" /></a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#" aria-expanded="false"><spring:message
								code="label.translate" /> <span class="caret"></span> </a>
						<ul class="dropdown-menu">
							<li><a href="?lang=en">English</a></li>
							<li><a href="?lang=vi">Vietnamese</a></li>
						</ul></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<li><a href='<c:url value="/login"></c:url>'><span
							class="glyphicon glyphicon-log-in"></span>
						<spring:message code="label.login" /></a></li>
					<li><a href='<c:url value="/newCook"></c:url>'><span
							class="glyphicon glyphicon-user"></span>
						<spring:message code="label.register" /></a></li>
					<li><a id='btnCart' href=""><span
							class="glyphicon glyphicon-shopping-cart"></span>
						<spring:message code="label.cart" /></a></li>
					<li><a><span id="total_items"></span></a></li>
				</ul>

			</div>
		</div>

	</nav>
</div>