<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>List page</h1>
	<table>
		<tr>
			<th>sabun</th>
			<th>name</th>
			<th>sub</th>
			<th>hiredate</th>
			<th>pay</th>
		</tr>
		<c:forEach items="${list }" var="bean">
			<tr>
				<td><a href="detail.action?sabun=${bean.sabun }">${bean.sabun }</a></td>
				<td><a href="detail.action?sabun=${bean.sabun }">${bean.name }</a></td>
				<td><a href="detail.action?sabun=${bean.sabun }">${bean.sub }</a></td>
				<td><a href="detail.action?sabun=${bean.sabun }">${bean.nalja }</a></td>
				<td><a href="detail.action?sabun=${bean.sabun }">${bean.pay }</a></td>
			</tr>
		</c:forEach>

	</table>
	<a href="add.action">add</a>
</body>
</html>