<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户管理</title>
<!-- 引入基本的CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<!-- 引入bootstrap主题(可选的) -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<!-- 引入jquery 1.11.1） -->
<script src="bootstrap/js/jquery.min.js"></script>
<!-- 引入bootstrap.min.js文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>

<style type="text/css">
input {
	width: 120px;
	border-radius: 4px
}

select {
	height: 23px;
	border-radius: 4px
}
</style>

</head>
<body>
	<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li><a style="color: black" href="#">首页</a></li>
		<li><a style="color: black" href="#">导购客户</a></li>
		<li class="active">客户管理</li>
	</ol>

	<div class="table-responsive">
		<div>
			<form>
				活动：<select>

					<option>全部</option>
					<option>1</option>
					<option>2</option>
					<option>3</option>



				</select> &nbsp; &nbsp;发证品牌：<input type="text" />&nbsp;&nbsp; 客户名：<input
					type="text" />&nbsp; &nbsp;签售号：<input type="text" />&nbsp;&nbsp;
				手机号：<input type="text" /> &nbsp;&nbsp; 发证人：<input type="text" />

				&nbsp;&nbsp; 签到：<select>
					<option>全部</option>
					<option>是</option>
					<option>否</option>
				</select> &nbsp;&nbsp;<input style="width: 60px" type="submit" value="查询" />
				&nbsp;&nbsp;<input style="width: 60px" type="submit" value="导出" />

			</form>


		</div>


		<!-- 客户列表 -->

		<table style="margin-top: 20px"
			class="table table-condensed table-hover table-striped table-bordered">
			<tr class="warning">


				<th>序号</th>
				<th>签售证号</th>
				<th>客户姓名</th>
				<th>售卡类型</th>
				<th>性别</th>
				<th>手机号码</th>
				<th>地址</th>
				<th>发证人</th>
				<th>发证品牌</th>
				<th>活动名称</th>
				<th>创建时间</th>
				<th>是否签到</th>
				<th>是否退卡</th>
				<th>操作</th>

			</tr>
			<tr>


				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<th>5</th>
				<td>6</td>
				<td>7</td>
				<td>8</td>
				<td>9</td>
				<td>10</td>
				<td>11</td>
				<td>12</td>
				<td>13</td>



				<td><span data-toggle="tooltip" data-placement="left"
					title="查看详情" class="glyphicon glyphicon-search"></span> <span
					data-toggle="tooltip" data-placement="left" title="编辑"
					class="glyphicon glyphicon-pencil"></span> <span
					data-toggle="tooltip" data-placement="left" title="删除"
					class="glyphicon glyphicon-remove"></span></td>
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