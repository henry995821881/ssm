<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="../common/header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
td {
	width: 16%;
	text-align: center;
}
</style>
</head>
<body>

	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading" style="height: 60px;">

				<table class="table">

					<tr>
						<td>コード</td>
						<td>指導機関名称</td>
						<td>エリア</td>
						<td>最大人数</td>
						<td>外部委託</td>
						<td>共通指導機関コード</td>
					</tr>

				</table>

			</div>
			<div class="panel-body" style="overflow: auto; height: 500px;">


				<table class="table table-bordered">
					<tbody>
						<c:if test="${not empty sidoukikanList }">
							<c:forEach items="${sidoukikanList }" var="sidoukikan">
								<tr>
									<td>
										<a target="Content" href="doInitUpdate/${sidoukikan.skCd}">${sidoukikan.skCd }</a>
									</td>
									<td>${ sidoukikan.skNm}</td>
									<td>${ sidoukikan.area}</td>
									<td>${ sidoukikan.maxNinzu}</td>
									<td>
										<c:if test="${ sidoukikan.gaibuFlg ==true}">
									o
									</c:if>
									</td>
									<td>${ sidoukikan.comSkCd}</td>
								</tr>
							</c:forEach>
						</c:if>
					</tbody>
				</table>
			</div>
		</div>

<a type="button" class="btn btn-default">追加</a>

	</div>


</body>
</html>