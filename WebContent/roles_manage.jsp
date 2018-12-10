<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色管理</title>
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

<script type="text/javascript">
	function addRoles() {
		
		location.href="addnewroles.jsp";
	}

</script>

</head>
<body>
	<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li href=""><a style="color: black" href=" ">首页 </a></li>
		<li href=""><a style="color: black" href="">权限管理</a></li>
		<li class="active" href="">角色管理</li>
		<button onclick="addRoles(); "
			style="font-size: 10px; margin-left: 800px">新增角色</button>
	</ol>
	<table style="margin-top: 20px"
		class="table table-condensed table-hover table-striped table-bordered">
		<tr class="warning">


			<th>序号</th>
			<th>角色</th>
			<th>角色类型</th>
			<th>操作</th>











		</tr>
		<tr>


			<td>1</td>
			<td>2</td>
			<td>3</td>

			<td><span data-toggle="tooltip" data-placement="left" title="修改"
				class="glyphicon glyphicon-pencil"></span>修改 <span
				data-toggle="tooltip" data-placement="left" title="删除" class="">设置权限</span>
			</td>

		</tr>
	</table>




</body>
</html>