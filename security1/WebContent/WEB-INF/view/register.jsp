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

		<form:form modelAttribute="userInfo" action="checkregister">
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
					<td colspan='2'><input name="submit" type="submit"
						value="submit" /></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>