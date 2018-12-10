<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>粉丝管理</title>
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
		<li><a style="color: black" href="">首页</a></li>
		<li><a style="color: black" href="">微信管理</a></li>
		<li class="active">粉丝管理</li>


	</ol>


	<div class="table-responsive">
		<div>
			<form>

				昵称：<input type="text" /> &nbsp; &nbsp; 性别：<select>

					<option>请选择</option>
					<option>男</option>
					<option>女</option>





				</select> &nbsp; &nbsp; 分组：<select>

					<option>请选择</option>
					<option>1</option>
					<option>2</option>
					<option>3</option>



				</select> &nbsp;&nbsp; 标签：<select>

					<option>请选择</option>
					<option>1</option>





				</select> &nbsp;&nbsp; <input style="width: 60px" type="submit" value="查询" />



			</form>

			<table style="margin-top: 20px"
				class="table table-condensed table-hover table-striped table-bordered">
				<tr class="warning">


					<th>序号</th>
					<th>头像</th>
					<th>昵称</th>
					<th>关注时间</th>
					<th>分组</th>
					<th>标签</th>
					<th>性别</th>
					<th>省/市</th>


					<th>操作</th>



				</tr>
				<tr>


					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
					<td>6</td>
					<td>7</td>
					<td>7</td>






					<td><span data-toggle="tooltip" data-placement="left"
						title="查看详情" class="glyphicon glyphicon-search"></td>
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


		</div>
</body>
</html>