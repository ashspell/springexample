<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL fmt</title>
</head>
<body>
	<c:set var = "number" value = "123456789" />
	
	<h2> 숫자 출력</h2>
	
	<h4><fmt:formatNumber value = "${number }" /></h4>
	<h4><fmt:formatNumber value = "${number }" type = "number" groupingUsed="false" /></h4>
		
	<%-- % --%>
	100% : <fmt:formatNumber value = "1" type ="percent" /> <br>
	40% : <fmt:formatNumber value = "0.4" type = "percent" />
	
	<%-- 통화 --%>
	통화 : <fmt:formatNumber value = "${number }" type = "currency" /> <br>
	통화(달러) : <fmt:formatNumber value = "${number }" type = "currency" currencySymbol ="$" /> <br>
	
	<%-- 포맷 처리된 문자열 변수에 저장 --%>
	<fmt:formatNumber value = "${number }" type = "currency" var = "money" /> 
	저장한 포맷 문자열 : ${money } <br>
	
	<h2>pattern</h2>
	
	3.14 : <fmt:formatNumber value = "3.14" /> <br>
	3.14 (0.0000) : <fmt:formatNumber value = "3,14" pattern = "0.0000" />
	3.14 (#.####) : <fmt:formatNumber value = "3.14" pattern = "#.####" /> <br>
	3.14 (#.####) : <fmt:formatNumber value = "3.141592" pattern = "#.####" /> <br>
	
	
	<hr>
	
	<h2> Date 포맷</h2>
	<%-- Date 객체 포맷 --%>
	date format : <fmt:formatDate value = "${Date }" pattern= "yyyy년 MM월 dd일 HH시 mm분 ss시" />
	
	<fmt:formatDate value = "${Date }" pattern = "yyyy/MM/dd HH:mm:ss" var = "today" /> <br>
	
	저장된 변수의 데이트포멧 : ${today }
	
	<%-- String 을 Date 객체로 변환  2022/02/18 17:26:18 --%>
	<fmt:parseDate value = "${today }" pattern = "yyyy/MM/dd HH:mm:ss" var ="date2" />
	<br>
	${date2 }	
</body>
</html>