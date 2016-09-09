<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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

		<a type="button" href="test1/zhang" class="btn btn-default">追加</a>

	</div>
	<form action="test2" method="post" ENCTYPE="multipart/form-data">
		<input type="hidden" id="ddd" name="date">
		<input type="hidden" name="dollar" value="20.01">
		<input type="file" name="file">
		<input type="submit" value="submit">
	</form>

	<%-- <fmt:formatDate  value="java日期" pattern="yyyy-MM-dd HH:mm:ss"/> --%>
	<script type="text/javascript">
		Date.prototype.Format = function(fmt) { //author: meizz   
			var o = {
				"M+" : this.getMonth() + 1, //月?   
				"d+" : this.getDate(), //日   
				"h+" : this.getHours(), //小?   
				"m+" : this.getMinutes(), //分   
				"s+" : this.getSeconds(), //秒   
				"q+" : Math.floor((this.getMonth() + 3) / 3), //季度   
				"S" : this.getMilliseconds()
			//毫秒   
			};
			if (/(y+)/.test(fmt))
				fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "")
						.substr(4 - RegExp.$1.length));
			for ( var k in o)
				if (new RegExp("(" + k + ")").test(fmt))
					fmt = fmt.replace(RegExp.$1,
							(RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k])
									.substr(("" + o[k]).length)));
			return fmt;
		}

		//yyyy-MM-dd
		var d = new Date();

		$("#ddd").val(d.Format("yyyy-MM-dd hh:mm:ss"));
		//$("#ddd")[0].value=d;
	</script>
	
	<div>
	

</body>
</html>