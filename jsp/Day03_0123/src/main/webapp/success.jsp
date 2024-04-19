<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success</title>
</head>
<body>
	<h1>로그인 성공 화면</h1>
	<h2>request: <%=request.getAttribute("req_userid") %></h2>님! 로그인이 되었습니다. <hr>
	<h2>session: <%=session.getAttribute("s_userid") %></h2>님! 로그인이 되었습니다. <hr>
	<a href="logout.jsp">로그아웃</a>
</body>
</html>