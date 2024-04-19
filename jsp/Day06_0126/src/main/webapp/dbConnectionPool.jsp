<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String jdbcDriver = "jdbc:apache:commons:dbcp:chap14";
	String query = "select * from MEMBER order by MEMBERID";

	try{
		conn = DriverManager.getConnection(jdbcDriver);
		pstmt = conn.prepareStatement(query);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
%>
			<%=rs.getString("name") %> <br>
			<%=rs.getString("memberid") %> <br>
			<%=rs.getString("email") %>
			<hr>
<%
		} //while
	} catch(Exception e){
		
	} finally {
		if(rs!=null) try {rs.close();} catch(SQLException ex) {}
		if(pstmt!=null) try {pstmt.close();} catch(SQLException ex) {}
		if(conn!=null) try {conn.close();} catch(SQLException ex) {}
	}
	
%>