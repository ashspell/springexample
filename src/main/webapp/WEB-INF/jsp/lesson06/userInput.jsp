<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
</head>
<body>
	<h3>회원정보 추가</h3>
	<%--  <form method="post" action="/lesson06/add_user" id = "userForm"> --%>
		<label>이름 : </label> <input type = "text" name = "name" id = "nameinput"> <br>
		<label>생년월일 : </label> <input type = "text" name = "birth" id = "birthinput"> <br>
		<label>자기소개 </label> <br>
		<textarea name ="introduce" rows ="5" cols = "50" id = "introduceinput"></textarea> <br>
		<label>이메일 주소 : </label> <input type ="text" name = "email" id = "emailinput">
		
		<%-- <button type = "submit">추가</button> --%>
		
		<button type = "button" id = "addBtn">추가</button>
	<%-- </form> --%>
	
	<script>
		$(document).ready(function() {
			
			$("#userForm").on("submit", function() {
				let name = $("#nameinput").val();
				let birth = $("#birthinput").val();
				let introduce = $("#introduceinput").val().trim();
				let email = $("#emailinput").val();
				
				// 유효성 검사
				
				if(name == "") {
					alert("이름을 입력하세요");
					return false;
				}
				
				if(birth == "") {
					alert("생년월일을 입력하세요");
					return false;
				}
				
				if(introduce == "") {
					alert("자기소개를 입력하세요");
					return false;
				}
				
				if(email == "") {
					alert("이메일을 입력하세요");
					return false;
				}
				
				$.ajax({
					type:"post",
					url:"/lesson06/add_user",
					// ""는 key : 다음은 value
					data:{"name" :name, "birth" :birth, "introduce" :introduce, "email" :email},
					success:function(date) {
						alert(data);
						location.href = "/lesson04/ex01/add_user";
					},
					error:function() {
						alert("입력 에러");
					}
				});
					return false;
				
				
			});
	
			
		});
	
	</script>
</body>
</html>