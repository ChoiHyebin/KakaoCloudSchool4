<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>s4</title>
</head>
<body>
	<h1>s4.jsp</h1>
	request.setAttribute("sampleVO", vo); <br>
	<%= request.getAttribute("sampleVO") %>
	전달 받은 데이터: ${sampleVO}
</body>
</html>