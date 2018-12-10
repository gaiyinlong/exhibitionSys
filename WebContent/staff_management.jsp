<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>店员维护</title>

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
</style>

<script type="text/javascript">
	function editStaff() {
		alert("编辑员工资料");

		location.href = "edit_staff.jsp";

	}

	function deleteStaff(id) {
		confirm("确认删除员工" + id);
	}
</script>

</head>


<body>

	<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li href=""><a style="color: black" href=" ">首页 </a></li>
		<li href=""><a style="color: black" href="">活动引流</a></li>
		<li class="active" href="">店员维护</li>
	</ol>
	<div class="table-responsive">
		<div>
			<form>
				商户名称：<input type="text" /> &nbsp;&nbsp;<input style="width: 60px"
					type="submit" value="查询" />
			</form>
		</div>
		<table style="margin-top: 20px"
			class="table table-condensed table-hover table-striped table-bordered">
			<tr class="warning">


				<th>序号</th>
				<th>员工姓名</th>
				<th>商家名称</th>
				<th>性别</th>
				<th>联系方式</th>
				<th>级别</th>
				<th>操作</th>



			</tr>
			<tr>


				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<th>5</th>


				<td>6</td>


				<td><span onclick="editStaff();" data-toggle="tooltip"
					data-placement="left" title="编辑" class="glyphicon glyphicon-pencil"></span>

					&nbsp;&nbsp;&nbsp; <span onclick="deleteStaff();"
					data-toggle="tooltip" data-placement="left" title="删除"
					class="glyphicon glyphicon-remove"> </span></td>



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