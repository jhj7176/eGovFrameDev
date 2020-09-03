<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<link rel="canonical"
	href="https://getbootstrap.com/docs/3.4/examples/starter-template/">

<title>Starter Template for Bootstrap</title>
<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://code.jquery.com/jquery-1.12.4.min.js"
	integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ"
	crossorigin="anonymous"></script>

<script src="../../dist/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>

<!-- Bootstrap core CSS -->
<link href="../../dist/css/bootstrap.min.css" rel="stylesheet">
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="../../assets/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link href="starter-template.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
	integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
	crossorigin="anonymous">
<script src="../../assets/js/ie-emulation-modes-warning.js"></script>

<style type="text/css">
.container {
	text-align: center;
}
td>a{
	display: block;
}
#footer {
	position: relative;
	bottom: 0px;
}
</style>
</head>


<body>

	<div class="container">

		<div class="starter-template" id="header">
			<h1>Bootstrap starter</h1>
		</div>

		<div class="row" id="menu">
			<div class="col-md-3">&nbsp;</div>
			<div class="col-md-2">
				<a href="index.action">HOME</a>
			</div>
			<div class="col-md-2">
				<a href="emp.action">EMP</a>
			</div>
			<div class="col-md-2">
				<a href="dept.action">DEPT</a>
			</div>
			<div class="col-md-3">&nbsp;</div>

		</div>
		<div class="row" id="content">
			<div class="col-md-12">
				<div class="col-md-12">

					<div class="jumbotron">
						<h1>DEPT page</h1>
						<p>...</p>
						<p>
							<a class="btn btn-primary btn-lg" href="dadd.action"
								role="button">Add more</a>
						</p>
					</div>
				</div>
			</div>
			<table class="table table-hover table-striped">
				<tr>
					<th>deptno</th>
					<th>dname</th>
					<th>loc</th>
				</tr>

				<c:forEach items="${list }" var="bean">
					<tr>
						<td><a href="ddetail.action?deptno=${bean.deptno }">${bean.deptno }</a></td>
						<td><a href="ddetail.action?deptno=${bean.deptno }">${bean.dname }</a></td>
						<td><a href="ddetail.action?deptno=${bean.deptno }">${bean.loc }</a></td>
					</tr>
				</c:forEach>

			</table>

		</div>

		<div class="row" id="footer">
			<div class="col-md-12">
				<p>
					비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)｜ 사업자등록번호 : 214-85-24928 (주)비트컴퓨터
					서초본원 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245<br>
					통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 최종진<br> Copyright
					&copy; 비트캠프 All rights reserved.
				</p>
			</div>
		</div>


	</div>
	<!-- /.container -->
</body>
</html>