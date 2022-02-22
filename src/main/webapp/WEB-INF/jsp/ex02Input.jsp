<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 추가</title>
</head>
<body>
	<h1>학생정보 추가</h1>
	
	<form method = "get" action = "/lesson04/ex02/add_student">
		<label>이름</label> <input type = "text" name = "name"> <br>
		<label>전화번호</label> <input type = "text" name = "phonenumber"> <br>
		<label>이메일</label> <input type = "text" name = "email"> <br>
		<label>장래희망</label> <input type = "text" name = "dreamjob"> <br>
		
		<button type = "submit"></button>
	
	</form>


</body>
</html>