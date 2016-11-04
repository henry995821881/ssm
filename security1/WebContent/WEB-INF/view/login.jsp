<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
.error {
	color: red;
}

.msg {
	color: green;
}
</style>

<script type="text/javascript"
	src="<c:url value='resources/js/jquery/jquery-1.8.2.js'></c:url>"></script>
	
	<script type="text/javascript">
	
	
	function btnSubmit(){
		
		//valid
		//submit
		$("#loginForm").submit();
		
	}
	
	</script>
</head>
<body>
	<h6>Spring Security</h6>

	<div id="login-box">

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
		<form  id="loginForm" name='loginForm' action="<c:url value='checklogin' />"
			method='POST'>
			<table>
				<tr>
					<td>User:</td>
					<td><input type='text' name='username' value=''></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='password' /></td>
				</tr>

				<tr>
					<td><img alt="code" src="<c:url value='randomcode' />">
					</td>
					<td><a href="<c:url value='login' />">change image</a></td>
				</tr>
				<tr>
					<td>randomCode:
					</td>
					<td><input type='text' name='randomCode' /></td>
				</tr>
				<tr>
					<td colspan='2'>
					<button onclick="btnSubmit();">submit</button>
					
						</td>
					<td><a href="<c:url value='register' />">register</a></td>
				</tr>
			</table>

		</form>
	</div>
</body>
</html>