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
		String sname = "¯��";
	%>
	<h1>
	<span style="color: blue">
		<%
			// jsp = java server page = java + http ����
			out.write(sname);
		%>
	</span>
	�� �ȳ��ϼ���.
	</h1>
</body>
</html>