<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Detail page</h1>

<form action="update.action" method="post">
	<div>
		<label for="sabun">사번</label>
		<input type="text" name="sabun" readonly="readonly" value="${bean.sabun }"/>
	</div>
	<div>
		<label for="name">이름</label>
		<input type="text" name="name"  value="${bean.name }"/>
	</div>
	<div>
		<label for="sub">부서</label>
		<input type="text" name="sub"   value="${bean.sub }"/>
	</div>
	<div>
		<label for="nalja">입사일</label>
		<input type="text" name="nalja" readonly="readonly" value="${bean.nalja }"/>
	</div>
	<div>
		<label for="pay">연봉</label>
		<input type="text" name="pay"  value="${bean.pay }"/>
	</div>
	<div>
		<button type="submit">수정</button>
		
	</div>
<a href="delete.action?sabun=${bean.sabun }">삭제</a>
</form>

</body>
</html>