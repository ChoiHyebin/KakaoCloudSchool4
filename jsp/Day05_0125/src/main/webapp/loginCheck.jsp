<%@page import="mycom.test.util.JdbcUtility"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 로그인한 id에 해당하는 회원 정보를 DB로부터 읽어서 확인할 수 있는 페이지 만들기
	request.setCharacterEncoding("utf-8");
	String mid = request.getParameter("mid");
	String mpw = request.getParameter("mpw");

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:mariadb://localhost:3306/chap14?" + "useUnicode=true&characterEncoding=utf-8";
	String user = "jspexam";
	String password = "jsppw";
	String sql = "select * from member where memberid=?";
	
	try{
// 		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, mid);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()){
%>
			<h1><%= rs.getString("name") %></h1>
			<h1><%= rs.getString("memberid") %></h1>
			<h1><%= rs.getString("email") %></h1>
			<hr>
<%		}
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		JdbcUtility.close(rs);
		JdbcUtility.close(pstmt);
		JdbcUtility.close(conn);
	}
%>