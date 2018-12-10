<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>菜单管理</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<!-- 引入bootstrap主题(可选的) -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<!-- 引入jquery 1.11.1） -->
<script src="bootstrap/js/jquery.min.js"></script>
<!-- 引入bootstrap.min.js文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="easyui/demo/demo.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<style>
select {
	height: 30px;
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
<script type="text/javascript">
	function addMenu() {

	}
</script>
</head>
<body>

	<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li href=""><a style="color: black" href="#">首页 </a></li>
		<li href=""><a style="color: black" href="#">权限管理 </a></li>
		<li class="active">菜单管理</li>
		<button onclick="addMenu();" style="font-size: 10px;"
			data-toggle="modal" data-target="#myModal">添加菜单</button>
	</ol>

	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h3 class="modal-title" id="myModalLabel">添加新菜单</h3>
				</div>

				<form act="" method="post">
					<div class="modal-body">

						<div class="input-group ">
							<span class="input-group-addon" id="sizing-addon1">菜单名称</span> <input
								type="text" class="form-control" aria-describedby="sizing-addon1" required>
						</div>
						</br>

						<div class="input-group ">
							<span class="input-group-addon" id="sizing-addon1">菜单ID</span> <input
								type="password" class="form-control"

								aria-describedby="sizing-addon1" required>
						</div>
						</br>

						<div class="input-group ">
							<span class="input-group-addon" id="sizing-addon1">URL</span> <input
								type="password" class="form-control" 
								aria-describedby="sizing-addon1" required>
						</div>
							</br>
							<div class="input-group ">
							<span class="input-group-addon" id="sizing-addon1">类型</span> 
									<select>
										<option>导航菜单</option>
										<option>权限</option>
										
										
									
									</select>
						</div>
						</br>
						
						<div class="input-group ">
							<span class="input-group-addon" id="sizing-addon1">一级菜单</span> 
									<select>
										<option>微信管理</option>
										<option>活动品牌</option>
										
										<option>导购客户</option>
										<option>综合查询</option>
										<option>权限管理</option>
										<option>手机端菜单</option>
										

										<option>活动引流</option>
										
										
									
									</select>
						</div>
						
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
						<button type="submit" class="btn btn-primary" onclick="">确认
						</button>
					</div>
				</form>
			</div>
		</div>
</body>
</html>