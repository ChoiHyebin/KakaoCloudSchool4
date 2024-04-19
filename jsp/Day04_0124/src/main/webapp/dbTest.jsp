<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 0. 예외 처리
	// 1. jdbcDriver 로딩
	// 2. Connection 연결 설정
	// 3. Statement = sql 질의
	// 4. ResultSet 결과 처리
	// 5. 연결 해제
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:mariadb://localhost:3306/chap14?"+"useUnicode=true&characterEndocing=utf-8";
	String user = "jspexam";
	String password = "jsppw";

	try {
		Class.forName("org.mariadb.jdbc.Driver");
		
		conn = DriverManager.getConnection(url, user, password);
		if(conn!=null){
			out.write("<h1>연결 성공</h1>");
		}
		
		stmt = conn.createStatement();
		
		String query = "select * from member";
		rs = stmt.executeQuery(query);
		
		while(rs.next()) {
%>
			<h1><%= rs.getString("name") %></h1>
			<h1><%= rs.getString("memberid") %></h1>
			<h1><%= rs.getString("email") %></h1>
<%
		}
	} catch(Exception e) {
// 		out.write("드라이버가 없습니다.");
		e.printStackTrace();
	} finally {
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		if(conn!=null) conn.close();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>