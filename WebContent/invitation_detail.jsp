<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户邀约明细</title>
<!-- 引入基本的CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<!-- 引入bootstrap主题(可选的) -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<!-- 引入jquery 1.11.1） -->
<script src="bootstrap/js/jquery.min.js"></script>
<!-- 引入bootstrap.min.js文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>

<script type="text/javascript">


function toOut() {
		
		location.href="invitation_query.jsp"
	}
</script>

</head>
<body>

	<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li><a style="color: black" href="#">首页</a></li>
		<li><a style="color: black" href="#">邀约查询</a></li>
		<li class="active">客户邀约详情</li>
		<button onclick="toOut();"
			style="font-size: 10px; margin-left: 800px">返回</button>
		
	</ol>
<div class="table-responsive">
		


		<table 
			class="table table-condensed table-hover table-striped table-bordered">
			<tr class="warning">


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
				



			</tr>
			<tr>


				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<th>5</th>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<th>5</th>
					<td>的回家啊咖啡哈是件好事</td>
					<td>4</td>
				<th>5</th>






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