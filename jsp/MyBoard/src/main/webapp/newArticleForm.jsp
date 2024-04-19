<%@page import="article.service.WriteRequest"%>
<%@page import="article.model.Writer"%>
<%@page import="article.service.WriteArticleService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String paramId = request.getParameter("id");
	String paramName = request.getParameter("name");

	Writer writer = new Writer(paramId, paramName);
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	WriteRequest req = new WriteRequest(writer, title, content);
	
	WriteArticleService was = new WriteArticleService();
	was.write(req);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>newArticleForm.jsp</title>
</head>
<body>
	<form action="write.do" method="POST">
		작성자: <input type="text" name="name"><br>
		작성자 아이디: <input type="text" name="id"><br>
		글 제목: <input type="text" name="title"> <br>
		내용: <textarea name="content"></textarea>
		<hr>
		<input type="button" value="글쓰기">
	</form>
</body>
</html>