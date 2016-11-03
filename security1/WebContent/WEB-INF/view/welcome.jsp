<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<sec:authentication property="principal.userInfo" var="userInfo" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>


	<a href="<c:url value='logout' />">logout</a>
	<a href="<c:url value='main' />">main</a>
	<br> welcome  nickname: ${userInfo.nickName}, username:${userInfo.userName}
	 权限等级 ：${userInfo.authority}
	<h1>Title:${title}</h1>
	<h1>Message:${message}</h1>

</body>
</html>