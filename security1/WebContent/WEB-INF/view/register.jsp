<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
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
	function btnSubmit() {

		//valid

		var username = $("[name='userName']").val();
		var password = $("[name='password']").val();
		var email = $("[name='email']").val();
		var code = $("[name='randomCode']").val();
		
		var regCode = /^[a-zA-Z0-9]{4}$/;
		var regUser = /^[a-zA-Z0-9_-]{6,9}$/;
		var regPassword = /^[a-zA-Z0-9_-]{3,18}$/;
		var regEmail = /^[a-zA-Z\d]+(\.[a-zA-Z\d]+)*@([\da-zA-Z](-[\da-zA-Z])?)+(\.{1,2}[a-zA-Z]+)+$/;

		if (!regUser.test(username)) {

			alert("username is error");
			return false;
		}
		if (!regPassword.test(password)) {
			alert("password is error");
			return false;
		}
		if (!regEmail.test(email)) {
			alert("email is error");
			return false;
		}

		if(!regCode.test(code)){
			
			alert("randomCode is error");
			return false;
		}
		
		
		
		//submit
		$("#userInfoForm").submit();

	}
</script>
</head>
<body>



	<h6>register</h6>


	<div id="login-box">

		<c:if test="${not empty error}">
			<div class="error">${error}</div>

		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

		<form:form id="userInfoForm" modelAttribute="userInfo"
			action="checkregister">
			<table>
				<tr>
					<td>User:</td>
					<td><form:input path="userName" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:password path="password" /></td>
				</tr>

				<tr>
					<td>email:</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>nickName:</td>
					<td><form:input path="nickName" /></td>
				</tr>
				<tr>
					<td>desc:</td>
					<td><form:input path="desc" /></td>
				</tr>

				<tr>
					<td><img alt="code" src="<c:url value='randomcode' />">
					</td>
					<td><a href="<c:url value='register' />">change image</a></td>
				</tr>
				<tr>
					<td>randomCode:</td>
					<td><input type="text" name="randomCode"></td>
				</tr>
				<tr>
					<td colspan='2'>
						<button onclick="return btnSubmit();">submit</button>
						<button type="reset">reset</button>
					</td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>