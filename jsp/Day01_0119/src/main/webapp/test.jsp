<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String sname = "짱구";
	%>
	<h1>
	<span style="color: blue">
		<%
			// jsp = java server page = java + http 제어
			out.write(sname);
		%>
	</span>
	님 안녕하세요.
	</h1>
</body>
</html>