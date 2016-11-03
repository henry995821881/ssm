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
<title>Main</title>
</head>
<body>


	<c:if test="${userInfo.authority == 57 or userInfo.authority == 58}">
		<button>user</button>
	</c:if>
	<c:if test="${userInfo.authority == 58}">
		<button>admin</button>
	</c:if>



	<br>
	<h1>${msg}</h1>
	<script type="text/javascript"
		src="<c:url value='resources/js/main.js' />"></script>
</body>

</html>