<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>代金券查询</title>
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
		<li class="active" href="">代金券查询</li>
	</ol>
	<div class="table-responsive">
		<div>
			<form action="" method="post">

				活动名称：<select>

					<option>dhajkdhaskd</option>
					<option>dhajkdhaskd</option>
					<option>dhajkdhaskddahdjahdak</option>


				</select>
				
				&nbsp;&nbsp; 
				品牌名称：<select>

					<option>dhajkdhaskd</option>
					<option>dhajkdhaskd</option>
					<option>dhajkdhaskddahdjahdak</option>


				</select>
				
				&nbsp;&nbsp;
				签收号： <input type="text" />
				&nbsp;&nbsp; <input style="width: 60px" type="submit" value="查询" />
				&nbsp;&nbsp; <input style="width: 60px" type="submit" value="导出" />
			共  XXXX 客户代金券   代金券金额：  XXXX  元
			
				
			
			</div>	
				
				 
				
			
			</form>
		</div>


		<table style="margin-top: 20px"
			class="table table-condensed table-hover table-striped table-bordered">
			<tr class="warning">


				<th>序号</th>
				<th>活动名称</th>
				<th>品牌名称</th>
				<th>业务员</th>

				<th>签售号</th>
				<th>售卡类型</th>
				<th>客户姓名</th>

				<th>电话号码</th>
				<th>签到时间</th>
				<th>领代金券</th>

				<th>代金券金额</th>
				<th>操作</th>
				
				





			</tr>
			<tr>


				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>1</td>
				<td>2</td>
				<td>3</td>
			





<td><span onclick="" data-toggle="tooltip"
					data-placement="left" title="编辑" class="glyphicon glyphicon-pencil"></span>

					&nbsp;&nbsp;&nbsp; <span onclick="" data-toggle="tooltip"
					data-placement="left" title="删除" class="glyphicon glyphicon-remove">
				</span></td>




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