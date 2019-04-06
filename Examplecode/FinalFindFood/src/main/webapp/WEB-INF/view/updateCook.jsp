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
	src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
/* Remove the navbar's default rounded borders and increase the bottom margin */
.navbar {
	margin-bottom: 0px;
	border-radius: 0;
}

/* Remove the jumbotron's default bottom margin */
.jumbotron {
	margin-bottom: 0px;
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

#avatar {
	height: 60px;
	width: 60px;
}

#description {
	width: 400px;
	height: 150px;
}

.avt {
	margin-top: 50px;
}

#browseBtn {
	background-color: #000000b3;
	text-align: center;
	font-weight: bold;
	color: white;
}
</style>
</head>
<body>
	<jsp:include page="../format/header.jsp"></jsp:include>

	<div class="container">

		<form action='/FindFood/addCook' method="POST" modelAttribute="cook"
			enctype="multipart/form-data">
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
							id="avatar" src="data:image/jpg;base64,${cook.avatar64bit}"
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
							<input type="text" id="firstname" name="fName" placeholder=""
								class="input-xlarge" value="${cook.fname }">
							<p class="help-block">Firstname can contain any letters or
								numbers, without spaces</p>
						</div>
					</div>
					<div class="col-sm-6">
						<label class="control-label" for="lName">Lastname</label>
						<div class="controls">
							<input type="text" id="lastname" name="lName" placeholder=""
								class="input-xlarge" value="${cook.lname }">
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
							<input type="text" id="email" name="email" placeholder=""
								class="input-xlarge" value="${cook.email }">
							<p class="help-block">Please provide your E-mail</p>
						</div>
					</div>
					<div class="col-sm-6">
						<label class="control-label" for="phone">Phone</label>
						<div class="controls">
							<input type="text" id="address" name="phone" placeholder=""
								class="input-xlarge" value="${cook.phone }">
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
								placeholder="" class="input-xlarge">
							<p class="help-block">Password should be at least 4
								characters</p>
						</div>
						<label class="control-label" for="password_confirm">Password
							(Confirm)</label>
						<div class="controls">
							<input type="password" id="password_confirm"
								name="password_confirm" placeholder="" class="input-xlarge">
							<p class="help-block">Please confirm password</p>
						</div>
						<!-- 						Button
						<div class="controls">
							<button class="btn btn-success">Save</button>
						</div> -->
					</div>
					<div class="col-sm-6">
						<label class="control-label" for="desc">Description</label>
						<div class="controls">
							<input type="text" id="description" name="desc" placeholder=""
								class="input-xlarge" value="${cook.description }">
							<p class="help-block">Please fill in a little about yourself</p>
						</div>
					</div>
					<input type="submit">
				</div>
			</fieldset>
		</form>
	</div>
	<jsp:include page="../format/footer.jsp"></jsp:include>
</body>
</html>