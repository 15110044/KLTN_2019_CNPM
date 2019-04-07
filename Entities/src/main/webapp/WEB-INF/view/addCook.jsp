<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/addCook.css" />
<link rel="stylesheet" type="text/css"
	href="resources/css/cart_style.css" />
<link rel="stylesheet" type="text/css"
	href="resources/css/updateCook.css" />
<script src="resources/lib/jquery-3.2.1.min.js"></script>
<script src="resources/lib/bootstrap.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../format/header.jsp"></jsp:include>

	<div class="container">

		<form class="form-horizontal" action='addCook' method="POST"
			modelAttribute="cook" enctype="multipart/form-data">
			<fieldset>
				<div id="legend">
					<legend class="">Modify Information </legend>
				</div>
				<div class="row">
					<div class="col-sm-1">
						<input id="cookID" type="hidden" name="cookID"
							value="${cook.idCook} ">
					</div>
				</div>
				<div class="row">
					<div class="col-sm-1">
						<!-- Avatar -->
						<label class="control-label" for="avatar">Avatar</label> <img
							id="avatar"
							src="https://s3.amazonaws.com/hotmatcher/member/125125/album/profile/1.jpg"
							class="img-circle">
					</div>
					<div class="avt col-sm-11">
						<input id="avtPath" type="file" name="avatar">
					</div>
				</div>
				<div class="row">
					<div class="col-sm-6">
						<!-- Username -->
						<label class="control-label" for="fName">Firstname</label>
						<div class="controls">
							<input type="text" id="firstname" name="fName" 
								class="input-xlarge">
							<p class="help-block">Firstname can contain any letters or
								numbers, without spaces</p>
						</div>
					</div>
					<div class="col-sm-6">
						<label class="control-label" for="lName">Lastname</label>
						<div class="controls">
							<input type="text" id="lastname" name="lName" 
								class="input-xlarge">
							<p class="help-block">Lastname can contain any letters or
								numbers, without spaces</p>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-sm-6">
						<!-- E-mail -->
						<label class="control-label" for="email">E-mail</label>
						<div class="controls">
							<input type="text" id="email" name="email" 
								class="input-xlarge">
							<p class="help-block">Please provide your E-mail</p>
						</div>
					</div>
					<div class="col-sm-6">
						<label class="control-label" for="phone">Phone</label>
						<div class="controls">
							<input type="text" id="address" name="phone"
								class="input-xlarge">
							<p class="help-block">Please provide your Phone number</p>
						</div>

					</div>

				</div>

				<div class="row">
					<div class="col-sm-6">
						<!-- Password-->
						<label class="control-label" for="password">Password</label>
						<div class="controls">
							<input type="password" id="password" name="password"
								class="input-xlarge">
							<p class="help-block">Password should be at least 4
								characters</p>
						</div>
						<label class="control-label" for="password_confirm">Password
							(Confirm)</label>
						<div class="controls">
							<input type="password" id="password_confirm"
								name="password_confirm" class="input-xlarge">
							<p class="help-block">Please confirm password</p>
						</div>
						<!-- Button -->
						<div class="controls">
							<button class="btn btn-success">Save</button>
						</div>
					</div>
					<div class="col-sm-6">
						<label class="control-label" for="desc">Description</label>
						<div class="controls">
							<input type="text" id="description" name="desc" placeholder=""
								class="input-xlarge">
							<p class="help-block">Please fill in a little about yourself</p>
						</div>
					</div>
				</div>
			</fieldset>
		</form>
	</div>
	<jsp:include page="../format/footer.jsp"></jsp:include>

</body>
</html>