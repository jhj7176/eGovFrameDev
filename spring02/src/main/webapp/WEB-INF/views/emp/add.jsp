<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>

<head>
<link rel="stylesheet" type="text/css"
	href="../bootstrap-3.4.1-dist/css/bootstrap.min.css" />

<style type="text/css">
</style>
<script type="text/javascript" src="../jquery/jquery-1.12.4.js"></script>
<script type="text/javascript"></script>
</head>

<body>

	<div class="container" id="heager">

		<div class="row">
			<div class="col-md-12 text-center text-primary">
				<h1>비트교육센터</h1>
			</div>

		</div>

		<div class="row" id="menu">
			<div class="col-md-12 text-center">
				<a href="../index.bit">HOME</a> <a href="list.bit">EMP</a> <a
					href="dept/list.bit">DEPT</a> <a href="login/form.bit">LOGIN</a>
			</div>

		</div>

		<div class="row" id="content">
			<div class="col-md-12">

				<form action="add.bit" method="post">
					<div class="form-group">
						<label for="exampleInputEmail1">name</label> <input
							name="name" type="text" class="form-control" id="exampleInputEmail1"
							placeholder="name">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">sub</label> <input
							name="sub" type="text" class="form-control" id="exampleInputPassword1"
							placeholder="sub">
					</div>
					
					<div class="form-group">
						<label for="exampleInputPassword1">pay</label> <input
							name="pay" type="text" class="form-control" id="exampleInputPassword1"
							placeholder="pay">
					</div>
					

					<button type="submit" class="btn btn-default">Submit</button>
				</form>


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
</body>
</html>
