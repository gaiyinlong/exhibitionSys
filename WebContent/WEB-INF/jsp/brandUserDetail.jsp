<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>品牌列表模态窗口</title>
</head>
<body>
	<!-- 模态窗品牌列表 -->
	<form action="Activity" method="get">
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">

						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>





						<h3 id="act_name" class="modal-title" id="myModalLabel">&nbsp;</h3>
						<button>
							<a style="cursor: pointer" type="button" data-toggle="modal"
								data-target="#addbrand">添加品牌</a>
						</button>
					</div>


					<div class="modal-body">



						<table style="margin-top: 20px"
							class="table table-condensed table-hover table-striped table-bordered">
							<tr class="warning">
								<input type="hidden" name="op" value="brandList" />


								<th>序号</th>


								<th>省/市</th>
								<th>品牌名称</th>

								<th>品牌负责人</th>
								<th>品牌负责人电话</th>
								<th>操作</th>



							</tr>


							<c:forEach items="${brandLists }" var="b" varStatus="status">


								<h1>dahjdka</h1>
								<td>${b.id }</td>
								<td>111</td>
								<td>${b.brandName }</td>
								<td>${b.brand_leader }</td>
								<td>${b.brand_leader }</td>





								<td>

									<button>删除</button>
									<button>取消负责</button>

								</td>
								</tr>
							</c:forEach>

						</table>



					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>



					</div>
	</form>
</body>
</html>