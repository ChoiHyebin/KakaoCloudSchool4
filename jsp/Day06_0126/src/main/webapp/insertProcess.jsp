<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%
    request.setCharacterEncoding("UTF-8"); // 인코딩 설정
    String title = request.getParameter("title"); // 제목
    String writer = request.getParameter("writer"); // 작성자
    String content = request.getParameter("content"); // 내용

    // DB 연결 정보
    String dbURL = "jdbc:mariadb://localhost:3306/chap14"; 
    String dbID = "jspexam";
    String dbPassword = "jsppw";

    try {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
        String query = "INSERT INTO POST (postid, writer, content, regdate) VALUES (?, ?, ?, now())";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, "postid"); // 사용자 아이디
        pstmt.setString(2, "writer"); // 사용자 이름
        pstmt.setString(3, "content"); // 내용

        int result = pstmt.executeUpdate();

        if(result == 1) {
            out.println("<script>alert('게시글이 성공적으로 등록되었습니다.'); location.href='게시판리스트페이지.jsp';</script>");
        } else {
            out.println("<script>alert('게시글 등록에 실패하였습니다.'); history.back();</script>");
        }

 pstmt.close();
        conn.close();
    } catch(Exception e) {
        e.printStackTrace();
    }
%>