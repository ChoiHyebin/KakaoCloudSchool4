<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login test2</title>
<style>
	.hide{
		display:none;
	}
	
	.f_msg{
		display:content;
		color:red;
	}
	.s_msg{
		display: contnet;
		color: red;
	}
</style>
<script>
	window.onload=function(){
		
		let f = document.getElementById('f');
		let b = document.getElementById('btn_submit');
		let txt_id=document.getElementById('userid');
		let txt_pw=document.getElementById('userpw');
		
		//아이디 : 영어 또는 숫자만 가능
		function onlyNumberAndEnglish(str) {
		  return /^[A-Za-z0-9][A-Za-z0-9]*$/.test(str);
		}
		//비밀번호 : 8글자 이상, 영문, 숫자, 특수문자 사용
		function strongPassword (str) {
		  return /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/.test(str);
		}
		
		txt_id.onkeyup=function(){
			//유효성검사
			let result1=onlyNumberAndEnglish(txt_id.value);
			if(!result1){
				//실패
				
			}
		};
		
		txt_pw.onkeyup=function(){
			
		};
		//이벤트
		b.onclick=function(event){
			window.alert("버튼클릭");
			
			f.action='loginCheck.jsp';
			f.method='POST';
			f.submit();
		};
		
	};
</script>
</head>
<body>
	<h1>로그인 화면</h1>
	<form method="GET" id="f">
		<label>아이디:
			<input type="text" name="userid" id="userid">
		</label>
		<div class="f_msg hide">형식에 맞지 않습니다.</div>
		<div class="hide">올바른 표현이 맞습니다.</div>
	
		<label>암호:
			<input type="text" name="userpw" id="userpw">
		</label>
		<div class="f_msg hide">암호가 형식에 맞지 않습니다.</div>
		<div class="hide">올바른 표현이 맞습니다.</div>
		
		<input type="reset" value="취소">
		<input id="btn_submit" type="button" value="로그인">
	</form>
</body>
</html>