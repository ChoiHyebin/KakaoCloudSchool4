<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 	request 요청 파악
	request.setCharacterEncoding("utf-8");
	String sid = request.getParameter("userid");
	String spw = request.getParameter("userpw");
	
	// 비즈니스 로직
	if(sid.equals("aaa") && spw.equals("1234")) {
		// 응답 코드
		request.setAttribute("req_userid", sid);
		session.setAttribute("s_userid", sid);
		
		// response.sendRedirect("success.jsp");
// 		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
// 		dispatcher.forward(request, response);
%>
	<jsp:forward page="success.jsp" />
<%
	}
	else{
		// 실패
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login check</title>
</head>
<body>
	<h1>loginCheck.jsp</h1>
	ID: <%=sid %> <br>
	PASSWORD: <%=spw %>
</body>
</html>