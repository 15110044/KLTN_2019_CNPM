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
<link rel="stylesheet" type="text/css"
	href="resources/css/allCook.css">
<script src="resources/lib/jquery-3.2.1.min.js"></script>
<script src="resources/lib/bootstrap.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../format/header.jsp"></jsp:include>

	<div class="container">
		<c:if test="${!empty loc}">

			<c:forEach items="${loc}" var="khachhang">
				<div id="item_div">
					<div class="items" id="item1">
						<!-- <img src="data:image/jpg;base64,${cook.avatar64bit}">  <a
							href='<c:url value='/getCook/${khachhang.maKH }'></c:url>'>Detail</a>-->
						<p>${khachhang.maKH} ${khachhang.tenNguoiDung}</p>

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