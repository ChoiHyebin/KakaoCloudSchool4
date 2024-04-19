<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>inputForm.jsp</title>
</head>
<body>
	<h1>회원가입 jsp form</h1>
	<hr>
	<!-- http://localhost:8787/Day05_0125/WEB-INF/member/insert.jsp -->
	<form action="insertRequest.jsp" method="POST">
		아이디: <input type="text" name="memberid"> <br>
		비밀번호: <input type="password" name="password"> <br>
		사용자 이름: <input type="text" name="name"> <br>
		이메일: <input type="text" name="email"> <br>
		<input type="reset" value="취소">
		<input type="submit" value="회원가입">
	</form>
</body>
</html>