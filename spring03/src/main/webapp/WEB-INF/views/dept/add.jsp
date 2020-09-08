<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>

<style type="text/css">
.img-circle {
	display: block;
	margin: auto;
}
form{
	display:block;
	margin:auto;
	width: 500px;
}
</style>
<script type="text/javascript"></script>
</head>
<body>

	<div class="container">
		<div class="row" id="header">
			<div class="col-md-12"></div>

		</div>

		<div class="row" id="menu">
			<div class="col-md-12">
				<nav class="navbar navbar-default">
					<div class="container-fluid">
						<!-- Brand and toggle get grouped for better mobile display -->
						<div class="navbar-header">
							<button type="button" class="navbar-toggle collapsed"
								data-toggle="collapse"
								data-target="#bs-example-navbar-collapse-1"
								aria-expanded="false">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
							<a class="navbar-brand" href="#">비트교육센터</a>
						</div>

						<!-- Collect the nav links, forms, and other content for toggling -->

						<!-- ${pageContext.request.contextPath} -->
						<div class="collapse navbar-collapse"
							id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li class="active"><a
									href="${pageContext.request.contextPath}/index.bit">HOME <span
										class="sr-only">(current)</span></a></li>
								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" role="button" aria-haspopup="true"
									aria-expanded="false">EMP <span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a
											href="${pageContext.request.contextPath}/emp/list.bit">List</a></li>
										<li><a href="#">Another action</a></li>
										<li><a href="#">Something else here</a></li>
										<li role="separator" class="divider"></li>
										<li><a href="#">Separated link</a></li>
										<li role="separator" class="divider"></li>
										<li><a href="#">One more separated link</a></li>
									</ul></li>
								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" role="button" aria-haspopup="true"
									aria-expanded="false">DEPT <span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a
											href="${pageContext.request.contextPath}/dept/list.bit">List</a></li>
										<li><a href="#">Another action</a></li>
										<li><a href="#">Something else here</a></li>
										<li role="separator" class="divider"></li>
										<li><a href="#">Separated link</a></li>
										<li role="separator" class="divider"></li>
										<li><a href="#">One more separated link</a></li>
									</ul></li>
							</ul>


							<form class="navbar-form navbar-left">
								<div class="form-group">
									<input type="text" class="form-control" placeholder="Search">
								</div>
								<button type="submit" class="btn btn-default">Submit</button>
							</form>
							<ul class="nav navbar-nav navbar-right">
								<li><a
									href="${pageContext.request.contextPath}/login/form.bit">Login</a></li>
							</ul>

						</div>
						<!-- /.navbar-collapse -->
					</div>
					<!-- /.container-fluid -->
				</nav>
			</div>

		</div>

		<div class="row" id="content">
			<div class="col-md-12">

				<div class="page-header">
					<h1>
						Insert page <small>dept table  ${fieldErrors }</small>
					</h1>
				</div>

				<form action="insert.bit" method="post" class="form-horizontal">
					<div class="form-group">
						<label for="dname" class="col-sm-2 control-label">dname</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="dname" id="name"
								placeholder="dname"/>
						</div>
					</div>
					<div class="form-group">
						<label for="loc" class="col-sm-2 control-label">loc</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="loc" id="loc"
								placeholder="loc"/>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Insert</button>
						</div>
					</div>
				</form>
			</div>

		</div>

		<div class="row" id="footer">
			<div class="col-md-12">
				<p>
					<addr>비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)｜ 사업자등록번호 :
					214-85-24928 (주)비트컴퓨터</addr>
					서초본원 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245<br>
					통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 최종진<br> Copyright
					&copy; 비트캠프 All rights reserved.
				</p>
			</div>

		</div>

	</div>
	<!-- container -->


</body>
</html>
