<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>签单明细</title>
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
	border-radius: 4px;
	width: 100px;
}
</style>
</head>
<body>
	<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li href=""><a style="color: black" href="#">首页 </a></li>
		<li href=""><a style="color: black" href="#">综合查询 </a></li>
		<li class="active">签单明细</li>

		<button onclick=" " style="font-size: 10px; margin-left: 930px">返回</button>
	</ol>

	<div class="table-responsive">
		<div>
			<form>


				活动名称：<select>

					<option>全部</option>
					<option>1</option>
					<option>2</option>
					<option>3</option>



				</select> &nbsp; &nbsp; 签售号：<input type="text" /> &nbsp;&nbsp; 客户名：<input
					type="text" /> &nbsp;&nbsp; 支付类型：<select>

					<option>全部</option>
					<option>支付宝</option>
					<option>微信</option>
					<option>刷卡</option>
					<option>现金</option>



				</select> &nbsp; &nbsp; 退单状态：<select>

					<option>是</option>
					<option>否</option>




				</select> &nbsp; &nbsp;
				 联单奖：<select>

					<option>是</option>
					<option>否</option>

				</select>
				
				&nbsp; &nbsp; <input style="width: 60px" type="submit" value="查询" /> &nbsp;
				&nbsp; <input style="width: 60px" type="submit" value="导出" />



			</form>


			<table style="margin-top: 20px"
				class="table table-condensed table-hover table-striped table-bordered">
				<tr class="warning">


					<th>序号</th>
					<th>签售证号</th>
					<th>证件类型</th>
					<th>发售品牌</th>
					<th>发证人员</th>
					<th>客户姓名</th>
					<th>联系方式</th>
					<th>订单品牌</th>
					<th>订单时间</th>
					<th>是否退单</th>
					<th>退单时间</th>
					<th>多单砸金蛋</th>
					<th>联单奖</th>
					<th>收银台账号</th>
					<th>支付类型</th>
					<th>退单金额/元</th>
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
					<td>8</td>
					<td>9</td>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>1</td>
					<td>2</td>
					<td>3</td>

					<td><input style="border: 1px solid red" /></td>
					







					<td><span data-toggle="tooltip" data-placement="left"
						title="修改金额" class="glyphicon glyphicon-pencil">修改金额</span></td>



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