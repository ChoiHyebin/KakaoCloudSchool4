<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body> <!-- view = html -->
	<h1>JDBC Driver 연동 테스트</h1>
	<table width="100%" border="1">
		<tr>
			 <td>이름</td>
			 <td>아이디</td>
			 <td>이메일</td>
		</tr>
<%
	// 요청 처리 - Controller
	String sid = request.getParameter("id");
	// 2. 데이터 조작 - 비즈니스 로직 => @Service
	String sql = "select * from member where id=" + sid;
	// 2-0. 예외 처리
	// 2-1. jdbcDriver 로딩
	// 2-2. Connection 연결 설정
	// 2-3. Statement = sql 질의
	// 2-4. ResultSet 결과 처리
	// 2-5. 연결 해제
	
	// 응답 - Controller

	Class.forName("com.mysql.jdbc.Driver");

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	try{
		String jdbcDriver = "jdbc:mysql://localhost:3306/dbtest";
		String dbUser = "root";
		String dbPass = "lolo0130";
		
		String query = "select * from member order by memberid";
		
		// 커넥션 생성
		conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		
		// Statement 생성
		stmt = conn.createStatement();
		
		// 쿼리 실행
		rs = stmt.executeQuery(query);
		
		// 쿼리 실행 결과 출력
		while(rs.next()){
%>
			<tr>
				<td><%= rs.getString("name") %></td>
				<td><%= rs.getString("memberid") %></td>
				<td><%= rs.getString("email") %></td>
			</tr>
<%
		}
	} catch(SQLException e){
		out.print(e.getMessage());
		e.printStackTrace();
	} finally {
		// statement 종료
		if(rs!=null) {
			try {
				rs.close();
			} catch(SQLException e){
				
			}
		}
		
		if(stmt!=null){
			try{
				stmt.close();
			} catch(SQLException e){
				
			}
		}
		
		// 커넥션 종료
		if(conn!=null){
			try{
				conn.close();
			} catch(SQLException e){
				
			}
		}
	}
%>
</table>

//~~~~/test.jsp

@RequestMapping("/test")
class MyController {
	public void test(@RequestParam("id") String sid) {
		String sql = "select * from member where id=" + sid;
	}
}

</body>
</html>