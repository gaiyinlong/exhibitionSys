<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>砸金蛋数量统计</title>
<title>砸金蛋查询</title>
<!-- 引入基本的CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<!-- 引入bootstrap主题(可选的) -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<!-- 引入jquery 1.11.1） -->
<script src="bootstrap/js/jquery.min.js"></script>
<!-- 引入bootstrap.min.js文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<style>
select {
	height: 25px;
	mairgin-top: 10px;
	border-radius: 4px
}

input {
	border-radius: 4px;
}

lable {
	color: red
}
</style>
</head>
<body>
<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li href=""><a style="color: black" href=" ">首页 </a></li>
		<li href=""><a style="color: black" href="">综合查询</a></li>
		<li class="active" href="">砸金蛋数量统计</li>
	</ol>
	
	<div class="table-responsive">
		<div>
			<form action="" method="post">

				活动名称：<select>

					<option>dhajkdhaskd</option>
					<option>dhajkdhaskd</option>
					<option>dhajkdhaskddahdjahdak</option>


				</select>
				
				
					&nbsp;&nbsp; <input style="width: 60px" type="submit" value="查询" />
				&nbsp;&nbsp; <input style="width: 60px" type="submit" value="导出" />
				</form>
			
		<table style="margin-top: 20px"
			class="table table-condensed table-hover table-striped table-bordered">
			<tr class="warning">


				<th>序号</th>
				<th>活动名称</th>
				<th>金蛋奖</th>
				<th>数量</th>

				<th>其他</th>
			






			</tr>
			<tr>


				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>1</td>
			





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