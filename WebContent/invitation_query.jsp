<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>邀约查询</title>
<!-- 引入基本的CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<!-- 引入bootstrap主题(可选的) -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<!-- 引入jquery 1.11.1） -->
<script src="bootstrap/js/jquery.min.js"></script>
<!-- 引入bootstrap.min.js文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<style>
input {
	width: 150px;
	border-radius: 4px
}
</style>

<script type="text/javascript">
	function toDetail() {




		location.href = "invitation_detail.jsp";

	}
</script>

</head>
<body>
	<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li><a style="color: black" href="#">首页</a></li>
		<li><a style="color: black" href="#">活动引流</a></li>
		<li class="active">邀约查询</li>

	</ol>
	<div class="table-responsive">
		<div>
			<form>
				微信昵称：<input type="text" /> &nbsp; &nbsp; 手机号：<input type="text" />&nbsp;&nbsp;
				&nbsp;&nbsp;<input style="width: 60px" type="submit" value="查询" />
			</form>
		</div>

		<table style="margin-top: 20px"
			class="table table-condensed table-hover table-striped table-bordered">
			<tr class="warning">


				<th>序号</th>
				<th>微信号</th>
				<th>微信昵称</th>
				<th>客户姓名</th>


				<th>客戶手机号</th>
				<th>邀约人数</th>



			</tr>
			<tr>


				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<th>5</th>





				<td><a  onclick="toDetail();" style="cursor: pointer"><span
						" data-toggle="tooltip" data-placement="left" title="查看详情"
						class="glyphicon glyphicon-search"></span> 点击查看</a></td>
			</tr>




		</table>



		<div style="text-align: center" class="panel">
			<nav>
				<ul class="pagination">
					<li><a href="#">&laquo;</a></li>
					<li><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">&raquo;</a></li>
				</ul>
			</nav>
		</div>
</body>
</html>