<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>品牌用户</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<!-- 引入bootstrap主题(可选的) -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<!-- 引入jquery 1.11.1） -->
<script src="bootstrap/js/jquery.min.js"></script>
<!-- 引入bootstrap.min.js文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/PCASClass.js"></script>
<script type="text/javascript" src="js/getcity.js"></script>

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

<script type="text/javascript">
	function toAdd() {

		location.href = "jsp?name=addbrand_user";

	}
	
	function deleteBrand(bname) {
		if (confirm("您确定要删除品牌[" + bname + "]吗？")) {
			//开始删除
			//请求删除的servlet
			//location.href="deleteActivity?id="+id;

		}
	}
</script>


</head>
<body>
	<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li href=""><a style="color: black" href="">首页 </a></li>
		<li href=""><a style="color: black" href="">活动品牌 </a></li>
		<li class="active">品牌用户</li>
		<button onclick="toAdd()" style="font-size: 10px; margin-left: 800px">新增品牌用户</button>
	</ol>

	<div class="table-responsive">
		<div>
			<form action="" method="post">


				省/直辖市：<select name="province" id="province"></select> &nbsp; &nbsp;
				城市：<select name="city" id="city"></select>

				<script type="text/javascript">
					new PCAS("province", "city");
				</script>


				&nbsp; &nbsp;活动名称：<input type="text" />&nbsp;&nbsp; 品牌名称：<input
					type="text" />&nbsp; &nbsp; 品牌负责人：<input type="text" />&nbsp;
				&nbsp; 联系方式：<input type="text" />&nbsp; &nbsp; <input
					style="width: 60px" type="submit" value="查询" />



			</form>


		</div>


		<!-- 品牌用戶列表 -->
		<form action="Activity" method="post">
			<table style="margin-top: 20px"
				class="table table-condensed table-hover table-striped table-bordered">
				<tr class="warning">

					<input type="hidden" name="op" value="brandList" />

					<th>编号</th>
					<th>登录名</th>
					<th>省-市</th>
					<th>品牌编码</th>
					<th>品牌名称</th>
					<th>品类</th>
					<th>负责人</th>
					<th>联系方式</th>
					<th>当前活动</th>
					<th>角色</th>
					<th>等级权限</th>
					<th>二维码</th>
					<th>操作</th>



				</tr>
				<tr>

					<c:forEach items="${brandlists }" var="b">
						<td>${b.id}</td>
						<td>${b.loginName}</td>
						<td>${b.province }- ${b.city }</td>
						<td>${b.brand_code }</td>
						<td>${b.brand_name }</td>
						<td>空</td>
						<td>${b.brand_leader }</td>
						<td>${b.brand_leaderTel }</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>



						<td>
							<button>初始化密码</button>
							<button>业务员</button>
							<button><a href="Activity?op=editBrandUser&bId=${b.id}&province=${b.province}&city=${b.city}"
								style="cursor: pointer">编辑</a></button>
							<button>

								<a onclick="deleteBrand('${b.brand_name }') "
									href="Activity?op=deleteBrandUser&brandId=${b.id }"
									style="cursor: pointer">删除</a>
							</button>
							<button>导入业务员</button>
						</td>
				</tr>



				</c:forEach>
			</table>
		</form>

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