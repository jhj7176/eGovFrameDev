<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap</title>
<!-- loading bootstrap css -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
	integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
	crossorigin="anonymous">
<style type="text/css">
.container {
	text-align: center;
}
form{
	display:block;
	margin:auto;
	margin-top:100px;
	margin-bottom:100px;
	width:400px;
}

#footer {
	position: relative;
	bottom: 0px;
}
</style>
<!-- loading jquery -->
<script src="https://code.jquery.com/jquery-1.12.4.min.js"
	integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ"
	crossorigin="anonymous"></script>
<!-- loading bootstrap js -->
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"
	integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
	crossorigin="anonymous"></script>

</head>
<body>
	<div class="container">
		<div class="row" id="header">
			<div class="col-md-12">
				<h1>Bootstrap starter</h1>
			</div>
		</div>
		<div class="row" id="menu">
			<div class="col-md-3">&nbsp;&nbsp;</div>
			<div class="col-md-2">
				<a href="index.action">HOME</a>
			</div>
			<div class="col-md-2">
				<a href="emp.action">EMP</a>
			</div>
			<div class="col-md-2">
				<a href="dept.action">DEPT</a>
			</div>
			<div class="col-md-3">&nbsp;&nbsp;</div>
		</div>
		<div class="row" id="content">
			<div class="col-md-12">
				
					<h1><h1>
				
			</div>
				
			<div class="page-header">
				<h1>
					EMP <small>Detail page</small>
				</h1>
			</div>
			<form action="dedit.action" method="post" class="form-horizontal">
							
				  <div class="form-group">
				    <label for="sabun" class="col-sm-2 control-label">sabun</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="sabun" readonly="readonly" value="${bean.sabun }">
				    </div>
				  </div>
				
				  <div class="form-group">
				    <label for="name" class="col-sm-2 control-label">name</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="name" readonly="readonly" value="${bean.name }">
				    </div>
				  </div>
				
				  <div class="form-group">
				    <label for="sub" class="col-sm-2 control-label">sub</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="sub" readonly="readonly" value="${bean.sub }">
				    </div>
				  </div>
				
				  <div class="form-group">
				    <label for="nalja" class="col-sm-2 control-label">hiredate</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="nalja" readonly="readonly" value="${bean.nalja }">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="pay" class="col-sm-2 control-label">pay</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="pay" readonly="readonly" value="${bean.pay }">
				    </div>
				  </div>
				 <div class="form-group">
				    <div class="col-sm-offset-2 col-sm-10">
						<a class="btn btn-default" href="eedit.action?sabun=${bean.sabun }">Edit</a>
						<a class="btn btn-default" href="edelete.action?sabun=${bean.sabun }">Delete</a>
				    </div>
 				 </div>


			</form>
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


</body>
</html>