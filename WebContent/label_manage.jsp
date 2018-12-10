<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>标签管理</title>

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
		<li class="active">标签管理</li>

		<button style="font-size: 10px; margin-left: 800px"
			data-toggle="modal" data-target="#myModal">新增标签</button>
	</ol>

	<div class="table-responsive">
		<div>
			<form>

				标签名：<input type="text" /> </select> &nbsp;&nbsp; <input style="width: 60px"
					type="submit" value="查询" />



			</form>

			<table style="margin-top: 20px"
				class="table table-condensed table-hover table-striped table-bordered">
				<tr class="warning">


					<th>序号</th>
					<th>标签名称</th>




					<th>操作</th>



				</tr>
				<tr>


					<td>1</td>
					<td>2</td>








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

			<!-- model -->

			

			<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h3 class="modal-title" id="myModalLabel">添加标签</h3>
						</div>

						<form act="" method="post">
							<div class="modal-body">

								<div class="input-group input-group-lg">
									<span class="input-group-addon" id="sizing-addon1">标签名：</span> <input
										type="text" class="form-control" 

										aria-describedby="sizing-addon1" required>
								</div>
								</br>

							

							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">取消</button>
								<button type="submit" class="btn btn-primary" onclick="">确认
								</button>
							</div>
						</form>
					</div>
				</div>
</body>
</html>