<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login test</title>
<style type="text/css">
	.container{
		width: 400px;
		margin: auto;
	}
	h1{
		text-align: center;
	}
	form {
		width: 100%;
		display: flex;
		flex-direction: column;
		gap: 20px;
	}
	.id-form, .pw-form{
		width: 100%;
		display: flex;
		flex-direction: column;
		gap: 10px;
	}
	#id, #pw{
		font-size: 16px;
		border: none;
		border-bottom: 1px solid gray;
	}
	#id, #pw:focus{
		outline: none;
	}
	.btn-form{
		width: 100%;
		display: flex;
		flex-direction: column;
		gap: 10px;
	}
	.btn-form>input{
		font-size: 16px;
		background-color: gray;
		color: white;
		border: none;
		border-radius: 10px;
		padding: 10px 0;
		cursor: pointer;
	}
</style>
<script type="text/javascript">
	function checkValidation() {
		// 아이디와 패스워드의 유효성 검사
		
		// USERNAME_PATTERN: 아이디는 소문자 알파벳 및 숫자로 구성되어 있어야 하며, 길이는 4자 이상 10 이하로 설정
		// PASSWORD_PATTERN: 비밀번호는 대문자 및 소문자 알파벳, 숫자로 구성되어 있어야 하며, 길이는 8자 이상 15 이하로 설정
		
		// 서버에 전송 - 자바스크립트 코드로 전송시켜야 함
	    
	    var userid = document.getElementById('id').value;
	    var userpw = document.getElementById('pw').value;
	    
	 	// 아이디 검증을 위한 정규 표현식: 소문자 알파벳 및 숫자 포함, 길이 4~10자
	    var idRegex = /^[a-z0-9]{4,10}$/;
	    
	 	// 비밀번호 검증을 위한 정규 표현식: 대소문자 알파벳 및 숫자 포함, 길이 8~15자
	    var passwordRegex = /^[A-Za-z0-9]{8,15}$/;

	    // 아이디 유효성 검사
	    if (!idRegex.test(userid)) {
	        alert('아이디는 소문자 알파벳 및 숫자로 구성되어야 하며 길이는 4~10자여야 합니다.');
	        return false; // 유효성 검사 실패 시, 여기서 함수 실행을 중단
	    }
	    
		// 비밀번호 유효성 검사
	    if (!passwordRegex.test(userpw)) {
	        alert('비밀번호는 대문자 및 소문자 알파벳, 숫자로 구성되어야 하며 길이는 8~15자여야 합니다.');
	        return false; // 유효성 검사 실패 시, 여기서 함수 실행을 중단
	    }

	    // 유효성 검사를 통과하면 폼을 제출
	    //document.getElementById('loginForm').submit();
	    alert("success");
	}
</script>
</head>
<body>
	<div class="container">
		<h1>로그인 화면</h1>
		<form action="loginCheck.jsp" method="GET" id="loginForm">
			<div class="id-form">
				<label for="id">아이디</label>
				<input id="id" type="text" name="userid">
			</div>
			<div class="pw-form">
				<label for="pw">비밀번호</label>
				<input id="pw" type="password" name="userpw">
			</div>
			<div class="btn-form">
				<input type="reset" value="취소">
				<input type="button" onClick="checkValidation()" value="로그인">
			</div>
		</form>
		응답된 데이터(ID): <%= request.getParameter("userid") %>
		응답된 데이터(PW): <%= request.getParameter("userpw") %>
	</div>
</body>
</html>