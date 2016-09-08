<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zh-CN">

<head>
<%@include file="../common/header.jsp"%>
<style>
.panel-group {
	max-height: 770px;
	overflow: auto;
}

.leftMenu {
	margin: 10px;
	margin-top: 5px;
}

.leftMenu .panel-heading {
	font-size: 14px;
	padding-left: 20px;
	height: 36px;
	line-height: 36px;
	color: white;
	position: relative;
	cursor: pointer;
}

/*转成手形图标*/
.leftMenu .panel-heading span {
	position: absolute;
	right: 10px;
	top: 12px;
}

.leftMenu .menu-item-left {
	padding: 2px;
	background: transparent;
	border: 1px solid transparent;
	border-radius: 6px;
}

.leftMenu .menu-item-left:hover {
	background: #C4E3F3;
	border: 1px solid #1E90FF;
}
</style>
</head>

<body>
	<div class="panel-group table-responsive" role="tablist">
		<div class="panel panel-primary leftMenu">
			<!-- 利用data-target指定要折叠的分组列表 -->
			<div class="panel-heading" id="collapseListGroupHeading1" data-toggle="collapse" data-target="#collapseListGroup1" role="tab">
				<h4 class="panel-title">
					1
					<span class="glyphicon glyphicon-chevron-up right"></span>
				</h4>
			</div>
			<!-- .panel-collapse和.collapse标明折叠元素 .in表示要显示出来 -->
			<div id="collapseListGroup1" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="collapseListGroupHeading1">
				<ul class="list-group">
					<li class="list-group-item"><a href="tmMs21" class="menu-item-left" target="Content">tmMs21</a></li>
					<li class="list-group-item"><a href="#" class="menu-item-left">1</a></li>
					<li class="list-group-item"><a href="#" class="menu-item-left">2</a></li>
					<li class="list-group-item"><a href="#" class="menu-item-left">3</a></li>
					<li class="list-group-item"><a href="#" class="menu-item-left">4</a></li>
				</ul>
			</div>
		</div>
		<!--panel end-->
		<div class="panel panel-primary leftMenu">
			<div class="panel-heading" id="collapseListGroupHeading2" data-toggle="collapse" data-target="#collapseListGroup2" role="tab">
				<h4 class="panel-title">
					2
					<span class="glyphicon glyphicon-chevron-down right"></span>
				</h4>
			</div>
			<div id="collapseListGroup2" class="panel-collapse collapse" role="tabpanel" aria-labelledby="collapseListGroupHeading2">
				<ul class="list-group">
					<li class="list-group-item"><a href="#" class="menu-item-left">1</a></li>
					<li class="list-group-item"><a href="#" class="menu-item-left">2</a></li>
					<li class="list-group-item"><a href="#" class="menu-item-left">3</a></li>
					<li class="list-group-item"><a href="#" class="menu-item-left">4</a></li>
				</ul>
			</div>
		</div>
	</div>
	<script language="javascript">
		$(function() {
			$(".panel-heading").click(function(e) {
				/*切换折叠指示图标*/
				$(this).find("span").toggleClass("glyphicon-chevron-down");
				$(this).find("span").toggleClass("glyphicon-chevron-up");
			});
		});
	</script>
</body>

</html>