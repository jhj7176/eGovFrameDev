<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>INPUT page</h1>

	<form action="result.action">
		sabun : <input type="text" name="sabun" id="sabun" />${fieldErrors.sabun }<br />
		name : <input type="text" name="name" id="name" />${fieldErrors.name }<br />
		<button type="submit">submit</button>
	</form>
</body>
</html>