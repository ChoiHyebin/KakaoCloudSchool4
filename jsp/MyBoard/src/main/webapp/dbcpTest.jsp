<%@page import="jdbc.connection.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	try{
		Connection conn = ConnectionProvider.getConnection();
		if(conn!=null){
			out.write("<h1>연결성공</h1>");
		}
	}catch(Exception e){
		e.printStackTrace();
	}
%>