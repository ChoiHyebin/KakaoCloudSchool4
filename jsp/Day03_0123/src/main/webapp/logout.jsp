<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.invalidate();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
</head>
<body>
	<h1>로그아웃이 되었습니다.</h1>
<%-- 	<%=session.getAttribute("s_userid") %> --%>
	<a href="test.jsp">다시 로그인</a>
</body>
</html>