<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Add page</h1>

	<form action="insert.action" method="post">
	
	name<input type="text" name="name" id="name"/>
	sub<input type="text" name="sub" id="sub"/>
	pay<input type="text" name="pay" id="pay"/>
	<input type="submit" name="submit" value="전송"/>
	</form>
</body>
</html>